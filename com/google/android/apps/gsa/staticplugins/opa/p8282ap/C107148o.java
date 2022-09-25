package com.google.android.apps.gsa.staticplugins.opa.p8282ap;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ap.o */
/* compiled from: PG */
public final /* synthetic */ class C107148o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C107156w f298255a;

    public /* synthetic */ C107148o(C107156w wVar) {
        this.f298255a = wVar;
    }

    public final C60870cx apply(Object obj) {
        C107156w wVar = this.f298255a;
        if (((C118826c) obj) != C118826c.f331422a) {
            return C60856cj.m92899h(new Exception("Failed to download photos."));
        }
        return C60856cj.m92900i(wVar.mo95810e());
    }
}
