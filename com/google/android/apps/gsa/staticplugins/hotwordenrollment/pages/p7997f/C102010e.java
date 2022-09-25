package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.e */
/* compiled from: PG */
public final class C102010e extends C102017l {

    /* renamed from: a */
    public CharSequence f284623a;

    /* renamed from: b */
    public CharSequence f284624b;

    /* renamed from: c */
    public C102016k f284625c;

    /* renamed from: d */
    public CharSequence f284626d;

    /* renamed from: e */
    public CharSequence f284627e;

    /* renamed from: f */
    public CharSequence f284628f;

    /* renamed from: g */
    public Boolean f284629g;

    /* renamed from: h */
    private C58485gu f284630h;

    /* renamed from: a */
    public final C102018m mo92779a() {
        CharSequence charSequence;
        C58485gu guVar;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Boolean bool;
        CharSequence charSequence4 = this.f284623a;
        if (charSequence4 != null && (charSequence = this.f284624b) != null && (guVar = this.f284630h) != null && (charSequence2 = this.f284627e) != null && (charSequence3 = this.f284628f) != null && (bool = this.f284629g) != null) {
            return new C102011f(charSequence4, charSequence, guVar, this.f284625c, this.f284626d, charSequence2, charSequence3, bool);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f284623a == null) {
            sb.append(" title");
        }
        if (this.f284624b == null) {
            sb.append(" description");
        }
        if (this.f284630h == null) {
            sb.append(" exampleQueries");
        }
        if (this.f284627e == null) {
            sb.append(" positiveButtonText");
        }
        if (this.f284628f == null) {
            sb.append(" negativeButtonText");
        }
        if (this.f284629g == null) {
            sb.append(" shouldUseNeutralNegativeButton");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo92780b(CharSequence charSequence) {
        if (charSequence != null) {
            this.f284624b = charSequence;
            return;
        }
        throw new NullPointerException("Null description");
    }

    /* renamed from: c */
    public final void mo92781c(C58485gu guVar) {
        if (guVar != null) {
            this.f284630h = guVar;
            return;
        }
        throw new NullPointerException("Null exampleQueries");
    }

    /* renamed from: d */
    public final void mo92782d(CharSequence charSequence) {
        if (charSequence != null) {
            this.f284628f = charSequence;
            return;
        }
        throw new NullPointerException("Null negativeButtonText");
    }

    /* renamed from: e */
    public final void mo92783e(CharSequence charSequence) {
        if (charSequence != null) {
            this.f284627e = charSequence;
            return;
        }
        throw new NullPointerException("Null positiveButtonText");
    }

    /* renamed from: f */
    public final void mo92784f(CharSequence charSequence) {
        if (charSequence != null) {
            this.f284623a = charSequence;
            return;
        }
        throw new NullPointerException("Null title");
    }
}
