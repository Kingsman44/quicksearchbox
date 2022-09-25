package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10131c.C133220c;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.k */
/* compiled from: PG */
public final class C136909k implements C136903e {

    /* renamed from: a */
    private static final C58974d f372619a = C58974d.m91135i("SearchConsoleInsightsPE");

    /* renamed from: b */
    private final C133220c f372620b;

    public C136909k(C133220c cVar) {
        this.f372620b = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo113438a(C63955s sVar, C137009dj djVar) {
        C58970a aVar = (C58970a) ((C58970a) f372619a.mo56224b()).mo56372aa(40885);
        C63954r a = C63954r.m96325a(sVar.f172968a);
        if (a == null) {
            a = C63954r.TYPE_UNSPECIFIED;
        }
        aVar.mo56389s("Evaluating %s Condition Predicate", a.name());
        return this.f372620b.mo111027a();
    }
}
