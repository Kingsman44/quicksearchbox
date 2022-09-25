package androidx.p128m.p129a;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: androidx.m.a.c */
/* compiled from: PG */
final class C2398c {

    /* renamed from: a */
    final IntentFilter f6622a;

    /* renamed from: b */
    final BroadcastReceiver f6623b;

    /* renamed from: c */
    boolean f6624c;

    /* renamed from: d */
    boolean f6625d;

    public C2398c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f6622a = intentFilter;
        this.f6623b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f6623b);
        sb.append(" filter=");
        sb.append(this.f6622a);
        if (this.f6625d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
