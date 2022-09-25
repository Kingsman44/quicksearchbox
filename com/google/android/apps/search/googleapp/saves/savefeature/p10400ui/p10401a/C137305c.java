package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.a.c */
/* compiled from: PG */
public final class C137305c extends C137310h {

    /* renamed from: a */
    private final String f373516a;

    public C137305c(String str) {
        if (str != null) {
            this.f373516a = str;
            return;
        }
        throw new NullPointerException("Null listName");
    }

    /* renamed from: a */
    public final String mo113625a() {
        return this.f373516a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C137310h) {
            return this.f373516a.equals(((C137310h) obj).mo113625a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f373516a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f373516a;
        return "CreateListEvent{listName=" + str + "}";
    }
}
