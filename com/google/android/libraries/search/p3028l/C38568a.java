package com.google.android.libraries.search.p3028l;

import android.content.Context;
import android.content.pm.PackageManager;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.search.l.a */
/* compiled from: PG */
public final /* synthetic */ class C38568a implements C68214a {

    /* renamed from: a */
    public final /* synthetic */ Context f101949a;

    public /* synthetic */ C38568a(Context context) {
        this.f101949a = context;
    }

    /* renamed from: b */
    public final Object mo27525b() {
        Context context = this.f101949a;
        int i = C38569b.f101950a;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
}
