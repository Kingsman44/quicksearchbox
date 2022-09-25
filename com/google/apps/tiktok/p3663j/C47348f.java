package com.google.apps.tiktok.p3663j;

import com.google.common.base.C58838bb;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.j.f */
/* compiled from: PG */
public final class C47348f {

    /* renamed from: a */
    public C47350h f123067a;

    /* renamed from: b */
    private long f123068b = -1;

    /* renamed from: a */
    public final C47349g mo51221a() {
        return new C47283b(this.f123067a, this.f123068b);
    }

    /* renamed from: b */
    public final void mo51222b(long j, TimeUnit timeUnit) {
        C58838bb.m90868c(j > 0);
        this.f123068b = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
