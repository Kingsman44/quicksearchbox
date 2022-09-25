package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.a */
/* compiled from: PG */
final class C139048a extends C139115m {

    /* renamed from: a */
    private final int f378184a;

    public C139048a(int i) {
        this.f378184a = i;
    }

    /* renamed from: a */
    public final int mo114670a() {
        return this.f378184a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C139115m) && this.f378184a == ((C139115m) obj).mo114670a();
    }

    public final int hashCode() {
        return this.f378184a ^ 1000003;
    }

    public final String toString() {
        int i = this.f378184a;
        return "CustomColorSliderCloseEvent{customColor=" + i + "}";
    }
}
