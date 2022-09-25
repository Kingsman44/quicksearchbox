package androidx.media3.common.p136b;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: androidx.media3.common.b.ad */
/* compiled from: PG */
public final class C2605ad implements C2616d {
    protected C2605ad() {
    }

    /* renamed from: a */
    public final long mo6159a() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final C2626n mo6160b(Looper looper, Handler.Callback callback) {
        return new C2607af(new Handler(looper, callback));
    }
}
