package com.google.android.apps.gsa.search.core.p6513aj;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.aj.t */
/* compiled from: PG */
public final class C84560t {

    /* renamed from: a */
    public final Context f230137a;

    /* renamed from: b */
    public final C68214a f230138b;

    /* renamed from: c */
    public final C68214a f230139c;

    public C84560t(Context context, C68214a aVar, C68214a aVar2) {
        this.f230137a = context;
        this.f230138b = aVar;
        this.f230139c = aVar2;
        Process.myUserHandle();
    }

    /* renamed from: a */
    public static void m135283a(PackageManager packageManager, ComponentName componentName, boolean z) {
        packageManager.setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
    }
}
