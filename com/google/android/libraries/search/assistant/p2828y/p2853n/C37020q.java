package com.google.android.libraries.search.assistant.p2828y.p2853n;

import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.mediaparams.MediaStickyAppHelper$fetchMediaStickyApp$1", mo61344c = "MediaStickyAppHelper.kt", mo61345d = "invokeSuspend", mo61346e = {51})
/* renamed from: com.google.android.libraries.search.assistant.y.n.q */
/* compiled from: PG */
final class C37020q extends C69572j implements C69630p {

    /* renamed from: a */
    int f96415a;

    /* renamed from: b */
    final /* synthetic */ C37021r f96416b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f96417c;

    /* renamed from: d */
    final /* synthetic */ String f96418d;

    /* renamed from: e */
    final /* synthetic */ List f96419e;

    /* renamed from: f */
    private /* synthetic */ Object f96420f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37020q(C37021r rVar, C60870cx cxVar, String str, List list, C69577g gVar) {
        super(2, gVar);
        this.f96416b = rVar;
        this.f96417c = cxVar;
        this.f96418d = str;
        this.f96419e = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37020q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f96415a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f96420f;
            C71604be c = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C37019p(this.f96417c, (C69577g) null), 3);
            C71604be c2 = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C37018o(this.f96416b, (C69577g) null), 3);
            C37021r rVar = this.f96416b;
            C69585o oVar = rVar.f96425d;
            C37017n nVar = new C37017n(c2, c, this.f96418d, rVar, this.f96419e, (C69577g) null);
            this.f96415a = 1;
            obj = C71803m.m105040a(oVar, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C37020q qVar = new C37020q(this.f96416b, this.f96417c, this.f96418d, this.f96419e, gVar);
        qVar.f96420f = obj;
        return qVar;
    }
}
