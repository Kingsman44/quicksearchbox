package androidx.core.p098j;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import p3186j$.util.Objects;

/* renamed from: androidx.core.j.cj */
/* compiled from: PG */
class C2076cj extends C2075ci {
    public C2076cj(C2082cp cpVar, WindowInsets windowInsets) {
        super(cpVar, windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2076cj)) {
            return false;
        }
        C2076cj cjVar = (C2076cj) obj;
        return Objects.equals(this.f5981a, cjVar.f5981a) && Objects.equals(this.f5982b, cjVar.f5982b);
    }

    public int hashCode() {
        return this.f5981a.hashCode();
    }

    /* renamed from: q */
    public C2098m mo5234q() {
        DisplayCutout displayCutout = this.f5981a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C2098m(displayCutout);
    }

    /* renamed from: r */
    public C2082cp mo5235r() {
        return C2082cp.m5717h(this.f5981a.consumeDisplayCutout(), (View) null);
    }
}
