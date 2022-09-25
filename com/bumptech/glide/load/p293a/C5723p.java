package com.bumptech.glide.load.p293a;

/* renamed from: com.bumptech.glide.load.a.p */
/* compiled from: PG */
final class C5723p {

    /* renamed from: a */
    private boolean f17243a;

    /* renamed from: b */
    private boolean f17244b;

    /* renamed from: c */
    private boolean f17245c;

    /* renamed from: e */
    private final boolean m14814e() {
        return (this.f17245c || this.f17244b) && this.f17243a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo12233a() {
        this.f17244b = false;
        this.f17243a = false;
        this.f17245c = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized boolean mo12234b() {
        this.f17244b = true;
        return m14814e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo12235c() {
        this.f17245c = true;
        return m14814e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized boolean mo12236d() {
        this.f17243a = true;
        return m14814e();
    }
}
