package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8550e;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.e.a */
/* compiled from: PG */
public final class C112095a {

    /* renamed from: a */
    public final KeyguardManager f311299a;

    public C112095a(Context context) {
        Object systemService = context.getSystemService("keyguard");
        this.f311299a = systemService != null ? (KeyguardManager) systemService : null;
    }
}
