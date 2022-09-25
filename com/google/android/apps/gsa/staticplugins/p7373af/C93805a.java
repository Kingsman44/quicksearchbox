package com.google.android.apps.gsa.staticplugins.p7373af;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6524ab.C84617a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88063nu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88064nv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88065nw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88360yu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88362yw;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.ssb.service.SsbService;

/* renamed from: com.google.android.apps.gsa.staticplugins.af.a */
/* compiled from: PG */
public final class C93805a extends C86734a implements C84617a {

    /* renamed from: a */
    private final C86610af f262029a;

    public C93805a(C86610af afVar) {
        super(C118575h.WORKER_CONVERSATION, "conversation");
        this.f262029a = afVar;
    }

    /* renamed from: f */
    private final void m154796f(ServiceEventData serviceEventData) {
        C86775r rVar = this.f262029a.f233977l;
        if (rVar != null) {
            rVar.f234383e.mo80379b(serviceEventData);
        }
    }

    /* renamed from: a */
    public final void mo78378a(C88362yw ywVar) {
        C87684al alVar = new C87684al(C88244um.UPDATE_CONVERSATION_STATE);
        alVar.mo81965b(C88360yu.f238954a, ywVar);
        m154796f(alVar.mo81964a());
    }

    /* renamed from: b */
    public final void mo78379b() {
        SsbService.m80863g(3);
        m154796f(new C87684al(C88244um.NOTIFY_COMPLETED_ASSISTANT_CONVERSATION).mo81964a());
    }

    /* renamed from: c */
    public final void mo78380c() {
        m154796f(new C87684al(C88244um.NOTIFY_COMPLETED_CONVERSATION).mo81964a());
    }

    /* renamed from: d */
    public final void mo78381d() {
        SsbService.m80863g(2);
        m154796f(new C87684al(C88244um.NOTIFY_STARTED_ASSISTANT_CONVERSATION).mo81964a());
    }

    /* renamed from: e */
    public final void mo78382e(Query query) {
        C88064nv nvVar = (C88064nv) C88065nw.f238110d.createBuilder();
        long j = query.f252749G;
        nvVar.copyOnWrite();
        C88065nw nwVar = (C88065nw) nvVar.instance;
        nwVar.f238112a |= 1;
        nwVar.f238113b = j;
        String bn = query.mo84355bn();
        if (bn != null) {
            nvVar.copyOnWrite();
            C88065nw nwVar2 = (C88065nw) nvVar.instance;
            nwVar2.f238112a |= 2;
            nwVar2.f238114c = bn;
        }
        C87684al alVar = new C87684al(C88244um.NOTIFY_STARTED_CONVERSATION);
        alVar.mo81965b(C88063nu.f238109a, (C88065nw) nvVar.build());
        m154796f(alVar.mo81964a());
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
