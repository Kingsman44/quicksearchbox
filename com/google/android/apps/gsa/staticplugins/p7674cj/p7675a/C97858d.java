package com.google.android.apps.gsa.staticplugins.p7674cj.p7675a;

import android.content.ServiceConnection;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cj.a.d */
/* compiled from: PG */
public final /* synthetic */ class C97858d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C97863i f273261a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnection f273262b;

    public /* synthetic */ C97858d(C97863i iVar, ServiceConnection serviceConnection) {
        this.f273261a = iVar;
        this.f273262b = serviceConnection;
    }

    public final void run() {
        C97863i iVar = this.f273261a;
        try {
            iVar.f273270a.f273274b.unbindService(this.f273262b);
        } catch (IllegalArgumentException e) {
            C59104x d = C97864j.f273273a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PersonalContextWorker");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(30360)).mo56386p("unbindService failed.");
        }
    }
}
