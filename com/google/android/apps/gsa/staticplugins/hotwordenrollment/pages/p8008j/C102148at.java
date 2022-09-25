package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.at */
/* compiled from: PG */
public final class C102148at {

    /* renamed from: a */
    public static final C59071e f284958a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.at");

    /* renamed from: b */
    public final C102144ap f284959b;

    /* renamed from: c */
    public final C102230s f284960c;

    /* renamed from: d */
    public final Optional f284961d;

    /* renamed from: e */
    public final C102142an f284962e;

    /* renamed from: f */
    public final C89859i f284963f;

    public C102148at(C102144ap apVar, C102142an anVar, C102230s sVar, Optional optional, C89859i iVar) {
        this.f284959b = apVar;
        this.f284961d = optional;
        this.f284960c = sVar;
        this.f284962e = anVar;
        this.f284963f = iVar;
    }

    /* renamed from: a */
    public final void mo92911a() {
        if (this.f284959b.isAdded()) {
            C102134af afVar = new C102134af();
            C68324h.m98669f(afVar);
            FragmentManager parentFragmentManager = this.f284959b.getParentFragmentManager();
            parentFragmentManager.getClass();
            C0154a aVar = new C0154a(parentFragmentManager);
            aVar.mo689v(R.id.pending_enrollment_fragment_frame_layout, afVar, "UNIFIED_CONSENT_ENROLL_SCREEN");
            aVar.mo509f();
        }
    }
}
