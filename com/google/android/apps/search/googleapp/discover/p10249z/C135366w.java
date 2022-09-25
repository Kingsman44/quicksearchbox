package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f;
import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
import com.google.android.apps.search.googleapp.discover.p10237t.C134925a;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import java.util.List;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.ResponsePersistenceManager$persistFirstPageResponse$2", mo61344c = "ResponsePersistenceManager.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.w */
/* compiled from: PG */
final class C135366w extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C134925a f368817a;

    /* renamed from: b */
    final /* synthetic */ C135294aa f368818b;

    /* renamed from: c */
    final /* synthetic */ C134766q f368819c;

    /* renamed from: d */
    final /* synthetic */ C134555at f368820d;

    /* renamed from: e */
    final /* synthetic */ C134500f f368821e;

    /* renamed from: f */
    private /* synthetic */ Object f368822f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135366w(C134925a aVar, C135294aa aaVar, C134766q qVar, C134555at atVar, C134500f fVar, C69577g gVar) {
        super(2, gVar);
        this.f368817a = aVar;
        this.f368818b = aaVar;
        this.f368819c = qVar;
        this.f368820d = atVar;
        this.f368821e = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135366w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f368822f;
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C135363t(this.f368818b, this.f368817a, (C69577g) null), 3);
        C135362s a = C135361r.m219505a(this.f368817a);
        List list = a.f368802a;
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C135364u(a.f368803b, this.f368818b, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C135365v(this.f368818b, this.f368819c, this.f368817a, this.f368820d, list, this.f368821e, (C69577g) null), 3);
        this.f368818b.mo112244a(this.f368817a.f367365c);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C135366w wVar = new C135366w(this.f368817a, this.f368818b, this.f368819c, this.f368820d, this.f368821e, gVar);
        wVar.f368822f = obj;
        return wVar;
    }
}
