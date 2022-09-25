package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.engine.b.c.j;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5978b.p5981c.C75208h;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.d */
/* compiled from: PG */
public final class C79856d {

    /* renamed from: a */
    public final ac f218924a;

    /* renamed from: b */
    private final AtomicLong f218925b = new AtomicLong();

    public C79856d(ac acVar) {
        this.f218924a = acVar;
    }

    /* renamed from: a */
    public final j mo74269a() {
        return new C75208h(this.f218924a, this.f218925b.getAndIncrement());
    }
}
