package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.a */
/* compiled from: PG */
final class C101761a extends C101774n {

    /* renamed from: a */
    public Boolean f283854a;

    /* renamed from: b */
    public Integer f283855b;

    /* renamed from: c */
    public Intent f283856c;

    /* renamed from: d */
    private C101773m f283857d;

    /* renamed from: a */
    public final C101775o mo92546a() {
        Boolean bool;
        Integer num;
        C101773m mVar = this.f283857d;
        if (mVar != null && (bool = this.f283854a) != null && (num = this.f283855b) != null) {
            return new C101762b(mVar, bool, num, this.f283856c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f283857d == null) {
            sb.append(" enrollmentScreenId");
        }
        if (this.f283854a == null) {
            sb.append(" smoothScroll");
        }
        if (this.f283855b == null) {
            sb.append(" enrollmentResult");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo92547b(C101773m mVar) {
        if (mVar != null) {
            this.f283857d = mVar;
            return;
        }
        throw new NullPointerException("Null enrollmentScreenId");
    }
}
