package org.talent.talentpay.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Tnx {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private long amount;
    private String note;

    private LocalDateTime tnxTime;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private UserAccount sender;

    @ManyToOne
    @JoinColumn(name="receiver_id")
    private UserAccount receiver;

}