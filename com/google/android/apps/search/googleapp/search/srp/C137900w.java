package com.google.android.apps.search.googleapp.search.srp;

import com.google.android.apps.search.googleapp.search.p10406c.C137401b;
import com.google.android.apps.search.googleapp.search.p10415i.C137485ae;
import com.google.android.apps.search.googleapp.search.p10418j.C137536j;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137916ab;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.C43244c;
import com.google.android.libraries.web.base.p3348b.C43251d;
import com.google.android.libraries.web.coordinator.C43737c;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.shared.p3441a.C44077a;
import com.google.apps.tiktok.cache.C46401p;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4309n.C56745d;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.w */
/* compiled from: PG */
public final class C137900w {

    /* renamed from: a */
    public final C43262m f375200a;

    /* renamed from: b */
    public final C137750aa f375201b;

    /* renamed from: c */
    public final C137485ae f375202c;

    /* renamed from: d */
    public final C137916ab f375203d;

    /* renamed from: e */
    public final C21370a f375204e;

    /* renamed from: f */
    public final boolean f375205f;

    /* renamed from: g */
    public final Duration f375206g;

    /* renamed from: h */
    public final C46401p f375207h;

    /* renamed from: i */
    public final C46401p f375208i;

    /* renamed from: j */
    public final C43737c f375209j;

    /* renamed from: k */
    private final C43737c f375210k;

    /* renamed from: l */
    private final C43737c f375211l;

    public C137900w(long j, C43262m mVar, C137750aa aaVar, C43269t tVar, C137485ae aeVar, C138772i iVar, C137401b bVar, C43737c cVar, C44077a aVar, C44077a aVar2, C137916ab abVar, C21370a aVar3, C43737c cVar2, boolean z) {
        C21370a aVar4 = aVar3;
        C43737c cVar3 = cVar2;
        C43269t tVar2 = tVar;
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(aeVar, "srpPrefetchCacheManager");
        C138772i iVar2 = iVar;
        C69664n.m101061g(iVar, "voiceSearchDataService");
        C137401b bVar2 = bVar;
        C69664n.m101061g(bVar, "assistantSearchHandoverController");
        C69664n.m101061g(aVar4, "clock");
        this.f375200a = mVar;
        this.f375201b = aaVar;
        this.f375202c = aeVar;
        this.f375203d = abVar;
        this.f375204e = aVar4;
        this.f375210k = cVar3;
        this.f375205f = z;
        this.f375206g = Duration.ofMillis(j);
        this.f375211l = cVar;
        this.f375207h = aVar2.f114747a.mo50325a("search_query_name", C137542d.f374085g);
        this.f375208i = aVar.f114747a.mo50325a("search_refinement_suggestions_store", C56745d.f151443b);
        this.f375209j = cVar3;
    }

    /* renamed from: a */
    public final C137536j mo114035a() {
        return (C137536j) this.f375211l.mo5768a();
    }

    /* renamed from: b */
    public final void mo114036b(C137542d dVar) {
        C69664n.m101061g(dVar, "query");
        mo114037c(dVar, false, (C71604be) null);
    }

    /* renamed from: c */
    public final void mo114037c(C137542d dVar, boolean z, C71604be beVar) {
        C69664n.m101061g(dVar, "query");
        C43262m mVar = this.f375200a;
        C137899v vVar = new C137899v(beVar, this, dVar, z, (C69577g) null);
        C43323b bVar = C43323b.f113174a;
        C69664n.m101060f(bVar, "getDefaultInstance()");
        C69664n.m101061g(bVar, "clientData");
        C43251d dVar2 = (C43251d) mVar;
        dVar2.mo46335d(C71663i.m104689b(dVar2.f113025b, dVar2.f113026c, C71424ay.UNDISPATCHED, new C43244c(vVar, (C69577g) null)), bVar);
    }
}
