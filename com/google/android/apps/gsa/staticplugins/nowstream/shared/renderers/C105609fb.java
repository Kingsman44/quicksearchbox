package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105413u;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105414v;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fb */
/* compiled from: PG */
public final /* synthetic */ class C105609fb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C105610fc f294668a;

    public /* synthetic */ C105609fb(C105610fc fcVar) {
        this.f294668a = fcVar;
    }

    public final void onClick(View view) {
        C105610fc fcVar = this.f294668a;
        C89949q.m146521e(C28285c.m52882i(view, 5, (Integer) null), false);
        C105413u uVar = fcVar.f294669a;
        ((C105414v) uVar).f294030a.mo28345s("onSignIn", "SignInLureEventsDispatcher", new Bundle());
    }
}
