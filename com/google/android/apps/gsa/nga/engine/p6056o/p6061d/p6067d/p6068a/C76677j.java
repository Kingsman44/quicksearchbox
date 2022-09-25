package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a;

import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76746f;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76751k;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76757q;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122392ak;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122448cm;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.common.base.C58817ah;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4985f.p5030q.C65195fb;
import com.google.protos.p4985f.p5030q.C65196fc;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.d.a.j */
/* compiled from: PG */
public final /* synthetic */ class C76677j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C76746f f211958a;

    /* renamed from: b */
    public final /* synthetic */ C83320io f211959b;

    public /* synthetic */ C76677j(C76746f fVar, C83320io ioVar) {
        this.f211958a = fVar;
        this.f211959b = ioVar;
    }

    public final Object apply(Object obj) {
        C76746f fVar = this.f211958a;
        C83320io ioVar = this.f211959b;
        C122392ak akVar = (C122392ak) obj;
        C65196fc fcVar = akVar.f339311a;
        if (fcVar == null) {
            fcVar = C65196fc.f176453l;
        }
        C122448cm cmVar = akVar.f339312b;
        if (cmVar == null) {
            cmVar = C122448cm.f339454i;
        }
        fVar.mo72319b(cmVar, fcVar.f176458d);
        C122448cm cmVar2 = akVar.f339312b;
        if (cmVar2 == null) {
            cmVar2 = C122448cm.f339454i;
        }
        fVar.mo72318a(cmVar2, ioVar);
        C61752n nVar = fcVar.f176459e;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        C76757q qVar = (C76757q) fVar;
        qVar.mo72321f("fIntentName", nVar.f166811b, ioVar);
        C65195fb a = C65195fb.m96585a(fcVar.f176458d);
        if (a == null) {
            a = C65195fb.UNRECOGNIZED;
        }
        if (!a.equals(C65195fb.NO_ERROR)) {
            C65195fb a2 = C65195fb.m96585a(fcVar.f176458d);
            if (a2 == null) {
                a2 = C65195fb.UNRECOGNIZED;
            }
            qVar.mo72321f("fStatus", a2.name(), ioVar);
        }
        C19088t tVar = fcVar.f176462h;
        if (tVar == null) {
            tVar = C19088t.f53533p;
        }
        Collection.EL.stream(tVar.f53548n).forEach(new C76751k(qVar, ioVar));
        return fcVar;
    }
}
