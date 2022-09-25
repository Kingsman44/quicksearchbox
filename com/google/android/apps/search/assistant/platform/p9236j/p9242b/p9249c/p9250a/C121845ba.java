package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import android.content.Intent;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122046f;
import com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a;
import com.google.android.libraries.search.assistant.invocation.p2587a.p2588a.C33484b;
import com.google.android.libraries.search.assistant.invocation.p2587a.p2588a.C33485c;
import com.google.android.libraries.search.assistant.invocation.p2587a.p2588a.C33486d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61539c;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
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
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.VisActivityStarterGrpcClientImpl$startVoiceActivity$1", mo61344c = "VisActivityStarterGrpcClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.ba */
/* compiled from: PG */
final class C121845ba extends C69572j implements C69630p {

    /* renamed from: a */
    int f338085a;

    /* renamed from: b */
    final /* synthetic */ C121846bb f338086b;

    /* renamed from: c */
    final /* synthetic */ Intent f338087c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121845ba(C121846bb bbVar, Intent intent, C69577g gVar) {
        super(2, gVar);
        this.f338086b = bbVar;
        this.f338087c = intent;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121845ba) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C121831an anVar;
        C121831an anVar2;
        C121831an anVar3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338085a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C121846bb bbVar = this.f338086b;
            C121837at atVar = (C121837at) C121838au.f338075b.createBuilder();
            C69664n.m101060f(atVar, "newBuilder()");
            C121821ad a = C69664n.m101061g(atVar, "builder");
            C34053bp bpVar = bbVar.f338090c;
            if (bpVar != null) {
                a.mo105394b(bpVar);
            }
            C121838au a2 = a.mo105393a();
            C122046f fVar = this.f338086b.f338089b;
            C61541e eVar = C33487a.f89619d;
            C69664n.m101060f(eVar, "INTENT_KEYS");
            this.f338085a = 1;
            obj = ((C122046f) C61539c.m94271a(fVar, eVar, this.f338087c)).mo105520b(a2, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C121841ax axVar = (C121841ax) obj;
        C61301b bVar = null;
        if (axVar.f338081a == 2) {
            C59052c cVar = (C59052c) C121846bb.f338088a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "INV.ActivityStarter");
            C34053bp bpVar2 = this.f338086b.f338090c;
            if (bpVar2 != null) {
                bVar = C34711b.m63445a(bpVar2);
            }
            if (axVar.f338081a == 2) {
                anVar = (C121831an) axVar.f338082b;
            } else {
                anVar = C121831an.f338063c;
            }
            C121830am a3 = C121830am.m201261a(anVar.f338066b);
            if (a3 == null) {
                a3 = C121830am.UNRECOGNIZED;
            }
            if (axVar.f338081a == 2) {
                anVar2 = (C121831an) axVar.f338082b;
            } else {
                anVar2 = C121831an.f338063c;
            }
            String str = anVar2.f338065a;
            cVar.mo56379ah(new C59094n(36018));
            cVar.mo56359L("startVoiceActivity: for token = %s failed with type = %s and message = \"%s\"", bVar, a3, str);
            if (axVar.f338081a == 2) {
                anVar3 = (C121831an) axVar.f338082b;
            } else {
                anVar3 = C121831an.f338063c;
            }
            C69664n.m101060f(anVar3, "response.error");
            C69664n.m101061g(anVar3, "<this>");
            C121830am a4 = C121830am.m201261a(anVar3.f338066b);
            if (a4 == null) {
                a4 = C121830am.UNRECOGNIZED;
            }
            C69664n.m101060f(a4, "type");
            C69664n.m101061g(a4, "<this>");
            C33486d dVar = (C33486d) C121867s.f338154a.mo56070hd(a4);
            if (dVar == null) {
                dVar = C33486d.UNKNOWN;
            }
            String str2 = anVar3.f338065a;
            C69664n.m101060f(str2, "message");
            throw new C33484b(new C33485c(dVar, str2));
        }
        C59052c cVar2 = (C59052c) C121846bb.f338088a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "INV.ActivityStarter");
        C34053bp bpVar3 = this.f338086b.f338090c;
        C61301b a5 = bpVar3 != null ? C34711b.m63445a(bpVar3) : null;
        cVar2.mo56379ah(new C59094n(36017));
        cVar2.mo56389s("startVoiceActivity: for token = %s finished successful", a5);
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121845ba(this.f338086b, this.f338087c, gVar);
    }
}
