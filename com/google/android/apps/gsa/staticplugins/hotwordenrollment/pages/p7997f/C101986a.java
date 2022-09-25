package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.a */
/* compiled from: PG */
final class C101986a extends C102012g {

    /* renamed from: a */
    public CharSequence f284554a;

    /* renamed from: b */
    public CharSequence f284555b;

    /* renamed from: a */
    public final C102013h mo92759a() {
        CharSequence charSequence;
        CharSequence charSequence2 = this.f284554a;
        if (charSequence2 != null && (charSequence = this.f284555b) != null) {
            return new C101990b(charSequence2, charSequence);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f284554a == null) {
            sb.append(" title");
        }
        if (this.f284555b == null) {
            sb.append(" subtitle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo92760b(CharSequence charSequence) {
        if (charSequence != null) {
            this.f284555b = charSequence;
            return;
        }
        throw new NullPointerException("Null subtitle");
    }

    /* renamed from: c */
    public final void mo92761c(CharSequence charSequence) {
        if (charSequence != null) {
            this.f284554a = charSequence;
            return;
        }
        throw new NullPointerException("Null title");
    }
}
