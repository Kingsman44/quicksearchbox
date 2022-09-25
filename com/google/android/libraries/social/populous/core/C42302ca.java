package com.google.android.libraries.social.populous.core;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.social.populous.core.ca */
/* compiled from: PG */
public final class C42302ca extends LinkedHashMap {

    /* renamed from: a */
    private final int f110933a = 500;

    public C42302ca() {
        super(0, 0.75f, true);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.f110933a) {
            return true;
        }
        C42300bz bzVar = (C42300bz) entry.getValue();
        throw null;
    }
}
