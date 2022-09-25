package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.p10278a;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.overflowmenu.dataservice.AmpTooltipDataService$markTooltipDismissed$2", mo61344c = "AmpTooltipDataService.kt", mo61345d = "invokeSuspend", mo61346e = {63})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.a.f */
/* compiled from: PG */
final class C135642f extends C69572j implements C69630p {

    /* renamed from: a */
    int f369473a;

    /* renamed from: b */
    final /* synthetic */ C135644h f369474b;

    /* renamed from: c */
    private /* synthetic */ Object f369475c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135642f(C135644h hVar, C69577g gVar) {
        super(2, gVar);
        this.f369474b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135642f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f369473a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f369474b.f369482e.mo46039a(C135639c.f369469a, C60826bg.f164896a);
            C69664n.m101060f(a, "promotionStateProtoDataS…ectExecutor()\n          )");
            C71604be c = C71803m.m105042c((C71422aw) this.f369475c, (C69585o) null, (C71424ay) null, new C135640d(a, (C69577g) null), 3);
            c.mo62873s(new C135641e(a));
            this.f369473a = 1;
            obj = c.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C135642f fVar = new C135642f(this.f369474b, gVar);
        fVar.f369475c = obj;
        return fVar;
    }
}
