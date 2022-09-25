package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3070g;

import android.content.IntentFilter;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.n.c.a.g.a */
/* compiled from: PG */
public final /* synthetic */ class C39530a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39533d f104087a;

    /* renamed from: b */
    public final /* synthetic */ boolean f104088b;

    public /* synthetic */ C39530a(C39533d dVar, boolean z) {
        this.f104087a = dVar;
        this.f104088b = z;
    }

    public final Object call() {
        C39533d dVar = this.f104087a;
        if (this.f104088b) {
            if (dVar.f104098g) {
                return "Successfully handled broadcast";
            }
            ((C59052c) ((C59052c) C39533d.f104092a.mo56224b()).mo56372aa(53695)).mo56386p("Registering broadcastReceiver to listen for screen state changes.");
            ((C59052c) ((C59052c) C39533d.f104092a.mo56224b()).mo56372aa(53696)).mo56386p("#registerBroadcastReceiver");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            dVar.f104094c.registerReceiver(dVar.f104097f, intentFilter);
            dVar.f104098g = true;
            return "Successfully handled broadcast";
        } else if (!dVar.f104098g) {
            return "Successfully handled broadcast";
        } else {
            ((C59052c) ((C59052c) C39533d.f104092a.mo56224b()).mo56372aa(53694)).mo56386p("Unregistering broadcastReceiver to listen for screen state changes.");
            ((C59052c) ((C59052c) C39533d.f104092a.mo56224b()).mo56372aa(53697)).mo56386p("#unregisterBroadcastReceiver");
            dVar.f104094c.unregisterReceiver(dVar.f104097f);
            dVar.f104098g = false;
            return "Successfully handled broadcast";
        }
    }
}
