package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.gsa.sidekick.main.entry.C91326bd;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7862ms;
import com.google.p375ai.p378b.C7874nd;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.bk */
/* compiled from: PG */
public final class C91526bk implements C91326bd {

    /* renamed from: b */
    private static final C58528ij f255280b = C58528ij.m90013M(C7681g.NOTIFICATION_FEEDBACK_THUMBS_UP, C7681g.NOTIFICATION_FEEDBACK_THUMBS_DOWN, C7681g.DISAMBIGUATION_QUESTION_HERE, C7681g.DISAMBIGUATION_QUESTION_NOT_HERE);

    /* renamed from: a */
    final C7718hj f255281a;

    public C91526bk(C7718hj hjVar) {
        this.f255281a = hjVar;
    }

    /* renamed from: a */
    public final C58833ax mo85522a(C7718hj hjVar) {
        if (!this.f255281a.equals(hjVar)) {
            return C58836b.f156633a;
        }
        C7711hc hcVar = (C7711hc) hjVar.toBuilder();
        C7874nd ndVar = ((C7718hj) hcVar.instance).f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        C7862ms msVar = (C7862ms) ndVar.toBuilder();
        msVar.copyOnWrite();
        ((C7874nd) msVar.instance).f27604p = C7874nd.emptyProtobufList();
        C7874nd ndVar2 = ((C7718hj) hcVar.instance).f26938J;
        if (ndVar2 == null) {
            ndVar2 = C7874nd.f27577J;
        }
        for (C7526an anVar : ndVar2.f27604p) {
            C58528ij ijVar = f255280b;
            C7681g a = C7681g.m22802a(anVar.f26060j);
            if (a == null) {
                a = C7681g.INVALID;
            }
            if (!ijVar.contains(a)) {
                msVar.copyOnWrite();
                C7874nd ndVar3 = (C7874nd) msVar.instance;
                anVar.getClass();
                C62971cq cqVar = ndVar3.f27604p;
                if (!cqVar.mo58948c()) {
                    ndVar3.f27604p = C62942bv.mutableCopy(cqVar);
                }
                ndVar3.f27604p.add(anVar);
            }
        }
        hcVar.copyOnWrite();
        C7718hj hjVar2 = (C7718hj) hcVar.instance;
        C7874nd ndVar4 = (C7874nd) msVar.build();
        ndVar4.getClass();
        hjVar2.f26938J = ndVar4;
        hjVar2.f26955a |= 1073741824;
        return C58833ax.m90834k((C7718hj) hcVar.build());
    }
}
