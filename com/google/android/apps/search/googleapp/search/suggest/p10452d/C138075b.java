package com.google.android.apps.search.googleapp.search.suggest.p10452d;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.d.b */
/* compiled from: PG */
public final /* synthetic */ class C138075b implements Callable {

    /* renamed from: a */
    public static final /* synthetic */ C138075b f375670a = new C138075b();

    private /* synthetic */ C138075b() {
    }

    public final Object call() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
