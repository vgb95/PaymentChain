package com.vgb.paymentchain.payment.chain.service.impl;

import com.vgb.paymentchain.payment.chain.entities.User;
import com.vgb.paymentchain.payment.chain.service.UserService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class UserServiceImpl implements UserService {

private List<User> users = new ArrayList<>();
private Long nexId = 1L;


    @Override
    public User createUser(User user) {
    if(user.getEmail() == null || user.getEmail().isEmpty()) {
        throw new RuntimeException("Mail is mandatory");
    }

    user.setId(nexId++);
    user.setCreatedAt(LocalDateTime.now());
    user.setIsActive(true);

    users.add(user);

    return user;
    }

    @Override
    public User getUserById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    @Override
    public User updateUser(Long id, User user) {
        User userToUpdate = getUserById(id);
        if(userToUpdate == null) {
            throw new RuntimeException("User not found");
        }
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPhoneNumber(user.getPhoneNumber());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setDocumentType(user.getDocumentType());
        userToUpdate.setDocumentNumber(user.getDocumentNumber());
        userToUpdate.setDateOfBirth(user.getDateOfBirth());
        userToUpdate.setIsActive(user.getIsActive());

        return userToUpdate;
    }

    @Override
    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
