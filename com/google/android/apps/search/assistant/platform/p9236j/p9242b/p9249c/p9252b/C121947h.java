package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.assistlayer.AssistLayerApiImpl$showFragment$1", mo61344c = "AssistLayerApiImpl.kt", mo61345d = "invokeSuspend", mo61346e = {67})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.h */
/* compiled from: PG */
final class C121947h extends C69572j implements C69630p {

    /* renamed from: a */
    int f338390a;

    /* renamed from: b */
    final /* synthetic */ C121954o f338391b;

    /* renamed from: c */
    final /* synthetic */ C34037b f338392c;

    /* renamed from: d */
    final /* synthetic */ C129655b f338393d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121947h(C121954o oVar, C129655b bVar, C34037b bVar2, C69577g gVar) {
        super(2, gVar);
        this.f338391b = oVar;
        this.f338393d = bVar;
        this.f338392c = bVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121947h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338390a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C121954o oVar = this.f338391b;
            C129655b bVar = this.f338393d;
            C34037b bVar2 = this.f338392c;
            this.f338390a = 1;
            obj = oVar.mo105471d(bVar, bVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121947h(this.f338391b, this.f338393d, this.f338392c, gVar);
    }
}
