import com.lanou.bean.Student;
import com.lanou.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lizhongren1 on 2017/8/15.
 */
public class TestBatis {

    @Test
    public void test01() throws IOException {

//        InputStream stream = Resources.getResourceAsStream("batis-config.xml");
//
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
//
//        SqlSession session = factory.openSession();
//
//        StudentMapper mapper = session.getMapper(StudentMapper.class);

//        List<Student> students = mapper.findAll();
//
//        System.out.println(students);

//        Student student = new Student();
//        student.setName("哦哦哦");
//        student.setHobby("1111");
//        student.setSex("male");
//
//        Integer i = mapper.insertNewStudent(student);
//
//        System.out.println(student);
//
//        session.commit();

        // 啊啊啊啊
        System.out.println("测试001");




    }
    static int full = 0;
    public static void calc(int empty) {

        Set<String> string = new HashSet<String>();
        full = full + empty / 3;
        empty = empty / 3 + empty % 3;
        if (empty >= 3) {
            calc(empty);
        }else{
            System.out.println("可以兑换："+full);
        }
    }


}
