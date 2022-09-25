package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4591e.p4592a.p4594b.p4596b.C61024c;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.ah */
/* compiled from: PG */
public final /* synthetic */ class C96450ah implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C61024c f269826a;

    public /* synthetic */ C96450ah(C61024c cVar) {
        this.f269826a = cVar;
    }

    public final C60870cx apply(Object obj) {
        if (this.f269826a.mo57576a(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(((String) obj).replace("-----BEGIN PUBLIC KEY-----", BuildConfig.FLAVOR).replace("\n", BuildConfig.FLAVOR).replace("-----END PUBLIC KEY-----", BuildConfig.FLAVOR), 0))))) {
            return C60866ct.f164955a;
        }
        throw new GeneralSecurityException("Could not verify key");
    }
}
