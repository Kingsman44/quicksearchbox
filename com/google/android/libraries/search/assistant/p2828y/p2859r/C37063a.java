package com.google.android.libraries.search.assistant.p2828y.p2859r;

import java.util.Comparator;
import java.util.Map;
import p5462h.C69685i;

/* renamed from: com.google.android.libraries.search.assistant.y.r.a */
/* compiled from: PG */
public final class C37063a implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Comparator f96552a;

    /* renamed from: b */
    final /* synthetic */ Map f96553b;

    public C37063a(Comparator comparator, Map map) {
        this.f96552a = comparator;
        this.f96553b = map;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f96552a.compare((Integer) this.f96553b.get(((C69685i) obj).f186052a), (Integer) this.f96553b.get(((C69685i) obj2).f186052a));
    }
}
