package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.BottomBarContextDataService$getDataSource$1$loadData$1", mo61344c = "BottomBarContextDataService.kt", mo61345d = "invokeSuspend", mo61346e = {31})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.v */
/* compiled from: PG */
final class C136104v extends C69572j implements C69630p {

    /* renamed from: a */
    int f370666a;

    /* renamed from: b */
    final /* synthetic */ C136106x f370667b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136104v(C136106x xVar, C69577g gVar) {
        super(2, gVar);
        this.f370667b = xVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136104v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f370666a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C136106x xVar = this.f370667b;
            this.f370666a = 1;
            obj = C71803m.m105040a(xVar.f370672d, new C136103u(xVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C136104v(this.f370667b, gVar);
    }
}
