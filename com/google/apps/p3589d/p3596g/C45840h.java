package com.google.apps.p3589d.p3596g;

/* renamed from: com.google.apps.d.g.h */
/* compiled from: PG */
final class C45840h {

    /* renamed from: a */
    public int f120522a = 0;

    /* renamed from: b */
    private final String f120523b;

    public C45840h(String str) {
        this.f120523b = str;
    }

    /* renamed from: g */
    public static final boolean m81796g(int i) {
        return i < 33;
    }

    /* renamed from: i */
    private final String m81797i() {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!mo49991f()) {
                break;
            }
            int a = mo49986a();
            if (!m81798j(a)) {
                mo49990e(a);
                break;
            }
            sb.appendCodePoint(a);
        }
        return sb.toString();
    }

    /* renamed from: j */
    private static final boolean m81798j(int i) {
        if (i < 97 || i > 122) {
            return i >= 65 && i <= 90;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo49986a() {
        int i = this.f120522a;
        String str = this.f120523b;
        if (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            this.f120522a += Character.charCount(codePointAt);
            return codePointAt;
        }
        throw new AssertionError("Retrieving character at index " + i + " beyond length " + str.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo49987b() {
        if (mo49991f()) {
            int a = mo49986a();
            if (!m81798j(a)) {
                return new StringBuilder("\\").appendCodePoint(a).toString();
            }
            mo49990e(a);
            return "\\".concat(m81797i());
        }
        throw new C45841i("Missing command after '\\'.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo49988c() {
        mo49992h('{');
        mo49989d();
        String i = m81797i();
        mo49992h('}');
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo49989d() {
        while (mo49991f()) {
            int a = mo49986a();
            if (!m81796g(a)) {
                mo49990e(a);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo49990e(int i) {
        int i2 = this.f120522a;
        if (i2 > 0) {
            this.f120522a = i2 - Character.charCount(i);
            return;
        }
        throw new AssertionError("Unlooking when at the first character.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo49991f() {
        return this.f120522a < this.f120523b.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo49992h(char c) {
        if (!m81796g(c)) {
            mo49989d();
            if (mo49991f()) {
                int a = mo49986a();
                if (a != c) {
                    mo49990e(a);
                } else {
                    return;
                }
            }
            throw new C45841i("Missing " + c);
        }
        throw new AssertionError("Expected non-space character but got '" + c + "'");
    }
}
