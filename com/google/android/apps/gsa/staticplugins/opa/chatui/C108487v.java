package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.v */
/* compiled from: PG */
final class C108487v extends C108302ds {

    /* renamed from: a */
    private final C58485gu f301853a;

    /* renamed from: b */
    private final String f301854b;

    public C108487v(C58485gu guVar, String str) {
        this.f301853a = guVar;
        this.f301854b = str;
    }

    /* renamed from: a */
    public final C58485gu mo96738a() {
        return this.f301853a;
    }

    /* renamed from: b */
    public final String mo96739b() {
        return this.f301854b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C108302ds) {
            C108302ds dsVar = (C108302ds) obj;
            C58485gu guVar = this.f301853a;
            if (guVar != null ? C58597ky.m90218i(guVar, dsVar.mo96738a()) : dsVar.mo96738a() == null) {
                String str = this.f301854b;
                if (str != null ? str.equals(dsVar.mo96739b()) : dsVar.mo96739b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f301853a);
        String str = this.f301854b;
        return "SuggestionChipsHistoryData{suggestionItems=" + valueOf + ", eventId=" + str + "}";
    }

    public final int hashCode() {
        int i;
        C58485gu guVar = this.f301853a;
        int i2 = 0;
        if (guVar == null) {
            i = 0;
        } else {
            i = guVar.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str = this.f301854b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 ^ i2;
    }
}
