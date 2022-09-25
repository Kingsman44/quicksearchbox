package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9491b;

import com.google.protobuf.C62934bn;
import com.google.speech.p5208h.C66566aw;
import com.google.speech.p5208h.C66567ax;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.infoproviders.SearchInfoProvider$pinholeParams$2", mo61344c = "SearchInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {93, 94})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.b.n */
/* compiled from: PG */
final class C126489n extends C69572j implements C69630p {

    /* renamed from: a */
    Object f348371a;

    /* renamed from: b */
    int f348372b;

    /* renamed from: c */
    final /* synthetic */ C71604be f348373c;

    /* renamed from: d */
    private /* synthetic */ Object f348374d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126489n(C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348373c = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126489n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C71604be beVar;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f348372b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f348374d;
            C71604be c = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C126488m(this.f348373c, (C69577g) null), 3);
            C71604be c2 = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C126487l(this.f348373c, (C69577g) null), 3);
            Object obj4 = (C66566aw) C66567ax.f181069f.createBuilder();
            this.f348374d = c2;
            this.f348371a = obj4;
            this.f348372b = 1;
            Object a = c.mo62825a(this);
            if (a != aVar) {
                beVar = c2;
                obj = a;
                obj3 = obj4;
            }
            return aVar;
        } else if (i != 1) {
            obj2 = (C66566aw) this.f348374d;
            C69714l.m101134b(obj);
            ((C66566aw) obj2).mo59676a((Iterable) obj);
            return ((C62934bn) obj2).build();
        } else {
            obj3 = this.f348371a;
            beVar = (C71604be) this.f348374d;
            C69714l.m101134b(obj);
        }
        ((C66566aw) obj3).mo59677b((Iterable) obj);
        this.f348374d = obj3;
        this.f348371a = null;
        this.f348372b = 2;
        obj = beVar.mo62825a(this);
        if (obj != aVar) {
            obj2 = obj3;
            ((C66566aw) obj2).mo59676a((Iterable) obj);
            return ((C62934bn) obj2).build();
        }
        return aVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126489n nVar = new C126489n(this.f348373c, gVar);
        nVar.f348374d = obj;
        return nVar;
    }
}
