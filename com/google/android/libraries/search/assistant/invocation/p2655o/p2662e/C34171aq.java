package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.C71589p;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.oracle.InvocationRoutingOracleImpl$special$$inlined$flatMapLatest$1", mo61344c = "InvocationRoutingOracleImpl.kt", mo61345d = "invokeSuspend", mo61346e = {216})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.aq */
/* compiled from: PG */
public final class C34171aq extends C69572j implements C69631q {

    /* renamed from: a */
    int f90957a;

    /* renamed from: b */
    /* synthetic */ Object f90958b;

    /* renamed from: c */
    final /* synthetic */ C34173as f90959c;

    /* renamed from: d */
    private /* synthetic */ Object f90960d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34171aq(C69577g gVar, C34173as asVar) {
        super(3, gVar);
        this.f90959c = asVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34171aq aqVar = new C34171aq((C69577g) obj3, this.f90959c);
        aqVar.f90960d = (C71588o) obj;
        aqVar.f90958b = obj2;
        return aqVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71587n nVar;
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f90957a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r7 = this.f90960d;
            Set<C34354a> set = (Set) this.f90958b;
            if (set.isEmpty()) {
                nVar = new C71589p(C69498ao.f185920a);
            } else {
                ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
                for (C34354a aVar : set) {
                    arrayList.add(C71536cm.m104384b(new C34161ag(aVar.mo39323d(), aVar), new C34162ah((C69577g) null)));
                }
                Object[] array = C69540x.m100840V(arrayList).toArray(new C71587n[0]);
                C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                nVar = new C34158ad((C71587n[]) array);
            }
            this.f90957a = 1;
            if (C71594u.m104516c(r7, nVar, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
