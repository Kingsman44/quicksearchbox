package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.f */
/* compiled from: PG */
public final /* synthetic */ class C112120f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112127m f311343a;

    /* renamed from: b */
    public final /* synthetic */ String f311344b;

    public /* synthetic */ C112120f(C112127m mVar, String str) {
        this.f311343a = mVar;
        this.f311344b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C112127m mVar = this.f311343a;
        String str = this.f311344b;
        C29690f fVar = (C29690f) obj;
        if (fVar != null) {
            return mVar.f311359d.mo28209i(mVar.mo99401a(), "[Tapas] TapasMddClient.loadCortexResources", new C112121g(mVar, fVar, str));
        }
        mVar.mo99407h(1, "Missing client file group %s", "tapas_cortex");
        return C60856cj.m92900i(false);
    }
}
