package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.a.a */
/* compiled from: PG */
final class C26840a extends C26843d {

    /* renamed from: a */
    private int f73138a;

    /* renamed from: b */
    private int f73139b;

    /* renamed from: c */
    private int f73140c;

    /* renamed from: d */
    private byte f73141d;

    /* renamed from: a */
    public final int mo32205a() {
        if ((this.f73141d & 1) != 0) {
            return this.f73138a;
        }
        throw new IllegalStateException("Property \"framebuffer\" has not been set");
    }

    /* renamed from: b */
    public final int mo32206b() {
        if ((this.f73141d & 4) != 0) {
            return this.f73140c;
        }
        throw new IllegalStateException("Property \"texture\" has not been set");
    }

    /* renamed from: c */
    public final C26844e mo32207c() {
        if (this.f73141d == 7) {
            return new C26841b(this.f73138a, this.f73139b, this.f73140c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f73141d & 1) == 0) {
            sb.append(" framebuffer");
        }
        if ((this.f73141d & 2) == 0) {
            sb.append(" pbo");
        }
        if ((this.f73141d & 4) == 0) {
            sb.append(" texture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final void mo32208d(int i) {
        this.f73138a = i;
        this.f73141d = (byte) (this.f73141d | 1);
    }

    /* renamed from: e */
    public final void mo32209e(int i) {
        this.f73139b = i;
        this.f73141d = (byte) (this.f73141d | 2);
    }

    /* renamed from: f */
    public final void mo32210f(int i) {
        this.f73140c = i;
        this.f73141d = (byte) (this.f73141d | 4);
    }
}
