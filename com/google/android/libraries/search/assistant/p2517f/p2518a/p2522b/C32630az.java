package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionRootService$run$2", mo61344c = "AccessSessionRootService.kt", mo61345d = "invokeSuspend", mo61346e = {115})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.az */
/* compiled from: PG */
final class C32630az extends C69572j implements C69630p {

    /* renamed from: a */
    int f87438a;

    /* renamed from: b */
    final /* synthetic */ C32636be f87439b;

    /* renamed from: c */
    private /* synthetic */ Object f87440c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32630az(C32636be beVar, C69577g gVar) {
        super(2, gVar);
        this.f87439b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32630az) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71422aw awVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87438a != 0) {
            awVar = (C71422aw) this.f87440c;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar2 = (C71422aw) this.f87440c;
            C69626l lVar = this.f87439b.f87465f;
            this.f87440c = awVar2;
            this.f87438a = 1;
            Object a = lVar.mo5761a(this);
            if (a == aVar) {
                return aVar;
            }
            awVar = awVar2;
            obj = a;
        }
        List c = C32688dc.m60590c((C32858d) obj, C32691df.f87608b);
        C32636be beVar = this.f87439b;
        C71643cp d = C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C32628ax(beVar, c, (C69577g) null), 3);
        d.mo62873s(new C32629ay(this.f87439b, c));
        beVar.f87466g = d;
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32630az azVar = new C32630az(this.f87439b, gVar);
        azVar.f87440c = obj;
        return azVar;
    }
}
