package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.EscapeHatchHandler$createShowSuggestionArgsFlow$$inlined$transform$1", mo61344c = "EscapeHatchHandler.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.p */
/* compiled from: PG */
public final class C128794p extends C69572j implements C69630p {

    /* renamed from: a */
    int f354033a;

    /* renamed from: b */
    final /* synthetic */ C71587n f354034b;

    /* renamed from: c */
    final /* synthetic */ C128796r f354035c;

    /* renamed from: d */
    private /* synthetic */ Object f354036d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128794p(C71587n nVar, C69577g gVar, C128796r rVar) {
        super(2, gVar);
        this.f354034b = nVar;
        this.f354035c = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128794p) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f354033a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f354034b;
            C128793o oVar = new C128793o((C71588o) this.f354036d);
            this.f354033a = 1;
            if (nVar.mo38165mp(oVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C128794p pVar = new C128794p(this.f354034b, gVar, this.f354035c);
        pVar.f354036d = obj;
        return pVar;
    }
}
