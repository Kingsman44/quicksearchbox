package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b;

import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9221a.C121412a;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9221a.C121413b;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9221a.C121414c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9221a.C121415d;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9222b.C121427a;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48686au;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62963cj;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.o */
/* compiled from: PG */
public final class C121471o implements C121427a {

    /* renamed from: a */
    private final C121415d f337136a;

    /* renamed from: b */
    private final Executor f337137b;

    public C121471o(C121415d dVar, Executor executor) {
        this.f337136a = dVar;
        this.f337137b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo105136a(C48686au auVar, C58485gu guVar) {
        Map map = (Map) Collection.EL.stream(guVar).flatMap(C121466j.f337131a).map(C121467k.f337132a).collect(Collectors.groupingBy(C121468l.f337133a, C121469m.f337134a, Collectors.toCollection(C121470n.f337135a)));
        C121415d dVar = this.f337136a;
        C19141ab abVar = auVar.f125960b;
        if (abVar == null) {
            abVar = C19141ab.f53614i;
        }
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(new C62963cj(abVar.f53620e, C19141ab.f53613f)).filter(new C121413b(dVar)).map(new C121414c(dVar)).collect(C58370cn.f155946a);
        ArrayList arrayList = new ArrayList();
        C60870cx i = C60856cj.m92900i(arrayList);
        int size = guVar2.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = C60922j.m93044g(C60922j.m93045h(i, C47810es.m84966f(new C121434d((C121412a) guVar2.get(i2), auVar, map)), this.f337137b), C47810es.m84963c(new C121462f(arrayList)), this.f337137b);
        }
        return C60922j.m93044g(i, C47810es.m84963c(new C121461e(map)), this.f337137b);
    }
}
