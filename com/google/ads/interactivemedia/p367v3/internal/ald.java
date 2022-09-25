package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ald */
/* compiled from: PG */
public class ald implements Closeable, Flushable {

    /* renamed from: a */
    private static final String[] f20865a = new String[128];

    /* renamed from: b */
    private static final String[] f20866b;

    /* renamed from: c */
    private final Writer f20867c;

    /* renamed from: d */
    private int[] f20868d = new int[32];

    /* renamed from: e */
    private int f20869e = 0;

    /* renamed from: f */
    private final String f20870f;

    /* renamed from: g */
    private boolean f20871g;

    /* renamed from: h */
    private boolean f20872h;

    /* renamed from: i */
    private String f20873i;

    /* renamed from: j */
    private boolean f20874j;

    static {
        for (int i = 0; i <= 31; i++) {
            f20865a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f20865a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f20866b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public ald(Writer writer) {
        m18903a(6);
        this.f20870f = ":";
        this.f20874j = true;
        if (writer != null) {
            this.f20867c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    private final void m18903a(int i) {
        int i2 = this.f20869e;
        int[] iArr = this.f20868d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 + i2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f20868d = iArr2;
        }
        int[] iArr3 = this.f20868d;
        int i3 = this.f20869e;
        this.f20869e = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: s */
    private final int m18904s() {
        int i = this.f20869e;
        if (i != 0) {
            return this.f20868d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: t */
    private final void m18905t(int i) {
        this.f20868d[this.f20869e - 1] = i;
    }

    /* renamed from: u */
    private final void m18906u() {
        if (this.f20873i != null) {
            int s = m18904s();
            if (s == 5) {
                this.f20867c.write(44);
            } else if (s != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m18905t(4);
            m18907v(this.f20873i);
            this.f20873i = null;
        }
    }

    /* renamed from: v */
    private final void m18907v(String str) {
        String[] strArr;
        String str2;
        if (this.f20872h) {
            strArr = f20866b;
        } else {
            strArr = f20865a;
        }
        this.f20867c.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f20867c.write(str, i, i2 - i);
            }
            this.f20867c.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f20867c.write(str, i, length - i);
        }
        this.f20867c.write("\"");
    }

    /* renamed from: w */
    private final void m18908w() {
        int s = m18904s();
        if (s == 1) {
            m18905t(2);
        } else if (s == 2) {
            this.f20867c.append(',');
        } else if (s != 4) {
            if (s != 6) {
                if (s != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f20871g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m18905t(7);
        } else {
            this.f20867c.append(this.f20870f);
            m18905t(5);
        }
    }

    /* renamed from: x */
    private final void m18909x(int i, int i2, String str) {
        int s = m18904s();
        if (s == i2 || s == i) {
            String str2 = this.f20873i;
            if (str2 == null) {
                this.f20869e--;
                this.f20867c.write(str);
                return;
            }
            throw new IllegalStateException("Dangling name: ".concat(str2));
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: y */
    private final void m18910y(int i, String str) {
        m18908w();
        m18903a(i);
        this.f20867c.write(str);
    }

    /* renamed from: b */
    public void mo14844b() {
        m18906u();
        m18910y(1, "[");
    }

    /* renamed from: c */
    public void mo14845c() {
        m18906u();
        m18910y(3, "{");
    }

    public void close() {
        this.f20867c.close();
        int i = this.f20869e;
        if (i > 1 || (i == 1 && this.f20868d[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f20869e = 0;
    }

    /* renamed from: d */
    public void mo14847d() {
        m18909x(1, 2, "]");
    }

    /* renamed from: e */
    public void mo14848e() {
        m18909x(3, 5, "}");
    }

    /* renamed from: f */
    public void mo14849f(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f20873i != null) {
            throw new IllegalStateException();
        } else if (this.f20869e != 0) {
            this.f20873i = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public void flush() {
        if (this.f20869e != 0) {
            this.f20867c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public void mo14851g() {
        if (this.f20873i != null) {
            if (this.f20874j) {
                m18906u();
            } else {
                this.f20873i = null;
                return;
            }
        }
        m18908w();
        this.f20867c.write("null");
    }

    /* renamed from: h */
    public void mo14852h(long j) {
        m18906u();
        m18908w();
        this.f20867c.write(Long.toString(j));
    }

    /* renamed from: i */
    public void mo14853i(Boolean bool) {
        if (bool == null) {
            mo14851g();
            return;
        }
        m18906u();
        m18908w();
        this.f20867c.write(true != bool.booleanValue() ? "false" : "true");
    }

    /* renamed from: j */
    public void mo14854j(Number number) {
        if (number == null) {
            mo14851g();
            return;
        }
        m18906u();
        String obj = number.toString();
        if (this.f20871g || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m18908w();
            this.f20867c.append(obj);
            return;
        }
        new StringBuilder("Numeric values must be finite, but was ").append(number);
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(number.toString()));
    }

    /* renamed from: k */
    public void mo14855k(String str) {
        if (str == null) {
            mo14851g();
            return;
        }
        m18906u();
        m18908w();
        m18907v(str);
    }

    /* renamed from: l */
    public void mo14856l(boolean z) {
        m18906u();
        m18908w();
        this.f20867c.write(true != z ? "false" : "true");
    }

    /* renamed from: m */
    public final void mo14897m(boolean z) {
        this.f20871g = z;
    }

    /* renamed from: n */
    public final boolean mo14898n() {
        return this.f20871g;
    }

    /* renamed from: o */
    public final void mo14899o(boolean z) {
        this.f20872h = z;
    }

    /* renamed from: p */
    public final boolean mo14900p() {
        return this.f20872h;
    }

    /* renamed from: q */
    public final void mo14901q(boolean z) {
        this.f20874j = z;
    }

    /* renamed from: r */
    public final boolean mo14902r() {
        return this.f20874j;
    }
}
