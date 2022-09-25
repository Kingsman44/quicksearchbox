package com.google.android.apps.gsa.contentprovider.p5845a;

import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.gsa.contentprovider.d;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p1646ay.C19602d;

/* renamed from: com.google.android.apps.gsa.contentprovider.a.e */
/* compiled from: PG */
public final /* synthetic */ class C74496e implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ j f208612a;

    /* renamed from: b */
    public final /* synthetic */ d f208613b;

    public /* synthetic */ C74496e(j jVar, d dVar) {
        this.f208612a = jVar;
        this.f208613b = dVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        j jVar = this.f208612a;
        d dVar = this.f208613b;
        Pair a = jVar.a(dVar.f208620a);
        String str = dVar.b;
        String[] strArr = dVar.c;
        return Integer.valueOf(((C19602d) a.first).mo24918k((Uri) a.second));
    }
}
