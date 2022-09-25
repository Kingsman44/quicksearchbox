package com.google.android.apps.gsa.staticplugins.p7930es;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.r */
/* compiled from: PG */
final class C100663r extends BroadcastReceiver {

    /* renamed from: a */
    final SettableFuture f281477a = new SettableFuture();

    /* renamed from: b */
    final /* synthetic */ C100664s f281478b;

    /* renamed from: c */
    private final AtomicInteger f281479c;

    /* renamed from: d */
    private final long f281480d;

    /* renamed from: e */
    private final C100670y f281481e;

    public C100663r(C100664s sVar, int i, long j, C100670y yVar) {
        this.f281478b = sVar;
        this.f281479c = new AtomicInteger(i);
        this.f281480d = j;
        this.f281481e = yVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo91997a(Exception exc) {
        this.f281481e.mo92007c();
        this.f281478b.f281484b.unregisterReceiver(this);
        this.f281478b.mo92002e(this.f281480d, 5);
        this.f281477a.mo57357o(exc);
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (this.f281478b) {
            if ("com.google.android.apps.gsa.staticplugins.xms.SMS_STATUS".equals(intent.getAction())) {
                int resultCode = getResultCode();
                if (resultCode == -1) {
                    int decrementAndGet = this.f281479c.decrementAndGet();
                    this.f281481e.mo92005a();
                    if (decrementAndGet == 0) {
                        this.f281477a.mo57356n(C118826c.f331422a);
                        this.f281481e.mo92007c();
                        this.f281478b.f281484b.unregisterReceiver(this);
                        this.f281478b.mo92002e(this.f281480d, 2);
                    }
                } else if (resultCode == 0) {
                    mo91997a(new C100662q("Failed to send SMS. SMS Cancelled."));
                } else {
                    mo91997a(new C100662q("Failed to send SMS. Unknown error. ResultCode: " + resultCode));
                }
            }
        }
    }
}
