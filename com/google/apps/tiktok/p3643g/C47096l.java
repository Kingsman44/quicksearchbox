package com.google.apps.tiktok.p3643g;

import android.content.BroadcastReceiver;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.apps.tiktok.g.l */
/* compiled from: PG */
final class C47096l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ BroadcastReceiver.PendingResult f122697a;

    public C47096l(BroadcastReceiver.PendingResult pendingResult) {
        this.f122697a = pendingResult;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f122697a.finish();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C47100p pVar = (C47100p) obj;
        this.f122697a.setResult(pVar.mo51010a(), pVar.mo51012c(), pVar.mo51011b());
        if (pVar.mo51013d()) {
            this.f122697a.abortBroadcast();
        }
        this.f122697a.finish();
    }
}
