package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.analytics.internal.at */
/* compiled from: PG */
final class C142723at extends BroadcastReceiver {

    /* renamed from: a */
    static final String f387300a = "com.google.android.gms.analytics.internal.at";

    /* renamed from: b */
    public final C142740j f387301b;

    /* renamed from: c */
    public boolean f387302c;

    /* renamed from: d */
    public boolean f387303d;

    public C142723at(C142740j jVar) {
        this.f387301b = jVar;
    }

    /* renamed from: a */
    public final void mo117512a() {
        if (this.f387302c) {
            this.f387301b.mo117548h().mo117536i(2, "Unregistering connectivity change receiver", (Object) null, (Object) null, (Object) null);
            this.f387302c = false;
            this.f387303d = false;
            try {
                this.f387301b.f387334b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f387301b.mo117548h().mo117536i(6, "Failed to unregister the network broadcast receiver", e, (Object) null, (Object) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo117513b() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f387301b.f387334b.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (SecurityException unused) {
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f387301b.mo117548h();
        this.f387301b.mo117544d();
        String action = intent.getAction();
        this.f387301b.mo117548h().mo117536i(2, "NetworkBroadcastReceiver received action", action, (Object) null, (Object) null);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean b = mo117513b();
            if (this.f387303d != b) {
                this.f387303d = b;
                this.f387301b.mo117544d().mo117532d(b);
            }
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.f387301b.mo117548h().mo117536i(5, "NetworkBroadcastReceiver received unknown action", action, (Object) null, (Object) null);
        } else if (!intent.hasExtra(f387300a)) {
            this.f387301b.mo117544d().mo117534f();
        }
    }
}
