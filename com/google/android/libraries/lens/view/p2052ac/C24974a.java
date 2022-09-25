package com.google.android.libraries.lens.view.p2052ac;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.lens.p4711m.C62632i;

/* renamed from: com.google.android.libraries.lens.view.ac.a */
/* compiled from: PG */
public final class C24974a {

    /* renamed from: a */
    public final Activity f68122a;

    /* renamed from: b */
    public final C27232l f68123b;

    /* renamed from: c */
    public final boolean f68124c;

    public C24974a(Activity activity, C27232l lVar, boolean z) {
        this.f68122a = activity;
        this.f68123b = lVar;
        this.f68124c = z;
    }

    /* renamed from: a */
    public static boolean m46225a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        return Math.min(configuration.screenWidthDp, configuration.screenHeightDp) >= 600;
    }

    /* renamed from: b */
    public static boolean m46226b(boolean z, C27232l lVar, Activity activity) {
        return z || m46225a(activity) || activity.isInMultiWindowMode() || C62632i.m94823h(lVar.mo32701h());
    }
}
