package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p721a.C11967c;
import com.google.android.libraries.assistant.auto.tng.common.p931p.C13314n;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C12654b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f39676a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f39677b;

    /* renamed from: c */
    public final /* synthetic */ Executor f39678c;

    /* renamed from: d */
    public final /* synthetic */ C11967c f39679d;

    public /* synthetic */ C12654b(boolean z, C60870cx cxVar, Executor executor, C11967c cVar) {
        this.f39676a = z;
        this.f39677b = cxVar;
        this.f39678c = executor;
        this.f39679d = cVar;
    }

    public final void run() {
        boolean z = this.f39676a;
        C60870cx cxVar = this.f39677b;
        Executor executor = this.f39678c;
        C11967c cVar = this.f39679d;
        if (z) {
            C13314n.m29569a(cxVar, executor).mo20440jJ(cVar);
        } else {
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
