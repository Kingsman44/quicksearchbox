package com.google.android.libraries.search.assistant.invocation.p2655o.p2665g.p2666a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import java.util.ArrayList;
import java.util.Set;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.policy.conformance.SameClientAllowanceChecker$initialize$1$invokeSuspend$$inlined$flatMapLatest$1", mo61344c = "SameClientAllowance.kt", mo61345d = "invokeSuspend", mo61346e = {233})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.g.a.m */
/* compiled from: PG */
public final class C34344m extends C69572j implements C69631q {

    /* renamed from: a */
    int f91307a;

    /* renamed from: b */
    /* synthetic */ Object f91308b;

    /* renamed from: c */
    private /* synthetic */ Object f91309c;

    public C34344m(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34344m mVar = new C34344m((C69577g) obj3);
        mVar.f91309c = (C71588o) obj;
        mVar.f91308b = obj2;
        return mVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91307a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r7 = this.f91309c;
            Set<C34354a> set = (Set) this.f91308b;
            ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
            for (C34354a aVar : set) {
                arrayList.add(new C34350s(aVar.mo39323d(), aVar));
            }
            Object[] array = C69540x.m100840V(arrayList).toArray(new C71587n[0]);
            C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            C34347p pVar = new C34347p((C71587n[]) array);
            this.f91307a = 1;
            if (C71594u.m104516c(r7, pVar, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
