package com.uhasoft.skeleton;

import com.uhasoft.skeleton.generator.ModuleGenerator;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 @author Weihua
 @since 1.0.0 */

public class Generator  {

  private static final Map<String, String> params = new HashMap<>();
  /** 理论上，该文件夹的文件内容可随意更改，只要符合SpEL语法即可，生成的项目结构基本上就是加上package之后的结构 */
  private static final String TEMPLATE_FOLDER = "template";
  private static final String TARGET_PATH = "/Users/weihua/workspace/";

  static {
    params.put("group", "com.uhasoft");
    params.put("basePackage", "com.uhasoft.order");
    params.put("moduleName", "order");
    params.put("version", "1.0.0-SNAPSHOT");
  }

  public static void main(String[] args){
    File root = new File(Generator.class.getClassLoader().getResource(TEMPLATE_FOLDER).getFile());
    new ModuleGenerator(root, new File(TARGET_PATH + params.get("moduleName")), params).run();
  }

}
