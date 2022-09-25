package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69497an;
import p5462h.p5463a.C69505av;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$asSubscriptionsFlow$$inlined$combine$1$3", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {333})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.c */
/* compiled from: PG */
public final class C34387c extends C69572j implements C69631q {

    /* renamed from: a */
    int f91416a;

    /* renamed from: b */
    /* synthetic */ Object f91417b;

    /* renamed from: c */
    private /* synthetic */ Object f91418c;

    public C34387c(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34387c cVar = new C34387c((C69577g) obj3);
        cVar.f91418c = (C71588o) obj;
        cVar.f91417b = (Object[]) obj2;
        return cVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Map map;
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91416a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r6 = this.f91418c;
            C69685i[] iVarArr = (C69685i[]) ((Object[]) this.f91417b);
            C69664n.m101061g(iVarArr, "<this>");
            int length = iVarArr.length;
            if (length == 0) {
                map = C69497an.f185919a;
            } else if (length != 1) {
                map = new LinkedHashMap(C69505av.m100860b(length));
                C69505av.m100880v(iVarArr, map);
            } else {
                map = C69505av.m100862d(iVarArr[0]);
            }
            this.f91416a = 1;
            if (r6.mo20883a(map, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
