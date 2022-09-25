package com.google.android.apps.gsa.staticplugins.opa.p8183ag;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ag.d */
/* compiled from: PG */
public final /* synthetic */ class C106155d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C106158g f296263a;

    public /* synthetic */ C106155d(C106158g gVar) {
        this.f296263a = gVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C106158g gVar = this.f296263a;
        C59104x c = C106158g.f296266a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LensLauncherBtn");
        ((C59052c) ((C59052c) c).mo56372aa(24720)).mo56386p("timeout checking Lens capability");
        gVar.f296268c.mo83755a((TimeoutException) obj, 109739037, 29).mo83721a();
    }
}
