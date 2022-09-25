package androidx.media;

import android.text.TextUtils;

/* renamed from: androidx.media.ao */
/* compiled from: PG */
public final class C2417ao {

    /* renamed from: a */
    C2419aq f6691a;

    public C2417ao(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(str)) {
            this.f6691a = new C2418ap(str, i, i2);
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2417ao)) {
            return false;
        }
        return this.f6691a.equals(((C2417ao) obj).f6691a);
    }

    public final int hashCode() {
        return this.f6691a.hashCode();
    }
}
