package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126978e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127043a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127046d;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127062t;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127410a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127413b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127436d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127463a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127464b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127467e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.common.util.concurrent.C60870cx;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entry.dispatcher.VisEntryPointDispatcher$startMainAssistantErrorFlow$2", mo61344c = "VisEntryPointDispatcher.kt", mo61345d = "invokeSuspend", mo61346e = {140})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.c.s */
/* compiled from: PG */
final class C127518s extends C69572j implements C69630p {

    /* renamed from: a */
    int f351143a;

    /* renamed from: b */
    final /* synthetic */ C127475g f351144b;

    /* renamed from: c */
    final /* synthetic */ C127519t f351145c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127518s(C127475g gVar, C127519t tVar, C69577g gVar2) {
        super(2, gVar2);
        this.f351144b = gVar;
        this.f351145c = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127518s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351143a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34039bb bbVar = this.f351144b.f350986b;
            if (bbVar == null) {
                bbVar = C34039bb.f90716f;
            }
            C69664n.m101060f(bbVar, "entryRequest.invocation");
            C126978e eVar = this.f351145c.f351147b;
            C127043a aVar2 = (C127043a) C127046d.f349837e.createBuilder();
            C69664n.m101060f(aVar2, "newBuilder()");
            C127062t a = C69664n.m101061g(aVar2, "builder");
            C127410a aVar3 = (C127410a) C127413b.f350829i.createBuilder();
            C69664n.m101060f(aVar3, "newBuilder()");
            C127436d a2 = C69664n.m101061g(aVar3, "builder");
            a2.mo108064e(bbVar);
            C127463a aVar4 = (C127463a) C127465c.f350959c.createBuilder();
            C69664n.m101060f(aVar4, "newBuilder()");
            C127467e a3 = C69664n.m101061g(aVar4, "builder");
            a3.mo108080c(C127464b.ERROR_ORIGINAL_REQUEST_MISSING);
            a3.mo108079b("TriggeringClient's callback took too long and the original request data was removed.");
            a2.mo108062c(a3.mo108078a());
            a.mo107914b(a2.mo108060a());
            C60870cx a4 = eVar.mo107878a(a.mo107913a());
            C69664n.m101060f(a4, "conversationController\n …  }\n          }\n        )");
            this.f351143a = 1;
            obj = C71663i.m104690c(a4, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127518s(this.f351144b, this.f351145c, gVar);
    }
}
