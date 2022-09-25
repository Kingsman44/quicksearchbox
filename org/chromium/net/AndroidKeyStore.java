package org.chromium.net;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.chromium.base.C72387m;

/* compiled from: PG */
public class AndroidKeyStore {
    private static final String TAG = "AndroidKeyStore";

    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance(str);
            try {
                instance.init(1, privateKey);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                String algorithm = privateKey.getAlgorithm();
                String name = privateKey.getClass().getName();
                C72387m.m107041b(TAG, "Exception while encrypting input with " + str + " and " + algorithm + " private key (" + name + "): " + e, new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            C72387m.m107041b(TAG, "Cipher " + str + " not supported: " + e2, new Object[0]);
            return null;
        }
    }

    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e) {
            C72387m.m107041b(TAG, "Exception while checking support for " + str + ": " + e, new Object[0]);
            return false;
        }
    }

    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e) {
            C72387m.m107041b(TAG, "Exception while checking support for " + str + ": " + e, new Object[0]);
            return false;
        }
    }

    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature instance = Signature.getInstance(str);
            try {
                instance.initSign(privateKey);
                instance.update(bArr);
                return instance.sign();
            } catch (Exception e) {
                String algorithm = privateKey.getAlgorithm();
                String name = privateKey.getClass().getName();
                C72387m.m107041b(TAG, "Exception while signing message with " + str + " and " + algorithm + " private key (" + name + "): " + e, new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            C72387m.m107041b(TAG, "Signature algorithm " + str + " not supported: " + e2, new Object[0]);
            return null;
        }
    }
}
