package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c;

import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33707a;
import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33712f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34239av;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34743k;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34747o;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71506bj;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71562dl;
import kotlinx.coroutines.p5574b.C71570dt;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.c.u */
/* compiled from: PG */
public final class C34585u {

    /* renamed from: a */
    public static final C59071e f91879a = C59071e.m91331h();

    /* renamed from: b */
    public final C33707a f91880b;

    /* renamed from: c */
    public final C71587n f91881c;

    /* renamed from: d */
    public final C71553dc f91882d;

    public C34585u(C34239av avVar, C34575k kVar, C33712f fVar, C33707a aVar, C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f91880b = aVar;
        this.f91881c = C71506bj.m104339e(avVar.mo39282a(C34043bf.ENTRYPOINT_HDM_HOTWORD), new C34580p((C69577g) null, this));
        C71587n b = C34743k.m63491b(C71536cm.m104384b(C71471ab.m104286a(C71506bj.m104339e(fVar.f90058b, new C34581q((C69577g) null, this, kVar))), new C34578n((C69577g) null)), "On device hotword consumer", f91879a);
        int i = C71562dl.f190976a;
        this.f91882d = C34747o.m63497a(b, awVar, new C71570dt(5000, 0));
    }
}
