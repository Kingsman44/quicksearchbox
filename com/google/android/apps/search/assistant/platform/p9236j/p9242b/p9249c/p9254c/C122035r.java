package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a;
import com.google.android.libraries.search.assistant.invocation.android.parcelables.IBinderContainer;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g;
import com.google.p4238bo.p4239a.p4240a.p4241a.C56125i;
import com.google.protobuf.C62942bv;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenClientImpl$getVisToken$1", mo61344c = "ApaVisTokenClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {46})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.r */
/* compiled from: PG */
final class C122035r extends C69572j implements C69630p {

    /* renamed from: a */
    int f338584a;

    /* renamed from: b */
    final /* synthetic */ C121992ab f338585b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122035r(C121992ab abVar, C69577g gVar) {
        super(2, gVar);
        this.f338585b = abVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122035r) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338584a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                throw new C122017b(th);
            }
        } else {
            C69714l.m101134b(obj);
            C121994ad adVar = this.f338585b.f338520b;
            C122034q qVar = C122034q.f338583a;
            C122020c cVar = (C122020c) C122021d.f338555a.createBuilder();
            C69664n.m101060f(cVar, "newBuilder()");
            C69664n.m101061g(cVar, "builder");
            C62942bv build = cVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C60870cx b = C56125i.m87910b(adVar, qVar, (C122021d) build);
            this.f338584a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C56125i iVar = (C56125i) obj;
        C69664n.m101060f(iVar, "response");
        C61541e eVar = C33487a.f89620e;
        C69664n.m101060f(eVar, "BINDER_KEYS");
        return ((IBinderContainer) C61543g.m94279f(iVar, eVar)).f89615a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C122035r(this.f338585b, gVar);
    }
}
