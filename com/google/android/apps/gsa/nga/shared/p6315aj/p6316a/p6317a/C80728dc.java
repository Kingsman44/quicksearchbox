package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.os.Bundle;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.dc */
/* compiled from: PG */
public abstract class C80728dc {

    /* renamed from: a */
    public static final C80728dc f221616a = new C80669ay(true);

    /* renamed from: b */
    public static final C80728dc f221617b = new C80669ay(false);

    /* renamed from: a */
    public abstract boolean mo74516a();

    /* renamed from: b */
    public final Bundle mo74634b() {
        Bundle bundle = new Bundle();
        bundle.putString("action", "gesture_nav_bar_visible");
        bundle.putBoolean("visible", mo74516a());
        return bundle;
    }
}
