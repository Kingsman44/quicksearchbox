package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.p9606b;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9593a.p9594a.C127411a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9593a.p9594a.C127412b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127471c;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.c.b.a */
/* compiled from: PG */
public final class C127501a {
    /* renamed from: a */
    public static final C127412b m208464a(C127471c cVar) {
        C69664n.m101061g(cVar, "visEntryPointContext");
        C127411a aVar = (C127411a) C127412b.f350825c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        C127470b a = C127470b.m208430a(cVar.f350980b);
        if (a == null) {
            a = C127470b.UNRECOGNIZED;
        }
        boolean z = a == C127470b.HOTWORD;
        aVar.copyOnWrite();
        C127412b bVar = (C127412b) aVar.instance;
        bVar.f350827a = 1 | bVar.f350827a;
        bVar.f350828b = z;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C127412b) build;
    }

    /* renamed from: b */
    public static /* synthetic */ C127412b m208465b() {
        C127471c cVar = C127471c.f350977d;
        C69664n.m101060f(cVar, "getDefaultInstance()");
        return m208464a(cVar);
    }
}
