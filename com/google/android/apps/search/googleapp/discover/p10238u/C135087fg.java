package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.fg */
/* compiled from: PG */
final class C135087fg implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C61363ae f367932a;

    public C135087fg(C61363ae aeVar) {
        this.f367932a = aeVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "it");
        this.f367932a.mo57932a(C61362ad.m93870b("Cookie"), str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
