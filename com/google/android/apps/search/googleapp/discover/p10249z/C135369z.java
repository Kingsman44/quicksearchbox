package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10214s.C134587e;
import com.google.android.apps.search.googleapp.discover.p10237t.C134925a;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.ResponsePersistenceManager$persistNextPageResponse$2", mo61344c = "ResponsePersistenceManager.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.z */
/* compiled from: PG */
final class C135369z extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C134925a f368831a;

    /* renamed from: b */
    final /* synthetic */ C135294aa f368832b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368833c;

    /* renamed from: d */
    final /* synthetic */ String f368834d;

    /* renamed from: e */
    private /* synthetic */ Object f368835e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135369z(C134925a aVar, C135294aa aaVar, C134755f fVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f368831a = aVar;
        this.f368832b = aaVar;
        this.f368833c = fVar;
        this.f368834d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135369z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f368835e;
        C135362s a = C135361r.m219505a(this.f368831a);
        List list = a.f368802a;
        C134587e eVar = a.f368803b;
        if (eVar != null) {
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C135367x(this.f368832b, eVar, (C69577g) null), 3);
        }
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C135368y(this.f368832b, this.f368833c, this.f368834d, list, (C69577g) null), 3);
        this.f368832b.mo112244a(this.f368831a.f367365c);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C135369z zVar = new C135369z(this.f368831a, this.f368832b, this.f368833c, this.f368834d, gVar);
        zVar.f368835e = obj;
        return zVar;
    }
}
