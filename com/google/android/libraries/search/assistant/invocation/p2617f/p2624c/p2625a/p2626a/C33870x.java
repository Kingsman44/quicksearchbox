package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2600b.C33574g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71816z;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.x */
/* compiled from: PG */
final class C33870x implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C33504b f90381a;

    public C33870x(C33504b bVar) {
        this.f90381a = bVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C71816z zVar;
        C33574g gVar = (C33574g) obj;
        C69664n.m101061g(gVar, "it");
        C33504b bVar = this.f90381a;
        synchronized (gVar.f89757b) {
            zVar = gVar.f89759d;
        }
        if (!zVar.mo62867mj()) {
            C59052c cVar = (C59052c) C33574g.f89756a.mo56224b();
            cVar.mo56379ah(new C59094n(51228));
            cVar.mo56386p("sessionDeferred was not active, ignoring onSessionCreated");
            return;
        }
        zVar.mo62909P(bVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
