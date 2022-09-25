package com.google.android.libraries.onegoogle.accountmenu.cards;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.l */
/* compiled from: PG */
final class C30444l extends C30401cb {

    /* renamed from: a */
    private final C30418cs f82249a;

    /* renamed from: b */
    private final C30394bv f82250b;

    /* renamed from: c */
    private final C58833ax f82251c;

    /* renamed from: d */
    private final C30397by f82252d;

    public C30444l(C30418cs csVar, C30394bv bvVar, C58833ax axVar, C30397by byVar) {
        this.f82249a = csVar;
        this.f82250b = bvVar;
        this.f82251c = axVar;
        this.f82252d = byVar;
    }

    /* renamed from: a */
    public final C30394bv mo35973a() {
        return this.f82250b;
    }

    /* renamed from: b */
    public final C30397by mo35974b() {
        return this.f82252d;
    }

    /* renamed from: c */
    public final C30418cs mo35975c() {
        return this.f82249a;
    }

    /* renamed from: d */
    public final C58833ax mo35976d() {
        return this.f82251c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30401cb) {
            C30401cb cbVar = (C30401cb) obj;
            return this.f82249a.equals(cbVar.mo35975c()) && this.f82250b.equals(cbVar.mo35973a()) && this.f82251c.equals(cbVar.mo35976d()) && this.f82252d.equals(cbVar.mo35974b());
        }
    }

    public final int hashCode() {
        return ((((((this.f82249a.hashCode() ^ 1000003) * 1000003) ^ this.f82250b.hashCode()) * 1000003) ^ this.f82251c.hashCode()) * 1000003) ^ this.f82252d.hashCode();
    }

    public final String toString() {
        String obj = this.f82249a.toString();
        String obj2 = this.f82250b.toString();
        String valueOf = String.valueOf(this.f82251c);
        String obj3 = this.f82252d.toString();
        return "TextualCardInitialData{cardIcon=" + obj + ", titleData=" + obj2 + ", highlightId=" + valueOf + ", visualElementsInfo=" + obj3 + "}";
    }
}
