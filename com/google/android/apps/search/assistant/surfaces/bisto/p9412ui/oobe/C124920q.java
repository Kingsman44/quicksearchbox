package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.q */
/* compiled from: PG */
public final class C124920q extends C124804ag {

    /* renamed from: a */
    private final String f344665a;

    public C124920q(String str) {
        this.f344665a = str;
    }

    /* renamed from: a */
    public final String mo106649a() {
        return this.f344665a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C124804ag)) {
            return false;
        }
        C124804ag agVar = (C124804ag) obj;
        String str = this.f344665a;
        if (str == null) {
            return agVar.mo106649a() == null;
        }
        return str.equals(agVar.mo106649a());
    }

    public final int hashCode() {
        String str = this.f344665a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String str = this.f344665a;
        return "EndSetupEvent{oobeScreenName=" + str + "}";
    }
}
