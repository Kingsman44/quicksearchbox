package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.libraries.p1703d.C20644ah;
import com.google.android.libraries.p1703d.C20645ai;
import com.google.android.libraries.p1703d.C20656l;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.c */
/* compiled from: PG */
public final /* synthetic */ class C133717c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133731q f364214a;

    /* renamed from: b */
    public final /* synthetic */ Uri f364215b;

    /* renamed from: c */
    public final /* synthetic */ Uri f364216c;

    public /* synthetic */ C133717c(C133731q qVar, Uri uri, Uri uri2) {
        this.f364214a = qVar;
        this.f364215b = uri;
        this.f364216c = uri2;
    }

    public final Object call() {
        C133731q qVar = this.f364214a;
        Uri uri = this.f364215b;
        Uri uri2 = this.f364216c;
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.intent.extra.REFERRER", uri);
        C20644ah f = C20645ai.m38752f();
        C20656l lVar = (C20656l) f;
        lVar.f57917a = uri2;
        lVar.f57919c = bundle;
        f.mo25595b(true);
        f.mo25596c(true);
        if (qVar.f364233b.mo25669h(f.mo25594a())) {
            return null;
        }
        throw new RemoteException("Preload failed due to an unknown reason");
    }
}
