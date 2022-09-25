package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.m */
/* compiled from: PG */
public final class C108478m extends C108481p {

    /* renamed from: a */
    private final C54201r f301730a;

    public C108478m(C54201r rVar) {
        this.f301730a = rVar;
    }

    /* renamed from: a */
    public final C54201r mo96840a() {
        return this.f301730a;
    }

    /* renamed from: b */
    public final int mo96841b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C108400hh) {
            C108400hh hhVar = (C108400hh) obj;
            if (hhVar.mo96841b() != 2 || !this.f301730a.equals(hhVar.mo96840a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f301730a.hashCode();
    }

    public final String toString() {
        String obj = this.f301730a.toString();
        return "RichSuggestionSectionElement{richSuggestion=" + obj + "}";
    }
}
