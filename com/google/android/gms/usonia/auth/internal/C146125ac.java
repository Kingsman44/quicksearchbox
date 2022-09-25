package com.google.android.gms.usonia.auth.internal;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.google.android.gms.usonia.auth.internal.ac */
/* compiled from: PG */
final class C146125ac implements X509TrustManager {

    /* renamed from: a */
    final /* synthetic */ C146127ae f394869a;

    public C146125ac(C146127ae aeVar) {
        this.f394869a = aeVar;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("UsoniaTrustManager does not support server operation yet");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr.length != 0) {
            this.f394869a.mo122666a(x509CertificateArr);
            return;
        }
        throw new CertificateException("Chain is empty");
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
