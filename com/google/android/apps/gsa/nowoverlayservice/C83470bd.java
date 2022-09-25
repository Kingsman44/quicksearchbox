package com.google.android.apps.gsa.nowoverlayservice;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.bd */
/* compiled from: PG */
final class C83470bd implements PendingIntent.OnFinished {

    /* renamed from: a */
    final /* synthetic */ View f227576a;

    /* renamed from: b */
    final /* synthetic */ C83471be f227577b;

    public C83470bd(C83471be beVar, View view) {
        this.f227577b = beVar;
        this.f227576a = view;
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        if (i == -1) {
            C83469bc bcVar = new C83469bc();
            this.f227576a.startDragAndDrop((ClipData) bundle.getParcelable("clip_data"), bcVar, (Object) null, 256);
            if (!bundle.getBoolean("partial_long_press", false)) {
                C83471be beVar = this.f227577b;
                beVar.f227589k = true;
                beVar.mo17500a();
            }
        }
    }
}
