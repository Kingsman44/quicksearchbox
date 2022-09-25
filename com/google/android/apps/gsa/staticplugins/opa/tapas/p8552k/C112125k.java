package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.k */
/* compiled from: PG */
public final /* synthetic */ class C112125k implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112127m f311350a;

    /* renamed from: b */
    public final /* synthetic */ String f311351b = "tapas_cortex";

    /* renamed from: c */
    public final /* synthetic */ String f311352c;

    public /* synthetic */ C112125k(C112127m mVar, String str) {
        this.f311350a = mVar;
        this.f311352c = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C112127m mVar = this.f311350a;
        String str = this.f311351b;
        String str2 = this.f311352c;
        C29690f fVar = (C29690f) obj;
        if (fVar != null) {
            return C60856cj.m92900i(mVar.mo99403c(fVar, str2));
        }
        mVar.mo99407h(1, "Missing client file group %s", str);
        return C60856cj.m92900i(Optional.empty());
    }
}
