package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Email_Certificate  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Email_Certificate extends Email.Certificate {

    /* renamed from: a */
    public final PersonFieldMetadata f110633a;

    /* renamed from: b */
    public final Email.Certificate.CertificateStatus f110634b;

    /* renamed from: c */
    public final String f110635c;

    public C$AutoValue_Email_Certificate(PersonFieldMetadata personFieldMetadata, Email.Certificate.CertificateStatus certificateStatus, String str) {
        if (personFieldMetadata != null) {
            this.f110633a = personFieldMetadata;
            if (certificateStatus != null) {
                this.f110634b = certificateStatus;
                if (str != null) {
                    this.f110635c = str;
                    return;
                }
                throw new NullPointerException("Null configurationName");
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null metadata");
    }

    /* renamed from: a */
    public final Email.Certificate.CertificateStatus mo44985a() {
        return this.f110634b;
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo44986b() {
        return this.f110633a;
    }

    /* renamed from: c */
    public final String mo44987c() {
        return this.f110635c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Email.Certificate) {
            Email.Certificate certificate = (Email.Certificate) obj;
            return this.f110633a.equals(certificate.mo44986b()) && this.f110634b.equals(certificate.mo44985a()) && this.f110635c.equals(certificate.mo44987c());
        }
    }

    public final int hashCode() {
        return ((((this.f110633a.hashCode() ^ 1000003) * 1000003) ^ this.f110634b.hashCode()) * 1000003) ^ this.f110635c.hashCode();
    }

    public final String toString() {
        String obj = this.f110633a.toString();
        String obj2 = this.f110634b.toString();
        String str = this.f110635c;
        return "Certificate{metadata=" + obj + ", status=" + obj2 + ", configurationName=" + str + "}";
    }
}
