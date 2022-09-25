package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.a.a.j */
/* compiled from: PG */
public final class C33649j implements C37362b {

    /* renamed from: a */
    final /* synthetic */ Consumer f89919a;

    /* renamed from: b */
    final /* synthetic */ C33651l f89920b;

    public C33649j(Consumer consumer, C33651l lVar) {
        this.f89919a = consumer;
        this.f89920b = lVar;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        C69664n.m101061g(lVar, "audioData");
        this.f89919a.accept(lVar);
        if (lVar.f100343b == 2) {
            C59052c cVar = (C59052c) C33651l.f89922a.mo56224b();
            C61301b a = C34711b.m63445a(this.f89920b.f89923b);
            cVar.mo56379ah(new C59094n(51250));
            cVar.mo56389s("Closing the audio input session with invocation token (%s)  because audio data ended.", a);
            this.f89920b.close();
        }
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f89920b.f89924c;
    }
}
