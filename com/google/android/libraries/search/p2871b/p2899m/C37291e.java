package com.google.android.libraries.search.p2871b.p2899m;

import com.google.common.base.C58833ax;
import java.util.ListIterator;

/* renamed from: com.google.android.libraries.search.b.m.e */
/* compiled from: PG */
final class C37291e extends C37297k {

    /* renamed from: a */
    public final ListIterator f99092a;

    /* renamed from: b */
    public final C58833ax f99093b;

    /* renamed from: c */
    public final int f99094c;

    public C37291e(ListIterator listIterator, int i, C58833ax axVar) {
        if (listIterator != null) {
            this.f99092a = listIterator;
            this.f99094c = i;
            this.f99093b = axVar;
            return;
        }
        throw new NullPointerException("Null iterator");
    }

    /* renamed from: a */
    public final C58833ax mo40840a() {
        return this.f99093b;
    }

    /* renamed from: b */
    public final ListIterator mo40841b() {
        return this.f99092a;
    }

    /* renamed from: c */
    public final int mo40842c() {
        return this.f99094c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37297k) {
            C37297k kVar = (C37297k) obj;
            return this.f99092a.equals(kVar.mo40841b()) && this.f99094c == kVar.mo40842c() && this.f99093b.equals(kVar.mo40840a());
        }
    }

    public final int hashCode() {
        return ((((this.f99092a.hashCode() ^ 1000003) * 1000003) ^ this.f99094c) * 1000003) ^ this.f99093b.hashCode();
    }

    public final String toString() {
        String obj = this.f99092a.toString();
        String str = this.f99094c != 1 ? "INVALID_START" : "VALID";
        String obj2 = this.f99093b.toString();
        return "StoreInsertionStatus{iterator=" + obj + ", status=" + str + ", endEvent=" + obj2 + "}";
    }
}
