package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.p4750c.p4751a.C62949a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$enqueueWorkSpec$2", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {203})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.ac */
/* compiled from: PG */
final class C134010ac extends C69572j implements C69630p {

    /* renamed from: a */
    int f365032a;

    /* renamed from: b */
    final /* synthetic */ C134018ak f365033b;

    /* renamed from: c */
    final /* synthetic */ C46586t f365034c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134010ac(C134018ak akVar, C46586t tVar, C69577g gVar) {
        super(2, gVar);
        this.f365033b = akVar;
        this.f365034c = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134010ac) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365032a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f365033b.f365060i.ifPresent(new C134009ab());
            C134029av avVar = this.f365033b.f365059h;
            C46586t tVar = this.f365034c;
            C69664n.m101061g(tVar, "workSpec");
            Instant a = avVar.f365084a.mo57444a();
            C69664n.m101060f(a, "timeSource.now()");
            C46459k.m82829b(avVar.f365085b.mo46039a(new C134028au(C62949a.m95467b(a), tVar), avVar.f365086c), "Failed to append onTaskEnqueued", new Object[0]);
            C134018ak akVar = this.f365033b;
            C60870cx b = akVar.f365054c.mo50518b(akVar.f365053b, this.f365034c);
            C69664n.m101060f(b, "accountWorkManager.enqueue(accountId, workSpec)");
            this.f365032a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134010ac(this.f365033b, this.f365034c, gVar);
    }
}
