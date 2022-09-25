package p3186j$.time.format;

import p3186j$.time.DateTimeException;

/* renamed from: j$.time.format.n */
final class C40989n implements C40982g {

    /* renamed from: a */
    private final C40982g f107358a;

    /* renamed from: b */
    private final int f107359b;

    /* renamed from: c */
    private final char f107360c;

    C40989n(C40982g gVar, int i, char c) {
        this.f107358a = gVar;
        this.f107359b = i;
        this.f107360c = c;
    }

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.f107358a.mo43294b(zVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.f107359b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.f107360c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        boolean l = xVar.mo43328l();
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        } else if (i == charSequence.length()) {
            return i ^ -1;
        } else {
            int i2 = this.f107359b + i;
            if (i2 > charSequence.length()) {
                if (l) {
                    return i ^ -1;
                }
                i2 = charSequence.length();
            }
            int i3 = i;
            while (i3 < i2 && xVar.mo43320b(charSequence.charAt(i3), this.f107360c)) {
                i3++;
            }
            int d = this.f107358a.mo43295d(xVar, charSequence.subSequence(0, i2), i3);
            return (d == i2 || !l) ? d : (i + i3) ^ -1;
        }
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f107358a);
        char c = this.f107360c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + valueOf + "," + this.f107359b + str;
    }
}
