package com.google.android.libraries.p1975k.p1980e;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.libraries.k.e.a */
/* compiled from: PG */
public final class C24003a {

    /* renamed from: a */
    private Integer f65608a;

    /* renamed from: a */
    public final int mo29404a(Context context) {
        if (this.f65608a == null) {
            try {
                this.f65608a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                this.f65608a = -1;
            }
        }
        return this.f65608a.intValue();
    }
}
