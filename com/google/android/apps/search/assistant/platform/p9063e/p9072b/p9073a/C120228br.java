package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.gsa.binaries.satin.app.aen;
import com.google.android.apps.gsa.binaries.satin.app.aep;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4449cd.p4450a.C57934a;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5082b.p5083a.p5084a.C65482b;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.br */
/* compiled from: PG */
public final /* synthetic */ class C120228br implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C120235by f334570a;

    /* renamed from: b */
    public final /* synthetic */ C120816a f334571b;

    public /* synthetic */ C120228br(C120235by byVar, C120816a aVar) {
        this.f334570a = byVar;
        this.f334571b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C120235by byVar = this.f334570a;
        C120816a aVar = this.f334571b;
        if (byVar.f334584b == null) {
            aen aen = byVar.f334585c;
            aen.f195571e = byVar.f334588f.mo54628a("OnlineProcessingGraph");
            aVar.getClass();
            aen.f195572f = aVar;
            C68225k.m98529a(aen.f195571e, C57934a.class);
            C68225k.m98529a(aen.f195572f, C120816a.class);
            byVar.f334584b = new aep(aen.f195567a, aen.f195568b, aen.f195569c, aen.f195570d, aen.f195571e, aen.f195572f);
            return byVar.mo104700a(byVar.f334584b);
        }
        throw new C120236bz("Cannot start speech recognition when online processing is already running", C65482b.SPEECH_RECOGNITION_REQUESTED_IN_ILLEGAL_STATE, (Throwable) null);
    }
}
