package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import android.content.pm.PackageManager;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.w */
/* compiled from: PG */
public final class C126346w {

    /* renamed from: a */
    private final boolean f348034a;

    /* renamed from: b */
    private final boolean f348035b;

    public C126346w(PackageManager packageManager, boolean z, boolean z2) {
        boolean z3 = true;
        this.f348034a = z && !z2;
        this.f348035b = (!packageManager.hasSystemFeature("com.google.android.feature.PIXEL_2021_EXPERIENCE") || z2) ? false : z3;
    }

    /* renamed from: a */
    public final boolean mo107565a() {
        return this.f348035b || this.f348034a;
    }
}
