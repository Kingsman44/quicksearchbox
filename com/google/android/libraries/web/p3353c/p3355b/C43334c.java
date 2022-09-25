package com.google.android.libraries.web.p3353c.p3355b;

import com.google.apps.tiktok.dataservice.C46778cv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71571du;
import p5462h.C69596e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.libraries.web.data.internal.WebStateCoordinatorModel$1", mo61344c = "WebStateCoordinatorModel.kt", mo61345d = "invokeSuspend", mo61346e = {78})
/* renamed from: com.google.android.libraries.web.c.b.c */
/* compiled from: PG */
final class C43334c extends C69572j implements C69630p {

    /* renamed from: a */
    int f113201a;

    /* renamed from: b */
    final /* synthetic */ C43339h f113202b;

    /* renamed from: c */
    final /* synthetic */ C46778cv f113203c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43334c(C43339h hVar, C46778cv cvVar, C69577g gVar) {
        super(2, gVar);
        this.f113202b = hVar;
        this.f113203c = cvVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43334c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f113201a == 0) {
            C69714l.m101134b(obj);
            C69648ae aeVar = new C69648ae();
            C71571du b = C43345n.m76493b(this.f113202b.f113206a);
            C43333b bVar = new C43333b(this.f113203c, this.f113202b, aeVar);
            this.f113201a = 1;
            if (b.mo38165mp(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            C69714l.m101134b(obj);
        }
        throw new C69596e();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43334c(this.f113202b, this.f113203c, gVar);
    }
}
