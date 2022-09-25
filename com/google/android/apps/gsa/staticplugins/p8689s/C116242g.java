package com.google.android.apps.gsa.staticplugins.p8689s;

import android.hardware.biometrics.BiometricPrompt;
import android.security.keystore.KeyGenParameterSpec;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* renamed from: com.google.android.apps.gsa.staticplugins.s.g */
/* compiled from: PG */
final class C116242g {

    /* renamed from: a */
    private static final C59071e f322331a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.s.g");

    /* renamed from: d */
    private final SecretKey m192791d() {
        try {
            KeyGenerator b = mo102636b();
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            SecretKey secretKey = null;
            instance.load((KeyStore.LoadStoreParameter) null);
            try {
                secretKey = (SecretKey) instance.getKey("com.google.android.apps.gsa.staticplugins.biometricauth", (char[]) null);
            } catch (UnrecoverableKeyException e) {
                ((C59052c) ((C59052c) ((C59052c) f322331a.mo56225c()).mo56382g(e)).mo56372aa(14494)).mo56386p("Can't get key from the keystore.");
            }
            return secretKey == null ? mo102637c(b) : secretKey;
        } catch (NoSuchAlgorithmException | NoSuchProviderException e2) {
            throw new RuntimeException("Failed to get an instance of KeyGenerator", e2);
        } catch (IOException | InvalidAlgorithmParameterException | KeyStoreException | CertificateException e3) {
            throw new RuntimeException("Failed to init Cipher", e3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final BiometricPrompt.CryptoObject mo102635a() {
        try {
            SecretKey d = m192791d();
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(1, d);
            return new BiometricPrompt.CryptoObject(instance);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException("Failed to get an instance of Cipher", e);
        } catch (Exception e2) {
            throw new RuntimeException("Error getting SecretKey", e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final KeyGenerator mo102636b() {
        return KeyGenerator.getInstance("AES", "AndroidKeyStore");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final SecretKey mo102637c(KeyGenerator keyGenerator) {
        keyGenerator.init(new KeyGenParameterSpec.Builder("com.google.android.apps.gsa.staticplugins.biometricauth", 3).setBlockModes(new String[]{"CBC"}).setEncryptionPaddings(new String[]{"PKCS7Padding"}).setUserAuthenticationRequired(true).build());
        return keyGenerator.generateKey();
    }
}
