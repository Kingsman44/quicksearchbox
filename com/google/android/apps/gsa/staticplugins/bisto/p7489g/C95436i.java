package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.staticplugins.bisto.util.C96500t;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96501u;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96502v;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96504x;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142382dg;
import com.google.android.p10712d.C142383dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.i */
/* compiled from: PG */
public final /* synthetic */ class C95436i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95444q f267042a;

    public /* synthetic */ C95436i(C95444q qVar) {
        this.f267042a = qVar;
    }

    public final void run() {
        C95444q qVar = this.f267042a;
        C59104x b = C95444q.f267052a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BaseSimpleMicControl");
        ((C59052c) ((C59052c) b).mo56372aa(14904)).mo56386p("prepareFuture complete");
        qVar.f267057f = null;
        if (qVar.f267058g) {
            C59104x b2 = C95444q.f267052a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "BaseSimpleMicControl");
            ((C59052c) ((C59052c) b2).mo56372aa(14906)).mo56386p("isLastOperationOpenMic true, opening mic");
            C142382dg dgVar = (C142382dg) C142383dh.f386354m.createBuilder();
            dgVar.copyOnWrite();
            C142383dh dhVar = (C142383dh) dgVar.instance;
            dhVar.f386356a |= 1;
            dhVar.f386357b = 0;
            dgVar.copyOnWrite();
            C142383dh dhVar2 = (C142383dh) dgVar.instance;
            dhVar2.f386358c = 1;
            dhVar2.f386356a |= 2;
            qVar.mo89368e(qVar.f267055d, new C95438k((C142383dh) dgVar.build()));
            C96501u uVar = qVar.f267053b;
            C96502v vVar = qVar.f267059h;
            C22871g gVar = (C22871g) uVar.f269986a.mo17428b();
            gVar.getClass();
            C96504x xVar = (C96504x) uVar.f269987b.mo17428b();
            xVar.getClass();
            vVar.getClass();
            C96500t tVar = new C96500t(gVar, xVar, "BaseSimpleMicControl", vVar);
            qVar.f267056e = tVar;
            qVar.f267054c.mo74813a(tVar.f269975b.getAudioSessionId());
            tVar.mo90182c();
            return;
        }
        C59104x b3 = C95444q.f267052a.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "BaseSimpleMicControl");
        ((C59052c) ((C59052c) b3).mo56372aa(14905)).mo56386p("isLastOperationOpenMic false, closing mic");
        qVar.mo88997c();
    }
}
