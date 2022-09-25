package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4591e.p4592a.p4594b.p4596b.C61024c;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.al */
/* compiled from: PG */
public final /* synthetic */ class C124939al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C61024c f344728a;

    public /* synthetic */ C124939al(C61024c cVar) {
        this.f344728a = cVar;
    }

    public final C60870cx apply(Object obj) {
        C61024c cVar = this.f344728a;
        if (cVar.mo57576a(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(((String) obj).replace("-----BEGIN PUBLIC KEY-----", BuildConfig.FLAVOR).replace("\n", BuildConfig.FLAVOR).replace("-----END PUBLIC KEY-----", BuildConfig.FLAVOR), 0))))) {
            return C60856cj.m92900i(cVar.f165244b);
        }
        throw new GeneralSecurityException("Could not verify key");
    }
}
