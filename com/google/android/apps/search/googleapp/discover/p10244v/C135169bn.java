package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
import com.google.android.apps.search.googleapp.discover.p10214s.C134556au;
import com.google.android.apps.search.googleapp.discover.p10214s.C134558aw;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.SessionManager$setSessionStatus$2", mo61344c = "SessionManager.kt", mo61345d = "invokeSuspend", mo61346e = {55, 57})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.bn */
/* compiled from: PG */
final class C135169bn extends C69572j implements C69630p {

    /* renamed from: a */
    int f368183a;

    /* renamed from: b */
    final /* synthetic */ C135171bp f368184b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368185c;

    /* renamed from: d */
    final /* synthetic */ C134555at f368186d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135169bn(C135171bp bpVar, C134755f fVar, C134555at atVar, C69577g gVar) {
        super(2, gVar);
        this.f368184b = bpVar;
        this.f368185c = fVar;
        this.f368186d = atVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135169bn) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f368183a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C135171bp bpVar = this.f368184b;
            C134755f fVar = this.f368185c;
            this.f368183a = 1;
            obj = bpVar.mo112142c(fVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C135173br a = this.f368184b.mo112140a(this.f368185c);
        C134558aw awVar = ((C134556au) obj).f366438b;
        if (awVar == null) {
            awVar = C134558aw.f366443h;
        }
        String str = awVar.f366448d;
        C69664n.m101060f(str, "sessionState.structure.sessionId");
        C134555at atVar = this.f368186d;
        this.f368183a = 2;
        C135157bb bbVar = (C135157bb) a;
        Object a2 = C71803m.m105040a(bbVar.f368139e, new C135152ax(atVar, bbVar, str, (C69577g) null), this);
        if (a2 != C69554a.COROUTINE_SUSPENDED) {
            a2 = C69788q.f186170a;
        }
        if (a2 == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135169bn(this.f368184b, this.f368185c, this.f368186d, gVar);
    }
}
