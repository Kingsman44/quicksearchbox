package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.p489g.p493c.C9133f;
import com.google.common.base.C58839bc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7874nd;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.ag */
/* compiled from: PG */
final class C91492ag implements C58839bc {

    /* renamed from: a */
    final /* synthetic */ long f255199a;

    /* renamed from: b */
    final /* synthetic */ C91500ao f255200b;

    public C91492ag(C91500ao aoVar, long j) {
        this.f255200b = aoVar;
        this.f255199a = j;
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
        if (C91525bj.m149693f(ndVar) == null || C91525bj.m149698k(fVar, this.f255200b.f255219e.mo79746e(C90010bp.f246973ap), this.f255200b.f255219e.mo79746e(C90010bp.f246974aq)) > this.f255199a) {
            return false;
        }
        C7718hj hjVar2 = fVar.f31432b;
        if (hjVar2 == null) {
            hjVar2 = C7718hj.f26927af;
        }
        C7746ik a = C7746ik.m22834a(hjVar2.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        return a != C7746ik.REMINDER;
    }
}
