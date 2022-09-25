package com.google.android.apps.gsa.staticplugins.s3request.p8693d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.s3request.p8690a.C116249ad;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.speech.p5224k.p5225a.C67242t;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.d.a */
/* compiled from: PG */
public final /* synthetic */ class C116335a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C116339e f322521a;

    /* renamed from: b */
    public final /* synthetic */ InputStream f322522b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f322523c;

    /* renamed from: d */
    public final /* synthetic */ InputStream f322524d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f322525e;

    public /* synthetic */ C116335a(C116339e eVar, InputStream inputStream, byte[] bArr, InputStream inputStream2, byte[] bArr2) {
        this.f322521a = eVar;
        this.f322522b = inputStream;
        this.f322523c = bArr;
        this.f322524d = inputStream2;
        this.f322525e = bArr2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C116339e eVar = this.f322521a;
        InputStream inputStream = this.f322522b;
        byte[] bArr = this.f322523c;
        InputStream inputStream2 = this.f322524d;
        byte[] bArr2 = this.f322525e;
        if (C116249ad.m192805d(eVar.f322534b, eVar.f322535c, (C67242t) obj)) {
            eVar.mo102643e(inputStream, bArr, true);
            eVar.mo102643e(inputStream2, bArr2, false);
        } else {
            eVar.mo102643e(inputStream2, bArr2, false);
            eVar.mo102643e(inputStream, bArr, true);
        }
        return C118826c.f331422a;
    }
}
