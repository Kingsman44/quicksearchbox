package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61539c;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
import com.google.protobuf.C62942bv;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionServiceCallbacksImpl$onNewSession$1$sessionId$1", mo61344c = "ApaVoiceInteractionSessionServiceCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {33})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.al */
/* compiled from: PG */
final class C33772al extends C69572j implements C69630p {

    /* renamed from: a */
    int f90204a;

    /* renamed from: b */
    final /* synthetic */ C33775ao f90205b;

    /* renamed from: c */
    final /* synthetic */ Bundle f90206c;

    /* renamed from: d */
    final /* synthetic */ int f90207d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33772al(C33775ao aoVar, Bundle bundle, int i, C69577g gVar) {
        super(2, gVar);
        this.f90205b = aoVar;
        this.f90206c = bundle;
        this.f90207d = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33772al) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C33850di diVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90204a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33787b bVar = this.f90205b.f90216c;
            Bundle bundle = this.f90206c;
            int i = this.f90207d;
            this.f90204a = 1;
            if (bundle != null) {
                C33850di diVar2 = bVar.f90237a;
                C61541e eVar = C33487a.f89616a;
                C69664n.m101060f(eVar, "BUNDLE_KEYS");
                diVar = (C33850di) C61539c.m94271a(diVar2, eVar, bundle);
            } else {
                diVar = bVar.f90237a;
            }
            C33811bx bxVar = (C33811bx) C33812by.f90264b.createBuilder();
            C69664n.m101060f(bxVar, "newBuilder()");
            C69664n.m101061g(bxVar, "builder");
            bxVar.copyOnWrite();
            ((C33812by) bxVar.instance).f90266a = i;
            C62942bv build = bxVar.build();
            C69664n.m101060f(build, "_builder.build()");
            obj = diVar.mo39097j((C33812by) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new Long(((C33815ca) obj).f90272a);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33772al(this.f90205b, this.f90206c, this.f90207d, gVar);
    }
}
