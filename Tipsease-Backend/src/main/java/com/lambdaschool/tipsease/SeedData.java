package com.lambdaschool.tipsease;

import com.lambdaschool.tipsease.models.Employee;
import com.lambdaschool.tipsease.models.Role;
import com.lambdaschool.tipsease.models.User;
import com.lambdaschool.tipsease.models.UserRoles;
import com.lambdaschool.tipsease.services.EmployeeService;
import com.lambdaschool.tipsease.services.RoleService;
import com.lambdaschool.tipsease.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;

    @Autowired
    EmployeeService employeeService;


    @Override
    public void run(String[] args) throws Exception
    {
        Role r1 = new Role("admin");
        Role r2 = new Role("user");

        roleService.save(r1);
        roleService.save(r2);

        // admin, user
        ArrayList<UserRoles> admins = new ArrayList<>();
        admins.add(new UserRoles(new User(), r1));
        admins.add(new UserRoles(new User(), r2));

        User u1 = new User("Jacob Tonna", "Jtonna", "java","", admins);
        userService.save(u1);

        User u2 = new User("Admin George", "Admin", "admin","", admins);
        userService.save(u2);

        // user
        ArrayList<UserRoles> users = new ArrayList<>();
        users.add(new UserRoles(new User(), r2));

        User u3 = new User("Alex Shillingford", "Alex", "alexspassword","", users);
        userService.save(u3);

        User u4 = new User("Joseph Garcia", "Joseph", "josephspassword", "", users);
        userService.save(u4);

        User u5 = new User("Marlon Raskin", "Marlon", "marlonspassword", "", users);
        userService.save(u5);

        User u6 = new User("Victor Goico", "Victor", "vistorspassword", "", users);
        userService.save(u6);

        // these users will be employees

        // employee stuff
        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee("James F", "Quesadilla Gorilla", "https://componentcoffeelab.com/wp-content/uploads/2017/10/quesadilla-gorilla-youd-be-surprised-at-how-they-pronounce-it-300x300.png", "https://www.gannett-cdn.com/-mm-/0db0ac80146d892b7c004d14ca3b65331e5e208b/c=0-103-2000-1228/local/-/media/Visalia/2015/04/07/B9316879780Z.1_20150407200535_000_G2DAEELDN.1-0.jpg?width=3200&height=1680&fit=crop");
        employeeService.save(e1);

        Employee e2 = new Employee("Frank D", "Quesadilla Gorilla", "https://scontent-amt2-1.cdninstagram.com/vp/96eee3ca4dd27aa288434dd0df3fb2c1/5D340C0C/t51.2885-15/e35/50846629_645805099169568_5923745083951098418_n.jpg?_nc_ht=scontent-amt2-1.cdninstagram.com&se=7&ig_cache_key=MTk2ODYwOTA5Mjg4NjY0NjQ3MQ%3D%3D.2", "https://www.gannett-cdn.com/-mm-/0db0ac80146d892b7c004d14ca3b65331e5e208b/c=0-103-2000-1228/local/-/media/Visalia/2015/04/07/B9316879780Z.1_20150407200535_000_G2DAEELDN.1-0.jpg?width=3200&height=1680&fit=crop");
        employeeService.save(e2);

        Employee e3 = new Employee("Taylor Q", "Dennys", "https://s3-eu-west-1.amazonaws.com/unibudy-prod/5c750be7af6151008d051ddc.jpg", "https://socalcitykids.com/wp-content/uploads/2016/05/M2-FB-Header-2.jpg");
        employeeService.save(e3);

    }
}