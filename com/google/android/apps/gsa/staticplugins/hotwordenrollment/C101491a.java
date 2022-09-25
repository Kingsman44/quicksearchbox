package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.a */
/* compiled from: PG */
public final class C101491a extends C102228q {

    /* renamed from: a */
    public CharSequence f283233a;

    /* renamed from: b */
    public CharSequence f283234b;

    /* renamed from: c */
    private int f283235c;

    /* renamed from: d */
    private C84011f f283236d;

    /* renamed from: e */
    private C84011f f283237e;

    /* renamed from: f */
    private byte f283238f;

    /* renamed from: a */
    public final C102229r mo92318a() {
        C84011f fVar;
        C84011f fVar2;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (this.f283238f == 1 && (fVar = this.f283236d) != null && (fVar2 = this.f283237e) != null && (charSequence = this.f283233a) != null && (charSequence2 = this.f283234b) != null) {
            return new C101499b(this.f283235c, fVar, fVar2, charSequence, charSequence2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f283238f == 0) {
            sb.append(" footerType");
        }
        if (this.f283236d == null) {
            sb.append(" primaryButtonSpec");
        }
        if (this.f283237e == null) {
            sb.append(" secondaryButtonSpec");
        }
        if (this.f283233a == null) {
            sb.append(" opaPrimaryButtonContentDescription");
        }
        if (this.f283234b == null) {
            sb.append(" opaSecondaryButtonContentDescription");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo92319b(int i) {
        this.f283235c = i;
        this.f283238f = 1;
    }

    /* renamed from: c */
    public final void mo92320c(C84011f fVar) {
        if (fVar != null) {
            this.f283236d = fVar;
            return;
        }
        throw new NullPointerException("Null primaryButtonSpec");
    }

    /* renamed from: d */
    public final void mo92321d(C84011f fVar) {
        if (fVar != null) {
            this.f283237e = fVar;
            return;
        }
        throw new NullPointerException("Null secondaryButtonSpec");
    }
}
