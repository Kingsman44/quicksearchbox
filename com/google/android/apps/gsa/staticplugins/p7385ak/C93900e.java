package com.google.android.apps.gsa.staticplugins.p7385ak;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.e */
/* compiled from: PG */
public final /* synthetic */ class C93900e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93914s f262245a;

    /* renamed from: b */
    public final /* synthetic */ long f262246b;

    /* renamed from: c */
    public final /* synthetic */ Instant f262247c;

    public /* synthetic */ C93900e(C93914s sVar, long j, Instant instant) {
        this.f262245a = sVar;
        this.f262246b = j;
        this.f262247c = instant;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93914s sVar = this.f262245a;
        long j = this.f262246b;
        if (((Instant) obj).plus(Duration.ofDays(j)).isBefore(this.f262247c)) {
            return sVar.mo78409a();
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }
}
