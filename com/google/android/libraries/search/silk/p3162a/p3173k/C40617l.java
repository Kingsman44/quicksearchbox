package com.google.android.libraries.search.silk.p3162a.p3173k;

import androidx.p104d.p105a.C2164c;
import com.google.lens.sdk.LensApi;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.a.k.l */
/* compiled from: PG */
public final /* synthetic */ class C40617l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40618m f106587a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f106588b;

    public /* synthetic */ C40617l(C40618m mVar, C2164c cVar) {
        this.f106587a = mVar;
        this.f106588b = cVar;
    }

    public final void run() {
        C40618m mVar = this.f106587a;
        C2164c cVar = this.f106588b;
        Objects.requireNonNull(cVar);
        ((LensApi) mVar.f106590b.mo27525b()).checkPostCaptureAvailability(new C40613h(cVar));
        ((LensApi) mVar.f106590b.mo27525b()).onResume();
    }
}
