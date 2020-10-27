package test;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

/**
 * @author: wcp
 * @date: 2020/10/28 00:40
 * @Description:
 */
public class Test {

  public static void main(String[] args) {
    MetaObject metaObject = SystemMetaObject.forObject(new Object());
    System.out.println(metaObject);
  }
}
