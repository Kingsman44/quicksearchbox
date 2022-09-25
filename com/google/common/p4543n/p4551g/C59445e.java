package com.google.common.p4543n.p4551g;

import com.google.common.p4535g.C59203do;
import java.util.Arrays;

/* renamed from: com.google.common.n.g.e */
/* compiled from: PG */
public class C59445e extends C59447g {
    public C59445e(C59446f fVar, double d) {
        super(fVar, d);
    }

    /* renamed from: a */
    public final double mo56958a() {
        return m92356b(this.f157702b, this.f157703c, C59443c.f157696a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C59445e) && this.f157702b == mo56964c((C59445e) obj);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(mo56958a() + C59203do.f157270a)});
    }

    public final String toString() {
        double a = mo56958a();
        return a + "m";
    }
}
