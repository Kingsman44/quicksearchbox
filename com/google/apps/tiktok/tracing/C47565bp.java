package com.google.apps.tiktok.tracing;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.tracing.bp */
/* compiled from: PG */
final class C47565bp {

    /* renamed from: a */
    int f123434a;

    /* renamed from: b */
    final int f123435b;

    /* renamed from: c */
    C47565bp f123436c;

    /* renamed from: d */
    final Map f123437d = new HashMap(0);

    public C47565bp(int i, int i2) {
        if (i <= i2) {
            this.f123434a = i;
            this.f123435b = i2;
            this.f123436c = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return "Node" + identityHashCode;
    }
}
