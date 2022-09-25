package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.ui.controller.UiControllerService$getEntryComponent$2$isTouchModalityAsync$1", mo61344c = "UiControllerService.kt", mo61345d = "invokeSuspend", mo61346e = {101})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.j */
/* compiled from: PG */
final class C127092j extends C69572j implements C69630p {

    /* renamed from: a */
    int f349953a;

    /* renamed from: b */
    final /* synthetic */ C127097o f349954b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127092j(C127097o oVar, C69577g gVar) {
        super(2, gVar);
        this.f349954b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127092j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349953a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127097o oVar = this.f349954b;
            this.f349953a = 1;
            obj = oVar.mo107929c(false, "Failed to get touch modality setting.", new C127095m(oVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127092j(this.f349954b, gVar);
    }
}
