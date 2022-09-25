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

@C69567e(mo61343b = "com.google.apps.tiktok.coroutines.flow.LocalReadOperatorsKt$mapLocalReadStateIn$1", mo61344c = "LocalReadOperators.kt", mo61345d = "invokeSuspend", mo61346e = {103})
/* renamed from: com.google.apps.tiktok.coroutines.a.ac */
/* compiled from: PG */
final class C46594ac extends C69572j implements C69630p {

    /* renamed from: a */
    int f121782a;

    /* renamed from: b */
    final /* synthetic */ C71587n f121783b;

    /* renamed from: c */
    final /* synthetic */ C69630p f121784c;

    /* renamed from: d */
    final /* synthetic */ C71548cy f121785d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46594ac(C71587n nVar, C69630p pVar, C71548cy cyVar, C69577g gVar) {
        super(2, gVar);
        this.f121783b = nVar;
        this.f121784c = pVar;
        this.f121785d = cyVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C46594ac) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f121782a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n d = C71598y.m104524d(C46639q.m83116a(new C46593ab(this.f121783b, this.f121784c), new C46600ai(C69788q.f186170a), C46640r.f121890a, C46641s.f121891a), C71613bn.f191048b);
            C46647y yVar = new C46647y(this.f121785d);
            this.f121782a = 1;
            if (d.mo38165mp(yVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C46594ac(this.f121783b, this.f121784c, this.f121785d, gVar);
    }
}
