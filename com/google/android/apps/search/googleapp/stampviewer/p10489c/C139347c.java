package com.google.android.apps.search.googleapp.stampviewer.p10489c;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.c.c */
/* compiled from: PG */
public final class C139347c extends C139352h {

    /* renamed from: a */
    private final boolean f378968a;

    public C139347c(boolean z) {
        this.f378968a = z;
    }

    /* renamed from: a */
    public final boolean mo114911a() {
        return this.f378968a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C139352h) && this.f378968a == ((C139352h) obj).mo114911a();
    }

    public final int hashCode() {
        return (true != this.f378968a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f378968a;
        return "DocumentLoadedEvent{story=" + z + "}";
    }
}
