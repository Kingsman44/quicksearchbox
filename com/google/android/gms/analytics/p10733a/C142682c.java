package com.google.android.gms.analytics.p10733a;

import com.google.android.gms.analytics.C142757j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.a.c */
/* compiled from: PG */
public final class C142682c extends C142757j {

    /* renamed from: a */
    public final Map f387183a = new HashMap(4);

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo117461b(C142757j jVar) {
        ((C142682c) jVar).f387183a.putAll(this.f387183a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f387183a.entrySet()) {
            hashMap.put("dimension".concat(String.valueOf(String.valueOf(entry.getKey()))), entry.getValue());
        }
        return C142757j.m231683a(hashMap, 0);
    }
}
