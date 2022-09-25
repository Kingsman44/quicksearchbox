package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import android.content.Intent;
import com.google.android.apps.gsa.nga.shared.android.C80957m;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.y */
/* compiled from: PG */
public final /* synthetic */ class C78222y implements C80957m {

    /* renamed from: a */
    public final /* synthetic */ C78190aa f215363a;

    public /* synthetic */ C78222y(C78190aa aaVar) {
        this.f215363a = aaVar;
    }

    /* renamed from: a */
    public final void mo71168a(Intent intent) {
        C78190aa aaVar = this.f215363a;
        String stringExtra = intent.getStringExtra("reason");
        if (stringExtra == null || !stringExtra.equals("voiceinteraction")) {
            aaVar.f215276a.mo28212l("[NGA] onCloseSystemDialogs", new C78221x(aaVar));
        }
    }
}
