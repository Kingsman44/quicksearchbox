package com.google.android.apps.gsa.shared.bisto.p7029b;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.b.a */
/* compiled from: PG */
final class C89630a implements PendingIntent.OnFinished {

    /* renamed from: a */
    final /* synthetic */ C89631b f242708a;

    public C89630a(C89631b bVar) {
        this.f242708a = bVar;
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        if (i == 0) {
            this.f242708a.mo76703c();
        } else {
            this.f242708a.mo76702b();
        }
    }
}
