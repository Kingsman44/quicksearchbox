package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.p6403a;

import android.app.WallpaperColors;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.r.a.j */
/* compiled from: PG */
public final /* synthetic */ class C82029j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82030k f224241a;

    public /* synthetic */ C82029j(C82030k kVar) {
        this.f224241a = kVar;
    }

    public final void accept(Object obj) {
        C82030k kVar = this.f224241a;
        C83349aj.m132647b(kVar.f224245d, kVar.f224246e, Boolean.valueOf(C82030k.m130291d((WallpaperColors) obj)), "isDarkTextSupported");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
