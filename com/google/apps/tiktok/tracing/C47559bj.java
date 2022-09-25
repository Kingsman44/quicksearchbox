package com.google.apps.tiktok.tracing;

/* renamed from: com.google.apps.tiktok.tracing.bj */
/* compiled from: PG */
public final class C47559bj {

    /* renamed from: a */
    private static final C47559bj f123421a = new C47559bj(3, (Object) null, true);

    /* renamed from: b */
    private static final C47559bj f123422b = new C47559bj(2, (Object) null, true);

    /* renamed from: c */
    private final Object f123423c;

    /* renamed from: d */
    private boolean f123424d;

    /* renamed from: e */
    private final int f123425e;

    public C47559bj(int i, Object obj, boolean z) {
        this.f123425e = i;
        this.f123423c = obj;
        this.f123424d = z;
    }

    /* renamed from: d */
    static C47559bj m84647d(int i) {
        return i + -1 != 2 ? f123422b : f123421a;
    }

    /* renamed from: a */
    public final Object mo51419a() {
        if (this.f123424d && this.f123425e == 1) {
            return this.f123423c;
        }
        throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
    }

    /* renamed from: b */
    public final boolean mo51420b() {
        this.f123424d = true;
        return this.f123425e == 1;
    }

    /* renamed from: c */
    public final int mo51421c() {
        this.f123424d = true;
        return this.f123425e;
    }
}
