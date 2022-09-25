package com.google.p3723ar.core;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.ar.core.k */
/* compiled from: PG */
final class C47905k extends LinkedHashMap {
    public C47905k() {
        super(1, 0.75f, true);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
