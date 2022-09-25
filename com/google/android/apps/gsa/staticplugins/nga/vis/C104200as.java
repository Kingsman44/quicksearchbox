package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.as */
/* compiled from: PG */
public final class C104200as extends BroadcastReceiver {

    /* renamed from: a */
    private final C91142g f289864a;

    public C104200as(C91142g gVar) {
        this.f289864a = gVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f289864a.mo85405j(C90126fx.f251245fF)) {
            System.exit(0);
        }
    }
}
