package com.charleskeith.core.domain.users;

import com.charleskeith.core.domain.shared.Repository;

import java.util.List;

/**
 * 2016/6/3
 *
 * @author Shengzhao Li
 */

public interface UsersRepository extends Repository {

    List<Roles> findUsersRolesList(String usersGuid);

    List<String> findPermissionsByRoles(String rolesGuid);
}