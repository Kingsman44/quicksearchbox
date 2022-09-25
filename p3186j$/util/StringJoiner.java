package p3186j$.util;

import com.evernote.android.state.BuildConfig;
import java.util.Arrays;

/* renamed from: j$.util.StringJoiner */
public final class StringJoiner {

    /* renamed from: a */
    private final String f107537a;

    /* renamed from: b */
    private final String f107538b;

    /* renamed from: c */
    private final String f107539c;

    /* renamed from: d */
    private String[] f107540d;

    /* renamed from: e */
    private int f107541e;

    /* renamed from: f */
    private int f107542f;

    /* renamed from: g */
    private String f107543g;

    public StringJoiner(CharSequence charSequence) {
        this(charSequence, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }

    public StringJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Objects.requireNonNull(charSequence2, "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull(charSequence3, "The suffix must not be null");
        this.f107537a = charSequence2.toString();
        this.f107538b = charSequence.toString();
        this.f107539c = charSequence3.toString();
    }

    /* renamed from: a */
    private void m71645a() {
        String[] strArr;
        if (this.f107541e > 1) {
            char[] cArr = new char[this.f107542f];
            int b = m71646b(this.f107540d[0], cArr, 0);
            int i = 1;
            do {
                int b2 = b + m71646b(this.f107538b, cArr, b);
                b = b2 + m71646b(this.f107540d[i], cArr, b2);
                strArr = this.f107540d;
                strArr[i] = null;
                i++;
            } while (i < this.f107541e);
            this.f107541e = 1;
            strArr[0] = new String(cArr);
        }
    }

    /* renamed from: b */
    private static int m71646b(String str, char[] cArr, int i) {
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return length;
    }

    public StringJoiner add(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        String[] strArr = this.f107540d;
        if (strArr == null) {
            this.f107540d = new String[8];
        } else {
            int i = this.f107541e;
            if (i == strArr.length) {
                this.f107540d = (String[]) Arrays.copyOf(strArr, i * 2);
            }
            this.f107542f = this.f107538b.length() + this.f107542f;
        }
        this.f107542f = valueOf.length() + this.f107542f;
        String[] strArr2 = this.f107540d;
        int i2 = this.f107541e;
        this.f107541e = i2 + 1;
        strArr2[i2] = valueOf;
        return this;
    }

    /* renamed from: c */
    public final StringJoiner mo43519c(StringJoiner stringJoiner) {
        Objects.requireNonNull(stringJoiner);
        if (stringJoiner.f107540d == null) {
            return this;
        }
        stringJoiner.m71645a();
        return add(stringJoiner.f107540d[0]);
    }

    public StringJoiner setEmptyValue(CharSequence charSequence) {
        this.f107543g = ((CharSequence) Objects.requireNonNull(charSequence, "The empty value must not be null")).toString();
        return this;
    }

    public String toString() {
        String str;
        String[] strArr = this.f107540d;
        if (strArr == null && (str = this.f107543g) != null) {
            return str;
        }
        int i = this.f107541e;
        String str2 = this.f107537a;
        int length = str2.length();
        String str3 = this.f107539c;
        int length2 = str3.length() + length;
        if (length2 == 0) {
            m71645a();
            return i == 0 ? BuildConfig.FLAVOR : strArr[0];
        }
        char[] cArr = new char[(this.f107542f + length2)];
        int b = m71646b(str2, cArr, 0);
        if (i > 0) {
            b += m71646b(strArr[0], cArr, b);
            for (int i2 = 1; i2 < i; i2++) {
                int b2 = b + m71646b(this.f107538b, cArr, b);
                b = b2 + m71646b(strArr[i2], cArr, b2);
            }
        }
        m71646b(str3, cArr, b);
        return new String(cArr);
    }
}
