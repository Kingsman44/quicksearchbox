package com.google.common.p4535g;

import java.math.BigDecimal;
import java.util.Arrays;

/* renamed from: com.google.common.g.a */
/* compiled from: PG */
final class C59107a implements Comparable {

    /* renamed from: a */
    final BigDecimal f157079a;

    /* renamed from: b */
    final BigDecimal f157080b;

    /* renamed from: c */
    final BigDecimal f157081c;

    public C59107a(C59136bb bbVar) {
        this(new BigDecimal(bbVar.f157162e), new BigDecimal(bbVar.f157163f), new BigDecimal(bbVar.f157164g));
    }

    public C59107a(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.f157079a = bigDecimal;
        this.f157080b = bigDecimal2;
        this.f157081c = bigDecimal3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C59107a mo56408a(C59107a aVar) {
        return new C59107a(this.f157080b.multiply(aVar.f157081c).subtract(this.f157081c.multiply(aVar.f157080b)), this.f157081c.multiply(aVar.f157079a).subtract(this.f157079a.multiply(aVar.f157081c)), this.f157079a.multiply(aVar.f157080b).subtract(this.f157080b.multiply(aVar.f157079a)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C59136bb mo56409b() {
        return new C59136bb(this.f157079a.doubleValue(), this.f157080b.doubleValue(), this.f157081c.doubleValue());
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C59107a aVar = (C59107a) obj;
        int compareTo = this.f157079a.compareTo(aVar.f157079a);
        if (compareTo == 0 && (compareTo = this.f157080b.compareTo(aVar.f157080b)) == 0) {
            return this.f157081c.compareTo(aVar.f157081c);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59107a)) {
            return false;
        }
        C59107a aVar = (C59107a) obj;
        if (!this.f157079a.equals(aVar.f157079a) || !this.f157080b.equals(aVar.f157080b) || !this.f157081c.equals(aVar.f157081c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f157079a, this.f157080b, this.f157081c});
    }
}
