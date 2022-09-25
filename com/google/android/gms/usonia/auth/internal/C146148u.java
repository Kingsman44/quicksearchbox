package com.google.android.gms.usonia.auth.internal;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Vector;
import org.chromium.net.PrivateKeyType;
import org.p5623b.p5624a.C72034at;
import org.p5623b.p5624a.C72050bc;
import org.p5623b.p5624a.C72054bg;
import org.p5623b.p5624a.C72059bl;
import org.p5623b.p5624a.C72060bm;
import org.p5623b.p5624a.C72093f;
import org.p5623b.p5624a.C72099l;
import org.p5623b.p5624a.C72103p;
import org.p5623b.p5624a.p5626b.C72047c;
import org.p5623b.p5624a.p5628c.C72075a;
import org.p5623b.p5624a.p5628c.C72076b;
import org.p5623b.p5624a.p5628c.C72077c;
import org.p5623b.p5624a.p5628c.C72078d;
import org.p5623b.p5624a.p5628c.C72079e;
import org.p5623b.p5624a.p5628c.C72080f;
import org.p5623b.p5624a.p5628c.C72081g;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.C72131f;
import org.p5633c.p5634a.C72290n;

/* renamed from: com.google.android.gms.usonia.auth.internal.u */
/* compiled from: PG */
public final class C146148u {

    /* renamed from: a */
    private static final HashSet f394909a = new HashSet(Arrays.asList(new C72103p[]{C146147t.f394904b, C146147t.f394905c, C146147t.f394906d}));

    /* renamed from: b */
    private C58495hd f394910b = C58729pv.f156485a;

    /* renamed from: c */
    private static final void m238036c(C72080f fVar, String str, byte[] bArr, byte[] bArr2) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArr2));
            Signature instance = Signature.getInstance(str);
            instance.initVerify(generatePublic);
            instance.update(bArr2);
            instance.update(fVar.mo63294p("DER"));
            if (!instance.verify(bArr)) {
                throw new CertificateException("Signature could not be verified");
            }
        } catch (NoSuchAlgorithmException e) {
            throw u$$ExternalSyntheticBackport0.m238039m("Could not instantiate KeyFactory", e);
        } catch (IOException e2) {
            throw u$$ExternalSyntheticBackport0.m238039m("Unexpected IO Exception", e2);
        } catch (InvalidKeyException | InvalidKeySpecException e3) {
            throw new CertificateException("Invalid public key", e3);
        } catch (SignatureException e4) {
            throw new CertificateException("Invalid signature", e4);
        }
    }

    /* renamed from: a */
    public final synchronized void mo122698a(Map map) {
        this.f394910b = C58495hd.m89898l(map);
    }

    /* renamed from: b */
    public final String mo122699b(X509Certificate x509Certificate) {
        C58495hd hdVar;
        C72080f fVar = C72076b.m105518a(x509Certificate.getEncoded()).f191872b;
        C72290n a = C72290n.m106811a(x509Certificate.getNotAfter().getTime());
        if (a.compareTo(C72290n.m106811a(System.currentTimeMillis())) >= 0) {
            C72078d dVar = fVar.f191890j;
            if (dVar != null) {
                Vector vector = new Vector();
                int i = 0;
                for (int i2 = 0; i2 != dVar.f191878b.size(); i2++) {
                    Object elementAt = dVar.f191878b.elementAt(i2);
                    if (((C72077c) dVar.f191877a.get(elementAt)).f191875c) {
                        vector.addElement(elementAt);
                    }
                }
                C72103p[] b = C72078d.m105522b(vector);
                int length = b.length;
                int i3 = 0;
                while (i3 < length) {
                    C72103p pVar = b[i3];
                    if (f394909a.contains(pVar)) {
                        i3++;
                    } else {
                        throw new CertificateException("Unrecognized critical extension: ".concat(String.valueOf(String.valueOf(pVar))));
                    }
                }
                byte[] bArr = null;
                byte[] bArr2 = null;
                boolean z = false;
                for (C72103p pVar2 : C72078d.m105522b(dVar.f191878b)) {
                    if (pVar2.mo63309r(C146147t.f394905c)) {
                        bArr2 = C72050bc.m105606i(dVar.mo63262a(C146147t.f394905c).f191876d.mo63236k()).mo63236k();
                    } else {
                        if (pVar2.mo63309r(C146147t.f394904b)) {
                            bArr = C72050bc.m105606i(dVar.mo63262a(C146147t.f394904b).f191876d.mo63236k()).mo63236k();
                        }
                        if (pVar2.mo63309r(C146147t.f394907e)) {
                            z = C72131f.m105664b(C72060bm.m105466i(dVar.mo63262a(C146147t.f394907e).f191876d.mo63236k()).f191857a).equals("yes");
                        }
                    }
                }
                if (!z) {
                    throw new CertificateException("Certificate is not for a trusted app.");
                } else if (bArr != null) {
                    C72034at atVar = fVar.f191889i.f191879a;
                    byte[] bArr3 = atVar.f191798a;
                    int i4 = atVar.f191799b;
                    int length2 = bArr3.length;
                    if (length2 != 0) {
                        bArr3 = C72123b.m105660b(bArr3);
                        int i5 = length2 - 1;
                        bArr3[i5] = (byte) ((PrivateKeyType.INVALID << i4) & bArr3[i5]);
                    }
                    try {
                        synchronized (this) {
                            hdVar = this.f394910b;
                        }
                        C58800sl lA = hdVar.entrySet().iterator();
                        while (lA.hasNext()) {
                            Map.Entry entry = (Map.Entry) lA.next();
                            MessageDigest instance = MessageDigest.getInstance("SHA-256");
                            instance.update((byte[]) entry.getValue());
                            instance.update(bArr3);
                            byte[] digest = instance.digest();
                            if (Arrays.equals(digest, bArr)) {
                                m238036c(fVar, x509Certificate.getSigAlgName(), x509Certificate.getSignature(), (byte[]) entry.getValue());
                                return (String) entry.getKey();
                            } else if (bArr2 != null && Arrays.equals(digest, bArr2)) {
                                C72059bl blVar = new C72059bl(true, 0, new C72099l(2));
                                C72099l lVar = fVar.f191883c;
                                C72075a aVar = fVar.f191884d;
                                C72047c cVar = fVar.f191885e;
                                C72081g gVar = fVar.f191886f;
                                C72081g gVar2 = fVar.f191887g;
                                C72047c cVar2 = fVar.f191888h;
                                C72079e eVar = fVar.f191889i;
                                C72078d dVar2 = fVar.f191890j;
                                ArrayList arrayList = new ArrayList();
                                C72103p[] b2 = C72078d.m105522b(dVar2.f191878b);
                                int length3 = b2.length;
                                while (i < length3) {
                                    int i6 = length3;
                                    C72103p pVar3 = b2[i];
                                    C72103p[] pVarArr = b2;
                                    if (!pVar3.mo63309r(C146147t.f394906d)) {
                                        arrayList.add(dVar2.mo63262a(pVar3));
                                    }
                                    i++;
                                    length3 = i6;
                                    b2 = pVarArr;
                                }
                                boolean z2 = false;
                                C72078d dVar3 = new C72078d((C72077c[]) arrayList.toArray(new C72077c[0]));
                                C72077c a2 = dVar3.mo63262a(C72077c.f191873a);
                                if (a2 != null && a2.f191875c) {
                                    z2 = true;
                                }
                                if (lVar == null || aVar == null || cVar == null || gVar == null || gVar2 == null || ((cVar2 == null && !z2) || eVar == null)) {
                                    throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
                                }
                                C72093f fVar2 = new C72093f(10);
                                fVar2.mo63279b(blVar);
                                fVar2.mo63279b(lVar);
                                fVar2.mo63279b(aVar);
                                fVar2.mo63279b(cVar);
                                C72093f fVar3 = new C72093f(2);
                                fVar3.mo63279b(gVar);
                                fVar3.mo63279b(gVar2);
                                fVar2.mo63279b(new C72054bg(fVar3));
                                if (cVar2 != null) {
                                    fVar2.mo63279b(cVar2);
                                } else {
                                    fVar2.mo63279b(new C72054bg());
                                }
                                fVar2.mo63279b(eVar);
                                fVar2.mo63279b(new C72059bl(true, 3, dVar3));
                                C72080f a3 = C72080f.m105526a(new C72054bg(fVar2));
                                C72034at i7 = C72034at.m105368i(dVar.mo63262a(C146147t.f394906d).f191876d.mo63236k());
                                if (i7.f191799b == 0) {
                                    m238036c(a3, x509Certificate.getSigAlgName(), C72123b.m105660b(i7.f191798a), (byte[]) entry.getValue());
                                    return (String) entry.getKey();
                                }
                                throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
                            }
                        }
                        throw new CertificateException("Could not find a matching idKey for certificate");
                    } catch (NoSuchAlgorithmException e) {
                        throw u$$ExternalSyntheticBackport0.m238039m("Could not get a MessageDigest for SHA-256", e);
                    }
                } else {
                    throw new CertificateException("Certificate is missing the ID Hash extension");
                }
            } else {
                throw new CertificateException("Certificate extensions do not exist.");
            }
        } else {
            throw new CertificateException("Certificate expired at ".concat(a.toString()));
        }
    }
}
