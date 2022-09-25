package android.support.p031v4.p032os;

import android.os.Bundle;

/* renamed from: android.support.v4.os.f */
/* compiled from: PG */
final class C0337f implements Runnable {

    /* renamed from: a */
    final int f1059a;

    /* renamed from: b */
    final Bundle f1060b;

    /* renamed from: c */
    final /* synthetic */ ResultReceiver f1061c;

    public C0337f(ResultReceiver resultReceiver, int i, Bundle bundle) {
        this.f1061c = resultReceiver;
        this.f1059a = i;
        this.f1060b = bundle;
    }

    public final void run() {
        this.f1061c.mo806a(this.f1059a, this.f1060b);
    }
}
