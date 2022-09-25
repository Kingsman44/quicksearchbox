package com.google.apps.tiktok.dataservice;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;

/* renamed from: com.google.apps.tiktok.dataservice.bu */
/* compiled from: PG */
public final /* synthetic */ class C46737bu implements C46759cc {

    /* renamed from: a */
    public final /* synthetic */ Uri f122079a;

    /* renamed from: b */
    public final /* synthetic */ ContentValues f122080b;

    public /* synthetic */ C46737bu(Uri uri, ContentValues contentValues) {
        this.f122079a = uri;
        this.f122080b = contentValues;
    }

    /* renamed from: a */
    public final Object mo50753a(ContentProviderClient contentProviderClient) {
        return contentProviderClient.insert(this.f122079a, this.f122080b);
    }
}
