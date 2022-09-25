package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8250e;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.android.apps.gsa.staticplugins.opa.p8337bg.C108055b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.AmbientMediaSectionController;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115068m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.e.a */
/* compiled from: PG */
public final class C106761a implements C106740b {

    /* renamed from: a */
    private final AmbientMediaSectionController f297532a;

    public C106761a(C115068m mVar, Fragment fragment, C108055b bVar) {
        this.f297532a = mVar.mo101832a(fragment, bVar);
    }

    /* renamed from: a */
    public final List mo95632a() {
        return C58485gu.m89846n(C106734a.FULL);
    }

    /* renamed from: b */
    public final C60870cx mo95633b() {
        AmbientMediaSectionController ambientMediaSectionController = this.f297532a;
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(Optional.m71637of(ambientMediaSectionController.f319067f));
    }
}
