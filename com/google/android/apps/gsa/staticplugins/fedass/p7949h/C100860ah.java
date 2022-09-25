package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import com.google.android.apps.gsa.p6482q.p6483a.C84233f;
import com.google.android.apps.gsa.p6482q.p6483a.C84235h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.ah */
/* compiled from: PG */
final class C100860ah implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f281830a;

    /* renamed from: b */
    final /* synthetic */ C100862aj f281831b;

    public C100860ah(C100862aj ajVar, boolean z) {
        this.f281831b = ajVar;
        this.f281830a = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C100862aj.f281832a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(19656)).mo56386p("Speech Personalization update failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C100862aj ajVar = this.f281831b;
        boolean z = this.f281830a;
        ((C84235h) ajVar.f281838f.mo27525b()).mo77719i("FedAss.SpeechPersonalization");
        if (!z) {
            C60870cx e = ((C84233f) ajVar.f281839g.mo27525b()).mo77708e();
            C100861ai aiVar = new C100861ai();
            C60856cj.m92911t(e, C47810es.m84974n(aiVar), ajVar.f281841i);
        }
    }
}
