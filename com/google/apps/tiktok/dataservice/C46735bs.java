package com.google.apps.tiktok.dataservice;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* renamed from: com.google.apps.tiktok.dataservice.bs */
/* compiled from: PG */
public final /* synthetic */ class C46735bs implements C46738bv {

    /* renamed from: a */
    public final /* synthetic */ Uri f122069a;

    /* renamed from: b */
    public final /* synthetic */ String[] f122070b;

    /* renamed from: c */
    public final /* synthetic */ String f122071c;

    /* renamed from: d */
    public final /* synthetic */ String[] f122072d;

    /* renamed from: e */
    public final /* synthetic */ String f122073e;

    /* renamed from: f */
    public final /* synthetic */ CancellationSignal f122074f;

    public /* synthetic */ C46735bs(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        this.f122069a = uri;
        this.f122070b = strArr;
        this.f122071c = str;
        this.f122072d = strArr2;
        this.f122073e = str2;
        this.f122074f = cancellationSignal;
    }

    /* renamed from: a */
    public final Cursor mo50752a(ContentProviderClient contentProviderClient) {
        return contentProviderClient.query(this.f122069a, this.f122070b, this.f122071c, this.f122072d, this.f122073e, this.f122074f);
    }
}
