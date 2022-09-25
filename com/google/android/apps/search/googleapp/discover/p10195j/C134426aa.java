package com.google.android.apps.search.googleapp.discover.p10195j;

import com.google.android.libraries.elements.interfaces.C21266bi;
import com.google.apps.tiktok.tracing.contrib.p3716l.C47749b;
import java.util.LinkedHashSet;
import java.util.Set;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.aa */
/* compiled from: PG */
public final class C134426aa implements C21266bi {

    /* renamed from: a */
    public final Set f366140a = new LinkedHashSet();

    /* renamed from: b */
    private final C47749b f366141b;

    public C134426aa(C47749b bVar) {
        C69664n.m101061g(bVar, "tikTokXUiKitTracer");
        this.f366141b = bVar;
    }

    /* renamed from: a */
    public final void mo26752a(int i) {
        for (C21266bi uVar : C69540x.m100846ab(this.f366140a)) {
            this.f366141b.mo42465b(new C134449u(uVar, i), "ElementsImageLoadingTracker", "onImageError");
        }
    }

    /* renamed from: b */
    public final void mo26753b(int i) {
        for (C21266bi vVar : C69540x.m100846ab(this.f366140a)) {
            this.f366141b.mo42465b(new C134450v(vVar, i), "ElementsImageLoadingTracker", "onImageInvisible");
        }
    }

    /* renamed from: c */
    public final void mo26754c(int i) {
        for (C21266bi wVar : C69540x.m100846ab(this.f366140a)) {
            this.f366141b.mo42465b(new C134451w(wVar, i), "ElementsImageLoadingTracker", "onImageLoadCleared");
        }
    }

    /* renamed from: d */
    public final void mo26755d(int i) {
        for (C21266bi xVar : C69540x.m100846ab(this.f366140a)) {
            this.f366141b.mo42465b(new C134452x(xVar, i), "ElementsImageLoadingTracker", "onImageLoadStarted");
        }
    }

    /* renamed from: e */
    public final void mo26756e(int i) {
        for (C21266bi yVar : C69540x.m100846ab(this.f366140a)) {
            this.f366141b.mo42465b(new C134453y(yVar, i), "ElementsImageLoadingTracker", "onImageLoaded");
        }
    }

    /* renamed from: f */
    public final void mo26757f(int i) {
        for (C21266bi zVar : C69540x.m100846ab(this.f366140a)) {
            this.f366141b.mo42465b(new C134454z(zVar, i), "ElementsImageLoadingTracker", "onImageVisible");
        }
    }
}
