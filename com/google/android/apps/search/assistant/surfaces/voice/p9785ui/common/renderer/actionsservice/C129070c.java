package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.ActionsServiceCoroutineService$bindActionsService$1$appExecutionResponsesJob$1", mo61344c = "ActionsServiceCoroutineService.kt", mo61345d = "invokeSuspend", mo61346e = {78})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.c */
/* compiled from: PG */
final class C129070c extends C69572j implements C69630p {

    /* renamed from: a */
    int f354567a;

    /* renamed from: b */
    final /* synthetic */ C32433a f354568b;

    /* renamed from: c */
    final /* synthetic */ C129076i f354569c;

    /* renamed from: d */
    private /* synthetic */ Object f354570d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129070c(C32433a aVar, C129076i iVar, C69577g gVar) {
        super(2, gVar);
        this.f354568b = aVar;
        this.f354569c = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129070c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f354567a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n a = C71536cm.m104383a(this.f354568b.mo38060b());
            C129069b bVar = new C129069b((C71422aw) this.f354570d, this.f354569c);
            this.f354567a = 1;
            if (a.mo38165mp(bVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C129070c cVar = new C129070c(this.f354568b, this.f354569c, gVar);
        cVar.f354570d = obj;
        return cVar;
    }
}
