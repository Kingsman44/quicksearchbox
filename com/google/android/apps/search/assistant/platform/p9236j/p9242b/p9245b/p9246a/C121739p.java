package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a;

import com.google.android.apps.gsa.binaries.satin.app.arj;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121899ay;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33725a;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.a.p */
/* compiled from: PG */
public final class C121739p implements C33725a {

    /* renamed from: a */
    private final arj f337811a;

    public C121739p(arj arj) {
        C69664n.m101061g(arj, "assistDataResourceFactory");
        this.f337811a = arj;
    }

    /* renamed from: a */
    public final Object mo39041a(C33729b bVar, C34053bp bpVar, C33514d dVar, C69577g gVar) {
        if (dVar != null) {
            C34065ca caVar = bVar.f90084e;
            arj arj = this.f337811a;
            int i = caVar.f90772a;
            int i2 = i & 1;
            return new C121738o((C121899ay) arj.f199902a.a.a.f202685bj.mo17428b(), bpVar, dVar, 1 == i2, (i & 2) != 0, (i & 8) != 0);
        }
        throw new IllegalStateException("AssistDataResource is being acquired without VisSessionId");
    }
}
