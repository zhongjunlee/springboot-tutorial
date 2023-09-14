package com.johnny.rbac.security.repository;

import com.johnny.rbac.security.model.RolePermission;
import com.johnny.rbac.security.model.unionkey.RolePermissionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <p>
 * 角色-权限 DAO
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2018-12-10 13:45
 */
public interface RolePermissionDao extends JpaRepository<RolePermission, RolePermissionKey>, JpaSpecificationExecutor<RolePermission> {
}
