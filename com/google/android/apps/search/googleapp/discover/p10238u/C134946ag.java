package com.google.android.apps.search.googleapp.discover.p10238u;

import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.ag */
/* compiled from: PG */
final class C134946ag implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C70334de f367412a;

    public C134946ag(C70334de deVar) {
        this.f367412a = deVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "l");
        this.f367412a.mo62031f(C134948ai.f367417d);
        this.f367412a.mo62033h(C134948ai.f367417d, str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
