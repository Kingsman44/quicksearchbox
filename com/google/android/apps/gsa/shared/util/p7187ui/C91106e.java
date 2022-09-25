package com.google.android.apps.gsa.shared.util.p7187ui;

import com.google.common.p4535g.C59203do;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.e */
/* compiled from: PG */
final class C91106e {

    /* renamed from: a */
    final double f254403a;

    /* renamed from: b */
    final double f254404b;

    public C91106e(double d, double d2) {
        this.f254403a = d;
        this.f254404b = d2;
    }

    /* renamed from: b */
    public static double m148856b(double d, double d2, double d3) {
        double min = Math.min(1.0d, Math.max(C59203do.f157270a, d));
        double d4 = 1.0d - min;
        return (d4 * d4 * 3.0d * (C59203do.f157270a + d2)) + (d4 * 6.0d * min * (d3 - d2)) + (min * min * 3.0d * (1.0d - d3));
    }

    /* renamed from: a */
    public final double mo85373a(double d) {
        double d2 = this.f254403a;
        double d3 = this.f254404b;
        if (d > 1.0d) {
            return (m148856b(1.0d, d2, d3) * (d - 4.0d)) + 1.0d;
        }
        if (d < C59203do.f157270a) {
            return (m148856b(C59203do.f157270a, d2, d3) * d) + C59203do.f157270a;
        }
        double d4 = 1.0d - d;
        double d5 = d4 * d4;
        double d6 = d * d;
        return (d5 * d4 * C59203do.f157270a) + (d5 * 3.0d * d * d2) + (d4 * 3.0d * d6 * d3) + (d6 * d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C91106e) {
            C91106e eVar = (C91106e) obj;
            return this.f254403a == eVar.f254403a && this.f254404b == eVar.f254404b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(C59203do.f157270a), Double.valueOf(this.f254403a), Double.valueOf(this.f254404b), Double.valueOf(1.0d)});
    }
}
