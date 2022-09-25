package com.google.android.apps.gsa.staticplugins.fedass.p7940b;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100741g;
import com.google.android.libraries.assistant.trainingcache.agsa.C19427e;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5228m.C67337cn;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.b.u */
/* compiled from: PG */
public final /* synthetic */ class C100790u implements C100741g {

    /* renamed from: a */
    public final /* synthetic */ C100768ag f281707a;

    public /* synthetic */ C100790u(C100768ag agVar) {
        this.f281707a = agVar;
    }

    /* renamed from: a */
    public final void mo92032a(Object obj) {
        C100768ag agVar = this.f281707a;
        C67337cn cnVar = (C67337cn) obj;
        if (cnVar == null) {
            ((C59052c) ((C59052c) C100768ag.f281663a.mo56225c()).mo56372aa(19552)).mo56386p("Policy config not found!!");
            return;
        }
        C19427e eVar = (C19427e) agVar.f281666d.mo27525b();
        if (!eVar.f54329b.get()) {
            C59104x c = C19427e.f54328a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EkhoWriterWrap");
            ((C59052c) ((C59052c) c).mo56372aa(47837)).mo56386p("refreshPolicy called before init.");
            return;
        }
        EkhoWriter.nativeResetPolicyConfig(((EkhoWriter) eVar.f54333f.get()).f54364a.get(), cnVar.toByteArray());
    }
}
