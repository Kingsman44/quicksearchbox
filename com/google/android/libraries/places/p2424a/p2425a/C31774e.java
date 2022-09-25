package com.google.android.libraries.places.p2424a.p2425a;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.places.a.a.e */
/* compiled from: PG */
final class C31774e extends LinkedHashMap {
    public C31774e() {
        super(16, 0.75f, true);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
