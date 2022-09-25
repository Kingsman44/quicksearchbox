package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34048bk;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateProviderImpl$forClient$$inlined$combine$1$3", mo61344c = "InvocationSourceStateProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {337})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bz */
/* compiled from: PG */
public final class C34270bz extends C69572j implements C69631q {

    /* renamed from: a */
    int f91165a;

    /* renamed from: b */
    /* synthetic */ Object f91166b;

    /* renamed from: c */
    private /* synthetic */ Object f91167c;

    public C34270bz(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34270bz bzVar = new C34270bz((C69577g) obj3);
        bzVar.f91167c = (C71588o) obj;
        bzVar.f91166b = (Object[]) obj2;
        return bzVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91165a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r7 = this.f91167c;
            C34049bl[] blVarArr = (C34049bl[]) ((Object[]) this.f91166b);
            C34048bk bkVar = (C34048bk) C34049bl.f90749a.createBuilder();
            C69664n.m101060f(bkVar, "newBuilder()");
            for (C34049bl mergeFrom : blVarArr) {
                bkVar.mergeFrom(mergeFrom);
            }
            C62942bv build = bkVar.build();
            this.f91165a = 1;
            if (r7.mo20883a(build, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
