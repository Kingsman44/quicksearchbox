package androidx.media3.common.p136b;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: androidx.media3.common.b.u */
/* compiled from: PG */
public final class C2633u {

    /* renamed from: a */
    private static final Object f7303a = new Object();

    /* renamed from: a */
    public static String m7046a(String str, Throwable th) {
        String str2;
        synchronized (f7303a) {
            if (th != null) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    } else if (th2 instanceof UnknownHostException) {
                        str2 = "UnknownHostException (no network)";
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                }
            } else {
                try {
                    str2 = null;
                } catch (Throwable th3) {
                    while (true) {
                        throw th3;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String replace = str2.replace("\n", "\n  ");
        return str + "\n  " + replace + "\n";
    }

    /* renamed from: b */
    public static void m7047b(String str, String str2) {
        synchronized (f7303a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: c */
    public static void m7048c(String str, String str2) {
        synchronized (f7303a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: d */
    public static void m7049d(String str, String str2) {
        synchronized (f7303a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: e */
    public static void m7050e(String str, String str2) {
        synchronized (f7303a) {
            Log.w(str, str2);
        }
    }
}
