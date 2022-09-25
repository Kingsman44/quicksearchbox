package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.p4017at.p4082j.p4083a.C54398cx;
import com.google.p4017at.p4082j.p4083a.C54402da;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5463a.C69505av;

/* renamed from: com.google.android.apps.search.podcasts.b.a.b */
/* compiled from: PG */
final class C139989b implements C42844bc {

    /* renamed from: a */
    final /* synthetic */ C139997j f380494a;

    /* renamed from: b */
    final /* synthetic */ Collection f380495b;

    /* renamed from: c */
    final /* synthetic */ C139988a f380496c;

    public C139989b(C139997j jVar, Collection collection, C139988a aVar) {
        this.f380494a = jVar;
        this.f380495b = collection;
        this.f380496c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45922a(C42847bf bfVar) {
        Map e = this.f380494a.mo115380e(bfVar, this.f380495b, this.f380496c);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(e.size()));
        for (Map.Entry entry : e.entrySet()) {
            linkedHashMap.put(entry.getKey(), (C54402da) ((C54398cx) entry.getValue()).build());
        }
        return linkedHashMap;
    }
}
