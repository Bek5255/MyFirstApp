package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HumansList extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humans_list);
        imageButton = (ImageButton) findViewById(R.id.image);
        imageButton.setImageBitmap(getRoundedCornerBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.photo)));
        imageButton2 = (ImageButton) findViewById(R.id.image2);
        imageButton2.setImageBitmap(getRoundedCornerBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.photo2)));
        imageButton3 = (ImageButton) findViewById(R.id.image3);
        imageButton3.setImageBitmap(getRoundedCornerBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.photo3)));
        imageButton4 = (ImageButton) findViewById(R.id.image4);
        imageButton4.setImageBitmap(getRoundedCornerBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.photo4)));
        imageButton5 = (ImageButton) findViewById(R.id.image5);
        imageButton5.setImageBitmap(getRoundedCornerBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.photo5)));

    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap) {
        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);
        final int color = 0xff424242;
        final Paint paint = new Paint();
        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        final RectF rectF = new RectF(rect);
        final float roundPx = bitmap.getWidth();
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(color);
        canvas.drawRoundRect(rectF, roundPx, roundPx, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return output;
    }
}