package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.px */
/* compiled from: PG */
final class C58731px implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object[] f156490a;

    /* renamed from: b */
    final int[] f156491b;

    public C58731px(C58692ol olVar) {
        C58517hz hzVar = (C58517hz) olVar;
        int size = hzVar.mo54975m().size();
        this.f156490a = new Object[size];
        this.f156491b = new int[size];
        int i = 0;
        for (C58691ok okVar : hzVar.mo54975m()) {
            this.f156490a[i] = okVar.mo55768b();
            this.f156491b[i] = okVar.mo55767a();
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        C58514hw hwVar = new C58514hw(this.f156490a.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.f156490a;
            if (i >= objArr.length) {
                return hwVar.mo55467a();
            }
            hwVar.mo55469f(objArr[i], this.f156491b[i]);
            i++;
        }
    }
}
