package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.p7148ui.C90656ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.activity.b */
/* compiled from: PG */
public final /* synthetic */ class C110022b implements C90656ba {

    /* renamed from: a */
    public final /* synthetic */ OpaAmbActivity f306566a;

    public /* synthetic */ C110022b(OpaAmbActivity opaAmbActivity) {
        this.f306566a = opaAmbActivity;
    }

    /* renamed from: a */
    public final boolean mo73061a(MotionEvent motionEvent) {
        OpaAmbActivity opaAmbActivity = this.f306566a;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        opaAmbActivity.mo98307x();
        return false;
    }
}
