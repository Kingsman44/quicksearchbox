package com.google.android.apps.gsa.shared.bisto.p7028a;

import android.content.BroadcastReceiver;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.m */
/* compiled from: PG */
public final /* synthetic */ class C89589m implements C89472bk {

    /* renamed from: a */
    public final /* synthetic */ C89474bm f242651a;

    /* renamed from: b */
    public final /* synthetic */ BroadcastReceiver f242652b;

    public /* synthetic */ C89589m(C89474bm bmVar, BroadcastReceiver broadcastReceiver) {
        this.f242651a = bmVar;
        this.f242652b = broadcastReceiver;
    }

    /* renamed from: a */
    public final void mo83356a() {
        C89474bm bmVar = this.f242651a;
        BroadcastReceiver broadcastReceiver = this.f242652b;
        if (broadcastReceiver != null) {
            C58976aa aaVar = C58975e.f156826a;
            bmVar.f242495b.unregisterReceiver(broadcastReceiver);
        }
        bmVar.f242496c.f242516a.close();
    }
}
