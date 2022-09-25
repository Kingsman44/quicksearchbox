package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.pm.PackageManager;
import android.os.UserHandle;
import com.android.launcher3.compat.LauncherActivityInfoCompat;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.w */
/* compiled from: PG */
public final /* synthetic */ class C113511w implements C113250ac {

    /* renamed from: a */
    public final /* synthetic */ C113251ad f314274a;

    /* renamed from: b */
    public final /* synthetic */ LauncherActivityInfoCompat f314275b;

    /* renamed from: c */
    public final /* synthetic */ UserHandle f314276c;

    public /* synthetic */ C113511w(C113251ad adVar, LauncherActivityInfoCompat launcherActivityInfoCompat, UserHandle userHandle) {
        this.f314274a = adVar;
        this.f314275b = launcherActivityInfoCompat;
        this.f314276c = userHandle;
    }

    /* renamed from: a */
    public final Object mo99923a() {
        C113251ad adVar = this.f314274a;
        LauncherActivityInfoCompat launcherActivityInfoCompat = this.f314275b;
        UserHandle userHandle = this.f314276c;
        PackageManager packageManager = adVar.f313612e;
        return packageManager.getUserBadgedIcon(packageManager.getApplicationIcon(launcherActivityInfoCompat.getApplicationInfo()), userHandle);
    }
}
