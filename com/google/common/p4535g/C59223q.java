package com.google.common.p4535g;

import com.google.common.base.C58832aw;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.common.g.q */
/* compiled from: PG */
public final class C59223q implements Serializable {

    /* renamed from: a */
    public final double f157317a;

    /* renamed from: b */
    private final C59136bb f157318b = null;

    public C59223q(double d) {
        this.f157317a = d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59223q) {
            C59223q qVar = (C59223q) obj;
            if (this.f157317a == qVar.f157317a) {
                C59136bb bbVar = qVar.f157318b;
                if (C58832aw.m90831a((Object) null, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f157317a), null});
    }
}
