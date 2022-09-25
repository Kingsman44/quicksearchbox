package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateHubmodeConnectionImpl$connectToHubModeService$1$3", mo61344c = "VoicePlateHubmodeConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bx */
/* compiled from: PG */
final class C128742bx extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C128782dj f353917a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128742bx(C128782dj djVar, C69577g gVar) {
        super(3, gVar);
        this.f353917a = djVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C128742bx(this.f353917a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C128782dj.f354004a.mo56224b();
        cVar.mo56379ah(new C59094n(38012));
        cVar.mo56386p("VoicePlateFlow completed");
        this.f353917a.f354010g = false;
        return C69788q.f186170a;
    }
}
