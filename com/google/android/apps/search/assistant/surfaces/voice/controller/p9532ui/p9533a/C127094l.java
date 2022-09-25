package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.ui.controller.UiControllerService$isAssistantEnabled$2", mo61344c = "UiControllerService.kt", mo61345d = "invokeSuspend", mo61346e = {112})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.l */
/* compiled from: PG */
final class C127094l extends C69572j implements C69626l {

    /* renamed from: a */
    int f349958a;

    /* renamed from: b */
    final /* synthetic */ C127097o f349959b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127094l(C127097o oVar, C69577g gVar) {
        super(1, gVar);
        this.f349959b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C127094l(this.f349959b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349958a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f349959b.f349972e.mo104232b();
            C69664n.m101060f(b, "assistantEligibilityChecker.isAssistantEnabled");
            this.f349958a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
