package com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a;

import com.google.common.util.concurrent.C60866ct;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.shared.queue.AsyncEventQueueImpl$post$resultFuture$1", mo61344c = "AsyncEventQueueImpl.kt", mo61345d = "invokeSuspend", mo61346e = {63})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.a.j */
/* compiled from: PG */
final class C128553j extends C69572j implements C69630p {

    /* renamed from: a */
    int f353485a;

    /* renamed from: b */
    final /* synthetic */ C128555l f353486b;

    /* renamed from: c */
    final /* synthetic */ C128548e f353487c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128553j(C128555l lVar, C128548e eVar, C69577g gVar) {
        super(2, gVar);
        this.f353486b = lVar;
        this.f353487c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128553j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353485a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (CancellationException e) {
                C128548e eVar = this.f353487c;
                eVar.f353478c.set(C128558o.CANCELLED);
                Runnable runnable = eVar.f353477b;
                if (runnable != null) {
                    runnable.run();
                }
                eVar.f353479d.mo108515c();
                throw e;
            }
        } else {
            C69714l.m101134b(obj);
            this.f353486b.f353490c.mo50787a(C60866ct.f164955a, C128555l.f353488a);
            C71816z zVar = this.f353487c.f353480e;
            this.f353485a = 1;
            obj = zVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128553j(this.f353486b, this.f353487c, gVar);
    }
}
