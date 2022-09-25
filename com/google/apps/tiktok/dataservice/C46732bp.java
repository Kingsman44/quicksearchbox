package com.google.apps.tiktok.dataservice;

import android.content.ContentProviderClient;
import android.net.Uri;

/* renamed from: com.google.apps.tiktok.dataservice.bp */
/* compiled from: PG */
public final /* synthetic */ class C46732bp implements C46759cc {

    /* renamed from: a */
    public final /* synthetic */ Uri f122063a;

    public /* synthetic */ C46732bp(Uri uri) {
        this.f122063a = uri;
    }

    /* renamed from: a */
    public final Object mo50753a(ContentProviderClient contentProviderClient) {
        return Integer.valueOf(contentProviderClient.delete(this.f122063a, (String) null, (String[]) null));
    }
}
