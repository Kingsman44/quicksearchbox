package com.google.android.apps.search.googleapp.discover.p10244v;

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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.SessionManager$updateLastRefreshAttemptTime$2", mo61344c = "SessionManager.kt", mo61345d = "invokeSuspend", mo61346e = {128, 129})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.bo */
/* compiled from: PG */
final class C135170bo extends C69572j implements C69630p {

    /* renamed from: a */
    Object f368187a;

    /* renamed from: b */
    int f368188b;

    /* renamed from: c */
    final /* synthetic */ C135171bp f368189c;

    /* renamed from: d */
    final /* synthetic */ C134755f f368190d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135170bo(C135171bp bpVar, C134755f fVar, C69577g gVar) {
        super(2, gVar);
        this.f368189c = bpVar;
        this.f368190d = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135170bo) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f368188b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C135173br a = this.f368189c.mo112140a(this.f368190d);
            this.f368187a = a;
            this.f368188b = 1;
            obj = a.mo112133b(this);
            obj2 = a;
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            Object obj3 = this.f368187a;
            C69714l.m101134b(obj);
            obj2 = obj3;
        }
        C134558aw awVar = ((C134556au) obj).f366438b;
        if (awVar == null) {
            awVar = C134558aw.f366443h;
        }
        String str = awVar.f366448d;
        C69664n.m101060f(str, "session.structure.sessionId");
        this.f368187a = null;
        this.f368188b = 2;
        C135157bb bbVar = (C135157bb) obj2;
        Object a2 = C71803m.m105040a(bbVar.f368139e, new C135156ba(bbVar, str, (C69577g) null), this);
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
        return new C135170bo(this.f368189c, this.f368190d, gVar);
    }
}
