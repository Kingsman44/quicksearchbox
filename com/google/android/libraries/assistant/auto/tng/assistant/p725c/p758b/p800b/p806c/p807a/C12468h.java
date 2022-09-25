package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a;

import com.google.android.apps.gsa.binaries.satin.app.abm;
import com.google.android.apps.gsa.binaries.satin.app.abo;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.C12477c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.C12478d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.C12479e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13061g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13063i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13065k;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13067m;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13068n;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15489o;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15494t;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p961c.C13435c;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p961c.C13436d;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4449cd.p4450a.C57934a;
import com.google.p4449cd.p4462i.C58048g;
import dagger.p5294a.C68225k;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.h */
/* compiled from: PG */
public final class C12468h implements C12477c {

    /* renamed from: a */
    public static final C59071e f39355a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.h");

    /* renamed from: b */
    public final Map f39356b;

    /* renamed from: c */
    private final C12475o f39357c;

    /* renamed from: d */
    private final C13436d f39358d;

    /* renamed from: e */
    private final Executor f39359e;

    /* renamed from: f */
    private final C15494t f39360f;

    /* renamed from: g */
    private final abm f39361g;

    /* renamed from: h */
    private final C58048g f39362h;

    public C12468h(C12475o oVar, abm abm, C13436d dVar, Map map, C15494t tVar, C58048g gVar, Executor executor) {
        this.f39357c = oVar;
        this.f39361g = abm;
        this.f39358d = dVar;
        this.f39356b = map;
        this.f39360f = tVar;
        this.f39362h = gVar;
        this.f39359e = executor;
    }

    /* renamed from: b */
    public static C12479e m28555b(C12479e eVar) {
        C12478d b = eVar.mo20622b();
        C13061g gVar = (C13061g) C13068n.f40556f.createBuilder();
        gVar.copyOnWrite();
        C13068n nVar = (C13068n) gVar.instance;
        nVar.f40559b = 2;
        nVar.f40558a |= 1;
        String str = eVar.mo20624d().f40560c;
        gVar.copyOnWrite();
        C13068n nVar2 = (C13068n) gVar.instance;
        str.getClass();
        nVar2.f40558a = 2 | nVar2.f40558a;
        nVar2.f40560c = str;
        b.mo20609b((C13068n) gVar.build());
        return b.mo20608a();
    }

    /* renamed from: a */
    public final C60870cx mo20616a(C12479e eVar) {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        C47558bi a = C47831fm.m85006a("MessageInteractionManager.handleMessageInteraction");
        try {
            C13068n d = eVar.mo20624d();
            int a2 = C13065k.m29249a(d.f40559b);
            if (a2 != 0) {
                if (a2 == 2) {
                    int a3 = C13067m.m29250a(d.f40561d);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (a3 == 2 || a3 == 3) {
                        C13063i iVar = d.f40562e;
                        if (iVar == null) {
                            iVar = C13063i.f40550c;
                        }
                        if ((iVar.f40552a & 1) != 0) {
                            C13436d dVar = this.f39358d;
                            C13063i iVar2 = d.f40562e;
                            if (iVar2 == null) {
                                iVar2 = C13063i.f40550c;
                            }
                            C58833ax j = C58833ax.m90833j((C13435c) dVar.f41266b.remove(Long.valueOf(iVar2.f40553b)));
                            if (!j.mo56113h()) {
                                C59104x d2 = f39355a.mo56226d();
                                d2.mo56378ag(C58975e.f156826a, "MssgInteractionManImpl");
                                ((C59052c) ((C59052c) d2).mo56372aa(44259)).mo56386p("Failed to retrieve tapped message");
                                cxVar = mo20617c(m28555b(eVar));
                            } else {
                                C13435c cVar = (C13435c) j.mo56107c();
                                cxVar = C47633f.m84733g(cVar.mo21084a()).mo51516i(new C12463c(this, eVar), this.f39359e).mo51516i(new C12464d(cVar), this.f39359e).mo51516i(new C12465e(this, eVar), this.f39359e).mo51514f(Exception.class, new C12466f(this, eVar), C60826bg.f164896a);
                            }
                        } else {
                            C59104x d3 = f39355a.mo56226d();
                            d3.mo56378ag(C58975e.f156826a, "MssgInteractionManImpl");
                            ((C59052c) ((C59052c) d3).mo56372aa(44260)).mo56386p("Message info missing in message request");
                            cxVar = mo20617c(m28555b(eVar));
                        }
                        a.mo51417a(cxVar);
                        a.close();
                        return cxVar;
                    }
                    C59104x d4 = f39355a.mo56226d();
                    d4.mo56378ag(C58975e.f156826a, "MssgInteractionManImpl");
                    ((C59052c) ((C59052c) d4).mo56372aa(44261)).mo56387q("Unexpected Message Request type: %d", a3 - 1);
                    cxVar = mo20617c(m28555b(eVar));
                    a.mo51417a(cxVar);
                    a.close();
                    return cxVar;
                }
            }
            cxVar = mo20617c(eVar);
            a.mo51417a(cxVar);
            a.close();
            return cxVar;
        } catch (Throwable th) {
            C12462b.m28552a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final C60870cx mo20617c(C12479e eVar) {
        C47558bi a = C47831fm.m85006a("MessageInteractionManager.getErrorInteractionResult");
        try {
            C60870cx d = mo20618d(Optional.empty(), eVar);
            a.close();
            return d;
        } catch (Throwable th) {
            C12462b.m28552a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final C60870cx mo20618d(Optional optional, C12479e eVar) {
        C47558bi a = C47831fm.m85006a("MessageInteractionManager.messageGraphInteractionResult");
        try {
            abm abm = this.f39361g;
            optional.getClass();
            abm.f195300c = optional;
            eVar.getClass();
            abm.f195301d = eVar;
            abm.f195302e = this.f39362h.mo54628a("MessageInteractionManager");
            C68225k.m98529a(abm.f195300c, Optional.class);
            C68225k.m98529a(abm.f195301d, C12479e.class);
            C68225k.m98529a(abm.f195302e, C57934a.class);
            abo abo = new abo(abm.f195298a, abm.f195299b, abm.f195300c, abm.f195301d, abm.f195302e);
            C60870cx d = abo.mo20611d();
            a.mo51417a(d);
            C12467g gVar = new C12467g(this, eVar);
            C60856cj.m92911t(d, C47810es.m84974n(gVar), this.f39359e);
            Executor executor = (Executor) this.f39357c.f39370a.mo17428b();
            executor.getClass();
            C60870cx i = C60856cj.m92900i(new C12474n(abo, executor));
            a.close();
            return i;
        } catch (Throwable th) {
            C12462b.m28552a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final void mo20619e(C12991i iVar, C62722b bVar) {
        if (!C15489o.m32223a(iVar)) {
            this.f39360f.mo22365c(C37179a.f97427Z.mo40806d(), iVar, bVar);
        }
    }
}
