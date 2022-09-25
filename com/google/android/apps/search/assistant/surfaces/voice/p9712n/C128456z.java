package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.gsa.binaries.satin.app.anq;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128427b;
import com.google.android.libraries.assistant.p1533o.C18469be;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.z */
/* compiled from: PG */
public final class C128456z extends C18469be {

    /* renamed from: a */
    private final C128427b f353305a;

    /* renamed from: b */
    private final anq f353306b;

    public C128456z(anq anq, C128427b bVar) {
        this.f353306b = anq;
        this.f353305a = bVar;
    }

    /* renamed from: b */
    public final C70862aj mo23997b(C70862aj ajVar) {
        C128426a a = this.f353305a.mo108430a();
        C37258g gVar = C37176a.f96819Q;
        C69664n.m101060f(gVar, "MAIN_ASSISTANT_QUERY_START");
        a.mo108429g(gVar);
        anq anq = this.f353306b;
        return new C128455y((C128436f) anq.f199095a.b.f198027a.f199308ca.mo17428b(), (Executor) anq.f199095a.b.f198027a.f199244bP.mo17428b(), ajVar, a);
    }
}
