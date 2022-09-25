package com.google.android.apps.search.googleapp.settingsui;

import com.google.android.apps.search.googleapp.p10536x.C139874j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.an */
/* compiled from: PG */
public final class C139160an implements C139161ao {

    /* renamed from: a */
    public final C139874j f378476a;

    public C139160an(C139874j jVar) {
        C69664n.m101061g(jVar, "settingsPageEnum");
        this.f378476a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C139160an) && this.f378476a == ((C139160an) obj).f378476a;
    }

    public final int hashCode() {
        return this.f378476a.hashCode();
    }

    public final String toString() {
        C139874j jVar = this.f378476a;
        return "SettingsPage(settingsPageEnum=" + jVar + ")";
    }
}
