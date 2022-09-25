package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.k */
/* compiled from: PG */
final class C115066k implements C22868d {

    /* renamed from: a */
    final /* synthetic */ AmbientMediaSectionController f319399a;

    public C115066k(AmbientMediaSectionController ambientMediaSectionController) {
        this.f319399a = ambientMediaSectionController;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = AmbientMediaSectionController.f319062a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AmbientMediaSC");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(29446)).mo56386p("Unable to load album art.");
        this.f319399a.mo101761h((Drawable) null);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        this.f319399a.mo101761h((Drawable) obj);
    }
}
