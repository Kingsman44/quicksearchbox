package com.google.android.apps.gsa.staticplugins.opa.p8312ax;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ax.e */
/* compiled from: PG */
public final /* synthetic */ class C107629e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C85422c f299435a;

    /* renamed from: b */
    public final /* synthetic */ C85005h f299436b;

    /* renamed from: c */
    public final /* synthetic */ Query f299437c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f299438d;

    /* renamed from: e */
    public final /* synthetic */ C22871g f299439e;

    public /* synthetic */ C107629e(C85422c cVar, C85005h hVar, Query query, C58833ax axVar, C22871g gVar) {
        this.f299435a = cVar;
        this.f299436b = hVar;
        this.f299437c = query;
        this.f299438d = axVar;
        this.f299439e = gVar;
    }

    public final void run() {
        C85422c cVar = this.f299435a;
        C85005h hVar = this.f299436b;
        Query query = this.f299437c;
        C58833ax axVar = this.f299438d;
        C22871g gVar = this.f299439e;
        cVar.mo78952r();
        Query query2 = (Query) axVar.mo56109e(query);
        C90498f i = query2.mo84245H(0, true, (QueryTriggerType) null).mo84480i();
        i.mo84573e(0, 16);
        Query ay = i.mo84568a().mo84302an("android.opa.extra.SHOULD_ADD_USER_BUBBLE", true).mo84313ay("android.opa.extra.SRP_TO_OPA_TRANSITION_ORIGINAL_REQUEST_ID", query2.f252749G);
        e a = e.a(ay.mo84263a("android.opa.extra.TRIGGERED_BY"));
        if (a == null) {
            a = e.a;
        }
        C87565h hVar2 = new C87565h();
        hVar2.f236560f = 4;
        hVar2.f236556b = a;
        hVar2.f236558d = ay.mo84263a("android.opa.extra.LAUNCHED_ON");
        hVar2.f236497A = true;
        hVar2.f236523a = query.mo84355bn();
        hVar2.f236565k = ay;
        new C90873ag(hVar.mo78627k(hVar2.mo81685a()), gVar, "Launch OPA for search results", C107627c.f299433a).mo85223a(C107628d.f299434a);
    }
}
