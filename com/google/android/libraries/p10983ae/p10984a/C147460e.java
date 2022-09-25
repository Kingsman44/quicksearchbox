package com.google.android.libraries.p10983ae.p10984a;

import android.util.Base64;
import android.util.Log;
import com.google.common.base.C58838bb;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.ae.a.e */
/* compiled from: PG */
public final class C147460e {

    /* renamed from: a */
    private static final String f398037a = "e";

    /* renamed from: a */
    public static InputStream m240403a(String str) {
        C58838bb.m90868c(str.startsWith("data:"));
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            String[] split = str.substring(5, indexOf).split(";");
            boolean z = false;
            for (int i = 1; i < split.length; i++) {
                String str2 = split[i];
                if (str2.equals("base64")) {
                    z = true;
                } else if (!str2.startsWith("charset=")) {
                    String str3 = f398037a;
                    Log.e(str3, "Unknown data-URI option '" + str2 + "' in " + str);
                    throw new C147458c(2);
                }
            }
            if (z) {
                try {
                    byte[] decode = Base64.decode(substring, 0);
                    Log.i(f398037a, "Successfully decoded data uri: ".concat(String.valueOf(str)));
                    return new ByteArrayInputStream(decode);
                } catch (IllegalArgumentException unused) {
                    Log.e(f398037a, "Invalid base64 payload in data URI: ".concat(String.valueOf(str)));
                    throw new C147458c(4);
                }
            } else {
                Log.e(f398037a, "We only understand base64-encoded data URIs: ".concat(String.valueOf(str)));
                throw new C147458c(3);
            }
        } else {
            Log.e(f398037a, "Comma not found in data URI: ".concat(String.valueOf(str)));
            throw new C147458c(1);
        }
    }

    /* renamed from: b */
    public static boolean m240404b(String str) {
        return str.startsWith("data:");
    }
}
