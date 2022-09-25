package com.android.p270g;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.android.g.g */
/* compiled from: PG */
class C5149g extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f16357a;

    public C5149g(X509Certificate x509Certificate) {
        this.f16357a = x509Certificate;
    }

    public final void checkValidity() {
        this.f16357a.checkValidity();
    }

    public final int getBasicConstraints() {
        return this.f16357a.getBasicConstraints();
    }

    public final Set getCriticalExtensionOIDs() {
        return this.f16357a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() {
        return this.f16357a.getEncoded();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f16357a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f16357a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f16357a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f16357a.getKeyUsage();
    }

    public final Set getNonCriticalExtensionOIDs() {
        return this.f16357a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f16357a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f16357a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f16357a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f16357a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f16357a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f16357a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f16357a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f16357a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f16357a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f16357a.getSubjectUniqueID();
    }

    public final byte[] getTBSCertificate() {
        return this.f16357a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f16357a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f16357a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f16357a.toString();
    }

    public final void verify(PublicKey publicKey) {
        this.f16357a.verify(publicKey);
    }

    public final void checkValidity(Date date) {
        this.f16357a.checkValidity(date);
    }

    public final void verify(PublicKey publicKey, String str) {
        this.f16357a.verify(publicKey, str);
    }
}
