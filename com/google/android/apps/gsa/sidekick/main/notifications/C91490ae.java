package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.p489g.p493c.C9133f;
import com.google.common.base.C58839bc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56956f;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.ae */
/* compiled from: PG */
final class C91490ae implements C58839bc {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        C9133f fVar = (C9133f) obj;
        if (fVar == null || (fVar.f31431a & 1) == 0) {
            return false;
        }
        C7718hj hjVar = fVar.f31432b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        if ((hjVar.f26955a & 1073741824) == 0) {
            return false;
        }
        C7718hj hjVar2 = fVar.f31432b;
        if (hjVar2 == null) {
            hjVar2 = C7718hj.f26927af;
        }
        C7874nd ndVar = hjVar2.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        int a = C56956f.m88243a(ndVar.f27591c);
        if (a != 0 && a == 3) {
            return true;
        }
        return false;
    }
}
