package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127049g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127051i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127064v;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.impl.ControllerServiceBackendImpl$showErrorAndStopInteraction$1", mo61344c = "ControllerServiceBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {132})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.a */
/* compiled from: PG */
final class C127006a extends C69572j implements C69630p {

    /* renamed from: a */
    int f349728a;

    /* renamed from: b */
    final /* synthetic */ C127018g f349729b;

    /* renamed from: c */
    final /* synthetic */ C126988i f349730c;

    /* renamed from: d */
    final /* synthetic */ C127050h f349731d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127006a(C127018g gVar, C126988i iVar, C127050h hVar, C69577g gVar2) {
        super(2, gVar2);
        this.f349729b = gVar;
        this.f349730c = iVar;
        this.f349731d = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127006a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349728a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127018g gVar = this.f349729b;
            C126988i iVar = this.f349730c;
            C127050h hVar = this.f349731d;
            C127049g gVar2 = (C127049g) C127051i.f349864d.createBuilder();
            C69664n.m101060f(gVar2, "newBuilder()");
            C127064v a = C69664n.m101061g(gVar2, "builder");
            C119834cb cbVar = iVar.f349677g;
            if (cbVar == null) {
                cbVar = C119834cb.f333765b;
            }
            C69664n.m101060f(cbVar, "errorData.interactionId");
            C69664n.m101061g(cbVar, "value");
            C127049g gVar3 = a.f349884a;
            gVar3.copyOnWrite();
            C127051i iVar2 = (C127051i) gVar3.instance;
            cbVar.getClass();
            iVar2.f349867b = cbVar;
            iVar2.f349866a |= 1;
            a.mo107918b(hVar);
            C60870cx b = gVar.mo107874b(a.mo107917a());
            this.f349728a = 1;
            if (C71663i.m104690c(b, this) == aVar) {
                return aVar;
            }
        }
        this.f349729b.f349770h.mo107956b(this.f349730c);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127006a(this.f349729b, this.f349730c, this.f349731d, gVar);
    }
}
