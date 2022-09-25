package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n;

import android.content.pm.LauncherApps;
import com.google.common.base.C58881cr;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.j */
/* compiled from: PG */
public final /* synthetic */ class C117023j implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C117024k f324877a;

    public /* synthetic */ C117023j(C117024k kVar) {
        this.f324877a = kVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        LauncherApps launcherApps = (LauncherApps) this.f324877a.f324878a.getSystemService("launcherapps");
        return launcherApps == null ? Optional.empty() : Optional.m71637of(launcherApps);
    }
}
