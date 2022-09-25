package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import java.io.ByteArrayInputStream;
import java.net.Socket;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.X509ExtendedKeyManager;
import org.p5633c.p5634a.C72290n;

/* renamed from: com.google.android.gms.usonia.auth.internal.d */
/* compiled from: PG */
public final class C146131d extends X509ExtendedKeyManager {

    /* renamed from: a */
    private final String f394880a;

    /* renamed from: b */
    private final C146130c f394881b = new C146130c();

    /* renamed from: c */
    private boolean f394882c = false;

    public C146131d(String str) {
        this.f394880a = str;
    }

    /* renamed from: h */
    private final SignAppCertificateParams m238002h(KeyPair keyPair) {
        try {
            CertificateRequestInformation certificateRequestInformation = new CertificateRequestInformation();
            certificateRequestInformation.f394856a = this.f394880a;
            certificateRequestInformation.f394857b = keyPair.getPublic().getEncoded();
            Signature instance = Signature.getInstance("SHA256withECDSA");
            instance.initSign(keyPair.getPrivate());
            Parcel obtain = Parcel.obtain();
            C146122a.m237994a(certificateRequestInformation, obtain);
            instance.update(obtain.marshall());
            SignAppCertificateParams signAppCertificateParams = new SignAppCertificateParams();
            signAppCertificateParams.f394862a = certificateRequestInformation;
            signAppCertificateParams.f394863b = "SHA256withECDSA";
            signAppCertificateParams.f394864c = instance.sign();
            return signAppCertificateParams;
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    private static final KeyPair m238003i() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(C146146s.f394902a);
            return instance.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw d$$ExternalSyntheticBackport0.m238011m("Unable to generate a key with Android Keystore", e);
        }
    }

    /* renamed from: a */
    public final synchronized SignAppCertificateParams mo122671a() {
        KeyPair i;
        if (!this.f394882c) {
            this.f394882c = true;
            i = m238003i();
            C146130c cVar = this.f394881b;
            cVar.f394877b[cVar.mo122669a()] = i.getPrivate();
        } else {
            throw new IllegalStateException("Cannot generateKeyAndCSR() twice before calling setCertificate().");
        }
        return m238002h(i);
    }

    /* renamed from: b */
    public final synchronized X509Certificate mo122672b() {
        C146130c cVar;
        cVar = this.f394881b;
        return cVar.f394878c[cVar.f394879d];
    }

    /* renamed from: c */
    public final synchronized C72290n mo122673c() {
        C146130c cVar = this.f394881b;
        X509Certificate x509Certificate = cVar.f394878c[cVar.f394879d];
        if (x509Certificate == null) {
            return C72290n.f192434a;
        }
        return C72290n.m106811a(x509Certificate.getNotAfter().getTime());
    }

    public final synchronized String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        return C146130c.f394876a[this.f394881b.f394879d];
    }

    public final synchronized String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return C146130c.f394876a[this.f394881b.f394879d];
    }

    /* renamed from: d */
    public final synchronized void mo122676d() {
        this.f394882c = false;
    }

    /* renamed from: e */
    public final synchronized void mo122677e(byte[] bArr) {
        C146130c cVar = this.f394881b;
        if (cVar.f394877b[cVar.mo122669a()] != null) {
            C146130c cVar2 = this.f394881b;
            cVar2.f394878c[cVar2.mo122669a()] = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
            C146130c cVar3 = this.f394881b;
            cVar3.f394877b[cVar3.mo122669a()].getClass();
            cVar3.f394878c[cVar3.mo122669a()].getClass();
            cVar3.f394879d = cVar3.mo122669a();
            this.f394882c = false;
        } else {
            throw new IllegalStateException("setCertificate() was called with no pending key. Must call generateKeyAndCSR first.");
        }
    }

    /* renamed from: f */
    public final synchronized byte[] mo122678f(byte[] bArr, String str) {
        Signature instance;
        if (this.f394881b.mo122670b()) {
            try {
                instance = Signature.getInstance(str);
                C146130c cVar = this.f394881b;
                PrivateKey privateKey = cVar.f394877b[cVar.f394879d];
                privateKey.getClass();
                instance.initSign(privateKey);
                instance.update(bArr);
            } catch (NoSuchAlgorithmException e) {
                throw new SignatureException("Invalid signature algorithm.", e);
            } catch (InvalidKeyException e2) {
                throw new SignatureException("Invalid active key.", e2);
            }
        } else {
            throw new SignatureException("No active key.");
        }
        return instance.sign();
    }

    /* renamed from: g */
    public final synchronized KeyManager[] mo122679g() {
        if (this.f394881b.mo122670b()) {
        } else {
            throw new IllegalStateException("Must call setCertificate before getKeyManager");
        }
        return new KeyManager[]{this};
    }

    public final synchronized X509Certificate[] getCertificateChain(String str) {
        if (C146130c.f394876a[this.f394881b.f394879d].equals(str)) {
            X509Certificate[] x509CertificateArr = new X509Certificate[1];
            C146130c cVar = this.f394881b;
            X509Certificate x509Certificate = cVar.f394878c[cVar.f394879d];
            x509Certificate.getClass();
            x509CertificateArr[0] = x509Certificate;
            return x509CertificateArr;
        }
        if (C146130c.f394876a[this.f394881b.mo122669a()].equals(str)) {
            X509Certificate[] x509CertificateArr2 = new X509Certificate[1];
            C146130c cVar2 = this.f394881b;
            X509Certificate x509Certificate2 = cVar2.f394878c[cVar2.mo122669a()];
            x509Certificate2.getClass();
            x509CertificateArr2[0] = x509Certificate2;
            return x509CertificateArr2;
        }
        return new X509Certificate[0];
    }

    public final synchronized String[] getClientAliases(String str, Principal[] principalArr) {
        return new String[]{C146130c.f394876a[this.f394881b.f394879d]};
    }

    public final synchronized PrivateKey getPrivateKey(String str) {
        if (C146130c.f394876a[this.f394881b.f394879d].equals(str)) {
            C146130c cVar = this.f394881b;
            PrivateKey privateKey = cVar.f394877b[cVar.f394879d];
            privateKey.getClass();
            return privateKey;
        }
        if (!C146130c.f394876a[this.f394881b.mo122669a()].equals(str)) {
            return null;
        }
        C146130c cVar2 = this.f394881b;
        PrivateKey privateKey2 = cVar2.f394877b[cVar2.mo122669a()];
        privateKey2.getClass();
        return privateKey2;
    }

    public final synchronized String[] getServerAliases(String str, Principal[] principalArr) {
        return new String[]{C146130c.f394876a[this.f394881b.f394879d]};
    }
}
