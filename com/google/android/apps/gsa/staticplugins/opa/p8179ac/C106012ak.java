package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.android.apps.gsa.staticplugins.opa.C109722n;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.ak */
/* compiled from: PG */
public final /* synthetic */ class C106012ak implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106023av f295959a;

    /* renamed from: b */
    public final /* synthetic */ String f295960b;

    public /* synthetic */ C106012ak(C106023av avVar, String str) {
        this.f295959a = avVar;
        this.f295960b = str;
    }

    public final void run() {
        C106023av avVar = this.f295959a;
        try {
            ((C109722n) avVar.f295980a.f296028z).mo98049b(this.f295960b);
        } catch (Exception e) {
            C59104x c = C106025ax.f295983a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24661)).mo56386p("Failed to exit correctly on exitApp() call.");
        }
    }
}
