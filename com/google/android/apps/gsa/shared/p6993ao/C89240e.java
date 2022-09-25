package com.google.android.apps.gsa.shared.p6993ao;

import android.view.View;
import com.google.android.apps.gsa.search.shared.overlay.C87661j;
import com.google.android.apps.gsa.search.shared.overlay.OverlaySearchPlateContainer;
import com.google.android.apps.gsa.searchplate.C88906ah;
import com.google.android.apps.gsa.searchplate.C88951n;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.shared.ao.e */
/* compiled from: PG */
public final class C89240e {

    /* renamed from: a */
    public final C87661j f241976a;

    /* renamed from: b */
    public final View f241977b;

    /* renamed from: c */
    public final C89236a f241978c;

    /* renamed from: d */
    public final C88906ah f241979d;

    /* renamed from: e */
    public final C88951n f241980e;

    /* renamed from: f */
    private float f241981f;

    /* renamed from: g */
    private boolean f241982g;

    public C89240e(C87661j jVar, C89236a aVar, C88906ah ahVar, C88951n nVar) {
        this.f241976a = jVar;
        this.f241979d = ahVar;
        this.f241978c = aVar;
        this.f241980e = nVar;
        this.f241977b = jVar.mo81812h();
    }

    /* renamed from: b */
    static /* synthetic */ void m145156b(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public final void mo83191a(float f, boolean z, boolean z2, Runnable runnable) {
        if (!z || Math.abs(this.f241977b.getTranslationY() - f) <= 0.001f) {
            this.f241977b.setTranslationY(f);
            if (runnable != null) {
                runnable.run();
            }
        } else {
            C89236a aVar = this.f241978c;
            aVar.f241970a.addUpdateListener(new C89237b(this));
            aVar.f241971b = new C89238c(runnable);
            float translationY = this.f241977b.getTranslationY();
            if (aVar.f241970a.isRunning()) {
                aVar.mo83186a();
            }
            aVar.f241970a.setFloatValues(new float[]{translationY, f});
            aVar.f241970a.addListener(aVar);
            aVar.f241970a.start();
        }
        this.f241982g = z2;
    }

    /* renamed from: c */
    public final void mo83192c() {
        mo83191a(0.0f, false, true, (Runnable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo83193d(boolean z) {
        OverlaySearchPlateContainer overlaySearchPlateContainer = (OverlaySearchPlateContainer) this.f241977b.findViewById(R.id.search_plate_container);
        overlaySearchPlateContainer.getClass();
        SearchPlate searchPlate = (SearchPlate) overlaySearchPlateContainer.findViewById(R.id.search_plate);
        searchPlate.getClass();
        if (!searchPlate.mo82695z() || searchPlate.f240685E != 2) {
            this.f241982g = false;
            mo83191a(this.f241981f, z, false, (Runnable) null);
        }
    }

    /* renamed from: e */
    public final void mo83194e(float f) {
        View findViewById = this.f241977b.findViewById(R.id.launcher_search_button);
        findViewById.getClass();
        findViewById.setAlpha(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo83195f(float f) {
        this.f241981f = f;
        if (!this.f241982g) {
            if (this.f241978c.f241970a.isRunning()) {
                this.f241978c.mo83186a();
            }
            this.f241977b.setTranslationY(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo83196g(boolean z) {
        this.f241977b.setVisibility(true != z ? 8 : 0);
    }
}
