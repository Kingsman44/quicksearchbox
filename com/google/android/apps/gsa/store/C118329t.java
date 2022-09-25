package com.google.android.apps.gsa.store;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.store.t */
/* compiled from: PG */
public final class C118329t {

    /* renamed from: a */
    public final C58480gp f328455a = C58485gu.m89837e();

    /* renamed from: b */
    public int f328456b = 0;

    /* renamed from: a */
    public final C118333v mo103667a(String str, byte[] bArr) {
        C118333v vVar = new C118333v(str, bArr, Long.MAX_VALUE, TimeUnit.SECONDS);
        this.f328455a.mo55395g(vVar);
        this.f328456b++;
        return vVar;
    }

    /* renamed from: b */
    public final C118333v mo103668b(String str, byte[] bArr, long j, TimeUnit timeUnit) {
        C118333v vVar = new C118333v(str, bArr, j, timeUnit);
        this.f328455a.mo55395g(vVar);
        this.f328456b++;
        return vVar;
    }

    /* renamed from: c */
    public final C118309ag mo103669c() {
        return new C118309ag(C58485gu.m89845m(), this.f328455a.mo55394f(), C58485gu.m89845m(), 4);
    }
}
