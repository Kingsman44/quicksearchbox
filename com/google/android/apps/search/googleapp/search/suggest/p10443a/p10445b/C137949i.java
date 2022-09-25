package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.dataservice.localdata.LocalDataServiceImpl$incrementNumberOfLocalSearches$1", mo61344c = "LocalDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {64})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.i */
/* compiled from: PG */
public final class C137949i extends C69572j implements C69630p {

    /* renamed from: a */
    int f375309a;

    /* renamed from: b */
    final /* synthetic */ C137960t f375310b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137949i(C137960t tVar, C69577g gVar) {
        super(2, gVar);
        this.f375310b = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137949i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375309a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137960t tVar = this.f375310b;
            this.f375309a = 1;
            if (tVar.mo114058g(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137949i(this.f375310b, gVar);
    }
}
