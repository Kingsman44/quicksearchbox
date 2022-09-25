package com.google.apps.tiktok.dataservice;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.google.android.libraries.storage.p3315b.C42825ak;

/* renamed from: com.google.apps.tiktok.dataservice.k */
/* compiled from: PG */
final class C46822k implements C42825ak {

    /* renamed from: a */
    final /* synthetic */ Uri f122211a;

    /* renamed from: b */
    final /* synthetic */ String[] f122212b;

    /* renamed from: c */
    final /* synthetic */ Bundle f122213c;

    /* renamed from: d */
    final /* synthetic */ C46877q f122214d;

    public C46822k(C46877q qVar, Uri uri, String[] strArr, Bundle bundle) {
        this.f122214d = qVar;
        this.f122211a = uri;
        this.f122212b = strArr;
        this.f122213c = bundle;
    }

    /* renamed from: a */
    public final Cursor mo45908a(CancellationSignal cancellationSignal) {
        C46761ce ceVar = this.f122214d.f122310a;
        Uri uri = this.f122211a;
        String[] strArr = this.f122212b;
        Bundle bundle = this.f122213c;
        return ceVar.mo50775d(uri, new C46729bm(uri, strArr, bundle, cancellationSignal), new C46730bn(strArr, uri, bundle));
    }

    /* renamed from: b */
    public final String mo45909b() {
        return C46761ce.m83304b(this.f122212b, this.f122211a, this.f122213c);
    }

    /* renamed from: c */
    public final void mo45910c() {
    }
}
