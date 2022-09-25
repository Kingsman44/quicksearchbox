package androidx.core.p098j;

import android.view.DisplayCutout;
import androidx.core.p097i.C1968c;

/* renamed from: androidx.core.j.m */
/* compiled from: PG */
public final class C2098m {

    /* renamed from: a */
    public final DisplayCutout f6013a;

    public C2098m(DisplayCutout displayCutout) {
        this.f6013a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C1968c.m5305b(this.f6013a, ((C2098m) obj).f6013a);
    }

    public final int hashCode() {
        return this.f6013a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f6013a + "}";
    }
}
