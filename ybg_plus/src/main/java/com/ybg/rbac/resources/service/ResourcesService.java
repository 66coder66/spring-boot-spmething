package com.ybg.rbac.resources.service;

import java.util.List;
import com.ybg.base.jdbc.BaseMap;
import com.ybg.base.util.Json;
import com.ybg.base.util.Page;
import com.ybg.common.ResultVO;
import com.ybg.rbac.resources.domain.ResourcesDTO;
import com.ybg.rbac.resources.qvo.ResourcesQuery;

/***
 * @author https://gitee.com/YYDeament/88ybg
 * 
 *         授权资源
 * 
 * @date 2016/10/1
 */
public interface ResourcesService {

	/**
	 * 创建资源
	 * 
	 * @param bean
	 * @return
	 */
	Json save(ResourcesDTO bean);

	/**
	 * 更新数据，条件 和 需要更新的字段都不能为空 不限个数个条件
	 * 
	 * @author Deament
	 * @param updatemap
	 *            需要更新的字段和值
	 * @param wheremap
	 *            更新中的条件字段和值
	 * @param table_name
	 *            表的名称
	 **/
	void update(BaseMap<String, Object> updatemap, BaseMap<String, Object> wheremap);

	/** 更新权限 **/
	Json update(ResourcesDTO bean);

	/**
	 * 分页查询
	 * 
	 * @param page
	 * @param qvo
	 * @return
	 * @throws Exception
	 */
	Page list(Page page, ResourcesQuery qvo) throws Exception;

	/**
	 * 不分页查询
	 * 
	 * @param qvo
	 * @return
	 * @throws Exception
	 */
	List<ResourcesDTO> list(ResourcesQuery qvo) throws Exception;

	/**
	 * 角色 权限集合
	 * 
	 * @param roleid
	 * @return
	 * @throws Exception
	 */
	List<ResourcesDTO> getRolesByRoleId(String roleid) throws Exception;

	/**
	 * 角色 权限集合
	 * 
	 * @param roleid
	 * @return
	 * @throws Exception
	 */
	List<ResourcesDTO> getRolesByRoleIds(List<String> roleid) throws Exception;

	/**
	 * 授权的按钮操作
	 * 
	 * @param roleid
	 * @param parentid
	 * @return
	 * @throws Exception
	 */
	@Deprecated
	List<ResourcesDTO> getOperatorButton(String roleid, String parentid) throws Exception;

	/**
	 * 根据ID删除
	 * 
	 * @param id
	 */
	void removebyid(String id);

	/**
	 * 获取单个资源
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ResourcesDTO get(String id) throws Exception;

	/**
	 * 角色 权限集合（用于拦截权限。）
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	List<ResourcesDTO> getRolesByRoleIdHaveNull() throws Exception;
}
