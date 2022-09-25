package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9401e;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.DesugarDate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.e.b */
/* compiled from: PG */
public final class C124605b implements C124604a {

    /* renamed from: a */
    private static final C59071e f343721a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.c.e.b");

    /* renamed from: b */
    private final Context f343722b;

    /* renamed from: c */
    private final C60950i f343723c;

    public C124605b(Context context, C60950i iVar) {
        this.f343722b = context;
        this.f343723c = iVar;
    }

    /* renamed from: e */
    private static String m204271e(String str) {
        return "bisto-psk-".concat(String.valueOf(str));
    }

    /* renamed from: f */
    private static KeyPair m204272f(Context context, Instant instant, String str) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            if (!instance.containsAlias(str)) {
                m204274h(context, instant, str);
            }
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) instance.getEntry(str, (KeyStore.ProtectionParameter) null);
            if (privateKeyEntry == null) {
                return null;
            }
            return new KeyPair(privateKeyEntry.getCertificate().getPublicKey(), privateKeyEntry.getPrivateKey());
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException e) {
            C59104x c = f343721a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoKeyWrapper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(36266)).mo56386p("Error in retrieval");
            return null;
        }
    }

    /* renamed from: g */
    private static SecretKey m204273g(byte[] bArr, KeyPair keyPair) {
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(4, keyPair.getPrivate());
            return (SecretKey) instance.unwrap(bArr, "AES", 3);
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            C59104x c = f343721a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoKeyWrapper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(36267)).mo56386p("Error in unwrapping");
            return null;
        }
    }

    /* renamed from: h */
    private static void m204274h(Context context, Instant instant, String str) {
        KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context).setAlias(str).setSubject(new X500Principal("CN=".concat(str))).setSerialNumber(BigInteger.ONE).setStartDate(DesugarDate.from(instant)).setEndDate(DesugarDate.from(instant.plus(Duration.ofDays(36500)))).build();
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance.initialize(build);
            instance.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            C59104x c = f343721a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoKeyWrapper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(36268)).mo56386p("Error in generation");
        }
    }

    /* renamed from: i */
    private static byte[] m204275i(SecretKey secretKey, KeyPair keyPair) {
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(3, keyPair.getPublic());
            return instance.wrap(secretKey);
        } catch (InvalidKeyException | NoSuchAlgorithmException | IllegalBlockSizeException | NoSuchPaddingException e) {
            C59104x c = f343721a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoKeyWrapper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(36271)).mo56386p("Error in wrapping");
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo106553a(String str) {
        String e = m204271e(str);
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance.containsAlias(e);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            C59104x c = f343721a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoKeyWrapper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(36270)).mo56386p("Error in lookup");
            return false;
        }
    }

    /* renamed from: b */
    public final byte[] mo106554b(String str, byte[] bArr) {
        SecretKey g;
        KeyPair f = m204272f(this.f343722b, this.f343723c.mo57444a(), m204271e(str));
        if (f == null || (g = m204273g(bArr, f)) == null) {
            return null;
        }
        return g.getEncoded();
    }

    /* renamed from: c */
    public final byte[] mo106555c(String str, byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "TLS_ECDHE_PSK_WITH_NULL_SHA");
        KeyPair f = m204272f(this.f343722b, this.f343723c.mo57444a(), m204271e(str));
        if (f == null) {
            return null;
        }
        return m204275i(secretKeySpec, f);
    }

    /* renamed from: d */
    public final void mo106556d(String str) {
        String e = m204271e(str);
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            if (instance.containsAlias(e)) {
                instance.deleteEntry(e);
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            C59104x c = f343721a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoKeyWrapper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(36269)).mo56386p("Error cleaning up");
        }
    }
}
