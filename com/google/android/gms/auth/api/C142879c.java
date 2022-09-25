package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.common.api.C143721f;
import com.google.android.gms.common.api.C143723h;
import com.google.android.gms.common.internal.C143912ba;
import java.util.Arrays;

/* renamed from: com.google.android.gms.auth.api.c */
/* compiled from: PG */
public final class C142879c implements C143721f, C143723h {

    /* renamed from: a */
    public final Bundle f387678a;

    static {
        new Bundle();
    }

    public C142879c(Bundle bundle) {
        this.f387678a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C142879c)) {
            return false;
        }
        return C143912ba.m233949a(this.f387678a, ((C142879c) obj).f387678a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f387678a});
    }
}
