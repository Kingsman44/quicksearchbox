package org.p5633c.p5634a.p5639e;

/* renamed from: org.c.a.e.ag */
/* compiled from: PG */
final class C72241ag implements C72239ae {

    /* renamed from: a */
    public final String f192226a;

    public C72241ag(String str) {
        this.f192226a = str;
    }

    /* renamed from: a */
    public final int mo63586a(int i) {
        return this.f192226a.length();
    }

    /* renamed from: b */
    public final int mo63587b(String str, int i) {
        String str2 = this.f192226a;
        int length = str2.length();
        return str.regionMatches(true, i, str2, 0, length) ? i + length : i ^ -1;
    }

    /* renamed from: c */
    public final int mo63588c(String str, int i) {
        String str2 = this.f192226a;
        int length = str2.length();
        int length2 = str.length();
        int i2 = i;
        while (i2 < length2) {
            if (str.regionMatches(true, i2, str2, 0, length)) {
                return i2;
            }
            switch (str.charAt(i2)) {
                case '+':
                case ',':
                case '-':
                case '.':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i2++;
            }
            return i ^ -1;
        }
        return i ^ -1;
    }

    /* renamed from: d */
    public final void mo63589d(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.f192226a);
    }
}
