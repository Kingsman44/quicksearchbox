package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.support.p031v4.app.C0167am;
import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.g */
/* compiled from: PG */
public final /* synthetic */ class C106409g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C106410h f296815a;

    public /* synthetic */ C106409g(C106410h hVar) {
        this.f296815a = hVar;
    }

    public final void onClick(View view) {
        C0167am activity = this.f296815a.getActivity();
        if (activity != null) {
            C59104x b = C106410h.f296816a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AADetailsFragment");
            ((C59052c) ((C59052c) b).mo56372aa(23048)).mo56386p("finish() on click");
            activity.finish();
        }
    }
}
