package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32820bo;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32821bp;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32933k;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b.C32920c;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.n */
/* compiled from: PG */
final class C32761n extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C32607ac f87903a;

    /* renamed from: b */
    final /* synthetic */ C32821bp f87904b;

    /* renamed from: c */
    final /* synthetic */ Duration f87905c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32761n(C32607ac acVar, C32821bp bpVar, Duration duration) {
        super(1);
        this.f87903a = acVar;
        this.f87904b = bpVar;
        this.f87905c = duration;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        String str = (String) obj;
        C32920c cVar = this.f87903a.f87316g;
        C32820bo a = C32820bo.m60788a(this.f87904b.f88017b);
        if (a == null) {
            a = C32820bo.UNRECOGNIZED;
        }
        C69664n.m101060f(a, "result.source");
        Duration duration = this.f87905c;
        C69664n.m101060f(duration, "contextApiLatency");
        C69664n.m101061g(a, "source");
        C69664n.m101061g(duration, "contextApiLatency");
        C58495hd hdVar = C32933k.f88251a;
        String a2 = C32933k.m60944a(str);
        C58976aa aaVar = C58975e.f156826a;
        a.name();
        C39141kp kpVar = cVar.f88240a;
        long millis = duration.toMillis();
        ((C19569f) kpVar.f103037i.mo6453a()).mo24824b((double) millis, a2, a.name());
        return C69788q.f186170a;
    }
}
