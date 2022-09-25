package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.h */
/* compiled from: PG */
final class C136530h extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C136531i f371701a;

    public C136530h(C136531i iVar) {
        this.f371701a = iVar;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean n;
        boolean z;
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.MY_PACKAGE_SUSPENDED".equals(action) || "android.intent.action.MY_PACKAGE_UNSUSPENDED".equals(action)) {
                C59071e eVar = C136531i.f371703a;
                C136531i iVar = this.f371701a;
                if (C136531i.m221890o() && iVar.f371723t != (n = iVar.mo113162n())) {
                    iVar.f371723t = n;
                    C136533k i = iVar.mo22017i();
                    if (!(i == null || i.f371730c == (z = iVar.f371723t))) {
                        i.f371730c = z;
                        i.mo113170i();
                    }
                    iVar.mo113161m();
                }
            }
        }
    }
}
