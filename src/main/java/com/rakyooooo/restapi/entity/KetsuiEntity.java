package com.rakyooooo.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="T_KETSUI_HYOUMEI")
public class KetsuiEntity {

    @Id
    @Column(name="KETSUI_ID")
    private int ketsuiId;

    @Column(name="KETSUI")
    private String ketsui;
    
    @Column(name="USER_ID")
    private String userId;
    
}
