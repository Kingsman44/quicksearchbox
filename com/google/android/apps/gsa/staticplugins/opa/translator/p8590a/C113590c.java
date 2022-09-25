package com.google.android.apps.gsa.staticplugins.opa.translator.p8590a;

import android.widget.RelativeLayout;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.a.c */
/* compiled from: PG */
public final /* synthetic */ class C113590c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C113613z f314521a;

    public /* synthetic */ C113590c(C113613z zVar) {
        this.f314521a = zVar;
    }

    public final void run() {
        C113613z zVar = this.f314521a;
        RelativeLayout relativeLayout = zVar.f314584l;
        if (relativeLayout != null && C113613z.m188058c(relativeLayout).getVisibility() == 0 && zVar.f314595w != null && zVar.f314582j.mo26871c() - zVar.f314595w.longValue() >= zVar.f314596x) {
            C58976aa aaVar = C58975e.f156826a;
            C113613z.m188058c(zVar.f314584l).setVisibility(8);
        }
    }
}
