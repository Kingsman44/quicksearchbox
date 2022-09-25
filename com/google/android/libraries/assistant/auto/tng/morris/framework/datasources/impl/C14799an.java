package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.an */
/* compiled from: PG */
final class C14799an extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C14800ao f44585a;

    public C14799an(C14800ao aoVar) {
        this.f44585a = aoVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.app.action.INTERRUPTION_FILTER_CHANGED".equals(intent.getAction()) || "android.app.action.NOTIFICATION_POLICY_CHANGED".equals(intent.getAction())) {
            int f = this.f44585a.mo21744f();
            Optional j = this.f44585a.mo21745j();
            boolean z = false;
            if (C14160ab.m30486g(f) && f != this.f44585a.f44592f) {
                z = true;
            }
            boolean m = C14800ao.m31136m(j, this.f44585a.f44593g);
            if (!z) {
                if (!this.f44585a.f44588b.mo79746e(C90051dc.f248872ba) || !m) {
                    C58976aa aaVar = C58975e.f156826a;
                    return;
                }
                m = true;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            C14160ab.f42906a.get(f);
            if (j.isPresent()) {
                ((NotificationManager.Policy) j.get()).toString();
            }
            C14800ao aoVar = this.f44585a;
            if (!aoVar.f44594h && ((!aoVar.f44588b.mo79746e(C90051dc.f248872ba) || !m) && this.f44585a.f44591e.isPresent())) {
                C14160ab.m30484e(context, (NotificationManager.Policy) this.f44585a.f44591e.get());
            }
            C14800ao aoVar2 = this.f44585a;
            aoVar2.f44592f = f;
            aoVar2.f44593g = j;
            aoVar2.f44594h = true;
            aoVar2.mo21746k(-1);
            this.f44585a.mo21747l(Optional.empty());
        }
    }
}
