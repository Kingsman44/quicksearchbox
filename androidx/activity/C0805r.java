package androidx.activity;

import androidx.core.p094f.C1888a;

/* renamed from: androidx.activity.r */
/* compiled from: PG */
final class C0805r implements C0786a {

    /* renamed from: a */
    final /* synthetic */ OnBackPressedDispatcher f2753a;

    /* renamed from: b */
    private final C0800m f2754b;

    public C0805r(OnBackPressedDispatcher onBackPressedDispatcher, C0800m mVar) {
        this.f2753a = onBackPressedDispatcher;
        this.f2754b = mVar;
    }

    /* renamed from: b */
    public final void mo3342b() {
        this.f2753a.f2719a.remove(this.f2754b);
        this.f2754b.f2748c.remove(this);
        if (C1888a.m5150d()) {
            this.f2754b.f2749d = null;
            this.f2753a.mo3341d();
        }
    }
}
