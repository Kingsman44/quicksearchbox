package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.k */
/* compiled from: PG */
final class C98680k {

    /* renamed from: a */
    public boolean f275644a;

    /* renamed from: b */
    private final boolean f275645b;

    public C98680k(Intent intent) {
        this.f275645b = intent.getBooleanExtra("com.google.android.apps.gsa.customtabs.FORCE_CCT", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo91255a() {
        if (!this.f275645b) {
            return false;
        }
        this.f275644a = true;
        return true;
    }
}
