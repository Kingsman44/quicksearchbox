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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateClassicConnectionImpl$createHotwordInvocationStateFlow$$inlined$transform$1", mo61344c = "VoicePlateClassicConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.as */
/* compiled from: PG */
public final class C128710as extends C69572j implements C69630p {

    /* renamed from: a */
    int f353817a;

    /* renamed from: b */
    final /* synthetic */ C71587n f353818b;

    /* renamed from: c */
    private /* synthetic */ Object f353819c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128710as(C71587n nVar, C69577g gVar) {
        super(2, gVar);
        this.f353818b = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128710as) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353817a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f353818b;
            C128709ar arVar = new C128709ar((C71588o) this.f353819c);
            this.f353817a = 1;
            if (nVar.mo38165mp(arVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C128710as asVar = new C128710as(this.f353818b, gVar);
        asVar.f353819c = obj;
        return asVar;
    }
}
