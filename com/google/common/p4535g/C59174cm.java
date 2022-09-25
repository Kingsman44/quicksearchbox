package com.google.common.p4535g;

/* renamed from: com.google.common.g.cm */
/* compiled from: PG */
final class C59174cm extends C59176co {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final C59200dl f157228a;

    /* renamed from: b */
    private final C59200dl f157229b;

    public C59174cm(C59200dl dlVar, C59200dl dlVar2) {
        this.f157228a = dlVar;
        this.f157229b = dlVar2;
    }

    /* renamed from: b */
    public final int mo56551b() {
        return 2;
    }

    /* renamed from: c */
    public final C59200dl mo56552c(int i) {
        if (i == 0) {
            return this.f157228a;
        }
        if (i == 1) {
            return this.f157229b;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
