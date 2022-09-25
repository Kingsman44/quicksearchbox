package com.google.android.libraries.p1623at.p1632e;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.lang.reflect.Method;

/* renamed from: com.google.android.libraries.at.e.e */
/* compiled from: PG */
public final class C19557e {

    /* renamed from: a */
    private static final Method f54451a;

    /* renamed from: b */
    private static final Method f54452b;

    /* renamed from: c */
    private static final Method f54453c;

    /* renamed from: d */
    private static final Method f54454d;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            method3 = cls.getMethod("get", new Class[]{String.class, String.class});
            try {
                method2 = cls.getMethod("getInt", new Class[]{String.class, Integer.TYPE});
                try {
                    method = cls.getMethod("getLong", new Class[]{String.class, Long.TYPE});
                    try {
                        Method method5 = cls.getMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                        f54451a = method3;
                        f54452b = method2;
                        f54453c = method;
                        f54454d = method5;
                    } catch (Exception e) {
                        e = e;
                        try {
                            e.printStackTrace();
                            f54451a = method3;
                            f54452b = method2;
                            f54453c = method;
                            f54454d = null;
                        } catch (Throwable th) {
                            th = th;
                            f54451a = method3;
                            f54452b = method2;
                            f54453c = method;
                            f54454d = null;
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    method = null;
                    e.printStackTrace();
                    f54451a = method3;
                    f54452b = method2;
                    f54453c = method;
                    f54454d = null;
                } catch (Throwable th2) {
                    th = th2;
                    method = null;
                    f54451a = method3;
                    f54452b = method2;
                    f54453c = method;
                    f54454d = null;
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                method4 = null;
                method = method2;
                e.printStackTrace();
                f54451a = method3;
                f54452b = method2;
                f54453c = method;
                f54454d = null;
            } catch (Throwable th3) {
                th = th3;
                method2 = null;
                method = method2;
                f54451a = method3;
                f54452b = method2;
                f54453c = method;
                f54454d = null;
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            method3 = null;
            method4 = null;
            method = method2;
            e.printStackTrace();
            f54451a = method3;
            f54452b = method2;
            f54453c = method;
            f54454d = null;
        } catch (Throwable th4) {
            th = th4;
            method3 = null;
            method2 = null;
            method = method2;
            f54451a = method3;
            f54452b = method2;
            f54453c = method;
            f54454d = null;
            throw th;
        }
    }

    /* renamed from: a */
    public static int m37299a(String str, int i) {
        try {
            Method method = f54452b;
            if (method != null) {
                return ((Integer) method.invoke((Object) null, new Object[]{str, Integer.valueOf(i)})).intValue();
            }
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return i;
    }

    /* renamed from: b */
    public static String m37300b(String str, String str2) {
        Exception e;
        String str3;
        try {
            Object[] objArr = {str, str2};
            str3 = null;
            String str4 = (String) f54451a.invoke((Object) null, objArr);
            if (str2 == null) {
                try {
                    if (BuildConfig.FLAVOR.equals(str4)) {
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.e("SystemProperties", "get error", e);
                    return str3;
                }
            }
            return str4;
        } catch (Exception e3) {
            String str5 = str2;
            e = e3;
            str3 = str5;
            Log.e("SystemProperties", "get error", e);
            return str3;
        }
    }

    /* renamed from: c */
    public static boolean m37301c() {
        try {
            if (f54453c != null) {
                return ((Boolean) f54454d.invoke((Object) null, new Object[]{"lens_standalone_entrypoints", false})).booleanValue();
            }
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return false;
    }
}
