package com.google.android.apps.search.googleapp.discover.p10238u;

import android.net.Uri;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.fi */
/* compiled from: PG */
final class C135089fi implements Consumer {

    /* renamed from: a */
    final /* synthetic */ Uri.Builder f367934a;

    public C135089fi(Uri.Builder builder) {
        this.f367934a = builder;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "it");
        this.f367934a.appendQueryParameter("gl", str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
