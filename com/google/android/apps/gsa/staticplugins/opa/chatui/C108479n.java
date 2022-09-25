package com.google.android.apps.gsa.staticplugins.opa.chatui;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.n */
/* compiled from: PG */
public final class C108479n extends C108481p {

    /* renamed from: a */
    private final String f301731a;

    public C108479n(String str) {
        this.f301731a = str;
    }

    /* renamed from: b */
    public final int mo96841b() {
        return 1;
    }

    /* renamed from: c */
    public final String mo96842c() {
        return this.f301731a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C108400hh) {
            C108400hh hhVar = (C108400hh) obj;
            if (hhVar.mo96841b() != 1 || !this.f301731a.equals(hhVar.mo96842c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f301731a.hashCode();
    }

    public final String toString() {
        String str = this.f301731a;
        return "RichSuggestionSectionElement{sectionTitle=" + str + "}";
    }
}
