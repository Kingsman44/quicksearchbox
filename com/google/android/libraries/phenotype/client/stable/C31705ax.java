package com.google.android.libraries.phenotype.client.stable;

import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.phenotype.client.stable.ax */
/* compiled from: PG */
public final class C31705ax implements C31715bg {

    /* renamed from: a */
    private static boolean f85245a;

    /* renamed from: b */
    private final C58881cr f85246b;

    /* renamed from: c */
    private final int f85247c = Math.max(5, 10);

    public C31705ax(C58881cr crVar) {
        this.f85246b = crVar;
    }

    /* renamed from: a */
    public final void mo37332a() {
        synchronized (C31705ax.class) {
            if (!f85245a) {
                long j = (long) this.f85247c;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                C60888db dbVar = (C60888db) this.f85246b.mo6453a();
                C31703av.m59037a(dbVar.mo29164d(new C31704aw(dbVar, j, timeUnit), j, timeUnit));
                f85245a = true;
            }
        }
    }
}
