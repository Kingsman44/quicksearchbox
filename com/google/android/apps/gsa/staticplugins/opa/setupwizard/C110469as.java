package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.ahe;
import com.google.assistant.p3861at.ahf;
import com.google.assistant.p3861at.ahg;
import com.google.assistant.p3861at.ahh;
import com.google.assistant.p3861at.aii;
import com.google.assistant.p3861at.aij;
import com.google.assistant.p3861at.aik;
import com.google.assistant.p3861at.ain;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.as */
/* compiled from: PG */
public final /* synthetic */ class C110469as implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110473aw f307968a;

    public /* synthetic */ C110469as(C110473aw awVar) {
        this.f307968a = awVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx i;
        C110473aw awVar = this.f307968a;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(false);
        }
        C60870cx a = awVar.f307975d.mo28201a("checkMinorCapabilities", new C110466ap(awVar));
        ((C59052c) ((C59052c) C110473aw.f307972a.mo56224b()).mo56372aa(26416)).mo56386p("fetchPeopleSettingUiFuture");
        if (!((C86124t) awVar.f307976e.mo27525b()).mo79746e(C90062dn.f249218q)) {
            ((C59052c) ((C59052c) C110473aw.f307972a.mo56224b()).mo56372aa(26417)).mo56386p("fetchPeopleSettingUiFuture: Skip fetching people setting ui");
            i = C60856cj.m92900i(true);
        } else {
            l lVar = awVar.f307982k;
            Account a2 = ((C86054o) awVar.f307977f.mo27525b()).mo79668a();
            ahg ahg = (ahg) ahh.f129301g.createBuilder();
            String b = awVar.f307981j.mo79727b();
            if (!TextUtils.isEmpty(b)) {
                ahe ahe = (ahe) ahf.f129297c.createBuilder();
                ahe.copyOnWrite();
                ahf ahf = (ahf) ahe.instance;
                b.getClass();
                ahf.f129299a |= 1;
                ahf.f129300b = b;
                ahg.copyOnWrite();
                ahh ahh = (ahh) ahg.instance;
                ahf ahf2 = (ahf) ahe.build();
                ahf2.getClass();
                ahh.f129306d = ahf2;
                ahh.f129303a |= 4;
            }
            aii aii = (aii) ain.f129411h.createBuilder();
            ahh ahh2 = (ahh) ahg.build();
            aii.copyOnWrite();
            ain ain = (ain) aii.instance;
            ahh2.getClass();
            ain.f129415c = ahh2;
            ain.f129414b = 1;
            aij aij = (aij) aik.f129402c.createBuilder();
            aij.copyOnWrite();
            aik aik = (aik) aij.instance;
            aik.f129404a |= 1;
            aik.f129405b = true;
            aii.copyOnWrite();
            ain ain2 = (ain) aii.instance;
            aik aik2 = (aik) aij.build();
            aik2.getClass();
            ain2.f129416d = aik2;
            ain2.f129413a |= 2;
            ain ain3 = (ain) aii.build();
            acu acu = (acu) acv.f128920X.createBuilder();
            acu.copyOnWrite();
            acv acv = (acv) acu.instance;
            ain3.getClass();
            acv.f128929H = ain3;
            acv.f128946b |= 4096;
            i = awVar.f307975d.mo28209i(lVar.j(a2, (acv) acu.build(), (C50144me) null, 10000, TimeUnit.MILLISECONDS, awVar.getClass().getSimpleName()), "Fetch people settings then return true if it was successful.", new C110468ar(awVar));
        }
        C60870cx cxVar = i;
        ((C59052c) ((C59052c) C110473aw.f307972a.mo56224b()).mo56372aa(26415)).mo56386p("fetchBiometricsSettingUiFuture");
        l lVar2 = awVar.f307982k;
        Account a3 = ((C86054o) awVar.f307977f.mo27525b()).mo79668a();
        acu acu2 = (acu) acv.f128920X.createBuilder();
        acu2.copyOnWrite();
        acv acv2 = (acv) acu2.instance;
        acv2.f128946b |= 8388608;
        acv2.f128934M = true;
        C60870cx i2 = awVar.f307975d.mo28209i(lVar2.j(a3, (acv) acu2.build(), (C50144me) null, 10000, TimeUnit.MILLISECONDS, awVar.getClass().getSimpleName()), "Fetch biometrics settings then return true if it was successful.", new C110465ao(awVar));
        Account a4 = ((C86054o) awVar.f307977f.mo27525b()).mo79668a();
        if (a4 == null) {
            ((C59052c) ((C59052c) C110473aw.f307972a.mo56226d()).mo56372aa(26414)).mo56386p("fetchAccountData: current account null");
            return C60856cj.m92900i(false);
        }
        C60870cx c = awVar.f307978g.c(a4, new int[]{0, 1});
        return C60856cj.m92895d(a, cxVar, c, i2).mo57334a(new C110467aq(awVar, c, a, cxVar, i2), C60826bg.f164896a);
    }
}
