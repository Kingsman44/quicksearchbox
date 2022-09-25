package com.android.p247a.p249b.p252b;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: com.android.a.b.b.d */
/* compiled from: PG */
public final class C5003d extends C5001b {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final byte[] f15850b;

    /* renamed from: c */
    private int f15851c = -1;

    public C5003d(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f15850b = (byte[]) bArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((X509Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    public final byte[] getEncoded() {
        byte[] bArr = this.f15850b;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public final int hashCode() {
        int i = this.f15851c;
        if (i != -1) {
            return i;
        }
        try {
            int hashCode = Arrays.hashCode(getEncoded());
            this.f15851c = hashCode;
            return hashCode;
        } catch (CertificateEncodingException unused) {
            this.f15851c = 0;
            return 0;
        }
    }
}
