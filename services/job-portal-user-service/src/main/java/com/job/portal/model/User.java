package com.job.portal.model;

import com.job.portal.domain.UserRole;
import com.job.portal.domain.UserStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity 
@NoArgsConstructor 
@AllArgsConstructor 
@Getter 
@Setter 
@Builder 

public class User {
    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column (nullable = false)
    private String fullName;

    @Column (nullable = false)
    private String password;

    @Column (nullable = false)
    private String email;

    @Column (nullable = false)
    private String phone;

    private  String profileImage;

    @Enumerated (EnumType.STRING)
    @Column (nullable = false)
    private UserRole role = UserRole.ROLE_JOB_SEEKER;

    @Enumerated (EnumType.STRING)
    @Column (nullable = false)
    private UserStatus status = UserStatus.ACTIVE;

//ghp_e2bCIEtpPKVeZWz0vbiofHsjrbpNKM1rHKsf

}
