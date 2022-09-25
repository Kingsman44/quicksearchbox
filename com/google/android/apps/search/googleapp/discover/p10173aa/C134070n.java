package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.android.apps.search.googleapp.discover.p10214s.C134591i;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.DiscoverEligibilityWriter$handleEligibilityChange$1", mo61344c = "DiscoverEligibilityWriter.kt", mo61345d = "invokeSuspend", mo61346e = {51})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.n */
/* compiled from: PG */
final class C134070n extends C69572j implements C69630p {

    /* renamed from: a */
    int f365210a;

    /* renamed from: b */
    final /* synthetic */ C134073q f365211b;

    /* renamed from: c */
    final /* synthetic */ C134591i f365212c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134070n(C134073q qVar, C134591i iVar, C69577g gVar) {
        super(2, gVar);
        this.f365211b = qVar;
        this.f365212c = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134070n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365210a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134074r rVar = this.f365211b.f365219b;
            C134591i iVar = this.f365212c;
            this.f365210a = 1;
            if (rVar.mo111515d(iVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134070n(this.f365211b, this.f365212c, gVar);
    }
}
