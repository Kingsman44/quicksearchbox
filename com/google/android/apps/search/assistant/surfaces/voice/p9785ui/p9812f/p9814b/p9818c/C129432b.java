package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9818c;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.C129410a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52151hc;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.c.b */
/* compiled from: PG */
public final class C129432b implements C129410a {

    /* renamed from: a */
    public static final C59071e f355393a = C59071e.m91331h();

    /* renamed from: b */
    private final C127118j f355394b;

    /* renamed from: c */
    private final Executor f355395c;

    public C129432b(C127118j jVar, Executor executor) {
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f355394b = jVar;
        this.f355395c = executor;
    }

    /* renamed from: a */
    public final void mo109027a() {
        C127118j jVar = this.f355394b;
        C127454b bVar = C127454b.CLIENT_INPUT;
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "Narrate_current_content";
        C62942bv build = mVar.build();
        C69664n.m101060f(build, "newBuilder().setName(REA…LOUD_INTENT_NAME).build()");
        C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
        C63088z byteString = ((C61752n) build).toByteString();
        hcVar.copyOnWrite();
        C52152hd hdVar = (C52152hd) hcVar.instance;
        byteString.getClass();
        hdVar.f136852a |= 1;
        hdVar.f136853b = byteString;
        C62942bv build2 = hcVar.build();
        C69664n.m101060f(build2, "newBuilder().setIntent(i…t.toByteString()).build()");
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "asst_input.INTENT";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.IntentInput";
        C63088z byteString2 = ((C52152hd) build2).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString2.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString2;
        dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
        C62942bv build3 = dsVar.build();
        C69664n.m101060f(build3, "newBuilder()\n      .setC…()\n      )\n      .build()");
        C60856cj.m92911t(jVar.mo107931g(C127407d.m208361a(bVar, (C51805du) build3)), C47810es.m84974n(new C129431a()), this.f355395c);
    }
}
