package com.google.android.apps.search.googleapp.discover.p10204p.p10205a;

import androidx.work.C4632m;
import androidx.work.C4643x;
import androidx.work.C4645z;
import com.google.android.apps.search.googleapp.discover.p10204p.p10206b.C134486a;
import com.google.android.apps.search.googleapp.discover.p10204p.p10206b.C134492c;
import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f;
import com.google.android.apps.search.googleapp.discover.p10204p.p10210d.C134525e;
import com.google.common.util.concurrent.C60826bg;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.ondevicecontent.beyondstoresync.OnDeviceContentSyncWorker$startWork$1", mo61344c = "OnDeviceContentSyncWorker.kt", mo61345d = "invokeSuspend", mo61346e = {45})
/* renamed from: com.google.android.apps.search.googleapp.discover.p.a.b */
/* compiled from: PG */
final class C134481b extends C69572j implements C69630p {

    /* renamed from: a */
    int f366244a;

    /* renamed from: b */
    final /* synthetic */ C134482c f366245b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134481b(C134482c cVar, C69577g gVar) {
        super(2, gVar);
        this.f366245b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134481b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f366244a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134482c cVar = this.f366245b;
            if (!cVar.f366248c) {
                return new C4643x(C4632m.f14549a);
            }
            C134486a aVar2 = cVar.f366246a;
            this.f366244a = 1;
            obj = ((C134492c) aVar2).mo111801a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C134500f fVar = (C134500f) obj;
        if (fVar != null) {
            C69664n.m101060f(this.f366245b.f366247b.f366350a.mo46039a(new C134525e(fVar), C60826bg.f164896a), "content: OnDeviceContent…ecutors.directExecutor())");
        }
        return new C4645z(C4632m.f14549a);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134481b(this.f366245b, gVar);
    }
}
