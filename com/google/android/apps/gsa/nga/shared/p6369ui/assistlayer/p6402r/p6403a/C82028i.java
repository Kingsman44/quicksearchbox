package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.p6403a;

import android.app.WallpaperColors;
import android.app.WallpaperManager;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.r.a.i */
/* compiled from: PG */
public final /* synthetic */ class C82028i implements WallpaperManager.OnColorsChangedListener {

    /* renamed from: a */
    public final /* synthetic */ C82030k f224239a;

    /* renamed from: b */
    public final /* synthetic */ C22871g f224240b;

    public /* synthetic */ C82028i(C82030k kVar, C22871g gVar) {
        this.f224239a = kVar;
        this.f224240b = gVar;
    }

    public final void onColorsChanged(WallpaperColors wallpaperColors, int i) {
        C83349aj.m132647b(this.f224240b, this.f224239a.f224246e, Boolean.valueOf(C82030k.m130291d(wallpaperColors)), "isDarkTextSupported");
    }
}
