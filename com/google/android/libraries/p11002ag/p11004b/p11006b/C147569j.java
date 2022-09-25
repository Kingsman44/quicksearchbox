package com.google.android.libraries.p11002ag.p11004b.p11006b;

import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.ag.b.b.j */
/* compiled from: PG */
public final class C147569j implements C147570k {

    /* renamed from: a */
    private static final Pattern f398268a = Pattern.compile("^[\\p{L}\\p{N}]+$");

    /* renamed from: b */
    private final String f398269b;

    public C147569j(String str) {
        this.f398269b = str.concat("_");
    }

    /* renamed from: a */
    public final String mo124314a(Object obj) {
        String obj2 = obj.toString();
        if (f398268a.matcher(obj2).matches()) {
            StringBuilder sb = new StringBuilder();
            String str = this.f398269b;
            sb.append(str);
            sb.append(obj);
            return str.concat(String.valueOf(obj));
        }
        throw new IllegalArgumentException("Invalid key: ".concat(String.valueOf(obj2)));
    }
}
