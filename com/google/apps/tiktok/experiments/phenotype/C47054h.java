package com.google.apps.tiktok.experiments.phenotype;

import java.io.Serializable;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.h */
/* compiled from: PG */
public final class C47054h implements Serializable, C46969ci {
    private static final long serialVersionUID = -4770846455854161599L;

    /* renamed from: a */
    private final String f122640a;

    public C47054h(String str) {
        this.f122640a = str;
    }

    /* renamed from: b */
    private static void m83705b(StringBuilder sb, String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    /* renamed from: a */
    public final String mo50945a() {
        return this.f122640a;
    }

    public final Class annotationType() {
        return C46969ci.class;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46969ci) {
            return this.f122640a.equals(((C46969ci) obj).mo50945a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f122640a.hashCode() ^ 1335633679;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("@com.google.apps.tiktok.experiments.phenotype.PhenotypeApplicationSpecificProperties(");
        String str = this.f122640a;
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 9) {
                sb.append("\\t");
            } else if (charAt == 10) {
                sb.append("\\n");
            } else if (charAt == 13) {
                sb.append("\\r");
            } else if (charAt == '\"' || charAt == '\'' || charAt == '\\') {
                sb.append('\\');
                sb.append(charAt);
            } else if (charAt < ' ') {
                sb.append('\\');
                m83705b(sb, Integer.toOctalString(charAt), 3);
            } else if (charAt < 127 || Character.isLetter(charAt)) {
                sb.append(charAt);
            } else {
                sb.append("\\u");
                m83705b(sb, Integer.toHexString(charAt), 4);
            }
        }
        sb.append("\")");
        return sb.toString();
    }
}
