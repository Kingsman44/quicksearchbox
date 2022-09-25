package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.z */
/* compiled from: PG */
public final /* synthetic */ class C135853z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C135824av f370006a;

    public /* synthetic */ C135853z(C135824av avVar) {
        this.f370006a = avVar;
    }

    public final void run() {
        C135824av avVar = this.f370006a;
        if (avVar.f369956f.isEmpty()) {
            ((C59052c) ((C59052c) C135824av.f369951a.mo56226d()).mo56372aa(40629)).mo56386p("Attempt to execute the suggestion before requesting to generate it.");
            return;
        }
        C135821as asVar = new C135821as(avVar);
        C60870cx h = C60922j.m93045h((C60870cx) avVar.f369956f.get(), C47810es.m84966f(asVar), avVar.f369954d);
        C60845bz bzVar = avVar.f369957g;
        C60856cj.m92911t(h, C47810es.m84974n(bzVar), avVar.f369954d);
    }
}
