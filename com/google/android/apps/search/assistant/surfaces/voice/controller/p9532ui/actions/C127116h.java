package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.h */
/* compiled from: PG */
public final class C127116h {

    /* renamed from: a */
    private final C127113e f350013a;

    public C127116h(C127113e eVar) {
        this.f350013a = eVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C127114f mo107938a() {
        C62942bv build = this.f350013a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C127114f) build;
    }

    /* renamed from: b */
    public final void mo107939b(C127050h hVar) {
        C69664n.m101061g(hVar, "value");
        C127113e eVar = this.f350013a;
        eVar.copyOnWrite();
        C127114f fVar = (C127114f) eVar.instance;
        C127114f fVar2 = C127114f.f350009c;
        fVar.f350012b = hVar.getNumber();
        fVar.f350011a |= 1;
    }
}
