package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ax */
/* compiled from: PG */
final class C124821ax extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C124822ay f344374a;

    public C124821ax(C124822ay ayVar) {
        this.f344374a = ayVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C47538ax c = this.f344374a.f344377c.mo51613c("NetworkChangeReceiver");
        try {
            if (this.f344374a.mo106659b()) {
                C58976aa aaVar = C58975e.f156826a;
                this.f344374a.mo106658a();
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
