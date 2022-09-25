package androidx.core.p095g;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.graphics.C1943i;
import androidx.p060c.C0983m;
import androidx.p060c.C0984n;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.core.g.m */
/* compiled from: PG */
public final class C1915m {

    /* renamed from: a */
    public static final C0983m f5802a = new C0983m(16);

    /* renamed from: b */
    public static final ExecutorService f5803b;

    /* renamed from: c */
    public static final Object f5804c = new Object();

    /* renamed from: d */
    public static final C0984n f5805d = new C0984n(0);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C1920r());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5803b = threadPoolExecutor;
    }

    /* renamed from: a */
    public static C1914l m5179a(String str, Context context, C1909g gVar, int i) {
        int i2;
        int length;
        Typeface typeface = (Typeface) f5802a.mo3690d(str);
        if (typeface != null) {
            return new C1914l(typeface);
        }
        try {
            C1916n a = C1908f.m5173a(context, gVar, (CancellationSignal) null);
            if (a.f5806a != 0) {
                i2 = -2;
            } else {
                C1917o[] oVarArr = a.f5807b;
                if (oVarArr == null || (length = oVarArr.length) == 0) {
                    i2 = 1;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i4 = oVarArr[i3].f5812e;
                        if (i4 != 0) {
                            i2 = i4 < 0 ? -3 : i4;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new C1914l(i2);
            }
            Typeface a2 = C1943i.f5852a.mo5097a(context, a.f5807b, i);
            if (a2 == null) {
                return new C1914l(-3);
            }
            f5802a.mo3691e(str, a2);
            return new C1914l(a2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1914l(-1);
        }
    }

    /* renamed from: b */
    public static String m5180b(C1909g gVar, int i) {
        return gVar.f5789f + "-" + i;
    }
}
