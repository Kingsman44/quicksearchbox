package com.google.android.apps.search.googleapp.stampviewer.p10489c;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.c.d */
/* compiled from: PG */
public final class C139348d extends C139353i {

    /* renamed from: a */
    private final boolean f378969a;

    public C139348d(boolean z) {
        this.f378969a = z;
    }

    /* renamed from: a */
    public final boolean mo114915a() {
        return this.f378969a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C139353i) && this.f378969a == ((C139353i) obj).mo114915a();
    }

    public final int hashCode() {
        return (true != this.f378969a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f378969a;
        return "EducationStateEvent{inEducationState=" + z + "}";
    }
}
