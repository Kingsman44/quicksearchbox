package com.google.android.libraries.search.assistant.invocation.assistdata.p2596b;

import com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult;
import com.google.android.libraries.search.assistant.invocation.utils.p2696b.C34717a;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.assistdata.service.AssistDataGrpcClientImpl$getAssistData$1", mo61344c = "AssistDataGrpcClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.libraries.search.assistant.invocation.assistdata.b.r */
/* compiled from: PG */
final class C33544r extends C69572j implements C69630p {

    /* renamed from: a */
    int f89713a;

    /* renamed from: b */
    final /* synthetic */ C33547u f89714b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33544r(C33547u uVar, C69577g gVar) {
        super(2, gVar);
        this.f89714b = uVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33544r) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89713a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33547u uVar = this.f89714b;
            C33535i iVar = (C33535i) C33536j.f89702b.createBuilder();
            C69664n.m101060f(iVar, "newBuilder()");
            C69664n.m101061g(iVar, "builder");
            String str = uVar.f89719b;
            C69664n.m101061g(str, "value");
            iVar.copyOnWrite();
            str.getClass();
            ((C33536j) iVar.instance).f89704a = str;
            C62942bv build = iVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C60870cx b = C56125i.m87910b(this.f89714b.f89718a, C33543q.f89712a, (C33536j) build);
            this.f89713a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C56125i iVar2 = (C56125i) obj;
        C34717a aVar2 = this.f89714b.f89720c;
        try {
            C69664n.m101060f(iVar2, "response");
            C61541e eVar = C33527ac.f89696a;
            C69664n.m101060f(eVar, "ASSIST_STATE_KEYS");
            return (AssistStateResult) C61543g.m94279f(iVar2, eVar);
        } catch (Throwable th) {
            throw aVar2.mo38957a(th);
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33544r(this.f89714b, gVar);
    }
}
