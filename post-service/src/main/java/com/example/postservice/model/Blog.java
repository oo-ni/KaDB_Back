package com.example.postservice.model;

import jakarta.persistence.*;
import com.example.memberservice.model.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@Table(name = "BLOG")
public class Blog extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BlogNo")
    private int no;

    @Column(nullable = false, length = 50)
    private String Title;

    @Column(length = 50, columnDefinition = "DEFAULT NULL")
    private String Subtitle;

    @OneToOne
    @JoinColumn(name = "UserNo", referencedColumnName = "UserNo")
    private User user; // 포스트 서비스에도 유저를 만들어야 한다네요~
}
