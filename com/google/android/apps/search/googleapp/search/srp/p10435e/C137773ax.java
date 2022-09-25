package com.google.android.apps.search.googleapp.search.srp.p10435e;

import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.ax */
/* compiled from: PG */
final class C137773ax implements Consumer {

    /* renamed from: a */
    final /* synthetic */ Map f374794a;

    public C137773ax(Map map) {
        this.f374794a = map;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C69664n.m101061g(entry, "cgiParam");
        Map.EL.putIfAbsent(this.f374794a, entry.getKey(), entry.getValue());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
