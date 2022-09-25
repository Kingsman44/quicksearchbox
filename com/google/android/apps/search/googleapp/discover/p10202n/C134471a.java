package com.google.android.apps.search.googleapp.discover.p10202n;

import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.apps.search.googleapp.discover.n.a */
/* compiled from: PG */
public final class C134471a {
    /* renamed from: a */
    public static Intent m218228a() {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.monet.MonetActivity");
        intent.addFlags(276824064);
        intent.setData(new Uri.Builder().scheme("agsa").path("/data").appendQueryParameter("type", "training.training").build());
        return intent;
    }
}
