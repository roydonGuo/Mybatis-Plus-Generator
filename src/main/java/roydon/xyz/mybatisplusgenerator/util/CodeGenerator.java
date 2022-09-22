package roydon.xyz.mybatisplusgenerator.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

/**
 * Created by Intellij IDEA
 * Author: yi cheng
 * Date: 2022/9/14
 * Time: 19:54
 * 代码生成器·
 **/
public class CodeGenerator {

    public static void main(String[] args) {
        generate();
    }

    private static void generate() {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mybatis-plus-first?serverTimezone=GMT%2b8", "root", "qwer1234")
                .globalConfig(builder -> {
                    builder.author("roydon") // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\JAVA\\IDEA\\IDEAProjects\\Mybatis-Plus-Generator\\src\\main\\java\\"); // 指定输出目录，到java
                })
                .packageConfig(builder -> {
                    builder.parent("roydon.xyz.mybatisplusgenerator") // 设置父包名
                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\JAVA\\IDEA\\IDEAProjects\\Mybatis-Plus-Generator\\src\\main\\resources\\mapper\\")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.entityBuilder().enableLombok();
//                    builder.mapperBuilder().enableMapperAnnotation().build();
                    builder.controllerBuilder().enableHyphenStyle()  // 开启驼峰转连字符
                            .enableRestStyle();  // 开启生成@RestController 控制器
                    builder.addInclude("tb_user") // 设置需要生成的表名
                            .addTablePrefix("t_", "sys_","tb_"); // 设置过滤表前缀
                })
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
