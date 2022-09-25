package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

import android.text.SpannableStringBuilder;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.d */
/* compiled from: PG */
public final class C102055d extends C102071t {

    /* renamed from: a */
    public final SpannableStringBuilder f284737a;

    /* renamed from: b */
    public final int f284738b;

    public C102055d(int i, SpannableStringBuilder spannableStringBuilder) {
        this.f284738b = i;
        this.f284737a = spannableStringBuilder;
    }

    /* renamed from: a */
    public final SpannableStringBuilder mo92835a() {
        return this.f284737a;
    }

    /* renamed from: b */
    public final int mo92836b() {
        return this.f284738b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C102071t) {
            C102071t tVar = (C102071t) obj;
            return this.f284738b == tVar.mo92836b() && this.f284737a.equals(tVar.mo92835a());
        }
    }

    public final int hashCode() {
        return ((this.f284738b ^ 1000003) * 1000003) ^ this.f284737a.hashCode();
    }

    public final String toString() {
        String str = this.f284738b != 2 ? "NEW" : "OLD";
        String valueOf = String.valueOf(this.f284737a);
        return "PhoneSummaryContent{imageMode=" + str + ", legalLinkText=" + valueOf + "}";
    }
}
