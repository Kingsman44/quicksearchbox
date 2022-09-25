package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.conversation.context.impl.ContextController$fetchContext$1", mo61344c = "ContextController.kt", mo61345d = "invokeSuspend", mo61346e = {126})
/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.d */
/* compiled from: PG */
final class C119913d extends C69572j implements C69630p {

    /* renamed from: a */
    int f333925a;

    /* renamed from: b */
    final /* synthetic */ C119927r f333926b;

    /* renamed from: c */
    final /* synthetic */ C32796ar f333927c;

    /* renamed from: d */
    final /* synthetic */ boolean f333928d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119913d(C119927r rVar, C32796ar arVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f333926b = rVar;
        this.f333927c = arVar;
        this.f333928d = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119913d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f333925a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) C119927r.f333991a.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, "ConvEngine.Context");
                C59052c cVar2 = (C59052c) cVar.mo56382g(th);
                C32796ar arVar = this.f333927c;
                cVar2.mo56379ah(new C59094n(34591));
                cVar2.mo56389s("Failed to fetch context %s", arVar);
                throw th;
            }
        } else {
            C69714l.m101134b(obj);
            C119912c cVar3 = this.f333926b.f333995e;
            C32796ar arVar2 = this.f333927c;
            boolean z = this.f333928d;
            this.f333925a = 1;
            obj = cVar3.mo104560a(arVar2, z, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (C32801aw) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119913d(this.f333926b, this.f333927c, this.f333928d, gVar);
    }
}
