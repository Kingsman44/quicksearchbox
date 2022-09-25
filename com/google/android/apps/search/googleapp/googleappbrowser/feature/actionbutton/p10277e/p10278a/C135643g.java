package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.p10278a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.overflowmenu.dataservice.AmpTooltipDataService$markTooltipDismissedForJava$1", mo61344c = "AmpTooltipDataService.kt", mo61345d = "invokeSuspend", mo61346e = {52})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.a.g */
/* compiled from: PG */
public final class C135643g extends C69572j implements C69630p {

    /* renamed from: a */
    int f369476a;

    /* renamed from: b */
    final /* synthetic */ C135644h f369477b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135643g(C135644h hVar, C69577g gVar) {
        super(2, gVar);
        this.f369477b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135643g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f369476a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135644h hVar = this.f369477b;
            this.f369476a = 1;
            obj = C71803m.m105040a(hVar.f369480c, new C135642f(hVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135643g(this.f369477b, gVar);
    }
}
