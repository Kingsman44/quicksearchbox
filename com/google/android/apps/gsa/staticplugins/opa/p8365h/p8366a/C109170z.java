package com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a;

import com.google.android.apps.gsa.assistant.settings.features.d.ak;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.a.z */
/* compiled from: PG */
final class C109170z implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C91006f f303982a;

    public C109170z(C91006f fVar) {
        this.f303982a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f303982a.mo85292s(C90752i.m148229c("AA: could not read PDS"));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        ak akVar = (ak) obj;
        this.f303982a.mo85292s(C90752i.m148229c("AA: store: ".concat(String.valueOf((akVar.a & 128) != 0 ? String.valueOf(akVar.i) : "[absent]"))));
    }
}
