package com.github.guodont.qyapi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by carlosxiao
 */
public class WeChatMsg {

    /** ********************* 微信返回错误代码 ************************* */
    public static Map<Integer,String> map = new HashMap<Integer,String>();
    static {
        map.put(-1, "系统繁忙");
        map.put(0, "请求成功");
        map.put(40001, "获取access_token时Secret错误，或者access_token无效");
        map.put(40002, "不合法的凭证类型");
        map.put(40003, "不合法的UserID");
        map.put(40004, "不合法的媒体文件类型");
        map.put(40005, "不合法的文件类型 ");
        map.put(40006, "不合法的文件大小");
        map.put(40007, "不合法的媒体文件id");
        map.put(40008, "不合法的消息类型");
        map.put(40013, "不合法的corpid");
        map.put(40014, "不合法的access_token");
        map.put(40015, "不合法的菜单类型");
        map.put(40016, "不合法的按钮个数");
        map.put(40017, "不合法的按钮类型");
        map.put(40018, "不合法的按钮名字长度");
        map.put(40019, "不合法的按钮KEY长度 ");
        map.put(40020, "不合法的按钮URL长度");
        map.put(40021, "不合法的菜单版本号");
        map.put(40022, "不合法的子菜单级数");
        map.put(40023, "不合法的子菜单按钮个数");
        map.put(40024, "不合法的子菜单按钮类型");
        map.put(40025, "不合法的子菜单按钮名字长度");
        map.put(40026, "不合法的子菜单按钮KEY长度");
        map.put(40027, "不合法的子菜单按钮URL长度");
        map.put(40028, "不合法的自定义菜单使用成员");
        map.put(40029, "不合法的oauth_code");
        map.put(40031, "不合法的UserID列表");
        map.put(40032, "不合法的UserID列表长度");
        map.put(40033, "不合法的请求字符，不能包含\\uxxxx格式的字符");
        map.put(40035, "不合法的参数");
        map.put(40038, "不合法的请求格式");
        map.put(40039, "不合法的URL长度");
        map.put(40040, "不合法的插件token");
        map.put(40041, "不合法的插件id");
        map.put(40042, "不合法的插件会话");
        map.put(40048, "url中包含不合法domain");
        map.put(40054, "不合法的子菜单url域名");
        map.put(40055, "不合法的按钮url域名");
        map.put(40056, "不合法的agentid");
        map.put(40057, "不合法的callbackurl或者callbackurl验证失败");
        map.put(40058, "不合法的红包参数");
        map.put(40059, "不合法的上报地理位置标志位");
        map.put(40060, "设置上报地理位置标志位时没有设置callbackurl");
        map.put(40061, "设置应用头像失败");
        map.put(40062, "不合法的应用模式");
        map.put(40063, "参数为空");
        map.put(40064, "管理组名字已存在");
        map.put(40065, "不合法的管理组名字长度");
        map.put(40066, "不合法的部门列表");
        map.put(40067, "标题长度不合法");
        map.put(40068, "不合法的标签ID");
        map.put(40069, "不合法的标签ID列表");
        map.put(40070, "列表中所有标签（成员）ID都不合法");
        map.put(40071, "不合法的标签名字，标签名字已经存在");
        map.put(40072, "不合法的标签名字长度");
        map.put(40073, "不合法的openid");
        map.put(40074, "news消息不支持指定为高保密消息");
        map.put(40077, "不合法的预授权码");
        map.put(40078, "不合法的临时授权码");
        map.put(40079, "不合法的授权信息");
        map.put(40080, "不合法的suitesecret");
        map.put(40082, "不合法的suitetoken");
        map.put(40083, "不合法的suiteid");
        map.put(40084, "不合法的永久授权码");
        map.put(40085, "不合法的suiteticket");
        map.put(40086, "不合法的第三方应用appid");
        map.put(40092, "导入文件存在不合法的内容");
        map.put(40093, "不合法的跳转target");
        map.put(40094, "不合法的URL");
        map.put(40095, "修改失败，并发冲突");
        map.put(40155, "请勿添加其他公众号的主页链接");

        map.put(41001, "缺少access_token参数");
        map.put(41002, "缺少corpid参数");
        map.put(41003, "缺少refresh_token参数");
        map.put(41004, "缺少secret参数");
        map.put(41005, "缺少多媒体文件数据");
        map.put(41006, "缺少media_id参数");
        map.put(41007, "缺少子菜单数据");
        map.put(41008, "缺少oauth code");
        map.put(41009, "缺少UserID");
        map.put(41010, "缺少url");
        map.put(41011, "缺少agentid");
        map.put(41012, "缺少应用头像mediaid");
        map.put(41013, "缺少应用名字");
        map.put(41014, "缺少应用描述");
        map.put(41015, "缺少Content");
        map.put(41016, "缺少标题");
        map.put(41017, "缺少标签ID");
        map.put(41018, "缺少标签名字");
        map.put(41021, "缺少suiteid");
        map.put(41022, "缺少suitetoken");
        map.put(41023, "缺少suiteticket");
        map.put(41024, "缺少suitesecret");
        map.put(41025, "缺少永久授权码");
        map.put(41034, "缺少login_ticket");
        map.put(41035, "缺少跳转target");

        map.put(42001, "access_token超时");
        map.put(42002, "refresh_token过期");
        map.put(42003, "oauth_code超时");
        map.put(42004, "插件token过期");
        map.put(42007, "预授权码失效");
        map.put(42008, "临时授权码失效");
        map.put(42009, "suitetoken失效");

        map.put(43001, "需要GET请求");
        map.put(43002, "需要POST请求");
        map.put(43003, "需要HTTPS");
        map.put(43004, "需要成员已关注");
        map.put(43005, "需要好友关系");
        map.put(43006, "需要订阅");
        map.put(43007, "需要授权");
        map.put(43008, "需要支付授权");
        map.put(43010, "需要处于回调模式");
        map.put(43011, "需要企业授权");
        map.put(43013, "应用对成员不可见");

        map.put(44001, "多媒体文件为空");
        map.put(44002, "POST的数据包为空");
        map.put(44003, "图文消息内容为空");
        map.put(44004, "文本消息内容为空");

        map.put(45001, "多媒体文件大小超过限制");
        map.put(45002, "消息内容大小超过限制");
        map.put(45003, "标题大小超过限制");
        map.put(45004, "描述大小超过限制");
        map.put(45005, "链接长度超过限制");
        map.put(45006, "图片链接长度超过限制");
        map.put(45007, "语音播放时间超过限制");
        map.put(45008, "图文消息的文章数量不能超过10条");
        map.put(45009, "接口调用超过限制");
        map.put(45010, "创建菜单个数超过限制");
        map.put(45015, "回复时间超过限制");
        map.put(45016, "系统分组，不允许修改");
        map.put(45017, "分组名字过长");
        map.put(45018, "分组数量超过上限");
        map.put(45022, "应用名字长度不合法，合法长度为2-16个字");
        map.put(45024, "帐号数量超过上限");
        map.put(45025, "同一个成员每周只能邀请一次");
        map.put(45026, "触发删除用户数的保护");
        map.put(45027, "mpnews每天只能发送100次");
        map.put(45028, "素材数量超过上限");
        map.put(45029, "media_id对该应用不可见");
        map.put(45032, "作者名字长度超过限制");

        map.put(46001, "不存在媒体数据");
        map.put(46002, "不存在的菜单版本");
        map.put(46003, "不存在的菜单数据");
        map.put(46004, "不存在的成员");

        map.put(47001, "解析JSON/XML内容错误");

        map.put(48001, "Api未授权");
        map.put(48002, "Api禁用(一般是管理组类型与Api不匹配，例如普通管理组调用会话服务的Api)");
        map.put(48003, "suitetoken无效");
        map.put(48004, "授权关系无效");
        map.put(48005, "Api已废弃");

        map.put(50001, "redirect_uri未授权");
        map.put(50002, "成员不在权限范围");
        map.put(50003, "应用已停用");
        map.put(50004, "成员状态不正确，需要成员为企业验证中状态");
        map.put(50005, "企业已禁用");

        map.put(60001, "部门长度不符合限制");
        map.put(60002, "部门层级深度超过限制");
        map.put(60003, "部门不存在");
        map.put(60004, "上级部门不存在");
        map.put(60005, "不允许删除有成员的部门");
        map.put(60006, "不允许删除有子部门的部门");
        map.put(60007, "不允许删除根部门");
        map.put(60008, "部门ID或者部门名称已存在");
        map.put(60009, "部门名称含有非法字符");
        map.put(60010, "部门存在循环关系");
        map.put(60011, "权限不足(1.只有通迅录同步助手才有通迅录写权限。 2. 自定义的应用，需要确定可见范围是否有此人 )");
        map.put(60012, "不允许删除默认应用");
        map.put(60013, "不允许关闭应用");
        map.put(60014, "不允许开启应用");
        map.put(60015, "不允许修改默认应用可见范围");
        map.put(60016, "不允许删除存在成员的标签");
        map.put(60017, "不允许设置企业");
        map.put(60019, "不允许设置应用地理位置上报开关");
        map.put(60020, "访问ip不在白名单之中");
        map.put(60023, "已授权的应用不允许企业管理组调用接口修改菜单");
        map.put(60025, "主页型应用不支持的消息类型");
        map.put(60027, "不支持第三方修改主页型应用字段");
        map.put(60028, "应用已授权予第三方，不允许通过接口修改主页url");
        map.put(60029, "应用已授权予第三方，不允许通过接口修改可信域名");
        map.put(60031, "未设置管理组的登录授权域名");
        map.put(60102, "UserID已存在");
        map.put(60103, "手机号码不合法");
        map.put(60104, "手机号码已存在");
        map.put(60105, "邮箱不合法");
        map.put(60106, "邮箱已存在");
        map.put(60107, "微信号不合法");
        map.put(60108, "微信号已存在");
        map.put(60109, "QQ号已存在");
        map.put(60110, "用户同时归属部门超过20个");
        map.put(60111, "UserID不存在");
        map.put(60112, "成员姓名不合法");
        map.put(60113, "身份认证信息（微信号/手机/邮箱）不能同时为空");
        map.put(60114, "性别不合法");
        map.put(60115, "已关注成员微信不能修改");
        map.put(60116, "扩展属性已存在");
        map.put(60118, "成员无有效邀请字段，详情参考(邀请成员关注)的接口说明");
        map.put(60119, "成员已关注");
        map.put(60120, "成员已禁用");
        map.put(60121, "找不到该成员");
        map.put(60122, "邮箱已被外部管理员使用");
        map.put(60123, "无效的部门id");
        map.put(60124, "无效的上级部门id");
        map.put(60125, "非法部门名字，长度超过限制、重名等，重名包括与csv文件中同级部门重名或者与旧组织架构包含成员的同级部门重名");
        map.put(60126, "创建部门失败");
        map.put(60127, "缺少部门id");
        map.put(60128, "字段不合法，可能存在主键冲突或者格式错误");
        map.put(60129, "用户设置了拒绝邀请");
        map.put(60131, "不合法的职位长度");

        map.put(80001, "可信域名不匹配，或者可信域名没有IPC备案（后续将不能在该域名下正常使用jssdk）");
        map.put(80003, "邀请额度已用完");
        map.put(80004, "部门数量超过上限");

        map.put(82001, "发送消息或者邀请的参数全部为空或者全部不合法");
        map.put(82002, "不合法的PartyID列表长度");
        map.put(82003, "不合法的TagID列表长度");
        map.put(82004, "微信版本号过低");
        map.put(85002, "包含不合法的词语");
        map.put(86001, "不合法的会话ID");
        map.put(86003, "不存在的会话ID");
        map.put(86004, "不合法的会话名");
        map.put(86005, "不合法的会话管理员");
        map.put(86006, "不合法的成员列表大小");
        map.put(86007, "不存在的成员");
        map.put(86101, "需要会话管理员权限");
        map.put(86201, "缺少会话ID");
        map.put(86202, "缺少会话名");
        map.put(86203, "缺少会话管理员");
        map.put(86204, "缺少成员");
        map.put(86205, "非法的会话ID长度");
        map.put(86206, "非法的会话ID数值");
        map.put(86207, "会话管理员不在用户列表中");
        map.put(86208, "消息服务未开启");
        map.put(86209, "缺少操作者");
        map.put(86210, "缺少会话参数");
        map.put(86211, "缺少会话类型（单聊或者群聊）");
        map.put(86213, "缺少发件人");
        map.put(86214, "非法的会话类型");
        map.put(86215, "会话已存在");
        map.put(86216, "非法会话成员");
        map.put(86217, "会话操作者不在成员列表中");
        map.put(86218, "非法会话发件人");
        map.put(86219, "非法会话收件人");
        map.put(86220, "非法会话操作者");
        map.put(86221, "单聊模式下，发件人与收件人不能为同一人");
        map.put(86222, "不允许消息服务访问的API");
        map.put(86304, "不合法的消息类型");
        map.put(86305, "客服服务未启用");
        map.put(86306, "缺少发送人");
        map.put(86307, "缺少发送人类型");
        map.put(86308, "缺少发送人id");
        map.put(86309, "缺少接收人");
        map.put(86310, "缺少接收人类型");
        map.put(86311, "缺少接收人id");
        map.put(86312, "缺少消息类型");
        map.put(86313, "缺少客服，发送人或接收人类型，必须有一个为kf");
        map.put(86314, "客服不唯一，发送人或接收人类型，必须只有一个为kf");
        map.put(86315, "不合法的发送人类型");
        map.put(86316, "不合法的发送人id。Userid不存在、openid不存在、kf不存在");
        map.put(86317, "不合法的接收人类型");
        map.put(86318, "不合法的接收人id。Userid不存在、openid不存在、kf不存在");
        map.put(86319, "不合法的客服，kf不在客服列表中");
        map.put(86320, "不合法的客服类型");

        map.put(88001, "缺少seq参数");
        map.put(88002, "缺少offset参数");
        map.put(88003, "非法seq");

        map.put(90001, "未认证摇一摇周边");
        map.put(90002, "缺少摇一摇周边ticket参数");
        map.put(90003, "摇一摇周边ticket参数不合法");
        map.put(90004, "摇一摇周边ticket过期");
        map.put(90005, "未开启摇一摇周边服务");
        map.put(91004, "卡券已被核销");
        map.put(91011, "无效的code");
        map.put(91014, "缺少卡券详情");
        map.put(91015, "代金券缺少least_cost或者reduce_cost参数");
        map.put(91016, "折扣券缺少discount参数");
        map.put(91017, "礼品券缺少gift参数");
        map.put(91019, "缺少卡券sku参数");
        map.put(91020, "缺少卡券有效期");
        map.put(91021, "缺少卡券有效期类型");
        map.put(91022, "缺少卡券logo_url");
        map.put(91023, "缺少卡券code类型");
        map.put(91025, "缺少卡券title");
        map.put(91026, "缺少卡券color");
        map.put(91027, "缺少offset参数");
        map.put(91028, "缺少count参数");
        map.put(91029, "缺少card_id");
        map.put(91030, "缺少卡券code");
        map.put(91031, "缺少卡券notice");
        map.put(91032, "缺少卡券description");
        map.put(91033, "缺少ticket类型");
        map.put(91036, "不合法的有效期");
        map.put(91038, "变更库存值不合法");
        map.put(91039, "不合法的卡券id");
        map.put(91040, "不合法的ticket type");
        map.put(91041, "没有创建，上传卡券logo，以及核销卡券的权限");
        map.put(91042, "没有该卡券投放权限");
        map.put(91043, "没有修改或者删除该卡券的权限");
        map.put(91044, "不合法的卡券参数");
        map.put(91045, "缺少团购券groupon结构");
        map.put(91046, "缺少现金券cash结构");
        map.put(91047, "缺少折扣券discount 结构");
        map.put(91048, "缺少礼品券gift结构");
        map.put(91049, "缺少优惠券coupon结构");
        map.put(91050, "缺少卡券必填字段");
        map.put(91051, "商户名称超过12个汉字");
        map.put(91052, "卡券标题超过9个汉字");
        map.put(91053, "卡券提醒超过16个汉字");
        map.put(91054, "卡券描述超过1024个汉字");
        map.put(91055, "卡券副标题长度超过18个汉字");

        map.put(301001, "应用id已存在");
        map.put(301002, "accesstoken不允许操作其它应用");
        map.put(301004, "不允许删除超级管理员");
        map.put(301005, "消息型应用不允许做此操作");
        map.put(301006, "不允许禁用超级管理员");
        map.put(301008, "主页型应用不允许做此操作");
        map.put(301009, "应用发送消息没有接收主体");
        map.put(301010, "部门名已存在");
        map.put(301013, "座机不合法");
        map.put(301014, "英文名称不合法");
        map.put(302001, "批量同步成员存在userid为空的用户");
        map.put(302002, "管理员userid不存在");
        map.put(302003, "存在重复的userid");
        map.put(302004, "组织架构不合法");

    }
}
