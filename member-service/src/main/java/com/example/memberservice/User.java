package com.example.memberservice;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_no;

    @NotNull
    @JoinColumn()
    @Column(unique = true, length = 20)
    private String user_id;

    @NotNull
    private Boolean login_type;

    @OneToOne
    @JoinColumn(name = "user_no")
    private Profile profile;
}
