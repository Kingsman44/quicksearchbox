package com.google.android.apps.gsa.shared.p6968aa;

import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.aa.v */
/* compiled from: PG */
public abstract class C89066v {

    /* renamed from: a */
    public static final C89066v f241382a = m144891d().mo83044b();

    /* renamed from: b */
    public static final C89066v f241383b;

    static {
        C89064t d = m144891d();
        ((C89029b) d).f241298d = 3;
        d.mo83044b();
        C89064t d2 = m144891d();
        ((C89029b) d2).f241298d = 2;
        f241383b = d2.mo83044b();
    }

    /* renamed from: d */
    public static C89064t m144891d() {
        C89029b bVar = new C89029b();
        bVar.f241298d = 1;
        bVar.f241295a = C89065u.f241381a;
        bVar.f241296b = Long.MAX_VALUE;
        bVar.f241297c = 1;
        return bVar;
    }

    /* renamed from: e */
    public static C89066v m144892e(int i, int i2) {
        C89064t d = m144891d();
        ((C89029b) d).f241295a = new C89048d(i, i2);
        return d.mo83044b();
    }

    /* renamed from: a */
    public abstract long mo83012a();

    /* renamed from: b */
    public abstract C89065u mo83013b();

    /* renamed from: c */
    public abstract int mo83014c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89066v)) {
            return false;
        }
        C89066v vVar = (C89066v) obj;
        return mo83014c() == vVar.mo83014c() && mo83013b().equals(vVar.mo83013b()) && mo83012a() == vVar.mo83012a();
    }

    public final int hashCode() {
        Object[] objArr = new Object[3];
        int c = mo83014c();
        int i = c - 1;
        if (c != 0) {
            objArr[0] = Integer.valueOf(i);
            objArr[1] = mo83013b();
            objArr[2] = Long.valueOf(mo83012a());
            return Arrays.hashCode(objArr);
        }
        throw null;
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        int c = mo83014c();
        int i = c - 1;
        if (c != 0) {
            objArr[0] = Integer.valueOf(i);
            objArr[1] = mo83013b();
            objArr[2] = Long.valueOf(mo83012a());
            return String.format("ConnectivityRequirements: networkLevel=%d, networkQuality=%s, maxConnectivityCheckDurationMs=%d", objArr);
        }
        throw null;
    }
}
