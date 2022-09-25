package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.n.c.a.bq */
/* compiled from: PG */
public final /* synthetic */ class C39440bq implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103829a;

    /* renamed from: b */
    public final /* synthetic */ C39393ai f103830b;

    /* renamed from: c */
    public final /* synthetic */ C39411b f103831c;

    public /* synthetic */ C39440bq(C39479cu cuVar, C39393ai aiVar, C39411b bVar) {
        this.f103829a = cuVar;
        this.f103830b = aiVar;
        this.f103831c = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39479cu cuVar = this.f103829a;
        C39393ai aiVar = this.f103830b;
        C39411b bVar = this.f103831c;
        if (aiVar.mo41808a() == C39392ah.AUDIO_END_ERROR) {
            C59104x d = C39479cu.f103938a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) d).mo56372aa(53586)).mo56354G("#onError. Inside sequencer. Try to start hotword again. Error code: %s, error message: %s", aiVar.mo41808a(), aiVar.mo41809b());
        } else {
            C59104x c = C39479cu.f103938a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) c).mo56372aa(53584)).mo56354G("#onError. Inside sequencer. Try to start hotword again. Error code: %s, error message: %s", aiVar.mo41808a(), aiVar.mo41809b());
        }
        if (!cuVar.f103971v.get()) {
            C59104x d2 = C39479cu.f103938a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) d2).mo56372aa(53585)).mo56386p("HDM is not initialized, ignored the error.");
            return C60866ct.f164955a;
        }
        C60870cx h = cuVar.mo41847h();
        C39446bw bwVar = new C39446bw(cuVar, bVar, aiVar);
        return C60922j.m93045h(h, C47810es.m84966f(bwVar), cuVar.f103953d);
    }
}
