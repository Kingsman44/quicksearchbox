package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2703l.C34794h;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71671dg;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.ContextConsumerImpl$getSession$1", mo61344c = "ContextConsumerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {78, 80, 80})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bv */
/* compiled from: PG */
final class C32653bv extends C69572j implements C69626l {

    /* renamed from: a */
    Object f87519a;

    /* renamed from: b */
    int f87520b;

    /* renamed from: c */
    final /* synthetic */ C32636be f87521c;

    /* renamed from: d */
    final /* synthetic */ C34794h f87522d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32653bv(C32636be beVar, C34794h hVar, C69577g gVar) {
        super(1, gVar);
        this.f87521c = beVar;
        this.f87522d = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C32653bv(this.f87521c, this.f87522d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f87520b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C32636be beVar = this.f87521c;
            this.f87520b = 1;
            Object a = C71423ax.m104196a(new C32630az(beVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C71671dg dgVar = C71671dg.f191128a;
                C32652bu buVar = new C32652bu(this.f87522d, (C69577g) null);
                this.f87519a = th;
                this.f87520b = 3;
                if (C71803m.m105040a(dgVar, buVar, this) == aVar) {
                    return aVar;
                }
                obj2 = th;
            }
        } else if (i == 2) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            obj2 = this.f87519a;
            C69714l.m101134b(obj);
            throw ((Throwable) obj2);
        }
        C71671dg dgVar2 = C71671dg.f191128a;
        C32652bu buVar2 = new C32652bu(this.f87522d, (C69577g) null);
        this.f87520b = 2;
        if (C71803m.m105040a(dgVar2, buVar2, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }
}
