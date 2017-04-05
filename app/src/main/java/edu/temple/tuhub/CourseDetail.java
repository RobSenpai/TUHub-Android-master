package edu.temple.tuhub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CourseDetail extends AppCompatActivity {

    private TextView courseName;
    private TextView courseGrade;
    private View detailView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        detailView = findViewById(R.id.course_detail);
        courseName = (TextView) findViewById(R.id.course);
        courseGrade = (TextView) findViewById(R.id.grade);
        

    }
}
