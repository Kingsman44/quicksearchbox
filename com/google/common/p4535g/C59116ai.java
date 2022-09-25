package com.google.common.p4535g;

/* renamed from: com.google.common.g.ai */
/* compiled from: PG */
final class C59116ai implements Comparable {

    /* renamed from: a */
    int f157102a = 0;

    /* renamed from: b */
    final C59200dl f157103b;

    public C59116ai(C59200dl dlVar) {
        this.f157103b = dlVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo56430a() {
        return this.f157103b.mo56558e(this.f157102a);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int a = mo56430a();
        int a2 = ((C59116ai) obj).mo56430a();
        if (a == a2) {
            return 0;
        }
        return a >= a2 ? 1 : -1;
    }
}
