package com.google.android.p10717f.p10718a;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Arrays;

/* renamed from: com.google.android.f.a.a */
/* compiled from: PG */
public final class C142624a {

    /* renamed from: a */
    private final String f386954a;

    static {
        new C142624a("@@ContextManagerNullAccount@@");
    }

    public C142624a(String str) {
        C143919bh.m233969l(str);
        this.f386954a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C142624a)) {
            return false;
        }
        return TextUtils.equals(this.f386954a, ((C142624a) obj).f386954a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f386954a});
    }

    public final String toString() {
        return "#account#";
    }
}
