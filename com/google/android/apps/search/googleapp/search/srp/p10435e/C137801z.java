package com.google.android.apps.search.googleapp.search.srp.p10435e;

import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.LoadUrlParamsCreator$createPrefetchForJava$1", mo61344c = "LoadUrlParamsCreator.kt", mo61345d = "invokeSuspend", mo61346e = {41})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.z */
/* compiled from: PG */
public final class C137801z extends C69572j implements C69630p {

    /* renamed from: a */
    int f374906a;

    /* renamed from: b */
    final /* synthetic */ C137750aa f374907b;

    /* renamed from: c */
    final /* synthetic */ C137542d f374908c;

    /* renamed from: d */
    final /* synthetic */ C137770au f374909d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137801z(C137750aa aaVar, C137542d dVar, C137770au auVar, C69577g gVar) {
        super(2, gVar);
        this.f374907b = aaVar;
        this.f374908c = dVar;
        this.f374909d = auVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137801z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374906a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137750aa aaVar = this.f374907b;
            C137542d dVar = this.f374908c;
            C137770au auVar = this.f374909d;
            this.f374906a = 1;
            obj = C137750aa.m223912c(aaVar, dVar, false, true, auVar, this, 18);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137801z(this.f374907b, this.f374908c, this.f374909d, gVar);
    }
}
