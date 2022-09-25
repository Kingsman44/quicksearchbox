package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109774f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a */
/* compiled from: PG */
public final class C109826a {
    /* renamed from: a */
    public static Bundle m182917a(String str, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(str, bArr);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m182918b(C109774f fVar) {
        return m182917a("udc_ask_for_consent_args", fVar.toByteArray());
    }
}
