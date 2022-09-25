package com.google.android.libraries.elements.p1705a.p1706a;

import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageTypeProxy;
import com.youtube.p5283a.p5284a.C68051an;
import com.youtube.p5283a.p5284a.C68053ap;

/* renamed from: com.google.android.libraries.elements.a.a.h */
/* compiled from: PG */
public final class C20684h extends ImageTypeProxy {

    /* renamed from: a */
    public final C68053ap f57969a;

    public C20684h(C68053ap apVar) {
        this.f57969a = apVar;
    }

    public final ImageProxy defaultImage() {
        C68051an g = this.f57969a.mo60125g();
        if (g != null) {
            return new C20682f(g);
        }
        return null;
    }

    public final ImageProxy errorImage() {
        C68051an h = this.f57969a.mo60126h();
        if (h != null) {
            return new C20682f(h);
        }
        return null;
    }

    public final ImageProxy image() {
        C68051an i = this.f57969a.mo60127i();
        if (i != null) {
            return new C20682f(i);
        }
        return null;
    }

    public final float preloadWidthHint() {
        C68053ap apVar = this.f57969a;
        int a = apVar.mo16913a(12);
        if (a != 0) {
            return apVar.f24704b.getFloat(a + apVar.f24703a);
        }
        return 0.0f;
    }
}
