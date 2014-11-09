package com.example.apriamostopdf;

import java.io.File;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.OpenPdfButton);
        }                  	

	public void OpenPDFFile() 
	File pdfFile = new File(Environment.getExternalStorageDirectory(),"PdfFile.pdf");//File path
                	if (pdfFile.exists()) //Checking for the file is exist or not
                	{
                File file;
				if (file.exists()) {
                	Uri path = Uri.fromFile(pdfFile);
                	Intent objIntent = new Intent(Intent.ACTION_VIEW);
                	objIntent.setDataAndType(path, "application/pdf");
                	objIntent.setFlags(Intent. FLAG_ACTIVITY_CLEAR_TOP);
                	startActivity(objIntent);//Staring the pdf viewer
                    try {
                        startActivity(objIntent);
                    } 
                    catch (ActivityNotFoundException e) {
                        Toast.makeText(MainActivity.this, 
                            "No Application Available to View PDF", 
                            Toast.LENGTH_SHORT).show();
                    }
                
            
				 }
			
        
                	 }
                }
            

	
	