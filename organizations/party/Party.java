package assignment2.organizations.party;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;

import java.util.ArrayList;
import java.util.List;

public class Party extends Organization implements Contactable {
    private final String name;
    String mission;

    String email, address, phoneNumber;

    List<Election> elections = new ArrayList<>();

    public Party(String name, String mission) {
        // TODO finish this method (0.25 points)
        this.name = name;
        this.mission = mission;
    }

    public void addElection(Election e) {
        // TODO finish this method (0.25 points)
        elections.add(e);
    }

    public boolean removeElection(Election e) {
        boolean removed = false;
        // TODO finish this method (0.25 points)
        removed = elections.remove(e);
        return removed;
    }

    public List<Election> getFairElections() {
        List<Election> fairElections = new ArrayList<>();
        // TODO finish this method (0.25 points)
        for(int i = 0; i < elections.size(); i++) {
            if (elections.get(i).isFair()) {
                fairElections.add(elections.get(i));
            }
        }
        return fairElections;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
