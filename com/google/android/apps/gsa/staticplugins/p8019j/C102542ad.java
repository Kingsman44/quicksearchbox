package com.google.android.apps.gsa.staticplugins.p8019j;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6491a.p6492a.C84340a;
import com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130333h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51712bj;
import com.google.assistant.p3897e.p3921j.C51713bk;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51767ct;
import com.google.assistant.p3897e.p3921j.C51768cu;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.ad */
/* compiled from: PG */
public final /* synthetic */ class C102542ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C102550al f286174a;

    /* renamed from: b */
    public final /* synthetic */ C51714bl f286175b;

    /* renamed from: c */
    public final /* synthetic */ C102549ak f286176c;

    public /* synthetic */ C102542ad(C102550al alVar, C51714bl blVar, C102549ak akVar) {
        this.f286174a = alVar;
        this.f286175b = blVar;
        this.f286176c = akVar;
    }

    public final C60870cx apply(Object obj) {
        C102550al alVar = this.f286174a;
        C51714bl blVar = this.f286175b;
        C102549ak akVar = this.f286176c;
        Void voidR = (Void) obj;
        alVar.mo93336n(blVar, alVar.mo93330e());
        alVar.mo93334j(blVar);
        C84340a aVar = (C84340a) C84341b.f229550d.createBuilder();
        String str = ((C51715bm) blVar.instance).f135666c;
        aVar.copyOnWrite();
        C84341b bVar = (C84341b) aVar.instance;
        str.getClass();
        bVar.f229552a |= 1;
        bVar.f229553b = str;
        if (akVar.mo93325c().mo56113h()) {
            Query query = (Query) akVar.mo93325c().mo56107c();
            if (query.mo84263a("android.opa.extra.LAUNCHED_ON") == 7) {
                e eVar = e.aF;
                aVar.copyOnWrite();
                C84341b bVar2 = (C84341b) aVar.instance;
                bVar2.f229554c = eVar.ca;
                bVar2.f229552a |= 2;
            } else {
                e a = e.a(query.mo84263a("android.opa.extra.TRIGGERED_BY"));
                if (!(a == null || a == e.a)) {
                    aVar.copyOnWrite();
                    C84341b bVar3 = (C84341b) aVar.instance;
                    bVar3.f229554c = a.ca;
                    bVar3.f229552a |= 2;
                }
            }
        }
        alVar.mo93335l((C84341b) aVar.build(), blVar, alVar.mo93329d(akVar), BuildConfig.FLAVOR);
        alVar.mo93332h(blVar, akVar.mo93324b(), true, false);
        alVar.mo93333i(blVar);
        C102550al.m170054k(blVar);
        C51772cy cyVar = ((C51715bm) blVar.instance).f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        C51771cx cxVar = (C51771cx) cyVar.toBuilder();
        C51772cy cyVar2 = ((C51715bm) blVar.instance).f135671h;
        if (cyVar2 == null) {
            cyVar2 = C51772cy.f135824p;
        }
        C51768cu cuVar = cyVar2.f135835j;
        if (cuVar == null) {
            cuVar = C51768cu.f135816e;
        }
        C51767ct ctVar = (C51767ct) cuVar.toBuilder();
        ctVar.copyOnWrite();
        C51768cu cuVar2 = (C51768cu) ctVar.instance;
        cuVar2.f135818a |= 2;
        cuVar2.f135820c = true;
        cxVar.copyOnWrite();
        C51772cy cyVar3 = (C51772cy) cxVar.instance;
        C51768cu cuVar3 = (C51768cu) ctVar.build();
        cuVar3.getClass();
        cyVar3.f135835j = cuVar3;
        cyVar3.f135826a |= 256;
        C51772cy cyVar4 = (C51772cy) cxVar.build();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        cyVar4.getClass();
        bmVar.f135671h = cyVar4;
        bmVar.f135664a |= 128;
        if (((C86124t) alVar.f286203c.mo27525b()).mo79746e(C90059dk.f249143c)) {
            C51772cy cyVar5 = ((C51715bm) blVar.instance).f135671h;
            if (cyVar5 == null) {
                cyVar5 = C51772cy.f135824p;
            }
            C51771cx cxVar2 = (C51771cx) cyVar5.toBuilder();
            C51772cy cyVar6 = ((C51715bm) blVar.instance).f135671h;
            if (cyVar6 == null) {
                cyVar6 = C51772cy.f135824p;
            }
            C51768cu cuVar4 = cyVar6.f135835j;
            if (cuVar4 == null) {
                cuVar4 = C51768cu.f135816e;
            }
            C51767ct ctVar2 = (C51767ct) cuVar4.toBuilder();
            C51712bj bjVar = (C51712bj) C51713bk.f135658c.createBuilder();
            bjVar.copyOnWrite();
            C51713bk bkVar = (C51713bk) bjVar.instance;
            bkVar.f135660a |= 1;
            bkVar.f135661b = true;
            C51713bk bkVar2 = (C51713bk) bjVar.build();
            ctVar2.copyOnWrite();
            C51768cu cuVar5 = (C51768cu) ctVar2.instance;
            bkVar2.getClass();
            cuVar5.f135821d = bkVar2;
            cuVar5.f135818a |= 4;
            cxVar2.copyOnWrite();
            C51772cy cyVar7 = (C51772cy) cxVar2.instance;
            C51768cu cuVar6 = (C51768cu) ctVar2.build();
            cuVar6.getClass();
            cyVar7.f135835j = cuVar6;
            cyVar7.f135826a |= 256;
            C51772cy cyVar8 = (C51772cy) cxVar2.build();
            blVar.copyOnWrite();
            C51715bm bmVar2 = (C51715bm) blVar.instance;
            cyVar8.getClass();
            bmVar2.f135671h = cyVar8;
            bmVar2.f135664a |= 128;
        }
        if (!((C86124t) alVar.f286203c.mo27525b()).mo79746e(C90019by.f248086t)) {
            return C60856cj.m92900i(blVar);
        }
        if (!alVar.f286211k.mo56113h()) {
            return C60856cj.m92900i(blVar);
        }
        return C47633f.m84733g(((C130333h) alVar.f286211k.mo56107c()).mo109665a()).mo51515h(new C102546ah(blVar), C60826bg.f164896a);
    }
}
