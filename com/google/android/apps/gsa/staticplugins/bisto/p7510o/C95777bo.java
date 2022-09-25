package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.net.Uri;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.bo */
/* compiled from: PG */
public final class C95777bo implements C95802ch {

    /* renamed from: a */
    final /* synthetic */ C95778bp f268188a;

    /* renamed from: b */
    private Uri f268189b;

    public C95777bo(C95778bp bpVar, Uri uri) {
        this.f268188a = bpVar;
        this.f268189b = uri;
    }

    /* renamed from: a */
    public final void mo89728a(byte[] bArr) {
        if (this.f268189b == null) {
            this.f268189b = this.f268188a.mo89782b();
        }
        this.f268188a.mo89785l(this.f268189b, bArr, 0, bArr.length);
    }
}
