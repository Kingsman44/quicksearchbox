package com.google.p5238v.p5239a.p5259m;

import java.util.Arrays;

/* renamed from: com.google.v.a.m.y */
/* compiled from: PG */
class C67895y {

    /* renamed from: a */
    final long[] f184070a;

    /* renamed from: b */
    final long[] f184071b;

    /* renamed from: c */
    final long[] f184072c;

    C67895y() {
        this(new long[10], new long[10], new long[10]);
    }

    public C67895y(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f184070a = jArr;
        this.f184071b = jArr2;
        this.f184072c = jArr3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60029a(C67895y yVar, int i) {
        C67888r.m98140a(this.f184070a, yVar.f184070a, i);
        C67888r.m98140a(this.f184071b, yVar.f184071b, i);
        C67888r.m98140a(this.f184072c, yVar.f184072c, i);
    }

    /* renamed from: b */
    public void mo60030b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public C67895y(C67895y yVar) {
        this.f184070a = Arrays.copyOf(yVar.f184070a, 10);
        this.f184071b = Arrays.copyOf(yVar.f184071b, 10);
        this.f184072c = Arrays.copyOf(yVar.f184072c, 10);
    }
}
