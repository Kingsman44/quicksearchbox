package com.google.ads.interactivemedia.p367v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ace */
/* compiled from: PG */
final class ace extends BroadcastReceiver {

    /* renamed from: a */
    private static ace f20259a;

    /* renamed from: b */
    private final Handler f20260b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final ArrayList f20261c = new ArrayList();

    private ace() {
    }

    /* renamed from: a */
    public static synchronized ace m18207a(Context context) {
        ace ace;
        synchronized (ace.class) {
            if (f20259a == null) {
                f20259a = new ace();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(f20259a, intentFilter);
            }
            ace = f20259a;
        }
        return ace;
    }

    /* renamed from: c */
    private final void m18208c() {
        int size = this.f20261c.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (((acf) ((WeakReference) this.f20261c.get(size)).get()) == null) {
                this.f20261c.remove(size);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo14444b(acf acf) {
        m18208c();
        this.f20261c.add(new WeakReference(acf));
        this.f20260b.post(new acd(this, acf));
    }

    public final synchronized void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            m18208c();
            for (int i = 0; i < this.f20261c.size(); i++) {
                acf acf = (acf) ((WeakReference) this.f20261c.get(i)).get();
                if (acf != null) {
                    acf.m18212k();
                }
            }
        }
    }
}
