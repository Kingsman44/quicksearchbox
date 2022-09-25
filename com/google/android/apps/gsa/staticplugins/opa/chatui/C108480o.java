package com.google.android.apps.gsa.staticplugins.opa.chatui;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.o */
/* compiled from: PG */
public final class C108480o extends C108481p {

    /* renamed from: a */
    private final C108430ik f301732a;

    public C108480o(C108430ik ikVar) {
        this.f301732a = ikVar;
    }

    /* renamed from: b */
    public final int mo96841b() {
        return 3;
    }

    /* renamed from: d */
    public final C108430ik mo96843d() {
        return this.f301732a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C108400hh) {
            C108400hh hhVar = (C108400hh) obj;
            if (hhVar.mo96841b() != 3 || !this.f301732a.equals(hhVar.mo96843d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f301732a.hashCode();
    }

    public final String toString() {
        String obj = this.f301732a.toString();
        return "RichSuggestionSectionElement{suggestionChip=" + obj + "}";
    }
}
