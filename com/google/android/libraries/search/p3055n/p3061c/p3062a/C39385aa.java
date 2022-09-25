package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i.C39618j;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.n.c.a.aa */
/* compiled from: PG */
public final class C39385aa {

    /* renamed from: b */
    private static final C59071e f103699b = C59071e.m91332i("com.google.android.libraries.search.n.c.a.aa");

    /* renamed from: a */
    public C39644z f103700a;

    /* renamed from: a */
    public final C60870cx mo41797a(C39618j jVar) {
        C39644z zVar = this.f103700a;
        if (zVar != null) {
            C59104x b = C39479cu.f103938a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b).mo56372aa(53614)).mo56386p("#onConfigUpdate");
            C39636r rVar = new C39636r();
            C39479cu cuVar = (C39479cu) zVar;
            rVar.f104346a = cuVar.mo41850k(C39389ae.INTERNAL_CONFIG_CHANGE.name());
            rVar.mo41791b(C39389ae.INTERNAL_CONFIG_CHANGE);
            C39411b a = rVar.mo41790a();
            cuVar.f103970u.mo41868a(C37176a.f97164gQ.mo40779c(), a);
            C47558bi a2 = C47831fm.m85006a("#onConfigUpdate");
            try {
                C60870cx b2 = ((C39479cu) zVar).f103955f.mo51512b(new C39444bu((C39479cu) zVar, a, jVar), ((C39479cu) zVar).f103953d);
                a2.mo51417a(b2);
                a2.close();
                return b2;
            } catch (Throwable th) {
                C39429bf.m68861a(th, th);
            }
        } else {
            ((C59052c) ((C59052c) f103699b.mo56226d()).mo56372aa(53514)).mo56386p("Receive an config update when there's no subscriber. Ignore the request!");
            return C60866ct.f164955a;
        }
        throw th;
    }
}
