package com.java15.bank_rest.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "people", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})} )
public class People implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String surname;
    private String address;
    private String contact;
    @Column(nullable = false)
    private String username;
    private String password;

//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "role_id")
    @Enumerated(EnumType.STRING)
    private Role role;

    //Important Methods for authentication
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //here: it returns a single object that also returns the authority granted to the authenticated user
        //Aqui retorna un unico objeto que tambien retorna la autoridad otorgada al usuario autenticado
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public boolean isAccountNonExpired() {
        //This for expiration date
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
