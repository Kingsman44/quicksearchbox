package com.airbnb.lottie.p245f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.airbnb.lottie.C4838b;
import com.airbnb.lottie.p234a.p235a.C4801t;
import com.airbnb.lottie.p234a.p236b.C4809h;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: com.airbnb.lottie.f.k */
/* compiled from: PG */
public final class C4954k {

    /* renamed from: a */
    public static final ThreadLocal f15722a = new C4953j();

    /* renamed from: b */
    private static final ThreadLocal f15723b = new C4950g();

    /* renamed from: c */
    private static final ThreadLocal f15724c = new C4951h();

    /* renamed from: d */
    private static final ThreadLocal f15725d = new C4952i();

    /* renamed from: e */
    private static final float f15726e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f */
    private static float f15727f = -1.0f;

    /* renamed from: a */
    public static float m13718a() {
        float f = f15727f;
        if (f != -1.0f) {
            return f;
        }
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        f15727f = f2;
        return f2;
    }

    /* renamed from: b */
    public static float m13719b(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: c */
    public static float m13720c(Matrix matrix) {
        float[] fArr = (float[]) f15722a.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f15726e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    /* renamed from: d */
    public static int m13721d(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: e */
    public static Bitmap m13722e(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: f */
    public static Path m13723f(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            Path path2 = path;
            path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: g */
    public static void m13724g(Path path, C4801t tVar) {
        if (tVar != null && !tVar.f15286a) {
            m13725h(path, ((C4809h) tVar.f15287b).mo9744k() / 100.0f, ((C4809h) tVar.f15288c).mo9744k() / 100.0f, ((C4809h) tVar.f15289d).mo9744k() / 360.0f);
        }
    }

    /* renamed from: h */
    public static void m13725h(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) f15723b.get();
        Path path2 = (Path) f15724c.get();
        Path path3 = (Path) f15725d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C4838b.m13493a();
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 4.0f)) < 0.01d) {
            C4838b.m13493a();
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C4949f.m13710d(min, length);
                max = (float) C4949f.m13710d(max, length);
            }
            if (min < 0.0f) {
                min = (float) C4949f.m13710d(min, length);
            }
            if (max < 0.0f) {
                max = (float) C4949f.m13710d(max, length);
            }
            if (min == max) {
                path.reset();
                C4838b.m13493a();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C4838b.m13493a();
        }
    }

    /* renamed from: i */
    public static void m13726i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    public static boolean m13727j(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: k */
    public static boolean m13728k(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }

    /* renamed from: l */
    public static void m13729l(Canvas canvas, RectF rectF, Paint paint) {
        canvas.saveLayer(rectF, paint);
        C4838b.m13493a();
    }
}
