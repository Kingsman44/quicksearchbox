package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95065ab;
import com.google.android.p10712d.C142310ap;
import com.google.android.p10712d.C142311aq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.as */
/* compiled from: PG */
final class C95341as implements C95065ab {

    /* renamed from: a */
    final /* synthetic */ C95345aw f266741a;

    public C95341as(C95345aw awVar) {
        this.f266741a = awVar;
    }

    /* renamed from: c */
    public final void mo88997c() {
        C58976aa aaVar = C58975e.f156826a;
        ((C95373bx) this.f266741a.f266757k.mo27525b()).f266875e = 5;
        C142310ap apVar = (C142310ap) C142311aq.f386076d.createBuilder();
        apVar.copyOnWrite();
        C142311aq aqVar = (C142311aq) apVar.instance;
        aqVar.f386078a |= 1;
        aqVar.f386079b = false;
        apVar.copyOnWrite();
        C142311aq aqVar2 = (C142311aq) apVar.instance;
        aqVar2.f386078a |= 2;
        aqVar2.f386080c = true;
        C59104x b = C95345aw.f266745a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoBluetoothDevice");
        ((C59052c) ((C59052c) b).mo56372aa(14925)).mo56386p("Sent MicClose with abort");
        this.f266741a.mo89257D(9, 6, ((C142311aq) apVar.build()).toByteArray());
    }

    /* renamed from: d */
    public final void mo88998d() {
        throw null;
    }

    /* renamed from: f */
    public final void mo88999f() {
        C58976aa aaVar = C58975e.f156826a;
        ((C95373bx) this.f266741a.f266757k.mo27525b()).f266875e = 4;
        C142310ap apVar = (C142310ap) C142311aq.f386076d.createBuilder();
        apVar.copyOnWrite();
        C142311aq aqVar = (C142311aq) apVar.instance;
        aqVar.f386078a |= 1;
        aqVar.f386079b = true;
        apVar.copyOnWrite();
        C142311aq aqVar2 = (C142311aq) apVar.instance;
        aqVar2.f386078a |= 2;
        aqVar2.f386080c = true;
        C59104x b = C95345aw.f266745a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoBluetoothDevice");
        ((C59052c) ((C59052c) b).mo56372aa(14926)).mo56386p("Sent MicOpen");
        this.f266741a.mo89257D(9, 6, ((C142311aq) apVar.build()).toByteArray());
    }
}
