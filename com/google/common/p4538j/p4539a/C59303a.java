package com.google.common.p4538j.p4539a;

import com.google.common.p4525e.C58959g;
import com.google.common.p4525e.C58961i;
import com.google.p440an.p444c.C8847a;
import java.util.HashMap;

/* renamed from: com.google.common.j.a.a */
/* compiled from: PG */
final class C59303a {

    /* renamed from: a */
    public static final C58959g f157436a;

    static {
        HashMap hashMap = new HashMap();
        C58961i.m91119b('\"', "&quot;", hashMap);
        C58961i.m91119b('\'', "&#39;", hashMap);
        C58961i.m91119b('&', "&amp;", hashMap);
        C58961i.m91119b('<', "&lt;", hashMap);
        C58961i.m91119b('>', "&gt;", hashMap);
        f157436a = C58961i.m91118a(hashMap);
    }

    /* renamed from: a */
    static String m92149a(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 != length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt > '~' ? charAt >= 55296 || charAt < 160 : charAt < ' ') {
                if (charAt < 55296) {
                    if (!(charAt == 10 || charAt == 13 || charAt == 9 || charAt == 12)) {
                    }
                } else if (charAt <= 57343) {
                    int codePointAt = Character.codePointAt(str, i3 - 1);
                    if (codePointAt >= 65536 && (codePointAt & 65534) != 65534) {
                        i2 = i3 + 1;
                    }
                } else if (charAt >= 64976) {
                    if (charAt > 65007) {
                        if (charAt >= 65534) {
                        }
                    }
                }
                int length2 = str.length();
                StringBuilder sb = new StringBuilder(length2);
                while (i < length2) {
                    char charAt2 = str.charAt(i);
                    if (C8847a.m23487a(charAt2)) {
                        sb.append(charAt2);
                        i++;
                    } else {
                        int codePointAt2 = Character.codePointAt(str, i);
                        sb.appendCodePoint(true != C8847a.m23487a(codePointAt2) ? 65533 : codePointAt2);
                        i += Character.charCount(codePointAt2);
                    }
                }
                return sb.toString();
            }
            i2 = i3;
        }
        return str;
    }
}
