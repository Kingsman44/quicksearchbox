package com.google.p5238v.p5239a.p5248e.p5249a;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.C67907w;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.v.a.e.a.d */
/* compiled from: PG */
public final class C67587d implements C67907w {

    /* renamed from: a */
    private static final String f183518a = "d";

    /* renamed from: b */
    private KeyStore f183519b;

    public C67587d() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            this.f183519b = instance;
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public final synchronized C67486a mo59932a(String str) {
        C67586c cVar;
        cVar = new C67586c(C67870bp.m98086d(str), this.f183519b);
        byte[] a = C67859be.m98062a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a, cVar.mo59877a(cVar.mo59878b(a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return cVar;
    }

    /* renamed from: b */
    public final synchronized boolean mo59933b(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        java.lang.Thread.sleep(20);
        r0 = java.security.KeyStore.getInstance("AndroidKeyStore");
        r2.f183519b = r0;
        r0.load((java.security.KeyStore.LoadStoreParameter) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return r2.f183519b.containsAlias(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        throw new java.security.GeneralSecurityException(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        android.util.Log.w(f183518a, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo59934c(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r3 = com.google.p5238v.p5239a.p5259m.C67870bp.m98086d(r3)     // Catch:{ all -> 0x0034 }
            java.security.KeyStore r0 = r2.f183519b     // Catch:{ NullPointerException -> 0x000d }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x000d }
            monitor-exit(r2)
            return r3
        L_0x000d:
            java.lang.String r0 = f183518a     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0034 }
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            r2.f183519b = r0     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
        L_0x0025:
            java.security.KeyStore r0 = r2.f183519b     // Catch:{ all -> 0x0034 }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return r3
        L_0x002d:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5248e.p5249a.C67587d.mo59934c(java.lang.String):boolean");
    }
}
