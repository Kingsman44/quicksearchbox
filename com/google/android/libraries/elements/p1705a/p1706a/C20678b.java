package com.google.android.libraries.elements.p1705a.p1706a;

import com.google.android.libraries.elements.interfaces.ClientResourceProxy;
import com.youtube.p5283a.p5284a.C68090l;

/* renamed from: com.google.android.libraries.elements.a.a.b */
/* compiled from: PG */
public final class C20678b extends ClientResourceProxy {

    /* renamed from: a */
    private final C68090l f57961a;

    public C20678b(C68090l lVar) {
        this.f57961a = lVar;
    }

    public final String bundleId() {
        C68090l lVar = this.f57961a;
        int a = lVar.mo16913a(4);
        if (a != 0) {
            return lVar.mo16916d(a + lVar.f24703a);
        }
        return null;
    }

    public final long imageColor() {
        C68090l lVar = this.f57961a;
        int a = lVar.mo16913a(8);
        if (a != 0) {
            return ((long) lVar.f24704b.getInt(a + lVar.f24703a)) & 4294967295L;
        }
        return 0;
    }

    public final String imageName() {
        C68090l lVar = this.f57961a;
        int a = lVar.mo16913a(6);
        if (a != 0) {
            return lVar.mo16916d(a + lVar.f24703a);
        }
        return null;
    }
}
