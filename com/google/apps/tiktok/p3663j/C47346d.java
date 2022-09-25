package com.google.apps.tiktok.p3663j;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.j.d */
/* compiled from: PG */
public final class C47346d {

    /* renamed from: a */
    private long f123064a;

    /* renamed from: b */
    private final long f123065b = TimeUnit.MILLISECONDS.convert(3, TimeUnit.MINUTES);

    /* renamed from: c */
    private final List f123066c = new ArrayList();

    /* renamed from: a */
    public final C47347e mo51218a() {
        C58838bb.m90884s(this.f123064a != 0, "You must specify a minimum sync interval for all syncs.");
        C58490gz gzVar = new C58490gz(4);
        for (C47349g gVar : this.f123066c) {
            gzVar.mo55429h(gVar.mo51164b(), gVar);
        }
        return new C47278a(this.f123064a, this.f123065b, gzVar.mo55427f(true));
    }

    /* renamed from: b */
    public final void mo51219b(C47349g gVar) {
        this.f123066c.add(gVar);
    }

    /* renamed from: c */
    public final void mo51220c(long j, TimeUnit timeUnit) {
        this.f123064a = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
