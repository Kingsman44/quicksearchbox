package androidx.camera.camera2.p063b;

import android.os.SystemClock;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;

/* renamed from: androidx.camera.camera2.b.ai */
/* compiled from: PG */
final class C1086ai {

    /* renamed from: a */
    public long f3230a = -1;

    /* renamed from: b */
    final /* synthetic */ C1089al f3231b;

    public C1086ai(C1089al alVar) {
        this.f3231b = alVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3799a() {
        if (!this.f3231b.mo3806c()) {
            return 700;
        }
        long c = mo3801c();
        if (c <= 120000) {
            return 1000;
        }
        if (c <= 300000) {
            return SimpleSnackbar.LENGTH_SHORT;
        }
        return 4000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo3800b() {
        return !this.f3231b.mo3806c() ? 10000 : 1800000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo3801c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f3230a;
        if (j == -1) {
            this.f3230a = uptimeMillis;
            j = uptimeMillis;
        }
        return uptimeMillis - j;
    }
}
