package androidx.camera.camera2.p063b.p064a.p065a;

import android.os.Build;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.b.a.a.d */
/* compiled from: PG */
public final class C0999d {

    /* renamed from: a */
    public final C1006k f3147a;

    public C0999d(int i, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f3147a = new C1005j(i, surface);
        } else {
            this.f3147a = new C1004i(i, surface);
        }
    }

    public C0999d(C1006k kVar) {
        this.f3147a = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0999d)) {
            return false;
        }
        return this.f3147a.equals(((C0999d) obj).f3147a);
    }

    public final int hashCode() {
        return this.f3147a.hashCode();
    }
}
