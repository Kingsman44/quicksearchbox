package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.h */
/* compiled from: PG */
final class C110852h extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C110853i f308844a;

    public C110852h(C110853i iVar) {
        this.f308844a = iVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f308844a.f308846b.getBoolean("smartspace_oobe_dismissed", false)) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (!((C87573b) this.f308844a.f308847c.mo27525b()).f236596a.mo17534a()) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            C110853i iVar = this.f308844a;
            C58976aa aaVar3 = C58975e.f156826a;
            Intent intent2 = new Intent();
            intent2.setClassName(iVar.f308845a, "com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.SmartspaceOOBEActivity");
            intent2.addFlags(268435456);
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.apps.gsa.smartspace.EXTRA_LAUNCH_OOBE_PAGE", true);
            bundle.putParcelable("com.google.android.apps.gsa.smartspace.EXTRA_OOBE_LAUNCH_INTENT", intent2);
            ((C87573b) iVar.f308847c.mo27525b()).mo81706d(bundle);
            this.f308844a.f308845a.unregisterReceiver(this);
        }
    }
}
