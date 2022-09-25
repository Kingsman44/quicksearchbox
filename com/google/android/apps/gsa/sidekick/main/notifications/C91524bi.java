package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.p489g.p493c.C9133f;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C8174yg;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.bi */
/* compiled from: PG */
final class C91524bi extends C91525bj {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo85862a(C9133f fVar) {
        C7718hj hjVar = fVar.f31432b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C7874nd ndVar = hjVar.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        C8174yg ygVar = ndVar.f27593e;
        if (ygVar == null) {
            ygVar = C8174yg.f28719i;
        }
        return ygVar.f28725f;
    }

    /* renamed from: b */
    public final boolean mo85863b(C9133f fVar, long j, List list) {
        if (!C91525bj.m149697j(fVar, j, (Long) null) && mo85862a(fVar) >= j - 86400) {
            return false;
        }
        return true;
    }
}
