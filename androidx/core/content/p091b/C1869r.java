package androidx.core.content.p091b;

import android.content.res.Resources;
import androidx.core.p097i.C1968c;

/* renamed from: androidx.core.content.b.r */
/* compiled from: PG */
final class C1869r {

    /* renamed from: a */
    final Resources f5748a;

    /* renamed from: b */
    final Resources.Theme f5749b;

    public C1869r(Resources resources, Resources.Theme theme) {
        this.f5748a = resources;
        this.f5749b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1869r rVar = (C1869r) obj;
            return this.f5748a.equals(rVar.f5748a) && C1968c.m5305b(this.f5749b, rVar.f5749b);
        }
    }

    public final int hashCode() {
        return C1968c.m5304a(this.f5748a, this.f5749b);
    }
}
