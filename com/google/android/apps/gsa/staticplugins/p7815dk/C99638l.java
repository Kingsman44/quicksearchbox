package com.google.android.apps.gsa.staticplugins.p7815dk;

import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.assistant.p3861at.C50242pv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.p5209a.C66531b;

/* renamed from: com.google.android.apps.gsa.staticplugins.dk.l */
/* compiled from: PG */
final class C99638l extends k {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f278810a;

    /* renamed from: b */
    final /* synthetic */ C99641o f278811b;

    public C99638l(C99641o oVar, SettableFuture settableFuture) {
        this.f278811b = oVar;
        this.f278810a = settableFuture;
    }

    /* renamed from: gn */
    public final void mo91527gn(Throwable th) {
        this.f278810a.mo57357o(th);
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo91528go(Object obj) {
        C50242pv pvVar;
        Object obj2;
        C66611ci ciVar = (C66611ci) obj;
        C99641o oVar = this.f278811b;
        C62940bt r1 = C62942bv.checkIsLite(C66531b.f180946d);
        ciVar.mo58887l(r1);
        if (ciVar.f169962ag.mo58857o(r1.f169971d)) {
            C62940bt r12 = C62942bv.checkIsLite(C66531b.f180946d);
            ciVar.mo58887l(r12);
            Object l = ciVar.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj2 = r12.f169969b;
            } else {
                obj2 = r12.mo58889c(l);
            }
            pvVar = (C50242pv) obj2;
            C58976aa aaVar = C58975e.f156826a;
            if ((pvVar.f130644a & 2) != 0) {
                oVar.f278815b = pvVar.f130646c;
            }
        } else {
            pvVar = null;
        }
        if (pvVar != null) {
            this.f278810a.mo57356n(pvVar);
        } else {
            this.f278810a.mo57357o(new C90523o(0));
        }
    }
}
