package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.p6403a;

import android.app.WallpaperManager;
import android.os.Handler;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.r.a.e */
/* compiled from: PG */
public final /* synthetic */ class C82024e implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C82030k f224235a;

    public /* synthetic */ C82024e(C82030k kVar) {
        this.f224235a = kVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C82030k kVar = this.f224235a;
        WallpaperManager.getInstance(kVar.f224244c).addOnColorsChangedListener(kVar.f224243b, (Handler) null);
        return C118826c.f331422a;
    }
}
