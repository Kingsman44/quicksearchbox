package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.C143596v;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.cast.n */
/* compiled from: PG */
public final class C143605n {
    /* renamed from: a */
    public static final String m233297a(String str, String str2, Collection collection) {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String upperCase = str2.toUpperCase(Locale.ROOT);
        if (upperCase.matches("[A-F0-9]+")) {
            sb.append("/");
            sb.append(upperCase);
            if (collection != null) {
                if (!collection.isEmpty()) {
                    sb.append("/");
                    Iterator it = collection.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        C143596v.m233277j(str3);
                        if (!z) {
                            sb.append(",");
                        }
                        if (!C143596v.f389362a.matcher(str3).matches()) {
                            StringBuilder sb2 = new StringBuilder(str3.length());
                            for (int i = 0; i < str3.length(); i++) {
                                char charAt = str3.charAt(i);
                                if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                                    sb2.append(String.format("%%%04x", new Object[]{Integer.valueOf(charAt)}));
                                } else {
                                    sb2.append(charAt);
                                }
                            }
                            str3 = sb2.toString();
                        }
                        sb.append(str3);
                        z = false;
                    }
                } else {
                    throw new IllegalArgumentException("Must specify at least one namespace");
                }
            }
            if (collection == null) {
                sb.append("/");
            }
            sb.append("//ALLOW_IPV6");
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid application ID: ".concat(str2));
    }
}
