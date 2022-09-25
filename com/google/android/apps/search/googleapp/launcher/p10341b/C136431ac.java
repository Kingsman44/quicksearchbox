package com.google.android.apps.search.googleapp.launcher.p10341b;

import android.os.RemoteException;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C136431ac implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C136432ad f371411a;

    public /* synthetic */ C136431ac(C136432ad adVar) {
        this.f371411a = adVar;
    }

    public final void run() {
        C136432ad adVar = this.f371411a;
        try {
            C136433ae aeVar = adVar.f371413b;
            aeVar.mo113030s(adVar.f371412a, aeVar.mo113023b());
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C136433ae.f371414a.mo56225c()).mo56382g(e)).mo56372aa(40732)).mo56386p("Failed to send overlay visibility callback");
        }
    }
}
