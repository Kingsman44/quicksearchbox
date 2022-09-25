package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32925c;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32933k;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b.C32920c;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.C34836d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b;
import java.util.Set;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.x */
/* compiled from: PG */
final class C32771x extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C32607ac f87937a;

    /* renamed from: b */
    final /* synthetic */ C32871q f87938b;

    /* renamed from: c */
    final /* synthetic */ Throwable f87939c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32771x(C32607ac acVar, C32871q qVar, Throwable th) {
        super(1);
        this.f87937a = acVar;
        this.f87938b = qVar;
        this.f87939c = th;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        String str;
        C65570b bVar;
        C32920c cVar = this.f87937a.f87316g;
        C32871q qVar = this.f87938b;
        Throwable th = this.f87939c;
        C69664n.m101061g(qVar, "cachingStrategy");
        C58495hd hdVar = C32933k.f88251a;
        String a = C32933k.m60944a((String) obj);
        C58976aa aaVar = C58975e.f156826a;
        qVar.name();
        if (th != null) {
            th.getMessage();
        }
        C39141kp kpVar = cVar.f88240a;
        String name = qVar.name();
        if (th == null) {
            str = "OK";
        } else {
            Set set = C32925c.f88249a;
            if (C32925c.f88250b.contains(C32925c.m60930a(th))) {
                str = "TIMEOUT";
            } else if (C32925c.f88249a.contains(C32925c.m60930a(th))) {
                str = "CANCELLED";
            } else {
                C34819a a2 = C32925c.m60930a(th);
                if (((C34836d) a2).f92406a.f92404b == 100004) {
                    bVar = C65570b.m96731a(a2.mo39520a());
                    if (bVar == null) {
                        bVar = C65570b.ERROR_UNKNOWN;
                    }
                    C69664n.m101060f(bVar, "{\n      ContextApiErrorC…e) ?: ERROR_UNKNOWN\n    }");
                } else {
                    bVar = C65570b.ERROR_UNKNOWN;
                }
                str = bVar.name();
            }
        }
        ((C19567d) kpVar.f103038j.mo6453a()).mo24822a(1, a, name, str);
        return C69788q.f186170a;
    }
}
