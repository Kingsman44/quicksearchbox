package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.BroadcastReceiver;
import com.google.android.libraries.onegoogle.popovercontainer.C31033ah;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.f */
/* compiled from: PG */
public final /* synthetic */ class C30680f implements C31033ah {

    /* renamed from: a */
    public final /* synthetic */ C30694t f82817a;

    /* renamed from: b */
    public final /* synthetic */ C31036ak f82818b;

    /* renamed from: c */
    public final /* synthetic */ BroadcastReceiver f82819c;

    public /* synthetic */ C30680f(C30694t tVar, C31036ak akVar, BroadcastReceiver broadcastReceiver) {
        this.f82817a = tVar;
        this.f82818b = akVar;
        this.f82819c = broadcastReceiver;
    }

    /* renamed from: a */
    public final void mo36373a() {
        C30694t tVar = this.f82817a;
        C31036ak akVar = this.f82818b;
        BroadcastReceiver broadcastReceiver = this.f82819c;
        if (tVar.f82847a.mo35860k().mo36187t()) {
            akVar.requireContext().unregisterReceiver(broadcastReceiver);
        }
    }
}
