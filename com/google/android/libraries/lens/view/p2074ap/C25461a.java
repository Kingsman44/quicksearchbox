package com.google.android.libraries.lens.view.p2074ap;

/* renamed from: com.google.android.libraries.lens.view.ap.a */
/* compiled from: PG */
final class C25461a extends C25463c {

    /* renamed from: a */
    private int f69396a;

    /* renamed from: b */
    private byte f69397b;

    /* renamed from: a */
    public final C25464d mo30497a() {
        if (this.f69397b == 1) {
            return new C25462b(this.f69396a);
        }
        throw new IllegalStateException("Missing required properties: topOffset");
    }

    /* renamed from: b */
    public final void mo30498b(int i) {
        this.f69396a = i;
        this.f69397b = 1;
    }
}
