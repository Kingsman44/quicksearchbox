package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.BottomBarContextDataService$getBottomBarContextInternal$2", mo61344c = "BottomBarContextDataService.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.u */
/* compiled from: PG */
final class C136103u extends C69572j implements C69630p {

    /* renamed from: a */
    int f370664a;

    /* renamed from: b */
    final /* synthetic */ C136106x f370665b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136103u(C136106x xVar, C69577g gVar) {
        super(2, gVar);
        this.f370665b = xVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136103u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f370664a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f370665b.f370670b.mo112395a();
            this.f370664a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Boolean bool = (Boolean) obj;
        C136101s sVar = (C136101s) C136102t.f370660c.createBuilder();
        C69664n.m101060f(sVar, "newBuilder()");
        C69664n.m101061g(sVar, "builder");
        C69664n.m101060f(bool, "swaaEnabled");
        boolean booleanValue = bool.booleanValue();
        sVar.copyOnWrite();
        C136102t tVar = (C136102t) sVar.instance;
        tVar.f370662a = 1 | tVar.f370662a;
        tVar.f370663b = booleanValue;
        C62942bv build = sVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C136102t) build;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C136103u(this.f370665b, gVar);
    }
}
