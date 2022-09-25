package com.google.android.apps.gsa.nga.engine.viss;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.p */
/* compiled from: PG */
public final /* synthetic */ class C79386p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C79387q f218005a;

    /* renamed from: b */
    public final /* synthetic */ C79370ac f218006b;

    /* renamed from: c */
    public final /* synthetic */ IBinder f218007c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f218008d;

    /* renamed from: e */
    public final /* synthetic */ int f218009e;

    public /* synthetic */ C79386p(C79387q qVar, C79370ac acVar, IBinder iBinder, Bundle bundle, int i) {
        this.f218005a = qVar;
        this.f218006b = acVar;
        this.f218007c = iBinder;
        this.f218008d = bundle;
        this.f218009e = i;
    }

    public final void run() {
        C79387q qVar = this.f218005a;
        try {
            qVar.f218010a.mo73928e(this.f218006b, this.f218007c, this.f218008d, this.f218009e);
        } catch (RemoteException e) {
            C59104x c = NgaVoiceInteractionSessionService.f217951a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NgaViss");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(5554)).mo56386p("Failed to start remote session");
        }
    }
}
