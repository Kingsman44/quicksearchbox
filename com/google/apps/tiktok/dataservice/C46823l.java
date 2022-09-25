package com.google.apps.tiktok.dataservice;

import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.google.android.libraries.storage.p3315b.C42825ak;

/* renamed from: com.google.apps.tiktok.dataservice.l */
/* compiled from: PG */
final class C46823l implements C42825ak {

    /* renamed from: a */
    final /* synthetic */ Uri f122215a;

    /* renamed from: b */
    final /* synthetic */ String[] f122216b;

    /* renamed from: c */
    final /* synthetic */ String f122217c;

    /* renamed from: d */
    final /* synthetic */ String[] f122218d;

    /* renamed from: e */
    final /* synthetic */ String f122219e;

    /* renamed from: f */
    final /* synthetic */ C46877q f122220f;

    public C46823l(C46877q qVar, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f122220f = qVar;
        this.f122215a = uri;
        this.f122216b = strArr;
        this.f122217c = str;
        this.f122218d = strArr2;
        this.f122219e = str2;
    }

    /* renamed from: a */
    public final Cursor mo45908a(CancellationSignal cancellationSignal) {
        C46761ce ceVar = this.f122220f.f122310a;
        Uri uri = this.f122215a;
        String[] strArr = this.f122216b;
        String str = this.f122217c;
        String[] strArr2 = this.f122218d;
        String str2 = this.f122219e;
        return ceVar.mo50775d(uri, new C46735bs(uri, strArr, str, strArr2, str2, cancellationSignal), new C46736bt(strArr, uri, str, str2));
    }

    /* renamed from: b */
    public final String mo45909b() {
        return C46761ce.m83305c(this.f122216b, this.f122215a, this.f122217c, this.f122219e);
    }

    /* renamed from: c */
    public final void mo45910c() {
    }
}
