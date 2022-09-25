package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import android.location.Location;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7701gt;
import com.google.p375ai.p378b.C7702gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.z */
/* compiled from: PG */
public final /* synthetic */ class C98144z implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98064as f274057a;

    /* renamed from: b */
    public final /* synthetic */ C7702gu f274058b;

    public /* synthetic */ C98144z(C98064as asVar, C7702gu guVar) {
        this.f274057a = asVar;
        this.f274058b = guVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C98064as asVar = this.f274057a;
        C7702gu guVar = this.f274058b;
        C118826c cVar = (C118826c) obj;
        long m = asVar.mo90918m();
        C7701gt gtVar = (C7701gt) guVar.toBuilder();
        C22871g gVar = asVar.f273810f;
        if (asVar.f273816l.mo79746e(C90010bp.f247004p)) {
            cxVar = C60856cj.m92900i(new C98072b((C7702gu) gtVar.build(), (Location) null));
        } else {
            cxVar = asVar.f273811g.mo28209i(asVar.f273809e.mo71021e(C39226b.TAG_CLASSIC_SEARCH_PROACTIVE_LO), "internalUpdateFromPushedPartialEntries$entryChangesWithLocationFuture", new C98053ah(asVar, gtVar));
        }
        return asVar.f273811g.mo28210j(gVar.mo28210j(cxVar, "internalUpdateFromPushedPartialEntries$resultFuture", new C98141w(asVar, m)), "internalUpdateFromPushedPartialEntries$doneFuture", new C98142x(asVar, gtVar));
    }
}
