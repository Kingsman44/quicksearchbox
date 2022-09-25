package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.p291h.C5630q;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.c.a.at */
/* compiled from: PG */
public final class C5841at {

    /* renamed from: a */
    public static final Lock f17440a;

    /* renamed from: b */
    private static final Paint f17441b = new Paint(6);

    /* renamed from: c */
    private static final Paint f17442c = new Paint(7);

    /* renamed from: d */
    private static final Paint f17443d;

    /* renamed from: e */
    private static final Set f17444e;

    static {
        Lock lock;
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f17444e = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lock = new ReentrantLock();
        } else {
            lock = new C5840as();
        }
        f17440a = lock;
        Paint paint = new Paint(7);
        f17443d = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static int m15099a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static Bitmap.Config m15100b(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: c */
    public static Bitmap m15101c(C5642d dVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap a = dVar.mo12113a(i, i2, m15100b(bitmap));
        a.setHasAlpha(bitmap.hasAlpha());
        m15106h(bitmap, a, matrix);
        return a;
    }

    /* renamed from: d */
    public static Bitmap m15102d(C5642d dVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return m15104f(dVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: e */
    public static Bitmap m15103e(C5642d dVar, Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap l = m15110l(dVar, bitmap);
        Bitmap a = dVar.mo12113a(min, min, m15109k(bitmap));
        a.setHasAlpha(true);
        Lock lock = f17440a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(a);
            canvas.drawCircle(f2, f2, f2, f17442c);
            canvas.drawBitmap(l, (Rect) null, rectF, f17443d);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
            if (!l.equals(bitmap)) {
                dVar.mo12116d(l);
            }
            return a;
        } catch (Throwable th) {
            f17440a.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public static Bitmap m15104f(C5642d dVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap a = dVar.mo12113a((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m15100b(bitmap));
        a.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Log.v("TransformationUtils", "toFit:   " + width + "x" + height);
            int width2 = a.getWidth();
            int height2 = a.getHeight();
            Log.v("TransformationUtils", "toReuse: " + width2 + "x" + height2);
            StringBuilder sb = new StringBuilder("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m15106h(bitmap, a, matrix);
        return a;
    }

    /* renamed from: g */
    public static Bitmap m15105g(C5642d dVar, Bitmap bitmap, int i) {
        C5630q.m14604a(i > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config k = m15109k(bitmap);
        Bitmap l = m15110l(dVar, bitmap);
        Bitmap a = dVar.mo12113a(l.getWidth(), l.getHeight(), k);
        a.setHasAlpha(true);
        BitmapShader bitmapShader = new BitmapShader(l, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) a.getWidth(), (float) a.getHeight());
        Lock lock = f17440a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(a);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = (float) i;
            canvas.drawRoundRect(rectF, f, f, paint);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
            if (!l.equals(bitmap)) {
                dVar.mo12116d(l);
            }
            return a;
        } catch (Throwable th) {
            f17440a.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public static void m15106h(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f17440a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f17441b);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
        } catch (Throwable th) {
            f17440a.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    public static void m15107i(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* renamed from: j */
    public static boolean m15108j(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: k */
    private static Bitmap.Config m15109k(Bitmap bitmap) {
        return Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: l */
    private static Bitmap m15110l(C5642d dVar, Bitmap bitmap) {
        Bitmap.Config k = m15109k(bitmap);
        if (k.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap a = dVar.mo12113a(bitmap.getWidth(), bitmap.getHeight(), k);
        new Canvas(a).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return a;
    }
}
