package android.support.p033v7.app;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: android.support.v7.app.al */
/* compiled from: PG */
abstract class C0351al {

    /* renamed from: a */
    private BroadcastReceiver f1150a;

    /* renamed from: c */
    final /* synthetic */ C0356aq f1151c;

    public C0351al(C0356aq aqVar) {
        this.f1151c = aqVar;
    }

    /* renamed from: a */
    public abstract IntentFilter mo1140a();

    /* renamed from: b */
    public abstract void mo1141b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo1143c() {
        BroadcastReceiver broadcastReceiver = this.f1150a;
        if (broadcastReceiver != null) {
            try {
                this.f1151c.f1212l.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.f1150a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo1144d() {
        mo1143c();
        IntentFilter a = mo1140a();
        if (a != null && a.countActions() != 0) {
            if (this.f1150a == null) {
                this.f1150a = new C0350ak(this);
            }
            this.f1151c.f1212l.registerReceiver(this.f1150a, a);
        }
    }
}
