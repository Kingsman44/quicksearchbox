package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.dataservice.localdata.LocalDataServiceImpl$updatePreviousQueryData$1", mo61344c = "LocalDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {60})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.q */
/* compiled from: PG */
public final class C137957q extends C69572j implements C69630p {

    /* renamed from: a */
    int f375327a;

    /* renamed from: b */
    final /* synthetic */ C137960t f375328b;

    /* renamed from: c */
    final /* synthetic */ String f375329c;

    /* renamed from: d */
    final /* synthetic */ long f375330d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137957q(C137960t tVar, String str, long j, C69577g gVar) {
        super(2, gVar);
        this.f375328b = tVar;
        this.f375329c = str;
        this.f375330d = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137957q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375327a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137960t tVar = this.f375328b;
            String str = this.f375329c;
            long j = this.f375330d;
            this.f375327a = 1;
            if (tVar.mo114060i(str, j, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137957q(this.f375328b, this.f375329c, this.f375330d, gVar);
    }
}
