package app.muhammed.com.sqliteframework.models;

import com.orm.SugarRecord;

/**
 * Created by Muhammed on 30/09/17.
 */

public class UserModel extends SugarRecord<UserModel> {

    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
