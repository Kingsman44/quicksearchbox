package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.p8472a;

import com.google.assistant.p3781ad.p3789d.C48582b;
import java.io.Serializable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.a.a */
/* compiled from: PG */
public final class C110961a implements Serializable, C110962b {
    private static final long serialVersionUID = -5024694611675557320L;

    /* renamed from: a */
    private final String f309127a;

    /* renamed from: b */
    private final C48582b f309128b;

    public C110961a(String str, C48582b bVar) {
        this.f309127a = str;
        if (bVar != null) {
            this.f309128b = bVar;
            return;
        }
        throw new NullPointerException("Null actionType");
    }

    /* renamed from: c */
    private static void m184756c(StringBuilder sb, String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    /* renamed from: a */
    public final C48582b mo98986a() {
        return this.f309128b;
    }

    public final Class annotationType() {
        return C110962b.class;
    }

    /* renamed from: b */
    public final String mo98988b() {
        return this.f309127a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C110962b) {
            C110962b bVar = (C110962b) obj;
            return this.f309127a.equals(bVar.mo98988b()) && this.f309128b.equals(bVar.mo98986a());
        }
    }

    public final int hashCode() {
        return (this.f309127a.hashCode() ^ 88066485) + (this.f309128b.hashCode() ^ -1034301072);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("@com.google.android.apps.gsa.staticplugins.opa.tapas.action.annotations.ParameterMapKey(");
        String str = this.f309127a;
        sb.append("typestring=\"");
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
                m184756c(sb, Integer.toOctalString(charAt), 3);
            } else if (charAt < 127 || Character.isLetter(charAt)) {
                sb.append(charAt);
            } else {
                sb.append("\\u");
                m184756c(sb, Integer.toHexString(charAt), 4);
            }
        }
        sb.append("\", actionType=");
        sb.append(this.f309128b);
        sb.append(')');
        return sb.toString();
    }
}
