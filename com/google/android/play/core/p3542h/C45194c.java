package com.google.android.play.core.p3542h;

import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.play.core.h.c */
/* compiled from: PG */
public final class C45194c {
    /* renamed from: a */
    public static String m80472a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
