package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ais */
/* compiled from: PG */
public final class ais extends alb {

    /* renamed from: b */
    private static final Reader f20710b = new air();

    /* renamed from: c */
    private static final Object f20711c = new Object();

    /* renamed from: d */
    private Object[] f20712d = new Object[32];

    /* renamed from: e */
    private int f20713e = 0;

    /* renamed from: f */
    private String[] f20714f = new String[32];

    /* renamed from: g */
    private int[] f20715g = new int[32];

    public ais(agj agj) {
        super(f20710b);
        m18781w(agj);
    }

    /* renamed from: u */
    private final Object m18779u() {
        return this.f20712d[this.f20713e - 1];
    }

    /* renamed from: v */
    private final Object m18780v() {
        Object[] objArr = this.f20712d;
        int i = this.f20713e - 1;
        this.f20713e = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: w */
    private final void m18781w(Object obj) {
        int i = this.f20713e;
        Object[] objArr = this.f20712d;
        if (i == objArr.length) {
            int i2 = i + i;
            Object[] objArr2 = new Object[i2];
            int[] iArr = new int[i2];
            String[] strArr = new String[i2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f20715g, 0, iArr, 0, this.f20713e);
            System.arraycopy(this.f20714f, 0, strArr, 0, this.f20713e);
            this.f20712d = objArr2;
            this.f20715g = iArr;
            this.f20714f = strArr;
        }
        Object[] objArr3 = this.f20712d;
        int i3 = this.f20713e;
        this.f20713e = i3 + 1;
        objArr3[i3] = obj;
    }

    /* renamed from: x */
    private final String m18782x() {
        return " at path ".concat(String.valueOf(mo14837o()));
    }

    /* renamed from: y */
    private final void m18783y(int i) {
        if (mo14838p() != i) {
            throw new IllegalStateException("Expected " + alc.m18902a(i) + " but was " + alc.m18902a(mo14838p()) + m18782x());
        }
    }

    /* renamed from: a */
    public final void mo14822a() {
        m18783y(1);
        m18781w(((agh) m18779u()).iterator());
        this.f20715g[this.f20713e - 1] = 0;
    }

    /* renamed from: b */
    public final void mo14823b() {
        m18783y(2);
        m18780v();
        m18780v();
        int i = this.f20713e;
        if (i > 0) {
            int[] iArr = this.f20715g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: c */
    public final void mo14824c() {
        m18783y(3);
        m18781w(((agm) m18779u()).mo14727b().iterator());
    }

    public final void close() {
        this.f20712d = new Object[]{f20711c};
        this.f20713e = 1;
    }

    /* renamed from: d */
    public final void mo14826d() {
        m18783y(4);
        m18780v();
        m18780v();
        int i = this.f20713e;
        if (i > 0) {
            int[] iArr = this.f20715g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: e */
    public final boolean mo14827e() {
        int p = mo14838p();
        return (p == 4 || p == 2) ? false : true;
    }

    /* renamed from: f */
    public final String mo14828f() {
        m18783y(5);
        Map.Entry entry = (Map.Entry) ((Iterator) m18779u()).next();
        String str = (String) entry.getKey();
        this.f20714f[this.f20713e - 1] = str;
        m18781w(entry.getValue());
        return str;
    }

    /* renamed from: g */
    public final String mo14829g() {
        int p = mo14838p();
        if (p == 6 || p == 7) {
            String h = ((ago) m18780v()).mo14738h();
            int i = this.f20713e;
            if (i > 0) {
                int[] iArr = this.f20715g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return h;
        }
        throw new IllegalStateException("Expected STRING but was " + alc.m18902a(p) + m18782x());
    }

    /* renamed from: h */
    public final boolean mo14830h() {
        m18783y(8);
        boolean d = ((ago) m18780v()).mo14733d();
        int i = this.f20713e;
        if (i > 0) {
            int[] iArr = this.f20715g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return d;
    }

    /* renamed from: i */
    public final void mo14831i() {
        m18783y(9);
        m18780v();
        int i = this.f20713e;
        if (i > 0) {
            int[] iArr = this.f20715g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: j */
    public final double mo14832j() {
        int p = mo14838p();
        if (p == 7 || p == 6) {
            ago ago = (ago) m18779u();
            double doubleValue = ago.mo14734e() ? ago.mo14736f().doubleValue() : Double.parseDouble(ago.mo14738h());
            if (mo14894r() || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                m18780v();
                int i = this.f20713e;
                if (i > 0) {
                    int[] iArr = this.f20715g;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        throw new IllegalStateException("Expected NUMBER but was " + alc.m18902a(p) + m18782x());
    }

    /* renamed from: k */
    public final long mo14833k() {
        int p = mo14838p();
        if (p == 7 || p == 6) {
            ago ago = (ago) m18779u();
            long longValue = ago.mo14734e() ? ago.mo14736f().longValue() : Long.parseLong(ago.mo14738h());
            m18780v();
            int i = this.f20713e;
            if (i > 0) {
                int[] iArr = this.f20715g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return longValue;
        }
        throw new IllegalStateException("Expected NUMBER but was " + alc.m18902a(p) + m18782x());
    }

    /* renamed from: l */
    public final int mo14834l() {
        int p = mo14838p();
        if (p == 7 || p == 6) {
            ago ago = (ago) m18779u();
            int intValue = ago.mo14734e() ? ago.mo14736f().intValue() : Integer.parseInt(ago.mo14738h());
            m18780v();
            int i = this.f20713e;
            if (i > 0) {
                int[] iArr = this.f20715g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return intValue;
        }
        throw new IllegalStateException("Expected NUMBER but was " + alc.m18902a(p) + m18782x());
    }

    /* renamed from: m */
    public final void mo14835m() {
        if (mo14838p() == 5) {
            mo14828f();
            this.f20714f[this.f20713e - 2] = "null";
        } else {
            m18780v();
            int i = this.f20713e;
            if (i > 0) {
                this.f20714f[i - 1] = "null";
            }
        }
        int i2 = this.f20713e;
        if (i2 > 0) {
            int[] iArr = this.f20715g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: n */
    public final void mo14836n() {
        m18783y(5);
        Map.Entry entry = (Map.Entry) ((Iterator) m18779u()).next();
        m18781w(entry.getValue());
        m18781w(new ago((String) entry.getKey()));
    }

    /* renamed from: o */
    public final String mo14837o() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.f20713e) {
            Object[] objArr = this.f20712d;
            Object obj = objArr[i];
            if (obj instanceof agh) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f20715g[i]);
                    sb.append(']');
                }
            } else if (obj instanceof agm) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.f20714f[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: p */
    public final int mo14838p() {
        if (this.f20713e == 0) {
            return 10;
        }
        Object u = m18779u();
        if (u instanceof Iterator) {
            boolean z = this.f20712d[this.f20713e - 2] instanceof agm;
            Iterator it = (Iterator) u;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            m18781w(it.next());
            return mo14838p();
        } else if (u instanceof agm) {
            return 3;
        } else {
            if (u instanceof agh) {
                return 1;
            }
            if (u instanceof ago) {
                ago ago = (ago) u;
                if (ago.mo14737g()) {
                    return 6;
                }
                if (ago.mo14731b()) {
                    return 8;
                }
                if (ago.mo14734e()) {
                    return 7;
                }
                throw new AssertionError();
            } else if (u instanceof agl) {
                return 9;
            } else {
                if (u == f20711c) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
