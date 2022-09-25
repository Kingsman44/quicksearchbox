package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.gms.learning.internal.C144772d;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.g */
/* compiled from: PG */
public final /* synthetic */ class C100802g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GsaExampleStoreService f281732a;

    /* renamed from: b */
    public final /* synthetic */ String f281733b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f281734c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f281735d;

    /* renamed from: e */
    public final /* synthetic */ C144772d f281736e;

    public /* synthetic */ C100802g(GsaExampleStoreService gsaExampleStoreService, String str, byte[] bArr, byte[] bArr2, C144772d dVar) {
        this.f281732a = gsaExampleStoreService;
        this.f281733b = str;
        this.f281734c = bArr;
        this.f281735d = bArr2;
        this.f281736e = dVar;
    }

    public final void run() {
        GsaExampleStoreService gsaExampleStoreService = this.f281732a;
        String str = this.f281733b;
        byte[] bArr = this.f281734c;
        byte[] bArr2 = this.f281735d;
        C100742h e = C100742h.m166943a(new C100808m(gsaExampleStoreService)).mo92035e(new C100809n(gsaExampleStoreService, str, this.f281736e, bArr, bArr2));
        e.mo92039j(new C100810o(str));
        e.mo92038i(new C100811p(str));
    }
}
