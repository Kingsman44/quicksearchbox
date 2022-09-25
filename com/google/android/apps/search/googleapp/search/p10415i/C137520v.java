package com.google.android.apps.search.googleapp.search.p10415i;

import com.google.protobuf.C63088z;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.googleapp.search.i.v */
/* compiled from: PG */
public final /* synthetic */ class C137520v implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C137521w f374037a;

    public /* synthetic */ C137520v(C137521w wVar) {
        this.f374037a = wVar;
    }

    public final Object get() {
        C137521w wVar = this.f374037a;
        C63088z zVar = wVar.f374040b;
        int i = wVar.f374039a;
        wVar.f374039a = i + 1;
        return Integer.valueOf(zVar.mo59029a(i) & 255);
    }
}
