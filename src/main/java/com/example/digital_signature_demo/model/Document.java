package com.example.digital_signature_demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] signature;


    @Lob
    private byte[] signedDocumentContent; // Thêm trường này

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date signDate;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }


    public byte[] getSignedDocumentContent() {
        return signedDocumentContent;
    }

    public void setSignedDocumentContent(byte[] signedDocumentContent) {
        this.signedDocumentContent = signedDocumentContent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }
}
