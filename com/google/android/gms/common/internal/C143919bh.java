package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.C144016p;

/* renamed from: com.google.android.gms.common.internal.bh */
/* compiled from: PG */
public final class C143919bh {
    /* renamed from: a */
    public static Object m233958a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: b */
    public static void m233959b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m233960c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public static void m233961d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: e */
    public static void m233962e(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    /* renamed from: f */
    public static void m233963f(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    public static void m233964g(String str) {
        if (!C144016p.m234196a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: h */
    public static void m233965h(String str) {
        if (C144016p.m234196a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: i */
    public static void m233966i(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    public static void m233967j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: k */
    public static void m233968k(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* renamed from: l */
    public static void m233969l(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* renamed from: m */
    public static void m233970m(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: n */
    public static void m233971n(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }
}
