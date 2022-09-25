package com.google.android.apps.search.googleapp.search.p10415i;

import com.google.protobuf.C63088z;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.googleapp.search.i.u */
/* compiled from: PG */
public final /* synthetic */ class C137519u implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C137521w f374033a;

    /* renamed from: b */
    public final /* synthetic */ int f374034b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f374035c;

    /* renamed from: d */
    public final /* synthetic */ int f374036d;

    public /* synthetic */ C137519u(C137521w wVar, int i, byte[] bArr, int i2) {
        this.f374033a = wVar;
        this.f374034b = i;
        this.f374035c = bArr;
        this.f374036d = i2;
    }

    public final Object get() {
        C137521w wVar = this.f374033a;
        int i = this.f374034b;
        byte[] bArr = this.f374035c;
        int i2 = this.f374036d;
        int min = Math.min(wVar.f374040b.mo59031d() - wVar.f374039a, i);
        C63088z zVar = wVar.f374040b;
        int i3 = wVar.f374039a;
        int i4 = i3 + min;
        wVar.f374039a = i4;
        zVar.mo59039k(i3, i4).mo59171K(bArr, i2);
        return Integer.valueOf(min);
    }
}
