package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.dp */
/* compiled from: PG */
public final class C145317dp extends C145355f {

    /* renamed from: b */
    public String f392761b;

    /* renamed from: c */
    public String f392762c;

    /* renamed from: d */
    public int f392763d;

    /* renamed from: e */
    public String f392764e;

    /* renamed from: f */
    public long f392765f;

    /* renamed from: g */
    public final long f392766g;

    /* renamed from: h */
    public List f392767h;

    /* renamed from: i */
    public String f392768i;

    /* renamed from: j */
    public int f392769j;

    /* renamed from: k */
    public String f392770k;

    /* renamed from: l */
    public String f392771l;

    /* renamed from: m */
    public String f392772m;

    /* renamed from: n */
    public long f392773n = 0;

    /* renamed from: o */
    public String f392774o = null;

    public C145317dp(C145361ff ffVar, long j) {
        super(ffVar);
        this.f392766g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo120873d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo120874e() {
        mo120949a();
        C143919bh.m233958a(this.f392761b);
        return this.f392761b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo120875f() {
        mo120904g();
        mo120949a();
        C143919bh.m233958a(this.f392770k);
        return this.f392770k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo120876h() {
        String str;
        mo120904g();
        if (!this.f393011w.mo120971g().mo120923c().mo120786f(C145223ac.ANALYTICS_STORAGE)) {
            this.f393011w.mo120965ar().f392802j.mo120894a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.f393011w.mo120977o().mo121249C().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        C145323dv dvVar = this.f393011w.mo120965ar().f392802j;
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        dvVar.mo120894a(String.format("Resetting session stitching token to %s", objArr));
        this.f392772m = str;
        C144006f fVar = this.f393011w.f392924A;
        this.f392773n = System.currentTimeMillis();
    }
}
