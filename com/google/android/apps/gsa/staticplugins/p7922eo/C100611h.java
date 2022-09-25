package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6610c.C84998a;
import com.google.android.apps.gsa.search.core.p6519al.p6648ch.C85107a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85414a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.C87146in;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.h */
/* compiled from: PG */
public final class C100611h extends C86734a implements C85414a {

    /* renamed from: a */
    public final C87146in f281337a;

    /* renamed from: b */
    public final C85107a f281338b;

    /* renamed from: c */
    public final C84998a f281339c;

    /* renamed from: f */
    private final C86124t f281340f;

    /* renamed from: g */
    private final boolean f281341g;

    /* renamed from: h */
    private final C68214a f281342h;

    /* renamed from: i */
    private final C68214a f281343i;

    /* renamed from: j */
    private final C22871g f281344j;

    /* renamed from: k */
    private final C22871g f281345k;

    /* renamed from: l */
    private final C68214a f281346l;

    /* renamed from: m */
    private final b f281347m;

    public C100611h(C86124t tVar, boolean z, C68214a aVar, C68214a aVar2, C22871g gVar, C22871g gVar2, C68214a aVar3, C87146in inVar, C85107a aVar4, b bVar, C84998a aVar5) {
        super(C118575h.WORKER_VOICE_SEARCH_FETCHER, "voicesearchfetcher");
        this.f281340f = tVar;
        this.f281341g = z;
        this.f281342h = aVar;
        this.f281343i = aVar2;
        this.f281344j = gVar;
        this.f281345k = gVar2;
        this.f281346l = aVar3;
        this.f281337a = inVar;
        this.f281338b = aVar4;
        this.f281347m = bVar;
        this.f281339c = aVar5;
    }

    /* renamed from: a */
    public final C60870cx mo78927a(Query query, C89356b bVar, C119066v vVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        C89061q a = ((C89037bh) this.f281346l.mo27525b()).mo27376a(true != query.mo84434dO() ? 14 : 53, C89066v.f241382a);
        return this.f281344j.mo28210j(C100607d.m166734d(a, this.f281345k, this.f281340f, this.f281341g, (C89994f) this.f281343i.mo27525b(), query, this.f281342h, this.f281346l, this.f281347m), "startSpeechieWithNewAudioSource", new C100610g(this, query, bVar, vVar, a, axVar));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
