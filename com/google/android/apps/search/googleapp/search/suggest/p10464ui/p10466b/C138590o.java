package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import com.google.android.apps.search.googleapp.search.suggest.C138019ak;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.o */
/* compiled from: PG */
public final class C138590o implements C47388b {

    /* renamed from: a */
    public final C138019ak f376926a;

    public C138590o(C138019ak akVar) {
        this.f376926a = akVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C138590o) && C69664n.m101066l(this.f376926a, ((C138590o) obj).f376926a);
    }

    public final int hashCode() {
        return this.f376926a.hashCode();
    }

    public final String toString() {
        C138019ak akVar = this.f376926a;
        return "SuggestionLongClickEvent(suggestionDialogInfo=" + akVar + ")";
    }
}
