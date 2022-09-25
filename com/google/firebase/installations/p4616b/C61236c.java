package com.google.firebase.installations.p4616b;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.google.firebase.installations.b.c */
/* compiled from: PG */
public final class C61236c {

    /* renamed from: a */
    public static final String[] f165648a = {"*", "FCM", "GCM", BuildConfig.FLAVOR};

    /* renamed from: b */
    public final SharedPreferences f165649b;

    /* renamed from: c */
    public final String f165650c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r0.isEmpty() != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61236c(com.google.firebase.C61204g r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.mo57770f()
            android.content.Context r0 = r4.f165555c
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f165649b = r0
            r4.mo57770f()
            com.google.firebase.n r0 = r4.f165557e
            java.lang.String r0 = r0.f165715c
            if (r0 == 0) goto L_0x001b
            goto L_0x0049
        L_0x001b:
            r4.mo57770f()
            com.google.firebase.n r4 = r4.f165557e
            java.lang.String r0 = r4.f165714b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0032
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L_0x0049
        L_0x0032:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x003f
        L_0x003d:
            r0 = r2
            goto L_0x0049
        L_0x003f:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0049
            goto L_0x003d
        L_0x0049:
            r3.f165650c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p4616b.C61236c.<init>(com.google.firebase.g):void");
    }

    /* renamed from: a */
    public static String m93654a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: b */
    public static final PublicKey m93655b(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored ".concat(e.toString()));
            return null;
        }
    }
}
