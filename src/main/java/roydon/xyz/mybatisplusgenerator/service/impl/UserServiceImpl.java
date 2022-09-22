package roydon.xyz.mybatisplusgenerator.service.impl;

import roydon.xyz.mybatisplusgenerator.entity.User;
import roydon.xyz.mybatisplusgenerator.mapper.UserMapper;
import roydon.xyz.mybatisplusgenerator.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author roydon
 * @since 2022-09-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
