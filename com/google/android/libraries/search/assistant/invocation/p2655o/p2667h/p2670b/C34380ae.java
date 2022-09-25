package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$initialize$1$invokeSuspend$$inlined$flatMapLatest$1", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {216})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.ae */
/* compiled from: PG */
public final class C34380ae extends C69572j implements C69631q {

    /* renamed from: a */
    int f91393a;

    /* renamed from: b */
    /* synthetic */ Object f91394b;

    /* renamed from: c */
    final /* synthetic */ C34382ag f91395c;

    /* renamed from: d */
    private /* synthetic */ Object f91396d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34380ae(C69577g gVar, C34382ag agVar) {
        super(3, gVar);
        this.f91395c = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34380ae aeVar = new C34380ae((C69577g) obj3, this.f91395c);
        aeVar.f91396d = (C71588o) obj;
        aeVar.f91394b = obj2;
        return aeVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71587n nVar;
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91393a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r7 = this.f91396d;
            Set<C34354a> set = (Set) this.f91394b;
            if (set.isEmpty()) {
                nVar = new C71552db(new C34389e((C69577g) null));
            } else {
                ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
                for (C34354a aVar : set) {
                    arrayList.add(new C34392h(aVar.mo39323d(), aVar));
                }
                Object[] array = C69540x.m100840V(arrayList).toArray(new C71587n[0]);
                C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                nVar = new C34388d((C71587n[]) array);
            }
            this.f91393a = 1;
            if (C71594u.m104516c(r7, nVar, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
