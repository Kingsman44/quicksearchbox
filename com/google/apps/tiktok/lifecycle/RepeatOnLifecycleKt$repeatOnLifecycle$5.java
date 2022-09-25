package com.google.apps.tiktok.lifecycle;

import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2389t;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71808r;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.apps.tiktok.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$5", mo61344c = "RepeatOnLifecycle.kt", mo61345d = "invokeSuspend", mo61346e = {82})
/* compiled from: PG */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$5 extends C69572j implements C69630p {

    /* renamed from: a */
    Object f123152a;

    /* renamed from: b */
    Object f123153b;

    /* renamed from: c */
    int f123154c;

    /* renamed from: d */
    final /* synthetic */ C2383n f123155d;

    /* renamed from: e */
    final /* synthetic */ C2384o f123156e;

    /* renamed from: f */
    final /* synthetic */ C69630p f123157f;

    /* renamed from: g */
    private /* synthetic */ Object f123158g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$5(C2383n nVar, C2384o oVar, C69630p pVar, C69577g gVar) {
        super(2, gVar);
        this.f123155d = nVar;
        this.f123156e = oVar;
        this.f123157f = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$5) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f123154c != 0) {
            obj3 = this.f123153b;
            obj2 = this.f123152a;
            C71422aw awVar = (C71422aw) this.f123158g;
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                th = th;
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar2 = (C71422aw) this.f123158g;
            C69648ae aeVar = new C69648ae();
            C69648ae aeVar2 = new C69648ae();
            try {
                C2383n nVar = this.f123155d;
                C2384o oVar = this.f123156e;
                C69630p pVar = this.f123157f;
                this.f123158g = awVar2;
                this.f123152a = aeVar;
                this.f123153b = aeVar2;
                this.f123154c = 1;
                C71808r rVar = new C71808r(C69555b.m100961b(this), 1);
                rVar.mo63041A();
                aeVar2.f186027a = new RepeatOnLifecycleKt$repeatOnLifecycle$5$1$1(C2382m.m6395c(nVar), aeVar, awVar2, C2382m.m6393a(nVar), rVar, new C71799m(), pVar);
                Object obj4 = aeVar2.f186027a;
                C69664n.m101059e(obj4, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                oVar.mo5790b((C2389t) obj4);
                if (rVar.mo63043n() == aVar) {
                    return aVar;
                }
                obj2 = aeVar;
                obj3 = aeVar2;
            } catch (Throwable th2) {
                th = th2;
                obj2 = aeVar;
                obj3 = aeVar2;
                C71643cp cpVar = (C71643cp) ((C69648ae) obj2).f186027a;
                if (cpVar != null) {
                    cpVar.mo62723u((CancellationException) null);
                }
                C2389t tVar = (C2389t) ((C69648ae) obj3).f186027a;
                if (tVar != null) {
                    this.f123156e.mo5791c(tVar);
                }
                throw th;
            }
        }
        C71643cp cpVar2 = (C71643cp) ((C69648ae) obj2).f186027a;
        if (cpVar2 != null) {
            cpVar2.mo62723u((CancellationException) null);
        }
        C2389t tVar2 = (C2389t) ((C69648ae) obj3).f186027a;
        if (tVar2 != null) {
            this.f123156e.mo5791c(tVar2);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$5 repeatOnLifecycleKt$repeatOnLifecycle$5 = new RepeatOnLifecycleKt$repeatOnLifecycle$5(this.f123155d, this.f123156e, this.f123157f, gVar);
        repeatOnLifecycleKt$repeatOnLifecycle$5.f123158g = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$5;
    }
}
