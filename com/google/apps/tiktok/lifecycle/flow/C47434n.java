package com.google.apps.tiktok.lifecycle.flow;

import android.os.Looper;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5574b.C71571du;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.lifecycle.flow.n */
/* compiled from: PG */
final class C47434n extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C47437q f123196a;

    /* renamed from: b */
    final /* synthetic */ C47435o f123197b;

    /* renamed from: c */
    final /* synthetic */ C71571du f123198c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47434n(C47437q qVar, C47435o oVar, C71571du duVar) {
        super(1);
        this.f123196a = qVar;
        this.f123197b = oVar;
        this.f123198c = duVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C47423c cVar = (C47423c) obj;
        C69664n.m101061g(cVar, "$this$lifecycleFlow");
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            C47437q qVar = this.f123196a;
            if (!qVar.f123204a) {
                qVar.f123204a = true;
                C71803m.m105043d(this.f123197b.f123200b, (C69585o) null, C71424ay.UNDISPATCHED, new C47433m(this.f123197b, this.f123198c, cVar, (C69577g) null), 1);
                return C69788q.f186170a;
            }
            throw new IllegalStateException(" per Fragment lifecycle. Always `streamFrom()` in an `init` block or `onCreate()`. See go/tiktok/dev/kotlin/coroutines/mainthread/client for documentation.");
        }
        throw new IllegalStateException("Check failed.");
    }
}
