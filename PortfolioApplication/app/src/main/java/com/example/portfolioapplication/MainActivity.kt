package com.example.portfolioapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.btnSkills)

        buttonSkills.setOnClickListener{

            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)

        }
        val buttonEducation = findViewById<Button>(R.id.btnEducation)

        buttonEducation.setOnClickListener{

            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)

        }
        val buttonTechStack = findViewById<Button>(R.id.btnTechStack)

        buttonTechStack.setOnClickListener{

            intent = Intent(this, TechActivity::class.java)
            startActivity(intent)

        }
        val buttonAchievements = findViewById<Button>(R.id.btnAchievements)

        buttonAchievements.setOnClickListener{

            intent = Intent(this, AchivementsActivity::class.java)
            startActivity(intent)

        }

    }
}