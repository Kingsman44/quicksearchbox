package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.p1254a;

import com.google.android.apps.search.assistant.platform.pcp.api.C123598n;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a.h */
/* compiled from: PG */
public final /* synthetic */ class C16277h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C16280k f47914a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f47915b;

    public /* synthetic */ C16277h(C16280k kVar, C53306j jVar) {
        this.f47914a = kVar;
        this.f47915b = jVar;
    }

    public final void run() {
        C16280k kVar = this.f47914a;
        C53306j jVar = this.f47915b;
        if (kVar.f47929h.mo57444a().minus(C16280k.f47920a).isAfter(Instant.ofEpochMilli(kVar.f47926e.f47378s.get()))) {
            C58976aa aaVar = C58975e.f156826a;
            Optional.ofNullable((C123598n) kVar.f47923b.get(jVar)).ifPresent(C16275f.f47912a);
        }
    }
}
