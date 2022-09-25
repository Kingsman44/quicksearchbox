package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.view.View;
import com.google.android.libraries.animation.C147770c;
import com.google.android.libraries.animation.C147790p;
import com.google.android.libraries.animation.C147794t;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import p3186j$.time.Duration;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.u */
/* compiled from: PG */
final class C81802u {

    /* renamed from: a */
    public static final Duration f223737a = Duration.ofMillis(250);

    /* renamed from: b */
    public final C147783f f223738b;

    public C81802u(C147783f fVar) {
        this.f223738b = fVar;
    }

    /* renamed from: d */
    public static void m129961d(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: e */
    private final C81801t m129962e(String str, View view, Duration duration) {
        C147783f fVar = this.f223738b;
        Objects.requireNonNull(view);
        C147770c cVar = new C147770c(new C81785d(view));
        C147794t b = C147794t.m240888b(0.0f, 1.0f);
        b.f398763c = new C147790p(0.0f, 1.0f);
        C147779b bVar = new C147779b(fVar, cVar.mo124447a(b));
        bVar.f398748b = new C81788g(view);
        bVar.f398749c = new C81789h(view);
        return new C81796o(view, bVar.mo124453a(), duration);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C81801t mo75318a(View view) {
        C147783f fVar = this.f223738b;
        Objects.requireNonNull(view);
        C147770c cVar = new C147770c(new C81785d(view));
        C147794t b = C147794t.m240888b(0.0f, 1.0f);
        b.f398763c = new C147790p(0.0f, 1.0f);
        return new C81792k(view, new C147779b(fVar, cVar.mo124447a(b)).mo124453a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C81801t mo75319b(View view) {
        return m129962e("fadeOut", view, f223737a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C81801t mo75320c(View view) {
        return m129962e("slowFadeOut", view, Duration.ofMillis(400));
    }
}
