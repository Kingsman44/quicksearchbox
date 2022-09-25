package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6071f.p6072a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76746f;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76747g;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76748h;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76757q;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122403av;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122448cm;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.common.base.C58817ah;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.p4851a.p4852a.C63324h;
import com.google.protos.p4985f.p5030q.C65195fb;
import com.google.protos.p4985f.p5030q.C65196fc;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.f.a.f */
/* compiled from: PG */
public final /* synthetic */ class C76701f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C76703h f212005a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212006b;

    public /* synthetic */ C76701f(C76703h hVar, C74965n nVar) {
        this.f212005a = hVar;
        this.f212006b = nVar;
    }

    public final Object apply(Object obj) {
        C76703h hVar = this.f212005a;
        C74965n nVar = this.f212006b;
        C122403av avVar = (C122403av) obj;
        C65196fc fcVar = avVar.f339346a;
        if (fcVar == null) {
            fcVar = C65196fc.f176453l;
        }
        C65195fb a = C65195fb.m96585a(fcVar.f176458d);
        if (a == null) {
            a = C65195fb.UNRECOGNIZED;
        }
        a.name();
        C65196fc fcVar2 = avVar.f339346a;
        if (fcVar2 == null) {
            fcVar2 = C65196fc.f176453l;
        }
        C63324h hVar2 = fcVar2.f176460f;
        if (hVar2 == null) {
            hVar2 = C63324h.f171148d;
        }
        C61752n nVar2 = hVar2.f171151b;
        if (nVar2 == null) {
            nVar2 = C61752n.f166808f;
        }
        String str = nVar2.f166811b;
        C76746f fVar = hVar.f212014e;
        C83320io k = nVar.mo71336k();
        C65196fc fcVar3 = avVar.f339346a;
        if (fcVar3 == null) {
            fcVar3 = C65196fc.f176453l;
        }
        C122448cm cmVar = avVar.f339347b;
        if (cmVar == null) {
            cmVar = C122448cm.f339454i;
        }
        C61752n nVar3 = fcVar3.f176459e;
        if (nVar3 == null) {
            nVar3 = C61752n.f166808f;
        }
        C76757q qVar = (C76757q) fVar;
        qVar.mo72321f("iIntentName", nVar3.f166811b, k);
        int i = cmVar.f339456a;
        if (i > 0) {
            qVar.mo72321f("iMissingContext", Integer.toString(i), k);
        }
        C65195fb a2 = C65195fb.m96585a(fcVar3.f176458d);
        if (a2 == null) {
            a2 = C65195fb.UNRECOGNIZED;
        }
        if (!a2.equals(C65195fb.NO_ERROR)) {
            C65195fb a3 = C65195fb.m96585a(fcVar3.f176458d);
            if (a3 == null) {
                a3 = C65195fb.UNRECOGNIZED;
            }
            qVar.mo72321f("iStatus", a3.name(), k);
        }
        Collection.EL.stream(cmVar.f339457b).forEach(new C76747g(qVar, k));
        C19088t tVar = fcVar3.f176462h;
        if (tVar == null) {
            tVar = C19088t.f53533p;
        }
        Collection.EL.stream(tVar.f53548n).forEach(new C76748h(qVar, k));
        qVar.mo72320e(cmVar.f339458c, k);
        C65196fc fcVar4 = avVar.f339346a;
        return fcVar4 == null ? C65196fc.f176453l : fcVar4;
    }
}
