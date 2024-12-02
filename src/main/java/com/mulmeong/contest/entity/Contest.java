package com.mulmeong.contest.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity
public class Contest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Kind kind;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 1000)
    private String description;
    @Column(nullable = false, length = 2083)
    private String imgUrl;
    private boolean status;

    private LocalDate startDate;
    private LocalDate endDate;

    @Builder
    public Contest(
            Kind kind,
            String name,
            String description,
            String imgUrl,
            boolean status,
            LocalDate startDate,
            LocalDate endDate
    ) {
        this.kind = kind;
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
