package com.google.android.libraries.p11012aj;

import java.io.Serializable;

/* renamed from: com.google.android.libraries.aj.a */
/* compiled from: PG */
public final class C147592a implements Serializable, C147600c {
    private static final long serialVersionUID = -4770846455854161599L;

    /* renamed from: a */
    private final String f398393a = ":search";

    /* renamed from: b */
    private static void m240664b(StringBuilder sb, String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    /* renamed from: a */
    public final String mo124359a() {
        return this.f398393a;
    }

    public final Class annotationType() {
        return C147600c.class;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147600c) {
            return this.f398393a.equals(((C147600c) obj).mo124359a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f398393a.hashCode() ^ 1335633679;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("@com.google.android.libraries.processinit.CustomMainProcess(");
        sb.append('\"');
        for (int i = 0; i < 7; i++) {
            char charAt = ":search".charAt(i);
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
                m240664b(sb, Integer.toOctalString(charAt), 3);
            } else if (charAt < 127 || Character.isLetter(charAt)) {
                sb.append(charAt);
            } else {
                sb.append("\\u");
                m240664b(sb, Integer.toHexString(charAt), 4);
            }
        }
        sb.append("\")");
        return sb.toString();
    }
}
