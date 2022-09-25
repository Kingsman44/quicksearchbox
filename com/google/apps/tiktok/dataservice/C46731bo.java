package com.google.apps.tiktok.dataservice;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;

/* renamed from: com.google.apps.tiktok.dataservice.bo */
/* compiled from: PG */
public final /* synthetic */ class C46731bo implements C46759cc {

    /* renamed from: a */
    public final /* synthetic */ Uri f122061a;

    /* renamed from: b */
    public final /* synthetic */ ContentValues f122062b;

    public /* synthetic */ C46731bo(Uri uri, ContentValues contentValues) {
        this.f122061a = uri;
        this.f122062b = contentValues;
    }

    /* renamed from: a */
    public final Object mo50753a(ContentProviderClient contentProviderClient) {
        return Integer.valueOf(contentProviderClient.update(this.f122061a, this.f122062b, (String) null, (String[]) null));
    }
}
