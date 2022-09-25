package com.google.android.libraries.search.assistant.p2700k;

import com.google.frameworks.client.data.android.p4632a.C61333a;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.credential.RpcAuthCredentialContext$getCredential$token$1", mo61344c = "RpcAuthCredentialManager.kt", mo61345d = "invokeSuspend", mo61346e = {86})
/* renamed from: com.google.android.libraries.search.assistant.k.n */
/* compiled from: PG */
final class C34776n extends C69572j implements C69630p {

    /* renamed from: a */
    int f92278a;

    /* renamed from: b */
    final /* synthetic */ C34778p f92279b;

    /* renamed from: c */
    final /* synthetic */ C61333a f92280c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34776n(C34778p pVar, C61333a aVar, C69577g gVar) {
        super(2, gVar);
        this.f92279b = pVar;
        this.f92280c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34776n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f92278a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34778p pVar = this.f92279b;
            C34761b bVar = pVar.f92291a;
            C61333a aVar2 = this.f92280c;
            Set set = pVar.f92292b;
            this.f92278a = 1;
            obj = bVar.mo39491a(aVar2, set, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34776n(this.f92279b, this.f92280c, gVar);
    }
}
