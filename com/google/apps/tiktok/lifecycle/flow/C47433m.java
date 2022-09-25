package com.google.apps.tiktok.lifecycle.flow;

import android.os.Looper;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import com.google.apps.tiktok.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$5;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.p5574b.C71571du;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.apps.tiktok.lifecycle.flow.StreamMixinImpl$streamFrom$2$2", mo61344c = "Implementation.kt", mo61345d = "invokeSuspend", mo61346e = {132})
/* renamed from: com.google.apps.tiktok.lifecycle.flow.m */
/* compiled from: PG */
final class C47433m extends C69572j implements C69630p {

    /* renamed from: a */
    int f123192a;

    /* renamed from: b */
    final /* synthetic */ C47435o f123193b;

    /* renamed from: c */
    final /* synthetic */ C71571du f123194c;

    /* renamed from: d */
    final /* synthetic */ C47423c f123195d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47433m(C47435o oVar, C71571du duVar, C47423c cVar, C69577g gVar) {
        super(2, gVar);
        this.f123193b = oVar;
        this.f123194c = duVar;
        this.f123195d = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C47433m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f123192a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C2384o oVar = this.f123193b.f123199a;
            C2383n nVar = C2383n.STARTED;
            C47432l lVar = new C47432l(this.f123194c, this.f123195d, (C69577g) null);
            this.f123192a = 1;
            if (nVar == C2383n.INITIALIZED) {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            } else if (oVar.mo5789a() == C2383n.DESTROYED) {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start after its input Lifecycle has already been destroyed.");
            } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                Object a = C71423ax.m104196a(new RepeatOnLifecycleKt$repeatOnLifecycle$5(nVar, oVar, lVar, (C69577g) null), this);
                if (a != C69554a.COROUTINE_SUSPENDED) {
                    a = C69788q.f186170a;
                }
                if (a == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalArgumentException("repeatOnLifecycle must be called from the main thread.");
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C47433m(this.f123193b, this.f123194c, this.f123195d, gVar);
    }
}
