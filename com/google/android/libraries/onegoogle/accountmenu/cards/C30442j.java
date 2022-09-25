package com.google.android.libraries.onegoogle.accountmenu.cards;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.j */
/* compiled from: PG */
public final class C30442j extends C30394bv {

    /* renamed from: a */
    private final String f82243a;

    /* renamed from: b */
    private final C58833ax f82244b;

    public C30442j(String str, C58833ax axVar) {
        if (str != null) {
            this.f82243a = str;
            if (axVar != null) {
                this.f82244b = axVar;
                return;
            }
            throw new NullPointerException("Null titleContentDescription");
        }
        throw new NullPointerException("Null title");
    }

    /* renamed from: a */
    public final C58833ax mo35958a() {
        return this.f82244b;
    }

    /* renamed from: b */
    public final String mo35959b() {
        return this.f82243a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30394bv) {
            C30394bv bvVar = (C30394bv) obj;
            return this.f82243a.equals(bvVar.mo35959b()) && this.f82244b.equals(bvVar.mo35958a());
        }
    }

    public final int hashCode() {
        return ((this.f82243a.hashCode() ^ 1000003) * 1000003) ^ this.f82244b.hashCode();
    }

    public final String toString() {
        String str = this.f82243a;
        String obj = this.f82244b.toString();
        return "TextViewData{title=" + str + ", titleContentDescription=" + obj + "}";
    }
}
