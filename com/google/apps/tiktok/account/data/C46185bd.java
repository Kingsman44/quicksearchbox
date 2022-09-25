package com.google.apps.tiktok.account.data;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.apps.tiktok.account.data.bd */
/* compiled from: PG */
final class C46185bd extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C46186be f121115a;

    public C46185bd(C46186be beVar) {
        this.f121115a = beVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C47538ax c = this.f121115a.f121121f.mo51613c("MultiProcessAccountDataService BroadcastReceiver");
        try {
            this.f121115a.f121118c.mo50787a(C60866ct.f164955a, "com.google.apps.tiktok.account.data.AllAccounts");
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
