package com.google.android.apps.search.assistant.platform.appintegration.p8991c;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.c.a */
/* compiled from: PG */
public final class C119521a {
    /* renamed from: a */
    public static boolean m198385a(String str, String str2, int i) {
        if (!str2.isEmpty() && !str.isEmpty() && i >= 0) {
            for (String str3 : str.split("[,;]", 0)) {
                int indexOf = str3.indexOf(58);
                if (indexOf < 0) {
                    indexOf = str3.length();
                }
                if (indexOf > 0) {
                    if (indexOf != str2.length() || !str3.startsWith(str2)) {
                        int i2 = indexOf - 1;
                        if (str3.charAt(i2) == '*' && str2.startsWith(str3.substring(0, i2))) {
                        }
                    }
                    if (indexOf < str3.length()) {
                        try {
                            if (i >= Integer.parseInt(str3.substring(indexOf + 1))) {
                                return true;
                            }
                            return false;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
