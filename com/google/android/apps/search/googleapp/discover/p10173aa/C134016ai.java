package com.google.android.apps.search.googleapp.discover.p10173aa;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71760h;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$optOut$1", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {171})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.ai */
/* compiled from: PG */
final class C134016ai extends C69572j implements C69630p {

    /* renamed from: a */
    int f365047a;

    /* renamed from: b */
    final /* synthetic */ C134018ak f365048b;

    /* renamed from: c */
    private /* synthetic */ Object f365049c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134016ai(C134018ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f365048b = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134016ai) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365047a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f365049c;
            List e = C69540x.m100947e(C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C134014ag(this.f365048b, (C69577g) null), 3), C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C134015ah(this.f365048b, (C69577g) null), 3));
            this.f365047a = 1;
            if (C71760h.m104950b(e, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C134016ai aiVar = new C134016ai(this.f365048b, gVar);
        aiVar.f365049c = obj;
        return aiVar;
    }
}
