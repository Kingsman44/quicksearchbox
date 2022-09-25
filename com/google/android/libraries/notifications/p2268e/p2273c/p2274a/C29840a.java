package com.google.android.libraries.notifications.p2268e.p2273c.p2274a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.e.c.a.a */
/* compiled from: PG */
public final class C29840a {

    /* renamed from: a */
    public Context f80901a;

    /* renamed from: b */
    static final Rect m55235b(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = (float) width;
        float f3 = (float) height;
        float f4 = f2 / f3;
        if (f4 == f) {
            return new Rect(0, 0, width, height);
        }
        if (f4 > f) {
            int i = (int) (f * f3);
            int i2 = (width - i) / 2;
            return new Rect(i2, 0, i + i2, height);
        }
        int i3 = (height - ((int) (f2 * f))) / 2;
        return new Rect(0, i3, width, i3 + width);
    }

    /* renamed from: c */
    public static final Bitmap m55236c(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            m55237d(canvas, list);
            Paint paint = new Paint();
            int width = canvas.getWidth();
            int i2 = width / 2;
            int i3 = width / 4;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) i3);
            paint.setColor(-16777216);
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            float f = (float) i2;
            canvas.drawCircle(f, f, (float) (i2 + (i3 / 2)), paint);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            C30058b.m55792d("ChimeImageProcessorImpl", e, "Failed to allocate memory.", new Object[0]);
            return null;
        } catch (Exception e2) {
            C30058b.m55792d("ChimeImageProcessorImpl", e2, "Failed to create circular avatar.", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    private static final void m55237d(Canvas canvas, List list) {
        Paint paint = new Paint();
        int width = canvas.getWidth();
        int i = width / 2;
        int size = list.size();
        if (size == 0) {
            C30058b.m55791c("ChimeImageProcessorImpl", "Got empty list of avatars to merge.", new Object[0]);
        } else if (size == 1) {
            canvas.drawBitmap((Bitmap) list.get(0), m55235b((Bitmap) list.get(0), 1.0f), new Rect(0, 0, width, width), paint);
        } else if (size == 2) {
            canvas.drawBitmap((Bitmap) list.get(0), m55235b((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
            canvas.drawBitmap((Bitmap) list.get(1), m55235b((Bitmap) list.get(1), 0.5f), new Rect(i, 0, width, width), paint);
        } else if (size != 3) {
            canvas.drawBitmap((Bitmap) list.get(0), m55235b((Bitmap) list.get(0), 1.0f), new Rect(0, 0, i, i), paint);
            canvas.drawBitmap((Bitmap) list.get(1), m55235b((Bitmap) list.get(1), 1.0f), new Rect(i, 0, width, i), paint);
            canvas.drawBitmap((Bitmap) list.get(2), m55235b((Bitmap) list.get(2), 1.0f), new Rect(0, i, i, width), paint);
            canvas.drawBitmap((Bitmap) list.get(3), m55235b((Bitmap) list.get(3), 1.0f), new Rect(i, i, width, width), paint);
        } else {
            canvas.drawBitmap((Bitmap) list.get(0), m55235b((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
            canvas.drawBitmap((Bitmap) list.get(1), m55235b((Bitmap) list.get(1), 1.0f), new Rect(i, 0, width, i), paint);
            canvas.drawBitmap((Bitmap) list.get(2), m55235b((Bitmap) list.get(2), 1.0f), new Rect(i, i, width, width), paint);
        }
    }

    /* renamed from: a */
    public final Bitmap mo35165a(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int dimensionPixelSize = this.f80901a.getResources().getDimensionPixelSize(R.dimen.notifications_avatar_separator_stroke_width);
            m55237d(canvas, list);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) dimensionPixelSize);
            paint.setColor(-16777216);
            int width = canvas.getWidth();
            int i2 = width / 2;
            int size = list.size();
            if (size == 0) {
                C30058b.m55791c("ChimeImageProcessorImpl", "Got empty list of images to draw seprator on.", new Object[0]);
            } else if (size == 1) {
                C30058b.m55794f("ChimeImageProcessorImpl", "Not adding any separators since there is only one image.", new Object[0]);
            } else if (size == 2) {
                float f = (float) i2;
                canvas.drawLine(f, 0.0f, f, (float) width, paint);
            } else if (size != 3) {
                float f2 = (float) i2;
                float f3 = (float) width;
                canvas.drawLine(f2, 0.0f, f2, f3, paint);
                canvas.drawLine(0.0f, f2, f3, f2, paint);
            } else {
                float f4 = (float) i2;
                float f5 = (float) width;
                canvas.drawLine(f4, 0.0f, f4, f5, paint);
                canvas.drawLine(f4, f4, f5, f4, paint);
            }
            return createBitmap;
        } catch (OutOfMemoryError e) {
            C30058b.m55792d("ChimeImageProcessorImpl", e, "Failed to allocate memory.", new Object[0]);
            return null;
        } catch (Exception e2) {
            C30058b.m55792d("ChimeImageProcessorImpl", e2, "Failed to create square avatar.", new Object[0]);
            return null;
        }
    }
}
