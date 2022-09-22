package roydon.xyz.mybatisplusgenerator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author roydon
 * @since 2022-09-22
 */
@Getter
@Setter
  @TableName("tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 主键ID
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      /**
     * 用户名
     */
      private String userName;

      /**
     * 密码
     */
      private String password;

      /**
     * 姓名
     */
      private String name;

      /**
     * 年龄
     */
      private Integer age;

      /**
     * 邮箱
     */
      private String email;


}
