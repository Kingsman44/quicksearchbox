package com.google.android.apps.search.googleapp.discover.p10249z;

import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.StreamProvider$handlePaginationToken$2$1$1", mo61344c = "StreamProvider.kt", mo61345d = "invokeSuspend", mo61346e = {220})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.an */
/* compiled from: PG */
final class C135307an extends C69572j implements C69630p {

    /* renamed from: a */
    int f368618a;

    /* renamed from: b */
    final /* synthetic */ C135314au f368619b;

    /* renamed from: c */
    final /* synthetic */ C135359p f368620c;

    /* renamed from: d */
    final /* synthetic */ UUID f368621d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135307an(C135314au auVar, C135359p pVar, UUID uuid, C69577g gVar) {
        super(2, gVar);
        this.f368619b = auVar;
        this.f368620c = pVar;
        this.f368621d = uuid;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135307an) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368618a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135356m mVar = this.f368619b.f368653c;
            C135359p pVar = this.f368620c;
            UUID uuid = this.f368621d;
            this.f368618a = 1;
            obj = mVar.mo112287a(pVar, uuid, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135307an(this.f368619b, this.f368620c, this.f368621d, gVar);
    }
}
