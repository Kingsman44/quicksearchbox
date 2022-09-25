package com.google.android.libraries.logging.p2185ve;

import com.google.common.base.C58838bb;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.logging.ve.e */
/* compiled from: PG */
public final class C28353e {

    /* renamed from: a */
    public final C62917ay f77079a;

    /* renamed from: b */
    public final Object f77080b;

    public C28353e(C62917ay ayVar, Object obj) {
        int i = ((C62940bt) ayVar).f169971d.f169964b;
        boolean z = false;
        if (i >= 200000000 && i < 300000000) {
            z = true;
        }
        C58838bb.m90868c(z);
        this.f77079a = ayVar;
        this.f77080b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C28353e) {
            C28353e eVar = (C28353e) obj;
            if (!this.f77079a.equals(eVar.f77079a) || !this.f77080b.equals(eVar.f77080b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f77079a, this.f77080b);
    }
}
