package com.google.android.apps.gsa.staticplugins.p8689s;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.s.a */
/* compiled from: PG */
public final /* synthetic */ class C116236a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ Context f322320a;

    public /* synthetic */ C116236a(Context context) {
        this.f322320a = context;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        KeyguardManager keyguardManager = (KeyguardManager) this.f322320a.getSystemService(KeyguardManager.class);
        boolean z = false;
        if (keyguardManager != null && keyguardManager.isKeyguardSecure()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
