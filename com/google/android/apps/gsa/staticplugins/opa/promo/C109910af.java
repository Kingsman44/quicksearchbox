package com.google.android.apps.gsa.staticplugins.opa.promo;

import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3897e.p3921j.C52404qm;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.af */
/* compiled from: PG */
final class C109910af implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C109912ah f306241a;

    public C109910af(C109912ah ahVar) {
        this.f306241a = ahVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C109912ah.f306243a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OpaNotificationMrgImpl");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(25431)).mo56386p("Failed to get HomeGraphID");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C49875cf cfVar;
        String str = (String) obj;
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        C52404qm qmVar = (C52404qm) C52405qn.f137519c.createBuilder();
        String id = TimeZone.getDefault().getID();
        qmVar.copyOnWrite();
        C52405qn qnVar = (C52405qn) qmVar.instance;
        id.getClass();
        qnVar.f137521a |= 1;
        qnVar.f137522b = id;
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        C52405qn qnVar2 = (C52405qn) qmVar.build();
        qnVar2.getClass();
        cvVar.f129656G = qnVar2;
        cvVar.f129664b |= 32768;
        String languageTag = Locale.getDefault().toLanguageTag();
        cnVar.copyOnWrite();
        C49891cv cvVar2 = (C49891cv) cnVar.instance;
        languageTag.getClass();
        cvVar2.f129663a |= 256;
        cvVar2.f129669g = languageTag;
        C49891cv cvVar3 = (C49891cv) cnVar.build();
        C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
        if (!this.f306241a.f306247c.mo79746e(C90014bt.f247382gB) || str == null || str.isEmpty()) {
            C49875cf cfVar2 = C49875cf.NEXUS;
            dfVar.copyOnWrite();
            C49903dg dgVar = (C49903dg) dfVar.instance;
            dgVar.f129716c = cfVar2.f129621v;
            dgVar.f129714a |= 2;
        } else {
            dfVar.copyOnWrite();
            C49903dg dgVar2 = (C49903dg) dfVar.instance;
            dgVar2.f129714a |= 1;
            dgVar2.f129715b = str;
            if (UserHandleCompat.m148154a().mo85068b()) {
                cfVar = C49875cf.TITAN;
            } else {
                cfVar = C49875cf.NEXUS;
            }
            dfVar.copyOnWrite();
            C49903dg dgVar3 = (C49903dg) dfVar.instance;
            dgVar3.f129716c = cfVar.f129621v;
            dgVar3.f129714a |= 2;
        }
        dfVar.copyOnWrite();
        C49903dg dgVar4 = (C49903dg) dfVar.instance;
        cvVar3.getClass();
        dgVar4.f129719f = cvVar3;
        dgVar4.f129714a |= 32;
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        daVar.mo53372c((C49903dg) dfVar.build());
        C49898db dbVar = (C49898db) daVar.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        C109912ah ahVar = this.f306241a;
        ahVar.f306250f.n(ahVar.f306251g.mo79668a(), (acx) acw.build(), new C109909ae(this), getClass().getSimpleName());
    }
}
