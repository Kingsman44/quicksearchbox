package com.google.apps.tiktok.dataservice;

import android.content.pm.ProviderInfo;

/* renamed from: com.google.apps.tiktok.dataservice.cd */
/* compiled from: PG */
public final class C46760cd extends C46741by {
    public C46760cd(ProviderInfo providerInfo, Throwable th) {
        super("Provider exists, but could not be obtained: ".concat(providerInfo.toString()), th);
    }
}
