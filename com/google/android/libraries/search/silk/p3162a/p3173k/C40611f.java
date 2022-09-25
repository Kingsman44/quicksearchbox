package com.google.android.libraries.search.silk.p3162a.p3173k;

import android.app.Activity;
import androidx.p104d.p105a.C2164c;
import com.google.lens.sdk.C62643i;
import com.google.lens.sdk.C62647m;
import com.google.lens.sdk.LensApi;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.a.k.f */
/* compiled from: PG */
public final /* synthetic */ class C40611f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40618m f106579a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f106580b;

    /* renamed from: c */
    public final /* synthetic */ C62647m f106581c;

    public /* synthetic */ C40611f(C40618m mVar, C2164c cVar, C62647m mVar2) {
        this.f106579a = mVar;
        this.f106580b = cVar;
        this.f106581c = mVar2;
    }

    public final void run() {
        C40618m mVar = this.f106579a;
        C2164c cVar = this.f106580b;
        C62647m mVar2 = this.f106581c;
        LensApi lensApi = (LensApi) mVar.f106590b.mo27525b();
        Objects.requireNonNull(cVar);
        lensApi.mo58515a((Activity) null, new C40609d(cVar), new C62643i(lensApi, mVar2));
    }
}
