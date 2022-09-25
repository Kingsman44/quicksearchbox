package com.google.android.apps.search.googleapp.googleappbrowser.feature.omnibox;

import com.google.android.libraries.web.contrib.p3390j.p3396d.C43657e;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43659g;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43661i;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43664l;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.omnibox.f */
/* compiled from: PG */
public final class C135905f implements Supplier {

    /* renamed from: a */
    final /* synthetic */ boolean f370146a;

    public C135905f(boolean z) {
        this.f370146a = z;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        if (!this.f370146a) {
            return Optional.empty();
        }
        C43657e eVar = (C43657e) C43664l.f113936f.createBuilder();
        C69664n.m101060f(eVar, "newBuilder()");
        C69664n.m101061g(eVar, "builder");
        C43659g gVar = C43659g.START;
        C69664n.m101061g(gVar, "value");
        eVar.copyOnWrite();
        C43664l lVar = (C43664l) eVar.instance;
        lVar.f113942e = gVar.f113928d;
        lVar.f113938a |= 8;
        eVar.copyOnWrite();
        C43664l lVar2 = (C43664l) eVar.instance;
        lVar2.f113938a |= 1;
        lVar2.f113939b = 16.0f;
        C43661i iVar = C43661i.EMIT_TEXT_CLICK_EVENT;
        C69664n.m101061g(iVar, "value");
        eVar.copyOnWrite();
        C43664l lVar3 = (C43664l) eVar.instance;
        lVar3.f113940c = iVar.f113934d;
        lVar3.f113938a |= 2;
        C62942bv build = eVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return Optional.m71637of((C43664l) build);
    }
}
