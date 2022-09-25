package com.google.android.gms.cast;

import android.os.Bundle;
import com.google.android.gms.common.api.C143721f;
import com.google.android.gms.common.internal.C143912ba;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.google.android.gms.cast.g */
/* compiled from: PG */
public final class C143556g implements C143721f {

    /* renamed from: a */
    final CastDevice f389245a;

    /* renamed from: b */
    final C143557h f389246b;

    /* renamed from: c */
    final Bundle f389247c;

    /* renamed from: d */
    final int f389248d = 0;

    /* renamed from: e */
    final String f389249e;

    public C143556g(C143379f fVar) {
        this.f389245a = fVar.f388826a;
        this.f389246b = fVar.f388827b;
        this.f389247c = fVar.f388828c;
        this.f389249e = UUID.randomUUID().toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C143556g)) {
            return false;
        }
        C143556g gVar = (C143556g) obj;
        if (C143912ba.m233950b(this.f389245a, gVar.f389245a) && C143912ba.m233949a(this.f389247c, gVar.f389247c)) {
            int i = gVar.f389248d;
            if (C143912ba.m233950b(this.f389249e, gVar.f389249e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f389245a, this.f389247c, 0, this.f389249e});
    }
}
