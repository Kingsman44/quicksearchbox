package org.p5610a.p5611a.p5621c.p5622a;

import java.io.Writer;

/* renamed from: org.a.a.c.a.j */
/* compiled from: PG */
public final class C72009j extends C72001b {
    /* renamed from: c */
    private static final boolean m105315c(char c) {
        return c >= '0' && c <= '7';
    }

    /* renamed from: a */
    public final int mo63213a(CharSequence charSequence, int i, Writer writer) {
        char charAt;
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        if (charSequence.charAt(i) != '\\' || length <= 0) {
            return 0;
        }
        int i2 = i + 1;
        if (!m105315c(charSequence.charAt(i2))) {
            return 0;
        }
        int i3 = i + 2;
        int i4 = i + 3;
        sb.append(charSequence.charAt(i2));
        if (length > 1 && m105315c(charSequence.charAt(i3))) {
            sb.append(charSequence.charAt(i3));
            if (length > 2 && (charAt = charSequence.charAt(i2)) >= '0' && charAt <= '3' && m105315c(charSequence.charAt(i4))) {
                sb.append(charSequence.charAt(i4));
            }
        }
        writer.write(Integer.parseInt(sb.toString(), 8));
        return sb.length() + 1;
    }
}
