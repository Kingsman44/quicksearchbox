package com.google.android.apps.gsa.staticplugins.opa.util;

import android.app.Activity;
import android.app.KeyguardManager;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.cv */
/* compiled from: PG */
public final class C113867cv {

    /* renamed from: a */
    public final Activity f315284a;

    public C113867cv(Activity activity) {
        this.f315284a = activity;
    }

    /* renamed from: a */
    public final void mo100726a(Runnable runnable) {
        KeyguardManager keyguardManager = (KeyguardManager) this.f315284a.getSystemService("keyguard");
        if (keyguardManager.isKeyguardLocked()) {
            keyguardManager.requestDismissKeyguard(this.f315284a, new C113866cu(this, runnable));
        } else {
            runnable.run();
        }
    }
}
