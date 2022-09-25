package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location;

import android.view.View;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location.f */
/* compiled from: PG */
public final /* synthetic */ class C110862f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110866j f308863a;

    public /* synthetic */ C110862f(C110866j jVar) {
        this.f308863a = jVar;
    }

    public final void onClick(View view) {
        C110866j jVar = this.f308863a;
        C59104x b = C110866j.f308867a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ssIntroLocationAct");
        ((C59052c) ((C59052c) b).mo56372aa(26697)).mo56386p("tapped on not now button ");
        C60870cx o = jVar.f308870d.o();
        C110865i iVar = new C110865i(jVar);
        C60856cj.m92911t(o, C47810es.m84974n(iVar), C60826bg.f164896a);
        jVar.f308868b.finish();
    }
}
