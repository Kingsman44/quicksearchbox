package com.google.android.apps.search.googleapp.saves.savefeature.p10398c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.c.a */
/* compiled from: PG */
final class C137284a extends C137288b {

    /* renamed from: a */
    public final String f373480a;

    /* renamed from: b */
    public final C58485gu f373481b;

    public C137284a(String str, C58485gu guVar) {
        if (str != null) {
            this.f373480a = str;
            if (guVar != null) {
                this.f373481b = guVar;
                return;
            }
            throw new NullPointerException("Null webUrls");
        }
        throw new NullPointerException("Null subject");
    }

    /* renamed from: a */
    public final C58485gu mo113609a() {
        return this.f373481b;
    }

    /* renamed from: b */
    public final String mo113610b() {
        return this.f373480a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C137288b) {
            C137288b bVar = (C137288b) obj;
            return this.f373480a.equals(bVar.mo113610b()) && C58597ky.m90218i(this.f373481b, bVar.mo113609a());
        }
    }

    public final int hashCode() {
        return ((this.f373480a.hashCode() ^ 1000003) * 1000003) ^ this.f373481b.hashCode();
    }

    public final String toString() {
        String str = this.f373480a;
        String obj = this.f373481b.toString();
        return "SavesShareIntentData{subject=" + str + ", webUrls=" + obj + "}";
    }
}
