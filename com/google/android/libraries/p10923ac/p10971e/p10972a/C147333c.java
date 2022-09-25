package com.google.android.libraries.p10923ac.p10971e.p10972a;

import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ac.e.a.c */
/* compiled from: PG */
public final class C147333c implements Executor {

    /* renamed from: a */
    public final Object f397721a = new Object();

    /* renamed from: b */
    public final Executor f397722b;

    /* renamed from: c */
    public C147332b f397723c;

    public C147333c(Executor executor) {
        this.f397722b = executor;
    }

    public final void execute(Runnable runnable) {
        C147332b bVar = new C147332b(this, runnable);
        synchronized (bVar.f397720c.f397721a) {
            C147333c cVar = bVar.f397720c;
            C147332b bVar2 = cVar.f397723c;
            cVar.f397723c = bVar;
            if (bVar2 != null) {
                C58838bb.m90883r(bVar2.f397719b == null);
                bVar2.f397719b = bVar;
                return;
            }
            bVar.f397720c.f397722b.execute(bVar);
        }
    }
}
