package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.View;
import com.google.android.libraries.onegoogle.popovercontainer.C31035aj;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.d */
/* compiled from: PG */
public final /* synthetic */ class C30678d implements C31035aj {

    /* renamed from: a */
    public final /* synthetic */ C30694t f82813a;

    /* renamed from: b */
    public final /* synthetic */ C31036ak f82814b;

    /* renamed from: c */
    public final /* synthetic */ BroadcastReceiver f82815c;

    public /* synthetic */ C30678d(C30694t tVar, C31036ak akVar, BroadcastReceiver broadcastReceiver) {
        this.f82813a = tVar;
        this.f82814b = akVar;
        this.f82815c = broadcastReceiver;
    }

    /* renamed from: a */
    public final void mo35894a(View view) {
        C30694t tVar = this.f82813a;
        C31036ak akVar = this.f82814b;
        BroadcastReceiver broadcastReceiver = this.f82815c;
        tVar.f82847a.mo35864o().mo35821a(view, true != tVar.f82847a.mo35860k().mo36171d().mo36153b().mo56113h() ? 90575 : 90576);
        tVar.mo36379e(37);
        if (tVar.f82847a.mo35860k().mo36187t()) {
            akVar.requireContext().registerReceiver(broadcastReceiver, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), "android.permission.BROADCAST_CLOSE_SYSTEM_DIALOGS", (Handler) null);
        }
    }
}
