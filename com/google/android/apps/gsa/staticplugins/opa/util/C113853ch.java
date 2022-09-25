package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ch */
/* compiled from: PG */
public final class C113853ch {

    /* renamed from: a */
    private final C68214a f315266a;

    /* renamed from: b */
    private boolean f315267b = false;

    public C113853ch(C68214a aVar) {
        this.f315266a = aVar;
    }

    /* renamed from: a */
    public final void mo100699a() {
        if (!this.f315267b) {
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.OPA_ANDROID_ACTIVITY_INPUT_PLATE_FIRST_DRAWN;
            ((C89859i) this.f315266a.mo27525b()).mo74236a(fVar.mo83699a());
            this.f315267b = true;
        }
    }
}
