package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C101506aa implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101510ae f283270a;

    public /* synthetic */ C101506aa(C101510ae aeVar) {
        this.f283270a = aeVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C60870cx cxVar;
        C101510ae aeVar = this.f283270a;
        acz acz = (acz) obj;
        C58976aa aaVar = C58975e.f156826a;
        aeVar.f283276c.e();
        C59104x b = C101510ae.f283274a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HomeEnrollTaskRunner");
        ((C59052c) ((C59052c) b).mo56372aa(20310)).mo56386p("Running enrollment for devices");
        aeVar.f283275b.f257557b = true;
        ArrayList arrayList = new ArrayList();
        for (l lVar : aeVar.f283275b.f257559d) {
            if (lVar.f == 1) {
                C101525g gVar = aeVar.f283277d;
                if (TextUtils.isEmpty(gVar.f283350h)) {
                    ((C59052c) ((C59052c) C101525g.f283343a.mo56225c()).mo56372aa(20292)).mo56386p("#enrollCloud no account found.");
                    gVar.f283345c.mo87025f(C92362c.NO_ACCOUNT);
                    lVar.f(false);
                    cxVar = C60856cj.m92899h(new Exception("No account"));
                } else {
                    cxVar = gVar.f283346d.mo28209i(C90877ak.m148470d(gVar.f283347e, "enroll cloud with retries", new C101521c(gVar, lVar), new C101524f(), C59407o.m92309e(C59407o.m92308d(Duration.ofMillis(((C90021c) gVar.f283344b.mo27525b()).mo79743a(C90014bt.f247479ht))), (int) ((C90021c) gVar.f283344b.mo27525b()).mo79743a(C90014bt.f247480hu))), "handle cloud enrollment result", new C101522d(gVar, lVar));
                }
                arrayList.add(cxVar);
            } else {
                C101515aj ajVar = aeVar.f283278e;
                if (TextUtils.isEmpty(ajVar.f283313e)) {
                    ((C59052c) ((C59052c) C101515aj.f283310b.mo56225c()).mo56372aa(20319)).mo56386p("#checkVoiceMatchEnrollmentStatus No Account present!");
                }
                C60870cx d = C90877ak.m148470d(ajVar.f283315g, "fetch status", new C101512ag(ajVar), new C101514ai(lVar), C59407o.m92309e(C59407o.m92308d(C101515aj.f283309a), 4));
                arrayList.add(ajVar.f283315g.mo28209i(d, "check vm enrollment status", new C101513ah(ajVar, lVar, d)));
            }
        }
        new C90873ag(C60856cj.m92894c(arrayList).mo57334a(C101529k.f283353a, C60826bg.f164896a), aeVar.f283284k, "handle combined enrollment result", new C101540v(aeVar)).mo85223a(new C101541w(aeVar));
    }
}
