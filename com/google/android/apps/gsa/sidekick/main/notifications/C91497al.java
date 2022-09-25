package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.p489g.p493c.C9133f;
import com.google.common.base.C58839bc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.al */
/* compiled from: PG */
final class C91497al implements C58839bc {

    /* renamed from: a */
    private final long f255207a;

    /* renamed from: b */
    private final boolean f255208b;

    /* renamed from: c */
    private final boolean f255209c;

    public C91497al(long j, boolean z, boolean z2) {
        this.f255207a = j;
        this.f255208b = z;
        this.f255209c = z2;
    }

    /* renamed from: b */
    public final boolean mo5941a(C9133f fVar) {
        if (fVar == null) {
            return false;
        }
        C7718hj hjVar = fVar.f31432b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C7874nd ndVar = hjVar.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        if (C91525bj.m149693f(ndVar) != null && C91525bj.m149696i(fVar) && C91525bj.m149698k(fVar, this.f255208b, this.f255209c) > this.f255207a) {
            return true;
        }
        return false;
    }
}
