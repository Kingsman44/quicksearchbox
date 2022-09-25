package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127163w;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.connection.impl.ConnectionManagerApaCallbacks$onAssistantStateUpdate$1", mo61344c = "ConnectionManagerApaCallbacks.kt", mo61345d = "invokeSuspend", mo61346e = {98})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.j */
/* compiled from: PG */
final class C126957j extends C69572j implements C69630p {

    /* renamed from: a */
    int f349578a;

    /* renamed from: b */
    final /* synthetic */ C126962o f349579b;

    /* renamed from: c */
    final /* synthetic */ C119904w f349580c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126957j(C126962o oVar, C119904w wVar, C69577g gVar) {
        super(2, gVar);
        this.f349579b = oVar;
        this.f349580c = wVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126957j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349578a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127163w wVar = this.f349579b.f349594b;
            C119904w wVar2 = this.f349580c;
            this.f349578a = 1;
            if (wVar.mo107975e(wVar2, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126957j(this.f349579b, this.f349580c, gVar);
    }
}
