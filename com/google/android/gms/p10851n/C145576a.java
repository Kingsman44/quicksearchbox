package com.google.android.gms.p10851n;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.dynamite.C144149k;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.n.a */
/* compiled from: PG */
public final class C145576a {

    /* renamed from: a */
    private static final Object f393611a = new Object();

    /* renamed from: b */
    private static Method f393612b = null;

    /* renamed from: c */
    private static Method f393613c = null;

    static {
        int i = C143876h.f389990c;
    }

    /* renamed from: a */
    public static void m236656a(Context context) {
        Context context2;
        C143919bh.m233971n(context, "Context must not be null");
        C143700ab.m233443e(context, 11925000);
        synchronized (f393611a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m234354d(context, DynamiteModule.f390447c, "com.google.android.gms.providerinstaller.dynamite").f390459e;
            } catch (C144149k e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context c = C143700ab.m233441c(context);
                if (c != null) {
                    try {
                        if (f393613c == null) {
                            f393613c = m236657b(c, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, Long.TYPE, Long.TYPE});
                        }
                        f393613c.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e2) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e2.getMessage())));
                    }
                }
                if (c != null) {
                    m236658c(c, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new C144022y();
                }
            } else {
                m236658c(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            }
        }
    }

    /* renamed from: b */
    private static Method m236657b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    /* renamed from: c */
    private static void m236658c(Context context, String str) {
        try {
            if (f393612b == null) {
                f393612b = m236657b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f393612b.invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.getMessage() : cause.getMessage())));
            }
            throw new C144022y();
        }
    }
}
