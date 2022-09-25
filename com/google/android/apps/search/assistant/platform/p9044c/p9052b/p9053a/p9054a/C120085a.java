package com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.configuration.defaults.agsa.AgsaAssistantEnabledChangeListener$onAssistantEnabledSettingsDataChanged$future$1", mo61344c = "AgsaAssistantEnabledChangeListener.kt", mo61345d = "invokeSuspend", mo61346e = {26})
/* renamed from: com.google.android.apps.search.assistant.platform.c.b.a.a.a */
/* compiled from: PG */
final class C120085a extends C69572j implements C69630p {

    /* renamed from: a */
    int f334292a;

    /* renamed from: b */
    final /* synthetic */ C120086b f334293b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120085a(C120086b bVar, C69577g gVar) {
        super(2, gVar);
        this.f334293b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120085a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334292a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120105u uVar = this.f334293b.f334295a;
            C120094j jVar = (C120094j) C120095k.f334312b.createBuilder();
            C69664n.m101060f(jVar, "newBuilder()");
            C120097m a = C69664n.m101061g(jVar, "builder");
            a.mo104665b(C120100p.SETTING_ASSISTANT_ENABLED);
            C120095k a2 = a.mo104664a();
            this.f334292a = 1;
            obj = uVar.mo104668b(a2, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120085a(this.f334293b, gVar);
    }
}
