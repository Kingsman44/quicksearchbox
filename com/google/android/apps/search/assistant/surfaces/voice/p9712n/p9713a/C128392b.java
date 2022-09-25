package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32809bd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32812bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.a.b */
/* compiled from: PG */
final class C128392b implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C128393c f353130a;

    public C128392b(C128393c cVar) {
        this.f353130a = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C128393c cVar = this.f353130a;
        C32597b bVar = cVar.f353131a;
        C32809bd bdVar = (C32809bd) C32810be.f87993c.createBuilder();
        C69664n.m101060f(bdVar, "newBuilder()");
        C32812bg a = C69664n.m101061g(bdVar, "builder");
        C32796ar arVar = cVar.f353131a.mo38174d().f88043b;
        if (arVar == null) {
            arVar = C32796ar.f87973c;
        }
        C69664n.m101060f(arVar, "delegate.supportedContextKey.contextKey");
        a.mo38308b(arVar);
        return bVar.mo38175e(a.mo38307a());
    }
}
