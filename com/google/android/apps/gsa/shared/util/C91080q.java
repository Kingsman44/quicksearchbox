package com.google.android.apps.gsa.shared.util;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.util.q */
/* compiled from: PG */
public final class C91080q {
    /* renamed from: a */
    public static Map m148801a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        if (str != null) {
            for (String str3 : TextUtils.split(str, "; ")) {
                int indexOf = str3.indexOf(61);
                if (indexOf == -1) {
                    str2 = str3;
                } else {
                    str2 = str3.substring(0, indexOf);
                }
                hashMap.put(str2.trim(), str3);
            }
        }
        return hashMap;
    }
}
