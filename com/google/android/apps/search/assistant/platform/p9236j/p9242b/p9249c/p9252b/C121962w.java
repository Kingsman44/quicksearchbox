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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.assistlayer.AssistLayerInVisWindow$showFragment$1", mo61344c = "AssistLayerInVisWindow.kt", mo61345d = "invokeSuspend", mo61346e = {66})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.w */
/* compiled from: PG */
final class C121962w extends C69572j implements C69630p {

    /* renamed from: a */
    int f338454a;

    /* renamed from: b */
    final /* synthetic */ C121964y f338455b;

    /* renamed from: c */
    final /* synthetic */ C34037b f338456c;

    /* renamed from: d */
    final /* synthetic */ C129655b f338457d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121962w(C121964y yVar, C129655b bVar, C34037b bVar2, C69577g gVar) {
        super(2, gVar);
        this.f338455b = yVar;
        this.f338457d = bVar;
        this.f338456c = bVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121962w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338454a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C121964y yVar = this.f338455b;
            C129655b bVar = this.f338457d;
            C34037b bVar2 = this.f338456c;
            this.f338454a = 1;
            obj = yVar.mo105473g(bVar, bVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121962w(this.f338455b, this.f338457d, this.f338456c, gVar);
    }
}
