package com.google.android.libraries.search.assistant.p2705n;

import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.error.AppFlowExtensionsKt$runSubFlow$2", mo61344c = "AppFlowExtensions.kt", mo61345d = "invokeSuspend", mo61346e = {33})
/* renamed from: com.google.android.libraries.search.assistant.n.b */
/* compiled from: PG */
final class C34832b extends C69572j implements C69630p {

    /* renamed from: a */
    int f92395a;

    /* renamed from: b */
    final /* synthetic */ C37215b f92396b;

    /* renamed from: c */
    final /* synthetic */ C37254c f92397c;

    /* renamed from: d */
    final /* synthetic */ C69630p f92398d;

    /* renamed from: e */
    final /* synthetic */ C37254c f92399e;

    /* renamed from: f */
    private /* synthetic */ Object f92400f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34832b(C37215b bVar, C37254c cVar, C69630p pVar, C37254c cVar2, C69577g gVar) {
        super(2, gVar);
        this.f92396b = bVar;
        this.f92397c = cVar;
        this.f92398d = pVar;
        this.f92399e = cVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34832b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f92395a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C34834b bVar = C34830d.m63595b(th).f92362c;
                if (bVar == null) {
                    bVar = C34834b.f92401c;
                }
                C34819a b = C34819a.m63579b(bVar);
                C37215b bVar2 = this.f92396b;
                C37252a c = this.f92399e.mo40779c();
                C69664n.m101060f(c, "endEvent.toBuilder()");
                C69664n.m101061g(c, "<this>");
                c.mo40780d(b.mo39520a(), b.mo39522e());
                C69664n.m101060f(c, "withCustomStatus(error.c… error.appFlowErrorSpace)");
                bVar2.mo19974a(c);
                throw th;
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f92400f;
            this.f92396b.mo19974a(this.f92397c);
            C69630p pVar = this.f92398d;
            this.f92395a = 1;
            obj = pVar.mo5192a(awVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.f92396b.mo19974a(this.f92399e);
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34832b bVar = new C34832b(this.f92396b, this.f92397c, this.f92398d, this.f92399e, gVar);
        bVar.f92400f = obj;
        return bVar;
    }
}
