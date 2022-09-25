package androidx.p197u;

import android.view.View;
import android.view.WindowId;

/* renamed from: androidx.u.ba */
/* compiled from: PG */
final class C4217ba {

    /* renamed from: a */
    private final WindowId f13652a;

    public C4217ba(View view) {
        this.f13652a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4217ba) && ((C4217ba) obj).f13652a.equals(this.f13652a);
    }

    public final int hashCode() {
        return this.f13652a.hashCode();
    }
}
