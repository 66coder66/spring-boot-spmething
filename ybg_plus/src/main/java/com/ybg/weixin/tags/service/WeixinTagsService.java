package com.ybg.weixin.tags.service;
import java.util.List;
import com.ybg.weixin.tags.domain.WeixinTagsDTO;

/*** @author https://gitee.com/YYDeament/88ybg
 * 
 * @date 2016/10/1 */
public interface WeixinTagsService {
	
	/** 创建
	 * 
	 * @param bean
	 */
	public void create(WeixinTagsDTO bean);
	
	/** 查询
	 * 
	 * @return */
	public List<WeixinTagsDTO> list();
	
	/** 更新
	 * 
	 * @param id
	 * @param name
	 */
	public void update(Integer id, String name);
	
	/** 删除
	 * 
	 * @param id
	 */
	public void remove(Integer id);
	
	/** 批量取消
	 * 
	 * @param openids
	 * @param tagid
	 */
	public void batchuntagging(List<String> openids, Integer tagid);
	
	/** 批量打标签
	 * 
	 * @param openids
	 * @param tagid
	 */
	public void batchtagging(List<String> openids, Integer tagid);
}
