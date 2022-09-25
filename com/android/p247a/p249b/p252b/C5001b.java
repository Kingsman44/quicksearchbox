package com.android.p247a.p249b.p252b;

import java.math.BigInteger;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.android.a.b.b.b */
/* compiled from: PG */
public class C5001b extends X509Certificate {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final X509Certificate f15846a;

    public C5001b(X509Certificate x509Certificate) {
        this.f15846a = x509Certificate;
    }

    public final void checkValidity() {
        this.f15846a.checkValidity();
    }

    public final int getBasicConstraints() {
        return this.f15846a.getBasicConstraints();
    }

    public final Set getCriticalExtensionOIDs() {
        return this.f15846a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() {
        return this.f15846a.getEncoded();
    }

    public final List getExtendedKeyUsage() {
        return this.f15846a.getExtendedKeyUsage();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f15846a.getExtensionValue(str);
    }

    public final Collection getIssuerAlternativeNames() {
        return this.f15846a.getIssuerAlternativeNames();
    }

    public final Principal getIssuerDN() {
        return this.f15846a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f15846a.getIssuerUniqueID();
    }

    public final X500Principal getIssuerX500Principal() {
        return this.f15846a.getIssuerX500Principal();
    }

    public final boolean[] getKeyUsage() {
        return this.f15846a.getKeyUsage();
    }

    public final Set getNonCriticalExtensionOIDs() {
        return this.f15846a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f15846a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f15846a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f15846a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f15846a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f15846a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f15846a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f15846a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f15846a.getSignature();
    }

    public final Collection getSubjectAlternativeNames() {
        return this.f15846a.getSubjectAlternativeNames();
    }

    public final Principal getSubjectDN() {
        return this.f15846a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f15846a.getSubjectUniqueID();
    }

    public final X500Principal getSubjectX500Principal() {
        return this.f15846a.getSubjectX500Principal();
    }

    public final byte[] getTBSCertificate() {
        return this.f15846a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f15846a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f15846a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f15846a.toString();
    }

    public final void verify(PublicKey publicKey) {
        this.f15846a.verify(publicKey);
    }

    public final void checkValidity(Date date) {
        this.f15846a.checkValidity(date);
    }

    public final void verify(PublicKey publicKey, String str) {
        this.f15846a.verify(publicKey, str);
    }

    public final void verify(PublicKey publicKey, Provider provider) {
        this.f15846a.verify(publicKey, provider);
    }
}
