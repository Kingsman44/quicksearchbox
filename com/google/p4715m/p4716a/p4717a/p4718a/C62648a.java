package com.google.p4715m.p4716a.p4717a.p4718a;

import com.google.common.p4522b.C58495hd;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.m.a.a.a.a */
/* compiled from: PG */
final class C62648a {

    /* renamed from: a */
    public final CertificateFactory f169153a;

    /* renamed from: d */
    static final MessageDigest m94884d() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    static final Signature m94885e() {
        try {
            return Signature.getInstance("SHA256WithRSA");
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    static final PKIXCertPathValidatorResult m94886f(CertPath certPath, long j, Set set) {
        try {
            CertPathValidator instance = CertPathValidator.getInstance("PKIX");
            PKIXParameters pKIXParameters = new PKIXParameters(set);
            pKIXParameters.setDate(new Date(j));
            pKIXParameters.setRevocationEnabled(false);
            return (PKIXCertPathValidatorResult) instance.validate(certPath, pKIXParameters);
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58495hd mo58568a() {
        try {
            return C58495hd.m89901o(m94883b(this.f169153a.generateCertificate(new ByteArrayInputStream("-----BEGIN CERTIFICATE-----\nMIIDwzCCAqugAwIBAgIBATANBgkqhkiG9w0BAQUFADB8MQswCQYDVQQGEwJVUzET\nMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91bnRhaW4gVmlldzETMBEG\nA1UECgwKR29vZ2xlIEluYzESMBAGA1UECwwJR29vZ2xlIFRWMRcwFQYDVQQDDA5F\ndXJla2EgUm9vdCBDQTAeFw0xMjEyMTcyMjM5MzNaFw0zMjEyMTIyMjM5MzNaMHwx\nCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3Vu\ndGFpbiBWaWV3MRMwEQYDVQQKDApHb29nbGUgSW5jMRIwEAYDVQQLDAlHb29nbGUg\nVFYxFzAVBgNVBAMMDkV1cmVrYSBSb290IENBMIIBIjANBgkqhkiG9w0BAQEFAAOC\nAQ8AMIIBCgKCAQEAuRHQ6hLcMuHfXDNrGXMdnZ7QOXa/pYQJpv1ubencjzZO6YgC\nvZ/06ET9TPWaAlZqRypjbFhFzHxmJNx5ecMqpLKLoPeitc0Gftu+7AyG8g0kYHSE\nyikjhALYp+078ewmR1TjsS3mZA/2csXpmFIXwPzyLCDIQPhHyTKeO5exi/WYJHBj\nZhnBUugEBT1fjbzYS693mG8feNG2UCdN5OwUaWcfWK+poBEmPJQyB3/X6Wkfrj9P\nY4qPidbyGXhcIY6xtlfYwOHufW7d8ToKavG6//mDL9y1pCAXYzbvyGIZzFbOsuox\niUt4WMG/AxOZ4BLyiKqblNrddnkXHjTRCsQHRQIDAQABo1AwTjAdBgNVHQ4EFgQU\nRE4qR1jYuUiR9k/OdKkdMpqNjekwHwYDVR0jBBgwFoAURE4qR1jYuUiR9k/OdKkd\nMpqNjekwDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQUFAAOCAQEAP8gmoG5cBUB5\noZipM95odIXurrccM1mwEd6f9E/T61EJfUd+blGF9FTNg5glsbqwV+yT2xLi7FFJ\nepZzm8iWbYWM0+E8+jLiWAx3bYcMNAGqMKl24MDn214b6RAwpOAJSSa5WM1aB+VQ\ndd6aO/ZTfrFTXkUnTxfjCDOyUAq79PwllyneQXUw+nc4qmWKc0/qEXvrfBdgJw68\nPnZS2IvtGvjrN7sR/a5wFwr+4K0Gsx9pinIEwsAzC9YvY0wzERS4YjaIxQNlARmj\n7wC7bw6S/zQcodYx0Fxen5l9x8q9fHIL9Fylfm4EqNKZLFEBFP6iSPB+voQNtNPi\n8w593ov1Mw==\n-----END CERTIFICATE-----\n".getBytes(StandardCharsets.UTF_8)))), C62655h.EUREKA_CA_CERT, m94883b(this.f169153a.generateCertificate(new ByteArrayInputStream("-----BEGIN CERTIFICATE-----\nMIIDhzCCAm+gAwIBAgIBATANBgkqhkiG9w0BAQUFADB8MQswCQYDVQQGEwJVUzET\nMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91bnRhaW4gVmlldzETMBEG\nA1UECgwKR29vZ2xlIEluYzESMBAGA1UECwwJR29vZ2xlIFRWMRcwFQYDVQQDDA5F\ndXJla2EgUm9vdCBDQTAeFw0xMjEyMTkwMDQ3MTJaFw0zMjEyMTQwMDQ3MTJaMH0x\nCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3Vu\ndGFpbiBWaWV3MRMwEQYDVQQKDApHb29nbGUgSW5jMRIwEAYDVQQLDAlHb29nbGUg\nVFYxGDAWBgNVBAMMD0V1cmVrYSBHZW4xIElDQTCCASIwDQYJKoZIhvcNAQEBBQAD\nggEPADCCAQoCggEBALwigL2A9johADuudl41fz3DZFxVlIY0LwWHKM33aYwXs1Cn\nuIL638dDLdZ+q6BvtxNygKRHFcEgmVDN7BRiCVukmM3SQbY2Tv/oLjIwSoGoQqNs\nmzNuyrL1U2bgJ1OGGoUepzk/SneO+1RmZvtYVMBeOcf1UAYL4IrUzuFqVR+LFwDm\naaMn5gglaTwSnY0FLNYuojHetFJQ1iBJ3nGg+a0gQBLx3SXr1ea4NvTWj3/KQ9zX\nEFvmP1GKhbPz//YDLcsjT5ytGOeTBYysUpr3TOmZer5ufk0K48YcqZP6OqWRXRy9\nZuvMYNyGdMrP+JIcmH1X+mFHnquAt+RIgCqSxRsCAwEAAaMTMBEwDwYDVR0TBAgw\nBgEB/wIBATANBgkqhkiG9w0BAQUFAAOCAQEAi9Shsc9dzXtsSEpBH1MvGC0yRf+e\nq9NzPh8i1+r6AeZzAw8rxiW7pe7F9UXLJBIqrcJdBfR69cKbEBZa0QpzxRY5oBDK\n0WiFnvueJoOOWPN3oE7l25e+LQBf9ZTbsZ1la/3w0QRR38ySppktcfVN1SP+Mxyp\ntKvFvxq40YDvicniH5xMSDui+gIK3IQBiocC+1nup0wEfXSZh2olRK0WquxONRt8\ne4TJsT/hgnDlDefZbfqVtsXkHugRm9iy86T9E/ODT/cHFCC7IqWmj9a126l0eOKT\nDeUjLwUX4LKXZzRND5x2Q3umIUpWBfYqfPJ/EpSCJikH8AtsbHkUsHTVbA==\n-----END CERTIFICATE-----\n".getBytes(StandardCharsets.UTF_8)))), C62655h.EUREKA_GEN1_ICA_CERT);
        } catch (CertificateException e) {
            throw a$$ExternalSyntheticBackport0.m94889m("Failed to generate a legacy X509Certificate.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Set mo58569c(List list) {
        try {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(new TrustAnchor(m94883b(this.f169153a.generateCertificate(new ByteArrayInputStream(((String) it.next()).getBytes("UTF-8")))), (byte[]) null));
            }
            return hashSet;
        } catch (UnsupportedEncodingException | CertificateException e) {
            throw a$$ExternalSyntheticBackport0.m94889m("Failed to build a trust store.", e);
        }
    }

    public C62648a() {
        try {
            this.f169153a = CertificateFactory.getInstance("X.509");
        } catch (NoSuchProviderException | CertificateException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static X509Certificate m94883b(Certificate certificate) {
        if (certificate != null) {
            return (X509Certificate) certificate;
        }
        throw new CertificateException("Certificate can not be null.");
    }
}
