package com.google.p386ak.p394d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import p3186j$.util.Objects;

/* renamed from: com.google.ak.d.c */
/* compiled from: PG */
public final class C8387c implements Closeable, Flushable {

    /* renamed from: e */
    private static final Pattern f29231e = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: f */
    private static final String[] f29232f = new String[128];

    /* renamed from: g */
    private static final String[] f29233g;

    /* renamed from: a */
    public final Writer f29234a;

    /* renamed from: b */
    public boolean f29235b;

    /* renamed from: c */
    public boolean f29236c;

    /* renamed from: d */
    public boolean f29237d;

    /* renamed from: h */
    private int[] f29238h = new int[32];

    /* renamed from: i */
    private int f29239i = 0;

    /* renamed from: j */
    private final String f29240j;

    /* renamed from: k */
    private String f29241k;

    static {
        for (int i = 0; i <= 31; i++) {
            f29232f[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f29232f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f29233g = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C8387c(Writer writer) {
        m23199n(6);
        this.f29240j = ":";
        this.f29237d = true;
        this.f29234a = (Writer) Objects.requireNonNull(writer, "out == null");
    }

    /* renamed from: m */
    private final int m23198m() {
        int i = this.f29239i;
        if (i != 0) {
            return this.f29238h[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: n */
    private final void m23199n(int i) {
        int i2 = this.f29239i;
        int[] iArr = this.f29238h;
        if (i2 == iArr.length) {
            this.f29238h = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.f29238h;
        int i3 = this.f29239i;
        this.f29239i = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: o */
    private final void m23200o(int i) {
        this.f29238h[this.f29239i - 1] = i;
    }

    /* renamed from: p */
    private final void m23201p(String str) {
        String[] strArr;
        String str2;
        if (this.f29236c) {
            strArr = f29233g;
        } else {
            strArr = f29232f;
        }
        this.f29234a.write(34);
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
                this.f29234a.write(str, i, i2 - i);
            }
            this.f29234a.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f29234a.write(str, i, length - i);
        }
        this.f29234a.write(34);
    }

    /* renamed from: q */
    private final void m23202q(int i, int i2, char c) {
        int m = m23198m();
        if (m == i2 || m == i) {
            String str = this.f29241k;
            if (str == null) {
                this.f29239i--;
                this.f29234a.write(c);
                return;
            }
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: r */
    private final void m23203r(int i, char c) {
        mo17129a();
        m23199n(i);
        this.f29234a.write(c);
    }

    /* renamed from: a */
    public final void mo17129a() {
        int m = m23198m();
        if (m == 1) {
            m23200o(2);
        } else if (m == 2) {
            this.f29234a.append(',');
        } else if (m != 4) {
            if (m != 6) {
                if (m != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f29235b) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m23200o(7);
        } else {
            this.f29234a.append(this.f29240j);
            m23200o(5);
        }
    }

    /* renamed from: b */
    public final void mo17130b() {
        if (this.f29241k != null) {
            int m = m23198m();
            if (m == 5) {
                this.f29234a.write(44);
            } else if (m != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m23200o(4);
            m23201p(this.f29241k);
            this.f29241k = null;
        }
    }

    /* renamed from: c */
    public final void mo17131c() {
        mo17130b();
        m23203r(1, '[');
    }

    public final void close() {
        this.f29234a.close();
        int i = this.f29239i;
        if (i > 1 || (i == 1 && this.f29238h[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f29239i = 0;
    }

    /* renamed from: d */
    public final void mo17133d() {
        mo17130b();
        m23203r(3, '{');
    }

    /* renamed from: e */
    public final void mo17134e() {
        m23202q(1, 2, ']');
    }

    /* renamed from: f */
    public final void mo17135f() {
        m23202q(3, 5, '}');
    }

    public final void flush() {
        if (this.f29239i != 0) {
            this.f29234a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final void mo17137g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f29241k != null) {
            throw new IllegalStateException();
        } else if (this.f29239i != 0) {
            this.f29241k = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: h */
    public final void mo17138h() {
        if (this.f29241k != null) {
            if (this.f29237d) {
                mo17130b();
            } else {
                this.f29241k = null;
                return;
            }
        }
        mo17129a();
        this.f29234a.write("null");
    }

    /* renamed from: i */
    public final void mo17139i(long j) {
        mo17130b();
        mo17129a();
        this.f29234a.write(Long.toString(j));
    }

    /* renamed from: j */
    public final void mo17140j(Number number) {
        if (number == null) {
            mo17138h();
            return;
        }
        mo17130b();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!(cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class || f29231e.matcher(obj).matches())) {
                String valueOf = String.valueOf(cls);
                throw new IllegalArgumentException("String created by " + valueOf + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f29235b) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(obj)));
        }
        mo17129a();
        this.f29234a.append(obj);
    }

    /* renamed from: k */
    public final void mo17141k(String str) {
        if (str == null) {
            mo17138h();
            return;
        }
        mo17130b();
        mo17129a();
        m23201p(str);
    }

    /* renamed from: l */
    public final void mo17142l(boolean z) {
        mo17130b();
        mo17129a();
        this.f29234a.write(true != z ? "false" : "true");
    }
}
