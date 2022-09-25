package com.google.android.libraries.lens.view.p2152n;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.n.h */
/* compiled from: PG */
final class C27455h extends LinkedHashMap {
    public C27455h() {
        super(300);
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 300;
    }
}
