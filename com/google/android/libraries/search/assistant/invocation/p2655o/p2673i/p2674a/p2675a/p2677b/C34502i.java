package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.i */
/* compiled from: PG */
final class C34502i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C69648ae f91685a;

    /* renamed from: b */
    final /* synthetic */ C87673aa f91686b;

    public C34502i(C69648ae aeVar, C87673aa aaVar) {
        this.f91685a = aeVar;
        this.f91686b = aaVar;
    }

    public final void run() {
        C60870cx cxVar;
        Object obj = this.f91685a.f186027a;
        if (obj == null) {
            C69664n.m101065k("future");
            cxVar = null;
        } else {
            cxVar = (C60870cx) obj;
        }
        cxVar.cancel(true);
        this.f91686b.mo81933e();
    }
}
