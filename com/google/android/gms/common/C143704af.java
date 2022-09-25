package com.google.android.gms.common;

import android.util.Log;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.gms.common.af */
/* compiled from: PG */
public final class C143704af {
    /* renamed from: a */
    public static byte[] m233458a(X509Certificate x509Certificate) {
        try {
            return x509Certificate.getEncoded();
        } catch (CertificateEncodingException e) {
            Log.w("GoogleSourceStampsChkr", "Unable to encode certificate", e);
            return null;
        }
    }
}
