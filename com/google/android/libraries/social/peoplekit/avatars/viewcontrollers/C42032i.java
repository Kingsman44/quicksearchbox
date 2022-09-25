package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.i */
/* compiled from: PG */
public final class C42032i extends ShapeDrawable {

    /* renamed from: a */
    private final String f109821a;

    /* renamed from: b */
    private final int f109822b;

    /* renamed from: c */
    private final Paint f109823c;

    public C42032i(Context context, String str, int i, int i2) {
        super(new OvalShape());
        this.f109821a = str;
        this.f109822b = i2;
        getPaint().setColor(i);
        Paint paint = new Paint();
        this.f109823c = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create("google-sans", 0));
        paint.setColor(C1878d.m5128a(context, R.color.quantum_white_100));
        paint.setAlpha(PrivateKeyType.INVALID);
        paint.setTextSize(C42025b.m73579a(context, str, i2));
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Rect rect = new Rect();
        Paint paint = this.f109823c;
        String str = this.f109821a;
        paint.getTextBounds(str, 0, str.length(), rect);
        String str2 = this.f109821a;
        int length = str2.length();
        float f = (float) (this.f109822b / 2);
        canvas.drawText(str2, 0, length, f, f - rect.exactCenterY(), this.f109823c);
    }
}
