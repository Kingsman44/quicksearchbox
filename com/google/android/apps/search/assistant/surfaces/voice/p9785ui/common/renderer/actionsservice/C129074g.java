package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.ActionsServiceCoroutineService$bindActionsService$1", mo61344c = "ActionsServiceCoroutineService.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.g */
/* compiled from: PG */
final class C129074g extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C32433a f354580a;

    /* renamed from: b */
    final /* synthetic */ C129076i f354581b;

    /* renamed from: c */
    private /* synthetic */ Object f354582c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129074g(C32433a aVar, C129076i iVar, C69577g gVar) {
        super(2, gVar);
        this.f354580a = aVar;
        this.f354581b = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129074g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f354582c;
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C129070c(this.f354580a, this.f354581b, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C129073f(this.f354580a, this.f354581b, (C69577g) null), 3);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C129074g gVar2 = new C129074g(this.f354580a, this.f354581b, gVar);
        gVar2.f354582c = obj;
        return gVar2;
    }
}
