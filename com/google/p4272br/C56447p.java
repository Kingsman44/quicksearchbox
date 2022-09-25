package com.google.p4272br;

/* renamed from: com.google.br.p */
/* compiled from: PG */
final class C56447p {

    /* renamed from: a */
    public int f150767a = 0;

    /* renamed from: b */
    private final String f150768b;

    public C56447p(String str) {
        this.f150768b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo54390a() {
        return this.f150768b.codePointAt(this.f150767a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo54391b() {
        int codePointAt = this.f150768b.codePointAt(this.f150767a);
        this.f150767a += Character.charCount(codePointAt);
        return codePointAt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo54392c(int i) {
        return this.f150768b.substring(i, this.f150767a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo54393d() {
        return this.f150768b.substring(this.f150767a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo54394e(String str) {
        this.f150767a += str.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo54395f(char c) {
        return this.f150768b.charAt(this.f150767a) == c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo54396g() {
        return this.f150767a < this.f150768b.length();
    }

    public final String toString() {
        return mo54393d();
    }
}
