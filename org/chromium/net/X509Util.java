package org.chromium.net;

import android.net.http.X509TrustManagerExtensions;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.chromium.base.C72387m;
import p000J.C0000N;

/* compiled from: PG */
public class X509Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final String OID_ANY_EKU = "2.5.29.37.0";
    private static final String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
    private static final String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
    private static final String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    private static final String TAG = "X509Util";
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerExtensions sDefaultTrustManager;
    private static boolean sLoadedSystemKeyStore;
    private static final Object sLock = new Object();
    private static File sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509TrustManagerExtensions sTestTrustManager;
    private static C72431ab sTrustStorageListener;

    public static void addTestRootCertificate(byte[] bArr) {
        ensureInitialized();
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            KeyStore keyStore = sTestKeyStore;
            String num = Integer.toString(keyStore.size());
            keyStore.setCertificateEntry("root_cert_" + num, createCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    private static List checkServerTrustedIgnoringRuntimeException(X509TrustManagerExtensions x509TrustManagerExtensions, X509Certificate[] x509CertificateArr, String str, String str2) {
        try {
            return x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        } catch (RuntimeException e) {
            C72387m.m107041b(TAG, "checkServerTrusted() unexpectedly threw: %s", e);
            throw new CertificateException(e);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clearTestRootCertificates() {
        /*
            ensureInitialized()
            java.lang.Object r0 = sLock
            monitor-enter(r0)
            java.security.KeyStore r1 = sTestKeyStore     // Catch:{ IOException -> 0x0012 }
            r2 = 0
            r1.load(r2)     // Catch:{ IOException -> 0x0012 }
            reloadTestTrustManager()     // Catch:{ IOException -> 0x0012 }
            goto L_0x0012
        L_0x0010:
            r1 = move-exception
            goto L_0x0014
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.clearTestRootCertificates():void");
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) {
        ensureInitialized();
        return (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
    }

    private static X509TrustManagerExtensions createTrustManager(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        try {
            TrustManager[] trustManagers = instance.getTrustManagers();
            int length = trustManagers.length;
            int i = 0;
            while (i < length) {
                TrustManager trustManager = trustManagers[i];
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return new X509TrustManagerExtensions((X509TrustManager) trustManager);
                    } catch (IllegalArgumentException e) {
                        String name = trustManager.getClass().getName();
                        C72387m.m107041b(TAG, "Error creating trust manager (" + name + "): " + e, new Object[0]);
                    }
                } else {
                    i++;
                }
            }
            C72387m.m107041b(TAG, "Could not find suitable trust manager", new Object[0]);
            return null;
        } catch (RuntimeException e2) {
            C72387m.m107041b(TAG, "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", e2);
            throw new KeyStoreException(e2);
        }
    }

    private static void ensureInitialized() {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void ensureInitializedLocked() {
        /*
            java.security.cert.CertificateFactory r0 = sCertificateFactory
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)
            sCertificateFactory = r0
        L_0x000c:
            android.net.http.X509TrustManagerExtensions r0 = sDefaultTrustManager
            r1 = 0
            if (r0 != 0) goto L_0x0017
            android.net.http.X509TrustManagerExtensions r0 = createTrustManager(r1)
            sDefaultTrustManager = r0
        L_0x0017:
            boolean r0 = sLoadedSystemKeyStore
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "AndroidCAStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ KeyStoreException -> 0x0044 }
            sSystemKeyStore = r0     // Catch:{ KeyStoreException -> 0x0044 }
            r0.load(r1)     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            java.io.File r0 = new java.io.File     // Catch:{ KeyStoreException -> 0x0044 }
            java.lang.String r2 = "ANDROID_ROOT"
            java.lang.String r2 = java.lang.System.getenv(r2)     // Catch:{ KeyStoreException -> 0x0044 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ KeyStoreException -> 0x0044 }
            r3.<init>()     // Catch:{ KeyStoreException -> 0x0044 }
            r3.append(r2)     // Catch:{ KeyStoreException -> 0x0044 }
            java.lang.String r2 = "/etc/security/cacerts"
            r3.append(r2)     // Catch:{ KeyStoreException -> 0x0044 }
            java.lang.String r2 = r3.toString()     // Catch:{ KeyStoreException -> 0x0044 }
            r0.<init>(r2)     // Catch:{ KeyStoreException -> 0x0044 }
            sSystemCertificateDirectory = r0     // Catch:{ KeyStoreException -> 0x0044 }
        L_0x0044:
            r0 = 1
            sLoadedSystemKeyStore = r0
        L_0x0047:
            java.util.Set r0 = sSystemTrustAnchorCache
            if (r0 != 0) goto L_0x0052
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            sSystemTrustAnchorCache = r0
        L_0x0052:
            java.security.KeyStore r0 = sTestKeyStore
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            sTestKeyStore = r0
            r0.load(r1)     // Catch:{ IOException -> 0x0064 }
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            android.net.http.X509TrustManagerExtensions r0 = sTestTrustManager
            if (r0 != 0) goto L_0x0071
            java.security.KeyStore r0 = sTestKeyStore
            android.net.http.X509TrustManagerExtensions r0 = createTrustManager(r0)
            sTestTrustManager = r0
        L_0x0071:
            org.chromium.net.ab r0 = sTrustStorageListener
            if (r0 != 0) goto L_0x009a
            org.chromium.net.ab r0 = new org.chromium.net.ab
            r0.<init>()
            sTrustStorageListener = r0
            android.content.IntentFilter r3 = new android.content.IntentFilter
            r3.<init>()
            java.lang.String r0 = "android.security.action.KEYCHAIN_CHANGED"
            r3.addAction(r0)
            java.lang.String r0 = "android.security.action.KEY_ACCESS_CHANGED"
            r3.addAction(r0)
            java.lang.String r0 = "android.security.action.TRUST_STORE_CHANGED"
            r3.addAction(r0)
            android.content.Context r1 = org.chromium.base.C72382h.f192527a
            org.chromium.net.ab r2 = sTrustStorageListener
            r4 = 0
            r5 = 0
            r6 = 4
            r1.registerReceiver(r2, r3, r4, r5, r6)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.ensureInitializedLocked():void");
    }

    private static String hashPrincipal(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i = 0; i < 4; i++) {
            int i2 = i + i;
            char[] cArr2 = HEX_DIGITS;
            byte b = digest[3 - i];
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    private static boolean isKnownRoot(X509Certificate x509Certificate) {
        if (sSystemKeyStore == null) {
            return false;
        }
        Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            String str = hashPrincipal + "." + i;
            if (!new File(sSystemCertificateDirectory, str).exists()) {
                return false;
            }
            Certificate certificate = sSystemKeyStore.getCertificate("system:".concat(str));
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    C72387m.m107041b(TAG, "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName(), new Object[0]);
                } else {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                }
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    public static void reloadDefaultTrustManager() {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
        C0000N.MGVAvp19();
    }

    private static void reloadTestTrustManager() {
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean verifyKeyUsage(java.security.cert.X509Certificate r4) {
        /*
            r0 = 0
            java.util.List r4 = r4.getExtendedKeyUsage()     // Catch:{ NullPointerException -> 0x003a }
            r1 = 1
            if (r4 != 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.Iterator r4 = r4.iterator()
        L_0x000d:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "1.3.6.1.5.5.7.3.1"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "2.5.29.37.0"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "2.16.840.1.113730.4.1"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "1.3.6.1.4.1.311.10.3.3"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x000d
        L_0x0039:
            return r1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.verifyKeyUsage(java.security.cert.X509Certificate):boolean");
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        List list;
        if (bArr == null || bArr.length == 0 || bArr[0] == null) {
            throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=".concat(String.valueOf(Arrays.deepToString(bArr))));
        }
        try {
            ensureInitialized();
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(createCertificateFromBytes(bArr[0]));
                for (int i = 1; i < bArr.length; i++) {
                    try {
                        arrayList.add(createCertificateFromBytes(bArr[i]));
                    } catch (CertificateException unused) {
                        C72387m.m107043d(TAG, "intermediate " + i + " failed parsing", new Object[0]);
                    }
                }
                X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                try {
                    x509CertificateArr[0].checkValidity();
                    if (!verifyKeyUsage(x509CertificateArr[0])) {
                        return new AndroidCertVerifyResult(-6);
                    }
                    synchronized (sLock) {
                        X509TrustManagerExtensions x509TrustManagerExtensions = sDefaultTrustManager;
                        if (x509TrustManagerExtensions == null) {
                            AndroidCertVerifyResult androidCertVerifyResult = new AndroidCertVerifyResult(-1);
                            return androidCertVerifyResult;
                        }
                        try {
                            list = checkServerTrustedIgnoringRuntimeException(x509TrustManagerExtensions, x509CertificateArr, str, str2);
                        } catch (CertificateException e) {
                            try {
                                list = checkServerTrustedIgnoringRuntimeException(sTestTrustManager, x509CertificateArr, str, str2);
                            } catch (CertificateException unused2) {
                                String message = e.getMessage();
                                C72387m.m107042c(TAG, "Failed to validate the certificate chain, error: " + message, new Object[0]);
                                return new AndroidCertVerifyResult(-2);
                            }
                        }
                        AndroidCertVerifyResult androidCertVerifyResult2 = new AndroidCertVerifyResult(0, list.size() > 0 ? isKnownRoot((X509Certificate) list.get(list.size() - 1)) : false, list);
                        return androidCertVerifyResult2;
                    }
                } catch (CertificateExpiredException unused3) {
                    return new AndroidCertVerifyResult(-3);
                } catch (CertificateNotYetValidException unused4) {
                    return new AndroidCertVerifyResult(-4);
                } catch (CertificateException unused5) {
                    return new AndroidCertVerifyResult(-1);
                }
            } catch (CertificateException unused6) {
                return new AndroidCertVerifyResult(-5);
            }
        } catch (CertificateException unused7) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
