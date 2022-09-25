package com.google;

import com.evernote.android.state.BuildConfig;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.b */
/* compiled from: PG */
public final class C54649b {

    /* renamed from: a */
    private static final String[] f143481a = {"about:", "chrome:", "file:", "ftp:", "intent:", "javascript:", "mailto:"};

    /* renamed from: a */
    public static String m87519a(String str) {
        String str2;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-512");
            if (str == null) {
                str2 = BuildConfig.FLAVOR;
            } else {
                str2 = str.trim();
            }
            String lowerCase = str2.toLowerCase();
            if (!str2.isEmpty()) {
                String[] strArr = f143481a;
                int i = 0;
                while (i < 7) {
                    String str3 = strArr[i];
                    if (!lowerCase.startsWith(str3)) {
                        i++;
                    } else {
                        throw new C6578a(String.format("Invalid URI: \"%s\"", new Object[]{str3}));
                    }
                }
                if (!str2.contains(":")) {
                    throw new C6578a("Invalid URI: no colon");
                } else if (str2.contains("//")) {
                    int indexOf = str2.indexOf("//") + 2;
                    int indexOf2 = str2.indexOf(47, indexOf);
                    if (indexOf == str2.length() || indexOf2 == indexOf) {
                        throw new C6578a("Invalid host");
                    } else if (indexOf2 != -1) {
                        String concat = String.valueOf(str2.substring(0, indexOf2).toLowerCase()).concat(String.valueOf(str2.substring(indexOf2)));
                        if (concat.startsWith("http://")) {
                            concat = concat.substring(5);
                        } else if (concat.startsWith("https://")) {
                            concat = concat.substring(6);
                        }
                        instance.update("0".concat(String.valueOf(concat)).getBytes(Charset.forName("UTF-8")));
                        byte[] digest = instance.digest();
                        StringBuilder sb = new StringBuilder(35);
                        sb.append("wc_");
                        int i2 = 0;
                        while (true) {
                            int length = digest.length;
                            if (i2 < length && i2 < 24) {
                                byte b = digest[i2] & 255;
                                int i3 = i2 + 1;
                                boolean z = i3 < length;
                                byte b2 = z ? digest[i3] & 255 : 0;
                                int i4 = i2 + 2;
                                boolean z2 = i4 < length;
                                byte b3 = z2 ? digest[i4] & 255 : 0;
                                int i5 = b >> 2;
                                int i6 = ((b & 3) << 4) | (b2 >> 4);
                                int i7 = ((b2 & 15) << 2) | (b3 >> 6);
                                byte b4 = b3 & 63;
                                if (!z2) {
                                    b4 = 64;
                                    if (!z) {
                                        i7 = 64;
                                    }
                                }
                                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.".charAt(i5));
                                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.".charAt(i6));
                                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.".charAt(i7));
                                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.".charAt(b4));
                                i2 += 3;
                            }
                        }
                        return sb.toString();
                    } else {
                        throw new C6578a("Not canonical: please append a forward slash \"/\"");
                    }
                } else {
                    throw new C6578a("Invalid URI: no scheme");
                }
            } else {
                throw new C6578a("Invalid URI: empty.");
            }
        } catch (NoSuchAlgorithmException e) {
            throw new C6578a((Throwable) e);
        }
    }
}
