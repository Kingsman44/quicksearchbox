package com.google.p4715m.p4716a.p4717a.p4718a;

import com.google.p4656j.p4657a.C61722f;
import com.google.p4656j.p4657a.C61724h;
import com.google.protobuf.C63088z;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.m.a.a.a.f */
/* compiled from: PG */
public final class C62653f {

    /* renamed from: a */
    private final C62651d f169156a;

    /* renamed from: b */
    private final C62654g f169157b;

    /* renamed from: c */
    private final Set f169158c = new HashSet();

    /* renamed from: d */
    private final Map f169159d = new HashMap();

    public C62653f(C62651d dVar, C61724h hVar, C62654g gVar) {
        this.f169156a = dVar;
        this.f169157b = gVar;
        for (C63088z b : hVar.f166759d) {
            this.f169158c.add(m94894b(b));
        }
        for (C61722f fVar : hVar.f166760e) {
            ByteBuffer b2 = m94894b(fVar.f166750a);
            if (!this.f169159d.containsKey(b2)) {
                this.f169159d.put(b2, new HashSet());
            }
            ((Set) this.f169159d.get(b2)).add(new C62652e(fVar));
        }
    }

    /* renamed from: b */
    private static final ByteBuffer m94894b(C63088z zVar) {
        boolean z = true;
        C62656i.m94896c(!zVar.mo59173M(), "Missing SPKI hash.");
        if (zVar.mo59031d() != 32) {
            z = false;
        }
        C62656i.m94896c(z, "Bad SPKI hash value.");
        return zVar.mo59043o();
    }

    /* renamed from: a */
    public final boolean mo58572a(CertPath certPath, TrustAnchor trustAnchor, long j) {
        try {
            C62654g gVar = this.f169157b;
            if (j > gVar.f169161b || j < gVar.f169160a) {
                return false;
            }
            if (this.f169158c.isEmpty()) {
                if (this.f169159d.isEmpty()) {
                    return true;
                }
            }
            List<? extends Certificate> certificates = certPath.getCertificates();
            X509Certificate trustedCert = trustAnchor.getTrustedCert();
            if (trustedCert != null) {
                ByteBuffer wrap = ByteBuffer.wrap(C62648a.m94884d().digest(trustedCert.getPublicKey().getEncoded()));
                int size = certificates.size() - 1;
                while (size >= 0) {
                    ByteBuffer wrap2 = ByteBuffer.wrap(C62648a.m94884d().digest(((Certificate) certificates.get(size)).getPublicKey().getEncoded()));
                    if (this.f169158c.contains(wrap2)) {
                        this.f169156a.mo29122a("Certificate revoked by SPKI hash.");
                        return false;
                    }
                    if (this.f169159d.containsKey(wrap)) {
                        BigInteger serialNumber = ((X509Certificate) certificates.get(size)).getSerialNumber();
                        if (serialNumber.bitLength() <= 64) {
                            for (C62652e eVar : (Set) this.f169159d.get(wrap)) {
                                if (serialNumber.compareTo(eVar.f169154a) >= 0 && serialNumber.compareTo(eVar.f169155b) <= 0) {
                                    return false;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                    size--;
                    wrap = wrap2;
                }
                return true;
            }
            throw new IllegalArgumentException("Trusted cert must be present in the trust anchor.");
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            this.f169156a.mo29123b("Revocation check failed due to exception", e);
            return false;
        }
    }
}
