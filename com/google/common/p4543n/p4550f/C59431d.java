package com.google.common.p4543n.p4550f;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.common.n.f.d */
/* compiled from: PG */
final class C59431d extends LinkedHashMap {
    public C59431d() {
        super((int) Math.ceil(128.0d), 0.5f, true);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 64;
    }
}
