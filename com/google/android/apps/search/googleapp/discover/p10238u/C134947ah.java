package com.google.android.apps.search.googleapp.discover.p10238u;

import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.ah */
/* compiled from: PG */
final class C134947ah implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C70334de f367413a;

    public C134947ah(C70334de deVar) {
        this.f367413a = deVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "it");
        this.f367413a.mo62033h(C134948ai.f367418e, str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
