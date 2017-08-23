import com.lanou.bean.Student;
import com.lanou.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by lizhongren1 on 2017/8/15.
 */
public class TestBatis {

    @Test
    public void test01() throws IOException {
//6666666666666666666666666666666666666666666
        InputStream stream = Resources.getResourceAsStream("batis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

        SqlSession session = factory.openSession();

        StudentMapper mapper = session.getMapper(StudentMapper.class);

//        List<Student> students = mapper.findAll();
//
//        System.out.println(students);

        Student student = new Student();
        student.setName("哦哦哦");
        student.setHobby("1111");
        student.setSex("male");

        Integer i = mapper.insertNewStudent(student);

        System.out.println(student);

        session.commit();

    }

}
