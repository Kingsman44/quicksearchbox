package com.p232a.p233a;

import java.util.Locale;

/* renamed from: com.a.a.cj */
/* compiled from: PG */
public class C4755cj {

    /* renamed from: a */
    protected final String f15057a;

    /* renamed from: b */
    protected int f15058b = 0;

    /* renamed from: c */
    protected int f15059c = 0;

    /* renamed from: d */
    private final C4763j f15060d = new C4763j();

    public C4755cj(String str) {
        String trim = str.trim();
        this.f15057a = trim;
        this.f15059c = trim.length();
    }

    /* renamed from: r */
    protected static final boolean m13208r(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    /* renamed from: b */
    public final float mo9643b(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        mo9657p();
        return mo9644c();
    }

    /* renamed from: c */
    public final float mo9644c() {
        float a = this.f15060d.mo9677a(this.f15057a, this.f15058b, this.f15059c);
        if (!Float.isNaN(a)) {
            this.f15058b = this.f15060d.f15085a;
        }
        return a;
    }

    /* renamed from: d */
    public final float mo9645d() {
        mo9657p();
        float a = this.f15060d.mo9677a(this.f15057a, this.f15058b, this.f15059c);
        if (!Float.isNaN(a)) {
            this.f15058b = this.f15060d.f15085a;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo9646e() {
        int i = this.f15058b;
        int i2 = this.f15059c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.f15058b = i3;
        if (i3 < i2) {
            return this.f15057a.charAt(i3);
        }
        return -1;
    }

    /* renamed from: f */
    public final C4779z mo9647f() {
        float c = mo9644c();
        if (Float.isNaN(c)) {
            return null;
        }
        int q = mo9658q();
        return q == 0 ? new C4779z(c, 1) : new C4779z(c, q);
    }

    /* renamed from: g */
    public final Boolean mo9648g(Object obj) {
        if (obj == null) {
            return null;
        }
        mo9657p();
        int i = this.f15058b;
        if (i != this.f15059c) {
            char charAt = this.f15057a.charAt(i);
            if (charAt != '0') {
                if (charAt == '1') {
                    charAt = '1';
                }
            }
            boolean z = true;
            this.f15058b++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* renamed from: h */
    public final Integer mo9649h() {
        int i = this.f15058b;
        if (i == this.f15059c) {
            return null;
        }
        String str = this.f15057a;
        this.f15058b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    /* renamed from: i */
    public final String mo9650i() {
        if (mo9655n()) {
            return null;
        }
        int i = this.f15058b;
        char charAt = this.f15057a.charAt(i);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int e = mo9646e();
        while (e != -1) {
            if (e != charAt) {
                e = mo9646e();
            } else {
                int i2 = this.f15058b + 1;
                this.f15058b = i2;
                return this.f15057a.substring(i + 1, i2 - 1);
            }
        }
        this.f15058b = i;
        return null;
    }

    /* renamed from: j */
    public final String mo9651j(char c) {
        if (mo9655n()) {
            return null;
        }
        char charAt = this.f15057a.charAt(this.f15058b);
        if (m13208r(charAt) || charAt == c) {
            return null;
        }
        int i = this.f15058b;
        int e = mo9646e();
        while (e != -1 && e != c && !m13208r(e)) {
            e = mo9646e();
        }
        return this.f15057a.substring(i, this.f15058b);
    }

    /* renamed from: k */
    public final void mo9652k() {
        while (true) {
            int i = this.f15058b;
            if (i < this.f15059c && m13208r(this.f15057a.charAt(i))) {
                this.f15058b++;
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public final boolean mo9653l(char c) {
        int i = this.f15058b;
        boolean z = false;
        if (i < this.f15059c && this.f15057a.charAt(i) == c) {
            z = true;
        }
        if (z) {
            this.f15058b++;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo9654m(String str) {
        int length = str.length();
        int i = this.f15058b;
        boolean z = false;
        if (i <= this.f15059c - length && this.f15057a.substring(i, i + length).equals(str)) {
            z = true;
        }
        if (z) {
            this.f15058b += length;
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo9655n() {
        return this.f15058b == this.f15059c;
    }

    /* renamed from: o */
    public final boolean mo9656o() {
        int i = this.f15058b;
        if (i == this.f15059c) {
            return false;
        }
        char charAt = this.f15057a.charAt(i);
        return (charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z');
    }

    /* renamed from: p */
    public final boolean mo9657p() {
        mo9652k();
        int i = this.f15058b;
        if (i == this.f15059c || this.f15057a.charAt(i) != ',') {
            return false;
        }
        this.f15058b++;
        mo9652k();
        return true;
    }

    /* renamed from: q */
    public final int mo9658q() {
        if (mo9655n()) {
            return 0;
        }
        if (this.f15057a.charAt(this.f15058b) == '%') {
            this.f15058b++;
            return 9;
        }
        int i = this.f15058b;
        if (i > this.f15059c - 2) {
            return 0;
        }
        try {
            int a = C4731bm.m13117a(this.f15057a.substring(i, i + 2).toLowerCase(Locale.US));
            this.f15058b += 2;
            return a;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }
}
