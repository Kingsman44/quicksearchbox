package com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.k.a.j */
/* compiled from: PG */
public final class C77742j {

    /* renamed from: a */
    public final byte[] f214164a;

    /* renamed from: b */
    public long f214165b = 0;

    public C77742j(int i) {
        C58838bb.m90869d(i <= 1 ? false : true, "Capacity has to be >1");
        this.f214164a = new byte[i];
    }

    /* renamed from: a */
    public final int mo72805a(long j) {
        return (int) (Math.max(0, j) % ((long) this.f214164a.length));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo72806b(long j) {
        long j2 = this.f214165b - j;
        if (j2 <= 0) {
            return 0;
        }
        if (j2 > ((long) this.f214164a.length)) {
            return -1;
        }
        return Math.min(mo72807c(j), (int) j2);
    }

    /* renamed from: c */
    public final int mo72807c(long j) {
        return this.f214164a.length - mo72805a(j);
    }
}
