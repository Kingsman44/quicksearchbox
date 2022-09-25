package com.google.android.gms.search;

import com.google.android.gms.common.api.C143721f;
import com.google.android.gms.common.api.C143723h;
import com.google.android.gms.common.internal.C143912ba;
import java.util.Arrays;

/* renamed from: com.google.android.gms.search.i */
/* compiled from: PG */
public final class C145915i implements C143721f, C143723h {

    /* renamed from: a */
    public final String f394479a;

    public C145915i(C145914h hVar) {
        this.f394479a = hVar.f394478a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C145915i) {
            return C143912ba.m233950b(this.f394479a, ((C145915i) obj).f394479a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394479a});
    }
}
