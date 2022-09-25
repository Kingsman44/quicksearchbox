package com.google.apps.tiktok.dataservice;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;

/* renamed from: com.google.apps.tiktok.dataservice.bm */
/* compiled from: PG */
public final /* synthetic */ class C46729bm implements C46738bv {

    /* renamed from: a */
    public final /* synthetic */ Uri f122054a;

    /* renamed from: b */
    public final /* synthetic */ String[] f122055b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f122056c;

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f122057d;

    public /* synthetic */ C46729bm(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        this.f122054a = uri;
        this.f122055b = strArr;
        this.f122056c = bundle;
        this.f122057d = cancellationSignal;
    }

    /* renamed from: a */
    public final Cursor mo50752a(ContentProviderClient contentProviderClient) {
        return contentProviderClient.query(this.f122054a, this.f122055b, this.f122056c, this.f122057d);
    }
}
