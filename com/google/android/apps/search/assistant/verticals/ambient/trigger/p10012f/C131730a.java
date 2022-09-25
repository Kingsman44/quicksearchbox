package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10012f;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106567a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106570d;
import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.platform.pcp.api.C123597m;
import com.google.android.apps.search.assistant.platform.pcp.api.C123598n;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131713d;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131691a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131692b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.f.a */
/* compiled from: PG */
public final class C131730a implements C131692b, C123598n {

    /* renamed from: a */
    private final C123587c f359868a;

    /* renamed from: b */
    private final boolean f359869b;

    /* renamed from: c */
    private Optional f359870c = Optional.empty();

    public C131730a(C130603a aVar, C123587c cVar, boolean z) {
        aVar.mo109740b(this);
        this.f359868a = cVar;
        this.f359869b = z;
    }

    /* renamed from: a */
    public final C53306j mo22862a() {
        return C53306j.AMBIENT_ASSISTANT;
    }

    /* renamed from: b */
    public final C60870cx mo110268b(C131713d dVar) {
        if (!this.f359869b) {
            return C60866ct.f164955a;
        }
        this.f359870c = Optional.m71637of(dVar);
        ((C123597m) this.f359868a).f341495c.mo106054a(this);
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo110269c() {
        if (this.f359870c != null) {
            ((C123597m) this.f359868a).f341495c.f341512b.remove(this);
            this.f359870c = Optional.empty();
        }
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo110270d(C53715bm bmVar, long j) {
        return C131691a.m214140a();
    }

    /* renamed from: f */
    public final /* synthetic */ Optional mo22863f() {
        return Optional.empty();
    }

    /* renamed from: g */
    public final void mo22864g() {
        C106567a aVar = (C106567a) C106570d.f297154c.createBuilder();
        aVar.copyOnWrite();
        C106570d dVar = (C106570d) aVar.instance;
        dVar.f297157b = 1;
        dVar.f297156a = 1 | dVar.f297156a;
        C46459k.m82829b(((C131713d) this.f359870c.get()).mo110075a(C131701c.m214153c((C106570d) aVar.build())), "Error calling trigger listener.", new Object[0]);
    }
}
