package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.shared.p7195y.C91183ao;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.C50194oa;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cq */
/* compiled from: PG */
public final class C108617cq {

    /* renamed from: a */
    public static final C59071e f302136a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cq");

    /* renamed from: b */
    public final C68214a f302137b;

    /* renamed from: c */
    public final l f302138c;

    /* renamed from: d */
    public final C91189au f302139d;

    public C108617cq(Context context, C68214a aVar, l lVar, C91183ao aoVar) {
        this.f302137b = aVar;
        this.f302138c = lVar;
        this.f302139d = aoVar.mo85410a(context);
    }

    /* renamed from: a */
    public final C60870cx mo97026a() {
        C58976aa aaVar = C58975e.f156826a;
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 2;
        acv.f128949e = true;
        return C60922j.m93045h(this.f302138c.j((Account) ((C83893b) this.f302137b.mo27525b()).mo77278a().mo56107c(), (acv) acu.build(), (C50144me) null, 5, TimeUnit.SECONDS, getClass().getSimpleName()), new C108609ci(this), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo97027b(String str, C49875cf cfVar, C49891cv cvVar) {
        C108616cp e = C108616cp.m180628e();
        C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
        dfVar.copyOnWrite();
        C49903dg dgVar = (C49903dg) dfVar.instance;
        str.getClass();
        dgVar.f129714a |= 1;
        dgVar.f129715b = str;
        dfVar.copyOnWrite();
        C49903dg dgVar2 = (C49903dg) dfVar.instance;
        dgVar2.f129716c = cfVar.f129621v;
        dgVar2.f129714a |= 2;
        dfVar.copyOnWrite();
        C49903dg dgVar3 = (C49903dg) dfVar.instance;
        cvVar.getClass();
        dgVar3.f129719f = cvVar;
        dgVar3.f129714a |= 32;
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        daVar.mo53372c((C49903dg) dfVar.build());
        C49898db dbVar = (C49898db) daVar.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        this.f302138c.n((Account) ((C83893b) this.f302137b.mo27525b()).mo77278a().mo56107c(), (acx) acw.build(), e, getClass().getSimpleName());
        return e.f302134a;
    }

    /* renamed from: c */
    public final C60870cx mo97028c() {
        C58976aa aaVar = C58975e.f156826a;
        C108616cp cpVar = new C108616cp(C108613cm.f302130a);
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 128;
        acv.f128952h = true;
        this.f302138c.i((Account) ((C83893b) this.f302137b.mo27525b()).mo77278a().mo56107c(), (acv) acu.build(), C50144me.f130361d, cpVar, (k) null, (String) null, getClass().getSimpleName());
        return cpVar.f302134a;
    }

    /* renamed from: d */
    public final C60870cx mo97029d(String str) {
        return C60922j.m93045h(mo97028c(), new C108608ch(this, str), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo97030e(C50194oa oaVar) {
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        oaVar.getClass();
        acx.f128990g = oaVar;
        acx.f128984a |= 16;
        C108616cp e = C108616cp.m180628e();
        this.f302138c.n((Account) ((C83893b) this.f302137b.mo27525b()).mo77278a().mo56107c(), (acx) acw.build(), e, getClass().getSimpleName());
        return e.f302134a;
    }
}
