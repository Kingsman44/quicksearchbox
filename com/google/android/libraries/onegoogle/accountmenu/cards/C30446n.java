package com.google.android.libraries.onegoogle.accountmenu.cards;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.n */
/* compiled from: PG */
final class C30446n extends C30403cd {

    /* renamed from: a */
    private final C58833ax f82255a;

    /* renamed from: b */
    private final C58833ax f82256b;

    public C30446n(C58833ax axVar, C58833ax axVar2) {
        this.f82255a = axVar;
        this.f82256b = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo35978a() {
        return this.f82256b;
    }

    /* renamed from: b */
    public final C58833ax mo35979b() {
        return this.f82255a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30403cd) {
            C30403cd cdVar = (C30403cd) obj;
            return this.f82255a.equals(cdVar.mo35979b()) && this.f82256b.equals(cdVar.mo35978a());
        }
    }

    public final int hashCode() {
        return ((this.f82255a.hashCode() ^ 1000003) * 1000003) ^ this.f82256b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f82255a);
        String valueOf2 = String.valueOf(this.f82256b);
        return "TextualCardTrailingTitle{textViewData=" + valueOf + ", icon=" + valueOf2 + "}";
    }
}
