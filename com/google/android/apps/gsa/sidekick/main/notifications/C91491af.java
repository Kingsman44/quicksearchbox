package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.p489g.p493c.C9133f;
import com.google.common.base.C58839bc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.af */
/* compiled from: PG */
final class C91491af implements C58839bc {

    /* renamed from: a */
    final /* synthetic */ long f255197a;

    /* renamed from: b */
    final /* synthetic */ C91500ao f255198b;

    public C91491af(C91500ao aoVar, long j) {
        this.f255198b = aoVar;
        this.f255197a = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        C9133f fVar = (C9133f) obj;
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
        C91525bj f = C91525bj.m149693f(ndVar);
        return f != null && f.mo85866e(fVar, this.f255197a, this.f255198b.f255219e.mo79746e(C90010bp.f246973ap), this.f255198b.f255219e.mo79746e(C90010bp.f246974aq)) <= this.f255197a;
    }
}
