package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33681i;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.android.libraries.search.p2904c.p2906aa.C37330e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.input.api.impl.AudioInputSessionImpl$close$1", mo61344c = "AudioInputSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {152})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.a.a.e */
/* compiled from: PG */
final class C33644e extends C69572j implements C69630p {

    /* renamed from: a */
    int f89901a;

    /* renamed from: b */
    final /* synthetic */ C33651l f89902b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33644e(C33651l lVar, C69577g gVar) {
        super(2, gVar);
        this.f89902b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33644e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89901a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C33651l.f89922a.mo56224b();
            C61301b a = C34711b.m63445a(this.f89902b.f89923b);
            C33653n nVar = this.f89902b.f89926e;
            C33653n nVar2 = null;
            if (nVar == null) {
                C69664n.m101065k("grpcSession");
                nVar = null;
            }
            int a2 = C37330e.m66336a(nVar.mo39021b());
            cVar.mo56379ah(new C59094n(51246));
            cVar.mo56352E("Closing listening session for InvocationToken (%s) and sessionAccessToken(%s).", a, a2);
            C33653n nVar3 = this.f89902b.f89926e;
            if (nVar3 == null) {
                C69664n.m101065k("grpcSession");
            } else {
                nVar2 = nVar3;
            }
            this.f89901a = 1;
            obj = nVar2.mo39022c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C33681i iVar = (C33681i) obj;
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33644e(this.f89902b, gVar);
    }
}
