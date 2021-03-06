package com.playground.javaplayground.infrastructure.persistence.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class FoodEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String foodName;

    private String foodCalorie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private StoreEntity storeEntity;
}
