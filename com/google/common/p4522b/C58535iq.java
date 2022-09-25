package com.google.common.p4522b;

import java.util.Arrays;
import java.util.Comparator;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.iq */
/* compiled from: PG */
public final class C58535iq extends C58490gz {

    /* renamed from: d */
    private transient Object[] f156184d = new Object[4];

    /* renamed from: e */
    private transient Object[] f156185e = new Object[4];

    /* renamed from: f */
    private final Comparator f156186f;

    public C58535iq(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f156186f = comparator;
    }

    /* renamed from: d */
    public final void mo55429h(Object obj, Object obj2) {
        int i = this.f156122b + 1;
        int length = this.f156184d.length;
        if (i > length) {
            int e = C58470gf.m89790e(length, i);
            this.f156184d = Arrays.copyOf(this.f156184d, e);
            this.f156185e = Arrays.copyOf(this.f156185e, e);
        }
        C58371co.m89406a(obj, obj2);
        Object[] objArr = this.f156184d;
        int i2 = this.f156122b;
        objArr[i2] = obj;
        this.f156185e[i2] = obj2;
        this.f156122b = i2 + 1;
    }

    /* renamed from: a */
    public final C58537is mo55363c() {
        int i = this.f156122b;
        if (i == 0) {
            return C58537is.m90050e(this.f156186f);
        }
        if (i != 1) {
            Object[] copyOf = Arrays.copyOf(this.f156184d, i);
            Arrays.sort(copyOf, this.f156186f);
            Object[] objArr = new Object[this.f156122b];
            for (int i2 = 0; i2 < this.f156122b; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.f156186f.compare(copyOf[i3], copyOf[i2]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + copyOf[i3] + " and " + copyOf[i2]);
                    }
                }
                objArr[Arrays.binarySearch(copyOf, Objects.requireNonNull(this.f156184d[i2]), this.f156186f)] = Objects.requireNonNull(this.f156185e[i2]);
            }
            return new C58537is(new C58735qa(C58485gu.m89839g(copyOf), this.f156186f), C58485gu.m89839g(objArr), (C58537is) null);
        }
        return new C58537is(new C58735qa(C58485gu.m89846n(Objects.requireNonNull(this.f156184d[0])), this.f156186f), C58485gu.m89846n(Objects.requireNonNull(this.f156185e[0])), (C58537is) null);
    }
}
