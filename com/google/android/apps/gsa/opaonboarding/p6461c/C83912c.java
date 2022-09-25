package com.google.android.apps.gsa.opaonboarding.p6461c;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.opaonboarding.C83906bl;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.opaonboarding.c.c */
/* compiled from: PG */
public final class C83912c {

    /* renamed from: a */
    private final Handler f228538a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private BroadcastReceiver f228539b;

    /* renamed from: c */
    private Runnable f228540c;

    /* renamed from: a */
    public final void mo77327a(C69464a aVar, C83906bl blVar) {
        C83910a aVar2 = new C83910a(aVar, blVar);
        if (this.f228540c == null) {
            this.f228540c = C83395k.m132735f((Context) aVar.mo17428b(), this.f228538a, aVar2);
        }
        if (this.f228539b == null) {
            this.f228539b = new C83911b(aVar2);
            ((Activity) aVar.mo17428b()).registerReceiver(this.f228539b, new IntentFilter("com.google.android.apps.gsa.notificationlistener.NOTIFICATION_LISTENER_SERVICE_CONNECTED"));
        }
    }

    /* renamed from: b */
    public final void mo77328b(C69464a aVar) {
        Runnable runnable = this.f228540c;
        if (runnable != null) {
            this.f228538a.removeCallbacks(runnable);
            this.f228540c = null;
        }
        if (this.f228539b != null) {
            try {
                ((Activity) aVar.mo17428b()).unregisterReceiver(this.f228539b);
            } catch (IllegalArgumentException unused) {
            }
            this.f228539b = null;
        }
    }
}
