package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.style.ReplacementSpan;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.p3922a.C51654l;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.im */
/* compiled from: PG */
final class C108432im extends ReplacementSpan {

    /* renamed from: a */
    public final C51655m f301624a;

    /* renamed from: b */
    private final Paint f301625b;

    /* renamed from: c */
    private float f301626c;

    /* renamed from: d */
    private final float f301627d;

    public C108432im(Context context, C51655m mVar) {
        Paint paint = new Paint();
        this.f301625b = paint;
        this.f301627d = C91115n.m148870b(2.0f, context);
        int a = C51654l.m86264a(mVar.f134594d);
        int i = (a == 0 ? 1 : a) - 1;
        if (i == 1) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(C1878d.m5128a(context, R.color.google_black));
            paint.setStrokeWidth(C91115n.m148870b(1.0f, context));
            paint.setUnderlineText(true);
            paint.setAntiAlias(true);
        } else if (i == 2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(C1878d.m5128a(context, R.color.google_black));
            paint.setPathEffect(new DashPathEffect(new float[]{C91115n.m148870b(1.1f, context), C91115n.m148870b(4.0f, context)}, 0.0f));
            paint.setStrokeWidth(C91115n.m148870b(1.0f, context));
            paint.setUnderlineText(true);
            paint.setAntiAlias(true);
        } else if (i == 3) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(C1878d.m5128a(context, R.color.quantum_googblue500));
            paint.setStrokeWidth(C91115n.m148870b(1.0f, context));
            paint.setUnderlineText(true);
            paint.setAntiAlias(true);
        } else if (i == 4) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(C1878d.m5128a(context, R.color.google_red));
            paint.setStrokeWidth(C91115n.m148870b(1.0f, context));
            paint.setUnderlineText(true);
            paint.setAntiAlias(true);
            paint.setPathEffect(new CornerPathEffect(C91115n.m148870b(1.0f, context)));
        }
        this.f301624a = mVar;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = f;
        int i6 = i5;
        if (this.f301624a != null) {
            canvas.drawText(charSequence, i, i2, f, (float) i4, paint);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            float f3 = (float) (fontMetricsInt.bottom - fontMetricsInt.descent);
            Path path = new Path();
            int a = C51654l.m86264a(this.f301624a.f134594d);
            if (a != 0 && a == 5) {
                float f4 = ((float) i6) - f3;
                float f5 = this.f301626c;
                float f6 = this.f301627d;
                path.moveTo(f2, f4);
                float f7 = f6 + f6;
                float f8 = f2;
                while (true) {
                    float f9 = f2 + f5;
                    if (f8 >= f9) {
                        break;
                    }
                    float f10 = f8 + f6;
                    if (f10 > f9) {
                        path.lineTo(f9, f4 - (((f9 - f8) * f6) / f6));
                        break;
                    }
                    float f11 = f4 - f6;
                    path.lineTo(f10, f11);
                    float f12 = f8 + f7;
                    if (f12 > f9) {
                        path.lineTo(f9, f11 + ((((f9 - f8) - f6) * f6) / f6));
                        break;
                    } else {
                        path.lineTo(f12, f4);
                        f8 = f12;
                    }
                }
            } else {
                float f13 = ((float) i6) - f3;
                path.moveTo(f2, f13);
                path.lineTo(this.f301626c + f2, f13);
            }
            Canvas canvas2 = canvas;
            canvas.drawPath(path, this.f301625b);
        }
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float measureText = paint.measureText(charSequence, i, i2);
        this.f301626c = measureText;
        return Math.round(measureText);
    }
}
