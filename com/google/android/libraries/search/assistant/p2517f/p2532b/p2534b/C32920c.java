package com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b;

import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32933k;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.b.b.c */
/* compiled from: PG */
public final class C32920c {

    /* renamed from: a */
    public final C39141kp f88240a;

    /* renamed from: b */
    private final C32924g f88241b;

    public C32920c(C39141kp kpVar, C32924g gVar) {
        C69664n.m101061g(kpVar, "streamz");
        C69664n.m101061g(gVar, "currentProcessName");
        this.f88240a = kpVar;
        this.f88241b = gVar;
    }

    /* renamed from: a */
    public final void mo38351a(String str, C32918a aVar, int i, boolean z) {
        C69664n.m101061g(aVar, "cacheType");
        C58976aa aaVar = C58975e.f156826a;
        aVar.name();
        this.f88241b.f88248a.name();
        C39141kp kpVar = this.f88240a;
        C58495hd hdVar = C32933k.f88251a;
        Object[] objArr = {C32933k.m60944a(str), this.f88241b.f88248a.name(), aVar.name(), Boolean.valueOf(z)};
        double d = (double) i;
        Double.isNaN(d);
        ((C19569f) kpVar.f103039k.mo6453a()).mo24824b(d / 1000.0d, objArr);
    }

    /* renamed from: b */
    public final void mo38352b(String str, C32919b bVar, Duration duration) {
        C69664n.m101061g(bVar, "startupLatencyType");
        C69664n.m101061g(duration, "contextApiStartupLatency");
        C58495hd hdVar = C32933k.f88251a;
        String a = C32933k.m60944a(str);
        C58976aa aaVar = C58975e.f156826a;
        bVar.name();
        C39141kp kpVar = this.f88240a;
        long millis = duration.toMillis();
        ((C19569f) kpVar.f103040l.mo6453a()).mo24824b((double) millis, a, bVar.name());
    }
}
