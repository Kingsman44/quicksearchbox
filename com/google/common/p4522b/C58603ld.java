package com.google.common.p4522b;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.common.b.ld */
/* compiled from: PG */
abstract class C58603ld extends WeakReference implements C58608li {

    /* renamed from: a */
    final int f156311a;

    /* renamed from: b */
    final C58608li f156312b;

    public C58603ld(ReferenceQueue referenceQueue, Object obj, int i, C58608li liVar) {
        super(obj, referenceQueue);
        this.f156311a = i;
        this.f156312b = liVar;
    }

    /* renamed from: a */
    public final int mo55633a() {
        return this.f156311a;
    }

    /* renamed from: b */
    public final C58608li mo55634b() {
        return this.f156312b;
    }

    /* renamed from: c */
    public final Object mo55635c() {
        return get();
    }
}
