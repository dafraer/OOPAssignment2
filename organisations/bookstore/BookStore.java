package assignment2.organisations.bookstore;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;
import assignment2.organizations.party.Election;

import java.util.ArrayList;
import java.util.List;

public class BookStore extends Organization implements Contactable {
    private String name;
    String email, address, phoneNumber;
    List<Publisher> publishers = new ArrayList<>();
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void addPublisher(Publisher p) {
        publishers.add(p);
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean removePublisher(Publisher p) {
        boolean removed = false;
        removed = publishers.remove(p);
        return removed;
    }
}
