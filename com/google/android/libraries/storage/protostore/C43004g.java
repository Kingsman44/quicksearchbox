package com.google.android.libraries.storage.protostore;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.libraries.storage.protostore.g */
/* compiled from: PG */
final class C43004g extends BroadcastReceiver {

    /* renamed from: a */
    private final Runnable f112461a;

    /* renamed from: b */
    private final String f112462b;

    public C43004g(Runnable runnable, String str) {
        this.f112461a = runnable;
        this.f112462b = str;
    }

    public final void onReceive(Context context, Intent intent) {
        String str = this.f112462b;
        if (str == null || !str.equals(intent.getStringExtra("sender_id"))) {
            ((C42945cm) this.f112461a).f112340a.mo46026h();
        }
    }
}
