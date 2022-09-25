package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.apps.gsa.staticplugins.p8793w.p8802c.C117847x;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.av */
/* compiled from: PG */
public final /* synthetic */ class C13738av implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13742az f41883a;

    public /* synthetic */ C13738av(C13742az azVar) {
        this.f41883a = azVar;
    }

    public final C60870cx apply(Object obj) {
        C13742az azVar = this.f41883a;
        if (((Boolean) obj).booleanValue()) {
            C59104x b = C13742az.f41895a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PolicyPicker");
            ((C59052c) ((C59052c) b).mo56372aa(45003)).mo56386p("Follow on query.");
            C13883n nVar = azVar.f41906l;
            C13877h hVar = new C13877h(nVar);
            C60870cx m = C60856cj.m92904m(C47810es.m84978r(hVar), nVar.f42296b);
            C13737au auVar = C13737au.f41882a;
            return C60922j.m93045h(m, C47810es.m84966f(auVar), C60826bg.f164896a);
        }
        C59104x b2 = C13742az.f41895a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "PolicyPicker");
        C59052c cVar = (C59052c) ((C59052c) b2).mo56372aa(45002);
        C13750bc a = C13750bc.m29999a(((C13751bd) azVar.f41905k.mo17428b()).f41929a);
        if (a == null) {
            a = C13750bc.UNSPECIFIED;
        }
        cVar.mo56389s("Fetch Policy Override: %s", a);
        C13750bc a2 = C13750bc.m29999a(((C13751bd) azVar.f41905k.mo17428b()).f41929a);
        if (a2 == null) {
            a2 = C13750bc.UNSPECIFIED;
        }
        if (a2.ordinal() != 0) {
            C13750bc a3 = C13750bc.m29999a(((C13751bd) azVar.f41905k.mo17428b()).f41929a);
            if (a3 == null) {
                a3 = C13750bc.UNSPECIFIED;
            }
            return C60856cj.m92900i(a3);
        }
        C60870cx a4 = ((C117847x) azVar.f41896b.mo27525b()).mo103458a();
        C13739aw awVar = C13739aw.f41884a;
        return C60922j.m93044g(a4, C47810es.m84963c(awVar), C60826bg.f164896a);
    }
}
