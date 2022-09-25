package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.j */
/* compiled from: PG */
public final class C138585j implements C47388b {

    /* renamed from: a */
    public final CharSequence f376916a;

    /* renamed from: b */
    public final int f376917b;

    /* renamed from: c */
    public final boolean f376918c;

    public C138585j(CharSequence charSequence, int i, boolean z) {
        C69664n.m101061g(charSequence, "text");
        this.f376916a = charSequence;
        this.f376917b = i;
        this.f376918c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C138585j)) {
            return false;
        }
        C138585j jVar = (C138585j) obj;
        return C69664n.m101066l(this.f376916a, jVar.f376916a) && this.f376917b == jVar.f376917b && this.f376918c == jVar.f376918c;
    }

    public final int hashCode() {
        return (((this.f376916a.hashCode() * 31) + this.f376917b) * 31) + (this.f376918c ? 1 : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f376916a;
        int i = this.f376917b;
        boolean z = this.f376918c;
        return "SearchBoxTextChangeEvent(text=" + charSequence + ", cursorPosition=" + i + ", triggeredByUser=" + z + ")";
    }
}
