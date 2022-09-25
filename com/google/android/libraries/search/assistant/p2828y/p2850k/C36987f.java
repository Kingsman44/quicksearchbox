package com.google.android.libraries.search.assistant.p2828y.p2850k;

import com.google.android.libraries.search.assistant.p2828y.p2859r.C37080h;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.deviceproperties.DevicePropertiesFetcher$buildDeviceProperties$2$locationDeferred$1", mo61344c = "DevicePropertiesFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {88})
/* renamed from: com.google.android.libraries.search.assistant.y.k.f */
/* compiled from: PG */
final class C36987f extends C69572j implements C69630p {

    /* renamed from: a */
    int f96313a;

    /* renamed from: b */
    final /* synthetic */ C36983b f96314b;

    /* renamed from: c */
    final /* synthetic */ C36991j f96315c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36987f(C36983b bVar, C36991j jVar, C69577g gVar) {
        super(2, gVar);
        this.f96314b = bVar;
        this.f96315c = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36987f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C39226b bVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f96313a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C36983b bVar2 = this.f96314b;
            if (!bVar2.f96306f || (bVar = bVar2.f96307g) == null) {
                return null;
            }
            C37080h hVar = this.f96315c.f96336h;
            this.f96313a = 1;
            obj = hVar.mo40611b(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (C63179l) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36987f(this.f96314b, this.f96315c, gVar);
    }
}
