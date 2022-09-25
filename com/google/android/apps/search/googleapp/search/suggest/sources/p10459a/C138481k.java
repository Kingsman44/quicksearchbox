package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.frameworks.client.data.android.C61362ad;
import java.util.Map;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.k */
/* compiled from: PG */
final class C138481k implements Consumer {

    /* renamed from: a */
    final /* synthetic */ Map f376680a;

    public C138481k(Map map) {
        this.f376680a = map;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "it");
        this.f376680a.put(C61362ad.m93870b("Authorization"), str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
