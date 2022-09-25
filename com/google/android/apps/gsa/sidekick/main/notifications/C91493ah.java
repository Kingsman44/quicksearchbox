package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.p489g.p493c.C9133f;
import com.google.common.base.C58839bc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.ah */
/* compiled from: PG */
final class C91493ah implements C58839bc {

    /* renamed from: a */
    final /* synthetic */ C91497al f255201a;

    public C91493ah(C91497al alVar) {
        this.f255201a = alVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        C9133f fVar = (C9133f) obj;
        if (fVar == null || (fVar.f31431a & 1) == 0 || !this.f255201a.mo5941a(fVar)) {
            return false;
        }
        C7718hj hjVar = fVar.f31432b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C7746ik a = C7746ik.m22834a(hjVar.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        if (a == C7746ik.REMINDER) {
            return true;
        }
        return false;
    }
}
