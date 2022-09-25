package androidx.media3.exoplayer.p142e;

import android.text.TextUtils;

/* renamed from: androidx.media3.exoplayer.e.ab */
/* compiled from: PG */
final class C2966ab {

    /* renamed from: a */
    public final String f8522a;

    /* renamed from: b */
    public final boolean f8523b;

    /* renamed from: c */
    public final boolean f8524c;

    public C2966ab(String str, boolean z, boolean z2) {
        this.f8522a = str;
        this.f8523b = z;
        this.f8524c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C2966ab.class) {
            C2966ab abVar = (C2966ab) obj;
            return TextUtils.equals(this.f8522a, abVar.f8522a) && this.f8523b == abVar.f8523b && this.f8524c == abVar.f8524c;
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f8522a.hashCode() + 31) * 31) + (true != this.f8523b ? 1237 : 1231)) * 31;
        if (true == this.f8524c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
