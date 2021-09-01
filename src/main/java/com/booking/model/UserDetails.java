package com.booking.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "guest_details")
public class UserDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GUEST_SEQ")

    @SequenceGenerator(name = "GUEST_SEQ", sequenceName = "guest_details_guest_details_id_seq", allocationSize = 1)
    private int guestDetailsId;

    @Column
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "guest_details_id", referencedColumnName = "guestDetailsId")
    private List<Allergy> allergy;


    public int getGuestDetailsId() {
        return guestDetailsId;
    }

    public void setGuestDetailsId(int guestDetailsId) {
        this.guestDetailsId = guestDetailsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Allergy> getAllergy() {
        return allergy;
    }

    public void setAllergy(List<Allergy> allergy) {
        this.allergy = allergy;
    }


}


