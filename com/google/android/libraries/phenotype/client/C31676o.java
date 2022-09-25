package com.google.android.libraries.phenotype.client;

import android.content.Context;
import android.net.Uri;
import androidx.p060c.C0977g;

/* renamed from: com.google.android.libraries.phenotype.client.o */
/* compiled from: PG */
public final class C31676o {

    /* renamed from: a */
    private static final C0977g f85188a = new C0977g();

    private C31676o() {
    }

    /* renamed from: a */
    public static synchronized Uri m59019a(String str) {
        synchronized (C31676o.class) {
            C0977g gVar = f85188a;
            Uri uri = (Uri) gVar.get(str);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
            gVar.put(str, parse);
            return parse;
        }
    }

    /* renamed from: b */
    public static String m59020b(String str) {
        int indexOf = str.indexOf("#");
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        if (!str.contains("@")) {
            return str;
        }
        throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(str)));
    }

    /* renamed from: c */
    public static String m59021c(String str) {
        int i;
        int indexOf = str.indexOf("#");
        if (indexOf < 0 || (i = indexOf + 1) >= str.length() || str.charAt(i) != '@') {
            return str;
        }
        int i2 = indexOf + 2;
        if (str.length() == i2) {
            return str.substring(0, indexOf);
        }
        return String.valueOf(str.substring(0, i)).concat(String.valueOf(str.substring(i2)));
    }

    /* renamed from: d */
    public static String m59022d(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return str + "#" + packageName;
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
    }
}
