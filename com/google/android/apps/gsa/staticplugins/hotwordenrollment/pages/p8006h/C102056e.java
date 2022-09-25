package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.e */
/* compiled from: PG */
public final class C102056e extends C102048aa {

    /* renamed from: a */
    public CharSequence f284739a;

    /* renamed from: b */
    public C102076y f284740b;

    /* renamed from: c */
    public C102229r f284741c;

    /* renamed from: d */
    private CharSequence f284742d;

    /* renamed from: a */
    public final C102049ab mo92814a() {
        CharSequence charSequence;
        CharSequence charSequence2 = this.f284742d;
        if (charSequence2 != null && (charSequence = this.f284739a) != null) {
            return new C102057f(charSequence2, charSequence, this.f284740b, this.f284741c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f284742d == null) {
            sb.append(" title");
        }
        if (this.f284739a == null) {
            sb.append(" summary");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo92815b(CharSequence charSequence) {
        if (charSequence != null) {
            this.f284739a = charSequence;
            return;
        }
        throw new NullPointerException("Null summary");
    }

    /* renamed from: c */
    public final void mo92816c(CharSequence charSequence) {
        if (charSequence != null) {
            this.f284742d = charSequence;
            return;
        }
        throw new NullPointerException("Null title");
    }
}
