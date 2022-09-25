package com.google.android.apps.search.googleapp.discover.p10238u;

import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.af */
/* compiled from: PG */
final class C134945af implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C70334de f367411a;

    public C134945af(C70334de deVar) {
        this.f367411a = deVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "it");
        this.f367411a.mo62033h(C134948ai.f367416c, str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
