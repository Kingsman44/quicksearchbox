package com.google.apps.tiktok.dataservice;

import android.content.ContentProviderClient;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.apps.tiktok.dataservice.br */
/* compiled from: PG */
public final /* synthetic */ class C46734br implements C46759cc {

    /* renamed from: a */
    public final /* synthetic */ String f122066a;

    /* renamed from: b */
    public final /* synthetic */ String f122067b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public final /* synthetic */ Bundle f122068c;

    public /* synthetic */ C46734br(String str, Bundle bundle) {
        this.f122066a = str;
        this.f122068c = bundle;
    }

    /* renamed from: a */
    public final Object mo50753a(ContentProviderClient contentProviderClient) {
        return contentProviderClient.call(this.f122066a, this.f122067b, this.f122068c);
    }
}
