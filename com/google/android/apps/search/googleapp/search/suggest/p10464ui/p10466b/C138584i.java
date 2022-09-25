package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.i */
/* compiled from: PG */
public final class C138584i implements C47388b {

    /* renamed from: a */
    private final CharSequence f376915a;

    public C138584i(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "text");
        this.f376915a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C138584i) && C69664n.m101066l(this.f376915a, ((C138584i) obj).f376915a);
    }

    public final int hashCode() {
        return this.f376915a.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.f376915a;
        return "SearchBoxFocusEvent(text=" + charSequence + ")";
    }
}
