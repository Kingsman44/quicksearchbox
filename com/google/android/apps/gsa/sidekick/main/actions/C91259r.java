package com.google.android.apps.gsa.sidekick.main.actions;

import com.google.android.apps.gsa.sidekick.main.entry.C91326bd;
import com.google.android.apps.p489g.p490a.C9116a;
import com.google.android.apps.p489g.p490a.C9117b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.sidekick.main.actions.r */
/* compiled from: PG */
public final class C91259r implements C91326bd {

    /* renamed from: a */
    public final Set f254703a;

    public C91259r(Set set) {
        this.f254703a = set;
    }

    /* renamed from: a */
    public final C58833ax mo85522a(C7718hj hjVar) {
        Object obj;
        Set set = this.f254703a;
        C7669fo foVar = hjVar.f26968i;
        if (foVar == null) {
            foVar = C7669fo.f26633e;
        }
        if (set.contains(foVar)) {
            C62940bt r0 = C62942bv.checkIsLite(C9117b.f31386e);
            hjVar.mo58887l(r0);
            Object l = hjVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C9117b bVar = (C9117b) obj;
            if (!bVar.f31389b) {
                C9116a aVar = (C9116a) bVar.toBuilder();
                aVar.copyOnWrite();
                C9117b bVar2 = (C9117b) aVar.instance;
                bVar2.f31388a |= 1;
                bVar2.f31389b = true;
                C7711hc hcVar = (C7711hc) C7718hj.f26927af.createBuilder(hjVar);
                hcVar.mo58885m(C9117b.f31386e, (C9117b) aVar.build());
                return C58833ax.m90834k((C7718hj) hcVar.build());
            }
        }
        return C58836b.f156633a;
    }
}
