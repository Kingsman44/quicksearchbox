package com.google.android.apps.gsa.shared.util.p7171i;

import com.evernote.android.state.BuildConfig;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.apps.gsa.shared.util.i.a */
/* compiled from: PG */
public final class C91042a {
    @Deprecated
    /* renamed from: a */
    public static int m148717a(String str) {
        return (int) m148719c(str, "SHA1", 4);
    }

    @Deprecated
    /* renamed from: b */
    public static long m148718b(String str) {
        return m148719c(str, "MD5", 8);
    }

    /* renamed from: c */
    private static long m148719c(String str, String str2, int i) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        try {
            byte[] digest = MessageDigest.getInstance(str2).digest(str.getBytes(Charset.forName("UTF-16LE")));
            long j = 0;
            for (int i2 = 0; i2 < Math.min(digest.length, i); i2++) {
                j |= (((long) digest[i2]) & 255) << (i2 * 8);
            }
            return j;
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException("Can't use ".concat(str2));
        }
    }
}
