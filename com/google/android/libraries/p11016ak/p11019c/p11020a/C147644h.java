package com.google.android.libraries.p11016ak.p11019c.p11020a;

import com.google.android.libraries.p11016ak.C147611a;
import com.google.android.libraries.p11016ak.C147631b;
import com.google.android.libraries.p11016ak.p11017a.C147612a;
import com.google.android.libraries.p11016ak.p11017a.C147613b;
import com.google.android.libraries.p11016ak.p11017a.C147614c;
import com.google.android.libraries.p11016ak.p11017a.C147615d;
import com.google.android.libraries.p11016ak.p11017a.C147616e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.p4750c.C62948a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.IntStream;
import p5304e.p5305a.p5306a.p5315aa.p5316a.C68337a;

/* renamed from: com.google.android.libraries.ak.c.a.h */
/* compiled from: PG */
public final class C147644h {

    /* renamed from: a */
    public final AtomicReference f398484a = new AtomicReference(C58836b.f156633a);

    /* renamed from: b */
    private final Map f398485b = new HashMap();

    /* renamed from: d */
    private final boolean m240713d(int i) {
        int c = mo124392c(i);
        return c == 1 || c == 2;
    }

    /* renamed from: a */
    public final synchronized C147631b mo124390a(List list) {
        C147631b bVar;
        Map map = (Map) Collection.EL.stream(this.f398485b.entrySet()).filter(new C147639c(this)).collect(Collectors.toMap(C147640d.f398481a, C147641e.f398482a));
        if (map.isEmpty()) {
            int size = list.size();
            C147611a aVar = (C147611a) C147631b.f398465c.createBuilder();
            aVar.mo124376a(Collections.nCopies(size, C62948a.f169987b));
            bVar = (C147631b) aVar.build();
        } else {
            double sum = (double) Collection.EL.stream(map.entrySet()).map(C147614c.f398427a).mapToLong(C147615d.f398428a).sum();
            double sum2 = (double) Collection.EL.stream(map.keySet()).map(new C147612a(list)).mapToLong(C147613b.f398426a).sum();
            C147611a aVar2 = (C147611a) C147631b.f398465c.createBuilder();
            boolean z = map.size() == list.size();
            aVar2.copyOnWrite();
            ((C147631b) aVar2.instance).f398468b = z;
            aVar2.mo124376a((Iterable) IntStream.CC.range(0, list.size()).mapToObj(new C147616e(map, list, sum2, sum)).collect(Collectors.toList()));
            bVar = (C147631b) aVar2.build();
        }
        return bVar;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo124391b(int i, C147643g gVar) {
        if (C68337a.m98691c()) {
            if (((C58833ax) this.f398484a.get()).mo56113h()) {
                return C60856cj.m92899h((Throwable) ((C58833ax) this.f398484a.get()).mo56107c());
            }
        }
        if (m240713d(i)) {
            return (C60870cx) this.f398485b.get(Integer.valueOf(i));
        }
        List<C60870cx> a = gVar.mo124389a();
        C58838bb.m90884s(a != null && !a.isEmpty(), "No futures provided.");
        if (C68337a.m98691c()) {
            for (C60870cx t : a) {
                C60856cj.m92911t(t, C47810es.m84974n(new C147642f(this)), C60826bg.f164896a);
            }
        }
        for (C60870cx cxVar : a) {
            if (!m240713d(i)) {
                this.f398485b.put(Integer.valueOf(i), cxVar);
            }
            i++;
        }
        return (C60870cx) a.get(0);
    }

    /* renamed from: c */
    public final int mo124392c(int i) {
        Map map = this.f398485b;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return 4;
        }
        C60870cx cxVar = (C60870cx) this.f398485b.get(valueOf);
        if (!cxVar.isDone()) {
            return 2;
        }
        try {
            cxVar.get();
            return 1;
        } catch (InterruptedException | ExecutionException unused) {
            return 3;
        }
    }
}
