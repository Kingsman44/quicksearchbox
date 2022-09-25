package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.ae */
/* compiled from: PG */
public final class C102052ae {

    /* renamed from: e */
    private static final C59071e f284726e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.ae");

    /* renamed from: a */
    public final C102051ad f284727a;

    /* renamed from: b */
    public final C90743b f284728b;

    /* renamed from: c */
    public final C102230s f284729c;

    /* renamed from: d */
    public final C102049ab f284730d;

    public C102052ae(C102051ad adVar, C74555u uVar, C102230s sVar, C90743b bVar, Map map) {
        this.f284727a = adVar;
        this.f284729c = sVar;
        this.f284728b = bVar;
        C69464a aVar = (C69464a) map.get(uVar.mo70884b());
        C58838bb.m90867b(aVar, "Missing SummaryPage binding for Domain %s", uVar.mo70884b());
        C102049ab abVar = (C102049ab) aVar.mo17428b();
        this.f284730d = abVar;
        C59104x b = f284726e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SummarySFragPeer");
        ((C59052c) ((C59052c) b).mo56372aa(20534)).mo56389s("page = %s", abVar);
    }
}
