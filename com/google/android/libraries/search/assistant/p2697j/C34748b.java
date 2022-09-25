package com.google.android.libraries.search.assistant.p2697j;

import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.j.b */
/* compiled from: PG */
final class C34748b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C69648ae f92212a;

    public C34748b(C69648ae aeVar) {
        this.f92212a = aeVar;
    }

    public final void run() {
        C60870cx cxVar;
        Object obj = this.f92212a.f186027a;
        if (obj == null) {
            C69664n.m101065k("future");
            cxVar = null;
        } else {
            cxVar = (C60870cx) obj;
        }
        cxVar.cancel(false);
    }
}
