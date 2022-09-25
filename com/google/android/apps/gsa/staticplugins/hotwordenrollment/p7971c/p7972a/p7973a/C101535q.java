package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49951fa;
import com.google.assistant.p3861at.C49952fb;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66595bu;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C101535q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C101510ae f283359a;

    public /* synthetic */ C101535q(C101510ae aeVar) {
        this.f283359a = aeVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C101510ae aeVar = this.f283359a;
        Void voidR = (Void) obj;
        C59104x b = C101510ae.f283274a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HomeEnrollTaskRunner");
        ((C59052c) ((C59052c) b).mo56372aa(20299)).mo56386p("Retrain utterances ready");
        aeVar.f283285l.mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_GCM_RETRAIN_UPDATE);
        acw acw = (acw) acx.f128971H.createBuilder();
        C49951fa faVar = (C49951fa) C49952fb.f129857j.createBuilder();
        faVar.copyOnWrite();
        C49952fb fbVar = (C49952fb) faVar.instance;
        fbVar.f129859a |= 32;
        fbVar.f129864f = true;
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C49952fb fbVar2 = (C49952fb) faVar.build();
        fbVar2.getClass();
        acx.f128999p = fbVar2;
        acx.f128984a |= 65536;
        C60870cx k = aeVar.f283276c.k(aeVar.f283281h.mo79689w(aeVar.f283280g), (C66595bu) aeVar.f283275b.mo87020a().mo56111f(), (acx) acw.build(), 25, TimeUnit.SECONDS, aeVar.getClass().getSimpleName());
        C22871g gVar = aeVar.f283279f;
        return gVar.mo28205e(gVar.mo28209i(k, "GCM retraining update success", C101508ac.f283272a), "catching send GCM retraining update", Throwable.class, C101509ad.f283273a);
    }
}
