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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.ActionsServiceCoroutineService$bindActionsService$1$manualInputResponseJob$1", mo61344c = "ActionsServiceCoroutineService.kt", mo61345d = "invokeSuspend", mo61346e = {83})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.f */
/* compiled from: PG */
final class C129073f extends C69572j implements C69630p {

    /* renamed from: a */
    int f354576a;

    /* renamed from: b */
    final /* synthetic */ C32433a f354577b;

    /* renamed from: c */
    final /* synthetic */ C129076i f354578c;

    /* renamed from: d */
    private /* synthetic */ Object f354579d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129073f(C32433a aVar, C129076i iVar, C69577g gVar) {
        super(2, gVar);
        this.f354577b = aVar;
        this.f354578c = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129073f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f354576a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n a = C71536cm.m104383a(this.f354577b.mo38061c());
            C129072e eVar = new C129072e((C71422aw) this.f354579d, this.f354578c);
            this.f354576a = 1;
            if (a.mo38165mp(eVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C129073f fVar = new C129073f(this.f354577b, this.f354578c, gVar);
        fVar.f354579d = obj;
        return fVar;
    }
}
