package edu.msg.ro.persistence.user.entity.dao;

import edu.msg.ro.persistence.user.entity.Role;
import edu.msg.ro.persistence.user.entity.User;

import javax.ejb.Remote;
import java.io.Serializable;
import java.util.List;

@Remote
public interface UserManagement extends Serializable {

    void addUser(User user);
    User updateUser(User user);
    List<User> getAllUsers();
    User getUserForUsername(String username);
    void deavtivateUser(int id);
    void addRole(Role role);
    void removeRole(Role role);
    Role updateRole(Role role);
    Role getRoleForID(int id);
    List<Role> getAllRoles();

}
