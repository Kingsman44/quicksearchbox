package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.bo */
/* compiled from: PG */
enum C103942bo {
    HARD_CODED((String) 0, (int) true, (long) false),
    REMOTE((String) 1, (int) false, (long) true),
    MERGE_AFTER_INITIAL_DOWNLOAD((String) 2, (int) true, (long) C103941bn.f289273a),
    MERGE((String) 3, (int) true, (long) true);
    

    /* renamed from: e */
    public final long f289279e;

    /* renamed from: f */
    public final boolean f289280f;

    /* renamed from: g */
    public final Predicate f289281g;

    private C103942bo(long j, boolean z, Predicate predicate) {
        this.f289279e = j;
        this.f289280f = z;
        this.f289281g = predicate;
    }

    private C103942bo(long j, boolean z, boolean z2) {
        this(r8, r9, j, z, (Predicate) new C103940bm(z2));
    }
}
