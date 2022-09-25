package com.google.android.apps.gsa.staticplugins.opa.promo.p8407a;

import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.phenotype.client.C31656al;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Collections;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.a.n */
/* compiled from: PG */
public final /* synthetic */ class C109892n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C109894p f306195a;

    /* renamed from: b */
    public final /* synthetic */ String f306196b;

    public /* synthetic */ C109892n(C109894p pVar, String str) {
        this.f306195a = pVar;
        this.f306196b = str;
    }

    public final C60870cx apply(Object obj) {
        C109894p pVar = this.f306195a;
        String str = this.f306196b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C59104x c = C109894p.f306198a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AcquNotifServClient");
            ((C59052c) ((C59052c) c).mo56372aa(25478)).mo56386p("Certificate not present.");
            return C60866ct.f164955a;
        }
        C70290cs csVar = new C70290cs("X-Goog-Api-Key", C70334de.f187481c);
        C70290cs csVar2 = new C70290cs("X-Android-Package", C70334de.f187481c);
        C70290cs csVar3 = new C70290cs("X-Android-Cert", C70334de.f187481c);
        C70334de deVar = new C70334de();
        deVar.mo62033h(csVar, pVar.f306200c.mo79758x(C90037cp.f248472b));
        deVar.mo62033h(csVar2, "com.google.android.googlequicksearchbox");
        deVar.mo62033h(csVar3, (String) axVar.mo56107c());
        String string = pVar.f306202e.getString("ph_server_token", (String) null);
        if (string != null) {
            deVar.mo62032g(C31656al.m58996b(Collections.singletonList(string)));
        }
        C60870cx g = C60922j.m93044g(((C89012aj) pVar.f306199b.mo27525b()).mo27501m(pVar.f306200c.mo79758x(C90037cp.f248525c), (int) pVar.f306200c.mo79743a(C90037cp.f248578d), deVar, str, 63), new C109890l(pVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}
