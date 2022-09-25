package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6157b.p6158a;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C78181d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C78185h f215253a;

    /* renamed from: b */
    public final /* synthetic */ Duration f215254b;

    public /* synthetic */ C78181d(C78185h hVar, Duration duration) {
        this.f215253a = hVar;
        this.f215254b = duration;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C78185h hVar = this.f215253a;
        Duration duration = this.f215254b;
        hVar.mo73118c(true);
        C60870cx e = C90877ak.m148471e(hVar.f215259b.mo28210j(hVar.f215261d.mo72586a(), "[NGA] call goBack from SysUi", new C78180c(hVar, duration)), duration.toMillis(), TimeUnit.MILLISECONDS, hVar.f215260c);
        return C60922j.m93045h(C60846c.m92879h(C60922j.m93045h(C60838bs.m92859i(e), new C78182e(hVar), C60826bg.f164896a), Throwable.class, new C78183f(hVar), C60826bg.f164896a), new C78184g(e), C60826bg.f164896a);
    }
}
