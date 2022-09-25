package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.t.b.b */
/* compiled from: PG */
public final /* synthetic */ class C38031b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C38032c f100761a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f100762b;

    /* renamed from: c */
    public final /* synthetic */ C37966b f100763c;

    /* renamed from: d */
    public final /* synthetic */ C37773c f100764d;

    public /* synthetic */ C38031b(C38032c cVar, C60870cx cxVar, C37966b bVar, C37773c cVar2) {
        this.f100761a = cVar;
        this.f100762b = cxVar;
        this.f100763c = bVar;
        this.f100764d = cVar2;
    }

    public final void run() {
        C38032c cVar = this.f100761a;
        C60870cx cxVar = this.f100762b;
        C37966b bVar = this.f100763c;
        C37773c cVar2 = this.f100764d;
        if (!cxVar.isDone()) {
            cVar.mo41211f(C37565ef.TIMEOUT);
            bVar.mo41175h(cVar2);
        }
    }
}
