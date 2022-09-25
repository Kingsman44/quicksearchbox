package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.fh */
/* compiled from: PG */
final class C135088fh implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C61363ae f367933a;

    public C135088fh(C61363ae aeVar) {
        this.f367933a = aeVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "it");
        this.f367933a.mo57932a(C61362ad.m93870b("Authorization"), str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
