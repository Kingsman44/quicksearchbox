package com.google.android.libraries.onegoogle.accountmenu.features.accountmessages;

import com.google.android.libraries.onegoogle.accountmenu.cards.C30418cs;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.accountmessages.i */
/* compiled from: PG */
final class C30517i extends C30516h {

    /* renamed from: a */
    public final String f82425a;

    /* renamed from: b */
    public final String f82426b;

    /* renamed from: c */
    public final String f82427c;

    /* renamed from: d */
    public final C30418cs f82428d;

    /* renamed from: e */
    public final C30418cs f82429e;

    /* renamed from: f */
    public final C30418cs f82430f;

    public C30517i(String str, String str2, String str3, C30418cs csVar, C30418cs csVar2, C30418cs csVar3) {
        if (str != null) {
            this.f82425a = str;
            if (str2 != null) {
                this.f82426b = str2;
                if (str3 != null) {
                    this.f82427c = str3;
                    this.f82428d = csVar;
                    this.f82429e = csVar2;
                    this.f82430f = csVar3;
                    return;
                }
                throw new NullPointerException("Null importantEntryPointA11yLabel");
            }
            throw new NullPointerException("Null recommendedActions");
        }
        throw new NullPointerException("Null accountIsInGoodShape");
    }

    /* renamed from: a */
    public final C30418cs mo36160a() {
        return this.f82429e;
    }

    /* renamed from: b */
    public final C30418cs mo36161b() {
        return this.f82430f;
    }

    /* renamed from: c */
    public final C30418cs mo36162c() {
        return this.f82428d;
    }

    /* renamed from: d */
    public final String mo36163d() {
        return this.f82425a;
    }

    /* renamed from: e */
    public final String mo36164e() {
        return this.f82427c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30516h) {
            C30516h hVar = (C30516h) obj;
            return this.f82425a.equals(hVar.mo36163d()) && this.f82426b.equals(hVar.mo36165f()) && this.f82427c.equals(hVar.mo36164e()) && this.f82428d.equals(hVar.mo36162c()) && this.f82429e.equals(hVar.mo36160a()) && this.f82430f.equals(hVar.mo36161b());
        }
    }

    /* renamed from: f */
    public final String mo36165f() {
        return this.f82426b;
    }

    public final int hashCode() {
        return ((((((((((this.f82425a.hashCode() ^ 1000003) * 1000003) ^ this.f82426b.hashCode()) * 1000003) ^ this.f82427c.hashCode()) * 1000003) ^ this.f82428d.hashCode()) * 1000003) ^ this.f82429e.hashCode()) * 1000003) ^ this.f82430f.hashCode();
    }

    public final String toString() {
        String str = this.f82425a;
        String str2 = this.f82426b;
        String str3 = this.f82427c;
        String obj = this.f82428d.toString();
        String obj2 = this.f82429e.toString();
        String obj3 = this.f82430f.toString();
        return "AccountMessagesResources{accountIsInGoodShape=" + str + ", recommendedActions=" + str2 + ", importantEntryPointA11yLabel=" + str3 + ", yellowAlertIcon=" + obj + ", checkIcon=" + obj2 + ", shieldIcon=" + obj3 + "}";
    }
}
