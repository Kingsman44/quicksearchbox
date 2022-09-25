package com.google.android.gms.analytics.p10733a;

import com.google.android.gms.analytics.C142757j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.a.d */
/* compiled from: PG */
public final class C142683d extends C142757j {

    /* renamed from: a */
    public final Map f387184a = new HashMap(4);

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo117461b(C142757j jVar) {
        ((C142683d) jVar).f387184a.putAll(this.f387184a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f387184a.entrySet()) {
            hashMap.put("metric".concat(String.valueOf(String.valueOf(entry.getKey()))), entry.getValue());
        }
        return C142757j.m231683a(hashMap, 0);
    }
}
