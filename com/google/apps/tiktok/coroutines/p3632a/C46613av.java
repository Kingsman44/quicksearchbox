package com.google.apps.tiktok.coroutines.p3632a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71613bn;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71598y;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.apps.tiktok.coroutines.flow.RemoteReadOperatorsKt$mapRemoteReadStateIn$1", mo61344c = "RemoteReadOperators.kt", mo61345d = "invokeSuspend", mo61346e = {74})
/* renamed from: com.google.apps.tiktok.coroutines.a.av */
/* compiled from: PG */
public final class C46613av extends C69572j implements C69630p {

    /* renamed from: a */
    int f121806a;

    /* renamed from: b */
    final /* synthetic */ C71587n f121807b;

    /* renamed from: c */
    final /* synthetic */ C69630p f121808c;

    /* renamed from: d */
    final /* synthetic */ C69630p f121809d;

    /* renamed from: e */
    final /* synthetic */ C71548cy f121810e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46613av(C71587n nVar, C69630p pVar, C69630p pVar2, C71548cy cyVar, C69577g gVar) {
        super(2, gVar);
        this.f121807b = nVar;
        this.f121808c = pVar;
        this.f121809d = pVar2;
        this.f121810e = cyVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C46613av) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f121806a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n d = C71598y.m104524d(C46639q.m83116a(new C46612au(this.f121807b, this.f121808c, this.f121809d), new C46615ax(C69788q.f186170a), C46643u.f121892a, C46644v.f121893a), C71613bn.f191048b);
            C46609ar arVar = new C46609ar(this.f121810e);
            this.f121806a = 1;
            if (d.mo38165mp(arVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C46613av(this.f121807b, this.f121808c, this.f121809d, this.f121810e, gVar);
    }
}
