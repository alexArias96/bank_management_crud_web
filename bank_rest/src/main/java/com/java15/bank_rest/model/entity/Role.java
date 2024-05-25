package com.java15.bank_rest.model.entity;


//@Table(name = "roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"role_id", "role_name"})})
public enum Role {
    ADMIN,
    USER

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "role_name")
//    private String name;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "create_at")
//    private Date createAt;
}
