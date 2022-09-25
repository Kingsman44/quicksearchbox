package com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2622c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34023am;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34029as;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import p5462h.C69685i;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.c.b */
/* compiled from: PG */
final class C33735b extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C33735b f90096a = new C33735b();

    public C33735b() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C34023am amVar = (C34023am) obj;
        C69664n.m101061g(amVar, "it");
        C62971cq<C34029as> cqVar = amVar.f90679c;
        C69664n.m101060f(cqVar, "it.eventsList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C34029as iVar : cqVar) {
            arrayList.add(new C69685i(iVar, amVar));
        }
        return arrayList;
    }
}
