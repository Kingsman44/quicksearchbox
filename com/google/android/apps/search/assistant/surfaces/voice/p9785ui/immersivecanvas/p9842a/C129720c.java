package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.android.apps.gsa.binaries.satin.app.C74099jr;
import com.google.android.apps.gsa.binaries.satin.app.jt;
import com.google.assistant.p3897e.p3921j.alb;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4450a.C57934a;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.c */
/* compiled from: PG */
public final /* synthetic */ class C129720c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C129722e f355966a;

    /* renamed from: b */
    public final /* synthetic */ alb f355967b;

    public /* synthetic */ C129720c(C129722e eVar, alb alb) {
        this.f355966a = eVar;
        this.f355967b = alb;
    }

    public final void run() {
        C129722e eVar = this.f355966a;
        alb alb = this.f355967b;
        C60870cx cxVar = eVar.f355972d;
        if (cxVar == null || cxVar.isDone()) {
            C74099jr jrVar = eVar.f355974f;
            jrVar.f206475c = eVar.f355973e.mo54628a("ContinuousMatchConnectionGraph");
            alb.getClass();
            jrVar.f206476d = alb;
            C68225k.m98529a(jrVar.f206475c, C57934a.class);
            C68225k.m98529a(jrVar.f206476d, alb.class);
            eVar.f355972d = new jt(jrVar.f206473a, jrVar.f206474b, jrVar.f206475c, jrVar.f206476d).b.mo60297gq();
            return;
        }
        ((C59052c) ((C59052c) C129722e.f355969a.mo56226d()).mo56372aa(38428)).mo56386p("Cannot start a new Continuous Match session when a session is already running.");
    }
}
