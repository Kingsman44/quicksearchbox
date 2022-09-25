package com.google.android.libraries.notifications.p2298k.p2299a;

import android.os.Bundle;
import com.google.android.libraries.notifications.C29992g;
import com.google.android.libraries.notifications.p2298k.C30043c;
import com.google.android.libraries.notifications.platform.p2318f.p2322b.C30116a;
import com.google.android.libraries.notifications.platform.p2318f.p2322b.C30126e;
import com.google.android.libraries.notifications.platform.p2337h.p2338a.C30144a;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68798g;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.notifications.scheduled.impl.GnpJobChimeWrapper$execute$2", mo61344c = "GnpJobChimeWrapper.kt", mo61345d = "invokeSuspend", mo61346e = {50})
/* renamed from: com.google.android.libraries.notifications.k.a.b */
/* compiled from: PG */
final class C30039b extends C69572j implements C69630p {

    /* renamed from: a */
    int f81282a;

    /* renamed from: b */
    final /* synthetic */ C30040c f81283b;

    /* renamed from: c */
    final /* synthetic */ Bundle f81284c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30039b(C30040c cVar, Bundle bundle, C69577g gVar) {
        super(2, gVar);
        this.f81283b = cVar;
        this.f81284c = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C30039b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f81282a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C30144a.m56002a(this.f81283b.f81285a);
            if (C68798g.m99324d()) {
                this.f81283b.f81288d.mo35161c(8).mo35136a();
            }
            C30040c cVar = this.f81283b;
            C60870cx a = cVar.f81286b.mo34979a(new C30036a(cVar, this.f81284c));
            C69664n.m101060f(a, "override suspend fun exe…  .toGnpJobResult()\n    }");
            this.f81282a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C69664n.m101060f(obj, "override suspend fun exe…  .toGnpJobResult()\n    }");
        C29992g gVar = (C29992g) obj;
        C69664n.m101061g(gVar, "<this>");
        int b = gVar.mo34949b();
        if (b != 0) {
            C30043c cVar2 = C30043c.NONE;
            int i = b - 1;
            if (i == 0) {
                return C30116a.f81465a;
            }
            if (i != 1) {
                C30116a aVar2 = C30116a.f81465a;
                Throwable a2 = gVar.mo34948a();
                C69664n.m101058d(a2);
                C69664n.m101061g(a2, "error");
                return new C30116a(C30126e.PERMANENT_FAILURE, a2);
            }
            C30116a aVar3 = C30116a.f81465a;
            Throwable a3 = gVar.mo34948a();
            C69664n.m101058d(a3);
            C69664n.m101061g(a3, "error");
            return new C30116a(C30126e.TRANSIENT_FAILURE, a3);
        }
        throw new C69677g();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C30039b(this.f81283b, this.f81284c, gVar);
    }
}
