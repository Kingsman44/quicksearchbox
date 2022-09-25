package com.google.android.libraries.notifications;

import android.os.SystemClock;

/* renamed from: com.google.android.libraries.notifications.h */
/* compiled from: PG */
public abstract class C30007h {
    /* renamed from: d */
    public static C30007h m55637d() {
        C29781c cVar = new C29781c();
        cVar.f80703a = null;
        cVar.mo34976b(SystemClock.uptimeMillis());
        return cVar.mo34975a();
    }

    /* renamed from: a */
    public abstract long mo34983a();

    /* renamed from: b */
    public abstract Long mo34984b();

    /* renamed from: e */
    public final C30007h mo35311e(long j) {
        if (mo35312f()) {
            return this;
        }
        C29781c cVar = new C29781c();
        cVar.f80703a = Long.valueOf(Math.max(0, mo34984b().longValue() - j));
        cVar.mo34976b(mo34983a());
        return cVar.mo34975a();
    }

    /* renamed from: f */
    public final boolean mo35312f() {
        return mo34984b() == null;
    }

    /* renamed from: c */
    public final long mo35310c() {
        Long b = mo34984b();
        b.getClass();
        return Math.max(0, b.longValue() - (SystemClock.uptimeMillis() - mo34983a()));
    }
}
