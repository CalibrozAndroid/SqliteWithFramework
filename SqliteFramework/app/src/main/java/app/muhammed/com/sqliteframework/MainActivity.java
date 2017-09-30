package app.muhammed.com.sqliteframework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import app.muhammed.com.sqliteframework.models.UserModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mNameEditText;
    private EditText mPhoneEditText;

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEditText = (EditText) findViewById(R.id.nameEditText);
        mPhoneEditText = (EditText) findViewById(R.id.phoneEditText);


        mButton = (Button) findViewById(R.id.addButton);

        mButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        UserModel userModel = new UserModel();

        userModel.setName(mNameEditText.getText().toString());
        userModel.setPhone(mPhoneEditText.getText().toString());
        userModel.save();

    }
}
