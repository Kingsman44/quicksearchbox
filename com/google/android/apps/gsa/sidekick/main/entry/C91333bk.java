package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.p489g.p490a.C9116a;
import com.google.android.apps.p489g.p490a.C9117b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.bk */
/* compiled from: PG */
public final class C91333bk implements C91326bd {

    /* renamed from: a */
    private final C7669fo f254885a;

    public C91333bk(C7669fo foVar) {
        this.f254885a = foVar;
    }

    /* renamed from: a */
    public final C58833ax mo85522a(C7718hj hjVar) {
        Object obj;
        C7669fo foVar = this.f254885a;
        C7669fo foVar2 = hjVar.f26968i;
        if (foVar2 == null) {
            foVar2 = C7669fo.f26633e;
        }
        if (foVar.equals(foVar2)) {
            C62940bt r0 = C62942bv.checkIsLite(C9117b.f31386e);
            hjVar.mo58887l(r0);
            Object l = hjVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C9117b bVar = (C9117b) obj;
            if (!bVar.f31390c) {
                C9116a aVar = (C9116a) bVar.toBuilder();
                aVar.copyOnWrite();
                C9117b bVar2 = (C9117b) aVar.instance;
                bVar2.f31388a |= 2;
                bVar2.f31390c = true;
                C7711hc hcVar = (C7711hc) C7718hj.f26927af.createBuilder(hjVar);
                hcVar.mo58885m(C9117b.f31386e, (C9117b) aVar.build());
                return C58833ax.m90834k((C7718hj) hcVar.build());
            }
        }
        return C58836b.f156633a;
    }
}
