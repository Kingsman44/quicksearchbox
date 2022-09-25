package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Email_Certificate_CertificateStatus  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Email_Certificate_CertificateStatus extends Email.Certificate.CertificateStatus {

    /* renamed from: a */
    public final double f110636a;

    /* renamed from: b */
    public final int f110637b;

    public C$AutoValue_Email_Certificate_CertificateStatus(double d, int i) {
        this.f110636a = d;
        if (i != 0) {
            this.f110637b = i;
            return;
        }
        throw new NullPointerException("Null statusCode");
    }

    /* renamed from: a */
    public final double mo44991a() {
        return this.f110636a;
    }

    /* renamed from: b */
    public final int mo44992b() {
        return this.f110637b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Email.Certificate.CertificateStatus) {
            Email.Certificate.CertificateStatus certificateStatus = (Email.Certificate.CertificateStatus) obj;
            return Double.doubleToLongBits(this.f110636a) == Double.doubleToLongBits(certificateStatus.mo44991a()) && this.f110637b == certificateStatus.mo44992b();
        }
    }

    public final int hashCode() {
        return this.f110637b ^ ((((int) ((Double.doubleToLongBits(this.f110636a) >>> 32) ^ Double.doubleToLongBits(this.f110636a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.f110636a;
        String num = Integer.toString(this.f110637b - 1);
        return "CertificateStatus{notAfterSec=" + d + ", statusCode=" + num + "}";
    }
}
