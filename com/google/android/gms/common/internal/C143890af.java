package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.internal.af */
/* compiled from: PG */
public final class C143890af {

    /* renamed from: a */
    public static final Uri f390073a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: b */
    public final String f390074b;

    /* renamed from: c */
    public final String f390075c;

    /* renamed from: d */
    public final ComponentName f390076d;

    /* renamed from: e */
    public final int f390077e;

    /* renamed from: f */
    public final boolean f390078f;

    public C143890af(ComponentName componentName) {
        this.f390074b = null;
        this.f390075c = null;
        C143919bh.m233958a(componentName);
        this.f390076d = componentName;
        this.f390077e = 4225;
        this.f390078f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C143890af)) {
            return false;
        }
        C143890af afVar = (C143890af) obj;
        return C143912ba.m233950b(this.f390074b, afVar.f390074b) && C143912ba.m233950b(this.f390075c, afVar.f390075c) && C143912ba.m233950b(this.f390076d, afVar.f390076d) && this.f390077e == afVar.f390077e && this.f390078f == afVar.f390078f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f390074b, this.f390075c, this.f390076d, Integer.valueOf(this.f390077e), Boolean.valueOf(this.f390078f)});
    }

    public final String toString() {
        String str = this.f390074b;
        if (str != null) {
            return str;
        }
        C143919bh.m233958a(this.f390076d);
        return this.f390076d.flattenToString();
    }

    public C143890af(String str, String str2, int i, boolean z) {
        C143919bh.m233969l(str);
        this.f390074b = str;
        C143919bh.m233969l(str2);
        this.f390075c = str2;
        this.f390076d = null;
        this.f390077e = i;
        this.f390078f = z;
    }
}
