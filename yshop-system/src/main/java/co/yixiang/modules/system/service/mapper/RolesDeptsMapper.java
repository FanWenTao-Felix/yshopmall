/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co
 */
package co.yixiang.modules.system.service.mapper;

import co.yixiang.common.mapper.CoreMapper;
import co.yixiang.modules.system.domain.RolesDepts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author hupeng
* @date 2020-05-16
*/
@Repository
@Mapper
public interface RolesDeptsMapper extends CoreMapper<RolesDepts> {

}
