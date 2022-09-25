package com.google.android.apps.gsa.speech.helper.crossprofile;

import android.content.Context;
import android.content.pm.CrossProfileApps;
import android.os.Build;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.helper.crossprofile.p */
/* compiled from: PG */
public final class C92331p {

    /* renamed from: a */
    public final CrossProfileApps f257433a;

    /* renamed from: b */
    public final C92334s f257434b;

    public C92331p(Context context, C68214a aVar) {
        this.f257434b = (C92334s) aVar.mo27525b();
        this.f257433a = Build.VERSION.SDK_INT >= 30 ? (CrossProfileApps) context.getSystemService(CrossProfileApps.class) : null;
    }

    /* renamed from: a */
    public final boolean mo86986a() {
        CrossProfileApps crossProfileApps = this.f257433a;
        return crossProfileApps != null && crossProfileApps.canRequestInteractAcrossProfiles();
    }
}
