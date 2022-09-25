package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.b */
/* compiled from: PG */
final class C139075b extends C139061am {

    /* renamed from: a */
    private final String f378232a;

    public C139075b(String str) {
        this.f378232a = str;
    }

    /* renamed from: a */
    public final String mo114684a() {
        return this.f378232a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C139061am) {
            return this.f378232a.equals(((C139061am) obj).mo114684a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f378232a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f378232a;
        return "OpenWidgetCustomizationMenuItemEvent{menuItemTag=" + str + "}";
    }
}
