package com.google.android.apps.gsa.search.core;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.apps.gsa.search.core.s */
/* compiled from: PG */
public final class C86581s extends Handler {

    /* renamed from: a */
    final /* synthetic */ C87172t f233905a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86581s(C87172t tVar) {
        super(Looper.getMainLooper());
        this.f233905a = tVar;
    }

    public final void handleMessage(Message message) {
        PendingIntent pendingIntent = this.f233905a.f235572a;
        if (pendingIntent != null) {
            pendingIntent.cancel();
        }
    }
}
