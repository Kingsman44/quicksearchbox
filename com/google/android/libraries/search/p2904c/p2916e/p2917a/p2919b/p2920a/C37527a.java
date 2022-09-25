package com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2920a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2921b.C37528a;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2921b.C37529b;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2921b.C37531d;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2921b.C37532e;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2921b.C37533f;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.e.a.b.a.a */
/* compiled from: PG */
public final class C37527a {

    /* renamed from: a */
    private final C21370a f99699a;

    /* renamed from: b */
    private final Queue f99700b = new C58781rt(new C58425eo(100));

    public C37527a(C21370a aVar) {
        C69664n.m101061g(aVar, "clock");
        this.f99699a = aVar;
    }

    /* renamed from: a */
    public final C37533f mo41006a() {
        C37532e eVar = (C37532e) C37533f.f99715b.createBuilder();
        C69664n.m101060f(eVar, "newBuilder()");
        C69664n.m101061g(eVar, "builder");
        List unmodifiableList = Collections.unmodifiableList(((C37533f) eVar.instance).f99717a);
        C69664n.m101060f(unmodifiableList, "_builder.getEventsList()");
        new C62883b(unmodifiableList);
        Queue queue = this.f99700b;
        eVar.copyOnWrite();
        C37533f fVar = (C37533f) eVar.instance;
        C62971cq cqVar = fVar.f99717a;
        if (!cqVar.mo58948c()) {
            fVar.f99717a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) queue, (List) fVar.f99717a);
        C62942bv build = eVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C37533f) build;
    }

    /* renamed from: b */
    public final void mo41007b(int i, C37531d dVar) {
        C69664n.m101061g(dVar, "type");
        Queue queue = this.f99700b;
        C37528a aVar = (C37528a) C37529b.f99701e.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        aVar.copyOnWrite();
        C37529b bVar = (C37529b) aVar.instance;
        bVar.f99703a |= 1;
        bVar.f99704b = i;
        C69664n.m101061g(dVar, "value");
        aVar.copyOnWrite();
        C37529b bVar2 = (C37529b) aVar.instance;
        bVar2.f99705c = dVar.f99714f;
        bVar2.f99703a |= 2;
        long b = this.f99699a.mo26870b();
        aVar.copyOnWrite();
        C37529b bVar3 = (C37529b) aVar.instance;
        bVar3.f99703a |= 4;
        bVar3.f99706d = b;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        queue.add((C37529b) build);
    }
}
