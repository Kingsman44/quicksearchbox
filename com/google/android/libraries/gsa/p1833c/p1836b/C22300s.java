package com.google.android.libraries.gsa.p1833c.p1836b;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.c.b.s */
/* compiled from: PG */
public final class C22300s implements C68220f {

    /* renamed from: a */
    private final C69464a f61605a;

    public C22300s(C69464a aVar) {
        this.f61605a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) ((C68221g) this.f61605a).f184583a).getSystemService("connectivity");
        C68225k.m98532d(connectivityManager);
        return connectivityManager;
    }
}
