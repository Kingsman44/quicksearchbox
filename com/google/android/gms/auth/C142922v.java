package com.google.android.gms.auth;

import android.webkit.CookieManager;

/* renamed from: com.google.android.gms.auth.v */
/* compiled from: PG */
final class C142922v implements C142920t {

    /* renamed from: a */
    final CookieManager f387825a = CookieManager.getInstance();

    /* renamed from: a */
    public final void mo46995a(String str, String str2) {
        this.f387825a.setCookie(str, str2);
    }
}
