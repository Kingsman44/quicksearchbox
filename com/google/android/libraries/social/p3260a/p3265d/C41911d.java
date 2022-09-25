package com.google.android.libraries.social.p3260a.p3265d;

import java.io.Serializable;
import java.util.Locale;

/* renamed from: com.google.android.libraries.social.a.d.d */
/* compiled from: PG */
public final class C41911d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final int f109315a;

    public C41911d(int i) {
        this.f109315a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C41911d) && this.f109315a == ((C41911d) obj).f109315a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f109315a + 527;
    }

    public final String toString() {
        return String.format(Locale.US, "VisualElementTag {id: %d, isRootPage: %b}", new Object[]{Integer.valueOf(this.f109315a), false});
    }
}
