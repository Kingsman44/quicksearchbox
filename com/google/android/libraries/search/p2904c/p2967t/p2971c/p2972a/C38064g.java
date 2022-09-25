package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a.C129708e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a.C129709f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a.C129710g;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38089m;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38091o;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Collection;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.state.impl.MicStateReporterImpl$notifyListeners$3", mo61344c = "MicStateReporterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.t.c.a.g */
/* compiled from: PG */
final class C38064g extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C38089m f100845a;

    /* renamed from: b */
    final /* synthetic */ C38091o f100846b;

    /* renamed from: c */
    final /* synthetic */ C129709f f100847c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38064g(C129709f fVar, C38089m mVar, C38091o oVar, C69577g gVar) {
        super(1, gVar);
        this.f100847c = fVar;
        this.f100845a = mVar;
        this.f100846b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C38064g(this.f100847c, this.f100845a, this.f100846b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C129709f fVar = this.f100847c;
        if (Collection.EL.stream(this.f100845a.f100919a).filter(new C129708e()).count() > 1) {
            ((C59052c) ((C59052c) C129710g.f355943a.mo56224b()).mo56372aa(38442)).mo56386p("Stopping CMM since a second client has requested mic access");
            fVar.f355942a.mo109200a();
        }
        return C69788q.f186170a;
    }
}
