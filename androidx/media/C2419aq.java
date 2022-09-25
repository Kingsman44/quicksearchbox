package androidx.media;

import android.text.TextUtils;
import androidx.core.p097i.C1968c;

/* renamed from: androidx.media.aq */
/* compiled from: PG */
class C2419aq {

    /* renamed from: a */
    private final String f6692a;

    /* renamed from: b */
    private final int f6693b;

    /* renamed from: c */
    private final int f6694c;

    public C2419aq(String str, int i, int i2) {
        this.f6692a = str;
        this.f6693b = i;
        this.f6694c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2419aq)) {
            return false;
        }
        C2419aq aqVar = (C2419aq) obj;
        return (this.f6693b < 0 || aqVar.f6693b < 0) ? TextUtils.equals(this.f6692a, aqVar.f6692a) && this.f6694c == aqVar.f6694c : TextUtils.equals(this.f6692a, aqVar.f6692a) && this.f6693b == aqVar.f6693b && this.f6694c == aqVar.f6694c;
    }

    public final int hashCode() {
        return C1968c.m5304a(this.f6692a, Integer.valueOf(this.f6694c));
    }
}
