package com.google.android.libraries.search.silk.p3162a.p3173k;

import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.lens.sdk.LensApi;

/* renamed from: com.google.android.libraries.search.silk.a.k.i */
/* compiled from: PG */
public final /* synthetic */ class C40614i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C40618m f106584a;

    public /* synthetic */ C40614i(C40618m mVar) {
        this.f106584a = mVar;
    }

    public final C60870cx apply(Object obj) {
        ((LensApi) this.f106584a.f106590b.mo27525b()).onPause();
        if (((Integer) obj).intValue() == 0) {
            return C60866ct.f164955a;
        }
        throw new C41742a(C41749b.m73223b("Failed to start Lens."));
    }
}
