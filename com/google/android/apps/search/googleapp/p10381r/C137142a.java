package com.google.android.apps.search.googleapp.p10381r;

import com.google.android.apps.search.googleapp.p10381r.C137148g;

/* renamed from: com.google.android.apps.search.googleapp.r.a */
/* compiled from: PG */
final class C137142a extends C137148g.C137149a {

    /* renamed from: a */
    private final String f373180a = "SIGNED_OUT_SEARCH_CUSTOMIZATION";

    /* renamed from: a */
    public final String mo113564a() {
        return this.f373180a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C137148g.C137149a) {
            return this.f373180a.equals(((C137148g.C137149a) obj).mo113564a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f373180a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f373180a;
        return "PreferenceClickEvent{fragmentTag=" + str + "}";
    }
}
