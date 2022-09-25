package com.google.android.apps.search.googleapp.discover.p10249z;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.af */
/* compiled from: PG */
public final class C135299af {
    /* renamed from: a */
    public static final Throwable m219418a(Throwable th, Class cls) {
        if (cls.isAssignableFrom(th.getClass())) {
            return th;
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            return m219418a(cause, cls);
        }
        return null;
    }
}
