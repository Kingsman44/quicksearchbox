package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58800sl;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.profile.cookies.gaia.internal.GaiaCookieManagerImpl$addCookiesToCookieJar$2", mo61344c = "GaiaCookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.web.profile.a.b.a.h */
/* compiled from: PG */
final class C44020h extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C58487gw f114587a;

    /* renamed from: b */
    final /* synthetic */ C44037y f114588b;

    /* renamed from: c */
    private /* synthetic */ Object f114589c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44020h(C58487gw gwVar, C44037y yVar, C69577g gVar) {
        super(2, gVar);
        this.f114587a = gwVar;
        this.f114588b = yVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44020h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f114589c;
        C58800sl lA = this.f114587a.map.keySet().iterator();
        while (lA.hasNext()) {
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C44019g(this.f114588b, (String) lA.next(), this.f114587a, (C69577g) null), 3);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C44020h hVar = new C44020h(this.f114587a, this.f114588b, gVar);
        hVar.f114589c = obj;
        return hVar;
    }
}
