package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.libraries.assistant.p1533o.C18465ba;
import com.google.android.libraries.assistant.p1533o.C18466bb;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.b */
/* compiled from: PG */
public final class C128419b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C128416ak f353180a;

    /* renamed from: b */
    final /* synthetic */ C128426a f353181b;

    public C128419b(C128416ak akVar, C128426a aVar) {
        this.f353180a = akVar;
        this.f353181b = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) C128436f.f353225a.mo56226d();
        cVar.mo56378ag(C38505d.f101864b, 196211705);
        C59052c cVar2 = (C59052c) cVar.mo56382g(th);
        cVar2.mo56379ah(new C59094n(38806));
        cVar2.mo56386p("Failed to connect to Conversation API.");
        this.f353180a.mo108414c(th);
        this.f353181b.mo108425c(C34819a.m63580c(C18466bb.f52404a, C18465ba.CONVERSATION_API_CONNECTING_FAILED));
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C69664n.m101061g((C128418am) obj, "unused");
    }
}
