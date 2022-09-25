package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5978b.p5989g.C75283p;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.e */
/* compiled from: PG */
public final class C79857e {

    /* renamed from: a */
    private final AtomicLong f218926a;

    public C79857e(long j) {
        this.f218926a = new AtomicLong(j);
    }

    /* renamed from: a */
    public final ac mo74270a() {
        return new C75283p(this.f218926a.getAndIncrement());
    }
}
