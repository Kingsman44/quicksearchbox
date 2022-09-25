package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.dataservice.localdata.LocalDataServiceImpl$setIsSignedOutSearchCustomizationEnabledFromAgsaC$1$1", mo61344c = "LocalDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {73})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.m */
/* compiled from: PG */
final class C137953m extends C69572j implements C69630p {

    /* renamed from: a */
    int f375319a;

    /* renamed from: b */
    final /* synthetic */ C137960t f375320b;

    /* renamed from: c */
    final /* synthetic */ boolean f375321c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137953m(C137960t tVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f375320b = tVar;
        this.f375321c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137953m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375319a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137960t tVar = this.f375320b;
            boolean z = this.f375321c;
            this.f375319a = 1;
            if (tVar.mo114059h(z, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137953m(this.f375320b, this.f375321c, gVar);
    }
}
