package com.google.ads.interactivemedia.p367v3.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yi */
/* compiled from: PG */
final class C7442yi extends LinkedHashMap {

    /* renamed from: a */
    final /* synthetic */ int f24386a = 4;

    public C7442yi() {
        super(5, 1.0f, false);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f24386a;
    }
}
