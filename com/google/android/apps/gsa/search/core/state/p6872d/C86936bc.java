package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.bc */
/* compiled from: PG */
final class C86936bc extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C86938be f234768a;

    public C86936bc(C86938be beVar) {
        this.f234768a = beVar;
    }

    public final void onReceive(Context context, Intent intent) {
        BroadcastReceiver.PendingResult goAsync = goAsync();
        C90875ai.m148465b(new C86934ba(goAsync), this.f234768a.f234797k.mo78535a(intent), this.f234768a.f234794h, "handleHotwordSnoozeBroadcast").mo85223a(new C86935bb(goAsync));
    }
}
