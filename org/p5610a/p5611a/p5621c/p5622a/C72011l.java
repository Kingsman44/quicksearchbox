package org.p5610a.p5611a.p5621c.p5622a;

import java.io.Writer;

/* renamed from: org.a.a.c.a.l */
/* compiled from: PG */
public final class C72011l extends C72001b {
    /* renamed from: a */
    public final int mo63213a(CharSequence charSequence, int i, Writer writer) {
        int i2;
        int i3;
        if (charSequence.charAt(i) != '\\' || (i2 = i + 1) >= charSequence.length() || charSequence.charAt(i2) != 'u') {
            return 0;
        }
        int i4 = 2;
        while (true) {
            i3 = i + i4;
            if (i3 < charSequence.length() && charSequence.charAt(i3) == 'u') {
                i4++;
            }
        }
        if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
            i4++;
        }
        int i5 = i + i4;
        int i6 = i5 + 4;
        if (i6 <= charSequence.length()) {
            CharSequence subSequence = charSequence.subSequence(i5, i6);
            try {
                writer.write((char) Integer.parseInt(subSequence.toString(), 16));
                return i4 + 4;
            } catch (NumberFormatException e) {
                new StringBuilder("Unable to parse unicode value: ").append(subSequence);
                throw new IllegalArgumentException("Unable to parse unicode value: ".concat(String.valueOf(subSequence)), e);
            }
        } else {
            throw new IllegalArgumentException("Less than 4 hex digits in unicode value: '" + charSequence.subSequence(i, charSequence.length()) + "' due to end of CharSequence");
        }
    }
}
