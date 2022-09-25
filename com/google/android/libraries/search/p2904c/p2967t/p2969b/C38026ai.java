package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.t.b.ai */
/* compiled from: PG */
public final /* synthetic */ class C38026ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C38029al f100743a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f100744b;

    /* renamed from: c */
    public final /* synthetic */ C37966b f100745c;

    /* renamed from: d */
    public final /* synthetic */ C37773c f100746d;

    public /* synthetic */ C38026ai(C38029al alVar, C60870cx cxVar, C37966b bVar, C37773c cVar) {
        this.f100743a = alVar;
        this.f100744b = cxVar;
        this.f100745c = bVar;
        this.f100746d = cVar;
    }

    public final void run() {
        C38029al alVar = this.f100743a;
        C60870cx cxVar = this.f100744b;
        C37966b bVar = this.f100745c;
        C37773c cVar = this.f100746d;
        if (!cxVar.isDone()) {
            alVar.mo41208e(C37565ef.TIMEOUT);
            bVar.mo41173f(cVar);
        }
    }
}
