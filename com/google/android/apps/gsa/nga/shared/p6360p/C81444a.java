package com.google.android.apps.gsa.nga.shared.p6360p;

import java.util.Random;
import java.util.UUID;

/* renamed from: com.google.android.apps.gsa.nga.shared.p.a */
/* compiled from: PG */
public final class C81444a {

    /* renamed from: a */
    private final Random f222852a = new Random();

    /* renamed from: a */
    public final UUID mo75083a() {
        return new UUID((this.f222852a.nextLong() & -61441) | 16384, (this.f222852a.nextLong() & 4611686018427387903L) | Long.MIN_VALUE);
    }
}
