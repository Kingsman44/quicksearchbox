package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.iz */
/* compiled from: PG */
final class C58544iz implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object[] f156198a;

    /* renamed from: b */
    private final Object[] f156199b;

    /* renamed from: c */
    private final Object[] f156200c;

    /* renamed from: d */
    private final int[] f156201d;

    /* renamed from: e */
    private final int[] f156202e;

    private C58544iz(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
        this.f156198a = objArr;
        this.f156199b = objArr2;
        this.f156200c = objArr3;
        this.f156201d = iArr;
        this.f156202e = iArr2;
    }

    /* renamed from: a */
    static C58544iz m90086a(C58546ja jaVar, int[] iArr, int[] iArr2) {
        return new C58544iz(jaVar.mo55198p().keySet().toArray(C58471gg.f156097c), jaVar.mo55197o().keySet().toArray(C58471gg.f156097c), jaVar.mo55542u().toArray(C58471gg.f156097c), iArr, iArr2);
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        Object[] objArr = this.f156200c;
        int length = objArr.length;
        if (length == 0) {
            return C58769rh.f156540a;
        }
        int i = 0;
        if (length == 1) {
            return new C58760qz(this.f156198a[0], this.f156199b[0], objArr[0]);
        }
        C58480gp gpVar = new C58480gp(length);
        while (true) {
            Object[] objArr2 = this.f156200c;
            if (i >= objArr2.length) {
                return C58738qd.m90600y(gpVar.mo55394f(), C58528ij.m90008H(this.f156198a), C58528ij.m90008H(this.f156199b));
            }
            gpVar.mo55395g(C58546ja.m90096x(this.f156198a[this.f156201d[i]], this.f156199b[this.f156202e[i]], objArr2[i]));
            i++;
        }
    }
}
