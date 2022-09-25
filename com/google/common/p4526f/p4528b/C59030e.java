package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.C59106z;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.common.f.b.e */
/* compiled from: PG */
public final class C59030e implements C59106z {

    /* renamed from: d */
    private static final Set f156952d = new HashSet(Arrays.asList(new Class[]{Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class}));

    /* renamed from: a */
    public final String f156953a = " ]";

    /* renamed from: b */
    public final StringBuilder f156954b;

    /* renamed from: c */
    public boolean f156955c = false;

    /* renamed from: e */
    private final String f156956e = "[CONTEXT ";

    public C59030e(StringBuilder sb) {
        this.f156954b = sb;
    }

    /* renamed from: b */
    private static int m91271b(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo56300a(String str, Object obj) {
        char c = ' ';
        if (this.f156955c) {
            this.f156954b.append(' ');
        } else {
            if (this.f156954b.length() > 0) {
                StringBuilder sb = this.f156954b;
                if (sb.length() > 1000 || this.f156954b.indexOf("\n") != -1) {
                    c = 10;
                }
                sb.append(c);
            }
            this.f156954b.append(this.f156956e);
            this.f156955c = true;
        }
        StringBuilder sb2 = this.f156954b;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
        } else if (f156952d.contains(obj.getClass())) {
            sb2.append(obj);
        } else {
            sb2.append('\"');
            String obj2 = obj.toString();
            int i = 0;
            while (true) {
                int b = m91271b(obj2, i);
                if (b != -1) {
                    sb2.append(obj2, i, b);
                    i = b + 1;
                    char charAt = obj2.charAt(b);
                    if (charAt == 9) {
                        charAt = 't';
                    } else if (charAt == 10) {
                        charAt = 'n';
                    } else if (charAt == 13) {
                        charAt = 'r';
                    } else if (!(charAt == '\"' || charAt == '\\')) {
                        sb2.append(65533);
                    }
                    sb2.append("\\");
                    sb2.append(charAt);
                } else {
                    sb2.append(obj2, i, obj2.length());
                    sb2.append('\"');
                    return;
                }
            }
        }
    }
}
