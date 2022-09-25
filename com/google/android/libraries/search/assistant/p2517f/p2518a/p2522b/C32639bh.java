package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.invocation.assistdata.p2596b.C33547u;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32831bz;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AssistDataContextAccessorImpl$fetchScreenshot$1", mo61344c = "AssistDataContextAccessorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {38, 40})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bh */
/* compiled from: PG */
public final class C32639bh extends C69572j implements C69630p {

    /* renamed from: a */
    int f87482a;

    /* renamed from: b */
    final /* synthetic */ C32640bi f87483b;

    /* renamed from: c */
    final /* synthetic */ C32871q f87484c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32639bh(C32640bi biVar, C32871q qVar, C69577g gVar) {
        super(2, gVar);
        this.f87483b = biVar;
        this.f87484c = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32639bh) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f87482a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C32640bi biVar = this.f87483b;
            C32871q qVar = this.f87484c;
            C32831bz bzVar = C32831bz.SCREENSHOT;
            this.f87482a = 1;
            obj = biVar.mo38200a(qVar, true, bzVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C60870cx b = ((C33547u) obj).mo38974b();
        this.f87482a = 2;
        obj = C71663i.m104690c(b, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32639bh(this.f87483b, this.f87484c, gVar);
    }
}
