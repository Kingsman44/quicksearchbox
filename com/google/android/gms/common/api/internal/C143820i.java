package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.internal.C143912ba;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* compiled from: PG */
public final class C143820i {

    /* renamed from: a */
    public final C143841m f389876a;

    /* renamed from: b */
    private final int f389877b;

    /* renamed from: c */
    private final C143724i f389878c;

    /* renamed from: d */
    private final String f389879d;

    public C143820i(C143841m mVar, C143724i iVar, String str) {
        this.f389876a = mVar;
        this.f389878c = iVar;
        this.f389879d = str;
        this.f389877b = Arrays.hashCode(new Object[]{mVar, iVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C143820i)) {
            return false;
        }
        C143820i iVar = (C143820i) obj;
        return C143912ba.m233950b(this.f389876a, iVar.f389876a) && C143912ba.m233950b(this.f389878c, iVar.f389878c) && C143912ba.m233950b(this.f389879d, iVar.f389879d);
    }

    public final int hashCode() {
        return this.f389877b;
    }
}
