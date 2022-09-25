package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.c */
/* compiled from: PG */
final class C139102c extends C139088bm {

    /* renamed from: a */
    private final String f378317a;

    public C139102c(String str) {
        this.f378317a = str;
    }

    /* renamed from: a */
    public final String mo114715a() {
        return this.f378317a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C139088bm) {
            return this.f378317a.equals(((C139088bm) obj).mo114715a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f378317a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f378317a;
        return "ToolbarTitleEvent{menuItemTag=" + str + "}";
    }
}
