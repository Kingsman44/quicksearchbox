package org.p5610a.p5611a.p5621c.p5622a;

import java.io.Writer;
import java.util.Arrays;
import java.util.EnumSet;

/* renamed from: org.a.a.c.a.i */
/* compiled from: PG */
public final class C72008i extends C72001b {

    /* renamed from: b */
    private final EnumSet f191745b = EnumSet.copyOf(Arrays.asList(new C72007h[]{C72007h.semiColonRequired}));

    /* renamed from: a */
    public final int mo63213a(CharSequence charSequence, int i, Writer writer) {
        int i2;
        int i3;
        int length = charSequence.length();
        if (charSequence.charAt(i) == '&' && i < length - 2 && charSequence.charAt(i + 1) == '#') {
            int i4 = i + 2;
            char charAt = charSequence.charAt(i4);
            if (charAt == 'x' || charAt == 'X') {
                i4++;
                if (i4 != length) {
                    i2 = 1;
                }
            } else {
                i2 = 0;
            }
            int i5 = i4;
            while (i5 < length && ((charSequence.charAt(i5) >= '0' && charSequence.charAt(i5) <= '9') || ((charSequence.charAt(i5) >= 'a' && charSequence.charAt(i5) <= 'f') || (charSequence.charAt(i5) >= 'A' && charSequence.charAt(i5) <= 'F')))) {
                i5++;
            }
            int i6 = (i5 == length || charSequence.charAt(i5) != ';') ? 0 : 1;
            if (i6 == 0) {
                if (mo63216c(C72007h.semiColonRequired)) {
                    return 0;
                }
                if (mo63216c(C72007h.errorIfNoSemiColon)) {
                    throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            if (i2 != 0) {
                try {
                    i3 = Integer.parseInt(charSequence.subSequence(i4, i5).toString(), 16);
                } catch (NumberFormatException unused) {
                }
            } else {
                i3 = Integer.parseInt(charSequence.subSequence(i4, i5).toString(), 10);
            }
            if (i3 > 65535) {
                char[] chars = Character.toChars(i3);
                writer.write(chars[0]);
                writer.write(chars[1]);
            } else {
                writer.write(i3);
            }
            return ((i5 + 2) - i4) + i2 + i6;
        }
        return 0;
    }

    /* renamed from: c */
    public final boolean mo63216c(C72007h hVar) {
        EnumSet enumSet = this.f191745b;
        return enumSet != null && enumSet.contains(hVar);
    }
}
