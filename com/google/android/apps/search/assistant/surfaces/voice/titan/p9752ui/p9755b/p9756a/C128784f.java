package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.EscapeHatchHandler$1", mo61344c = "EscapeHatchHandler.kt", mo61345d = "invokeSuspend", mo61346e = {69})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.f */
/* compiled from: PG */
final class C128784f extends C69572j implements C69630p {

    /* renamed from: a */
    int f354015a;

    /* renamed from: b */
    final /* synthetic */ C128796r f354016b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128784f(C128796r rVar, C69577g gVar) {
        super(2, gVar);
        this.f354016b = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128784f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f354015a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C128796r rVar = this.f354016b;
            C71587n nVar = rVar.f354044d;
            C128783e eVar = new C128783e(rVar);
            this.f354015a = 1;
            if (nVar.mo38165mp(eVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128784f(this.f354016b, gVar);
    }
}
