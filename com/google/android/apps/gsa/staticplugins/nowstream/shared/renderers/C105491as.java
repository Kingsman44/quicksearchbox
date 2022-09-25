package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105394b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105395c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.as */
/* compiled from: PG */
public final /* synthetic */ class C105491as implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C105495aw f294287a;

    public /* synthetic */ C105491as(C105495aw awVar) {
        this.f294287a = awVar;
    }

    public final void onClick(View view) {
        C105495aw awVar = this.f294287a;
        if (awVar.f63126Q.mo28316z()) {
            C105394b bVar = awVar.f294291a;
            ((C105395c) bVar).f294019a.mo28345s("onRecoveryClicked", "GooglePlayServicesCardEventsDispatcher", new Bundle());
        }
    }
}
