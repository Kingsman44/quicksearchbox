package com.google.android.libraries.p1657ba.p1664c.p1665a;

import android.util.Log;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.ba.c.a.c */
/* compiled from: PG */
public final class C19646c {

    /* renamed from: a */
    public static final C19646c f54650a = new C19646c();

    /* renamed from: b */
    public final String f54651b = "VisionKit";

    /* renamed from: f */
    public static final String m37475f(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    /* renamed from: g */
    private final String m37476g(Object obj, String str, Object... objArr) {
        String str2;
        String f = m37475f(str, objArr);
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (obj instanceof Class) {
                name = ((Class) obj).getName();
            }
            String[] split = name.split("\\.");
            int length = split.length;
            if (length == 0) {
                str2 = BuildConfig.FLAVOR;
            } else {
                str2 = split[length - 1];
            }
        }
        return "[" + str2 + "] " + f;
    }

    /* renamed from: a */
    public final void mo24967a(Object obj, String str, Object... objArr) {
        if (mo24971e(6)) {
            Log.e(this.f54651b, m37476g(obj, str, objArr));
        }
    }

    /* renamed from: b */
    public final void mo24968b(Throwable th, String str, Object... objArr) {
        if (mo24971e(6)) {
            Log.e(this.f54651b, m37475f(str, objArr), th);
        }
    }

    /* renamed from: c */
    public final void mo24969c(Object obj, String str, Object... objArr) {
        if (mo24971e(2)) {
            Log.v(this.f54651b, m37476g(obj, str, objArr));
        }
    }

    /* renamed from: d */
    public final void mo24970d(Object obj, String str, Object... objArr) {
        if (mo24971e(5)) {
            Log.w(this.f54651b, m37476g(obj, str, objArr));
        }
    }

    /* renamed from: e */
    public final boolean mo24971e(int i) {
        return Log.isLoggable(this.f54651b, i);
    }
}
