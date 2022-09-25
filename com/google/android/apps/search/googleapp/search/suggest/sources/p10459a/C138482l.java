package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.frameworks.client.data.android.C61362ad;
import java.util.Map;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.l */
/* compiled from: PG */
final class C138482l implements Consumer {

    /* renamed from: a */
    final /* synthetic */ Map f376681a;

    public C138482l(Map map) {
        this.f376681a = map;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "it");
        this.f376681a.put(C61362ad.m93870b("X-Geo"), str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
