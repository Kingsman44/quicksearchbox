package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.c */
/* compiled from: PG */
final class C131497c extends C131494bw {

    /* renamed from: a */
    private final Optional f359351a;

    /* renamed from: b */
    private final Optional f359352b;

    /* renamed from: c */
    private final Optional f359353c;

    /* renamed from: d */
    private final C58485gu f359354d;

    public C131497c(Optional optional, Optional optional2, Optional optional3, C58485gu guVar) {
        this.f359351a = optional;
        this.f359352b = optional2;
        this.f359353c = optional3;
        this.f359354d = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo110181a() {
        return this.f359354d;
    }

    /* renamed from: b */
    public final Optional mo110182b() {
        return this.f359353c;
    }

    /* renamed from: c */
    public final Optional mo110183c() {
        return this.f359352b;
    }

    /* renamed from: d */
    public final Optional mo110184d() {
        return this.f359351a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131494bw) {
            C131494bw bwVar = (C131494bw) obj;
            return this.f359351a.equals(bwVar.mo110184d()) && this.f359352b.equals(bwVar.mo110183c()) && this.f359353c.equals(bwVar.mo110182b()) && C58597ky.m90218i(this.f359354d, bwVar.mo110181a());
        }
    }

    public final int hashCode() {
        return ((((((this.f359351a.hashCode() ^ 1000003) * 1000003) ^ this.f359352b.hashCode()) * 1000003) ^ this.f359353c.hashCode()) * 1000003) ^ this.f359354d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f359351a);
        String valueOf2 = String.valueOf(this.f359352b);
        String valueOf3 = String.valueOf(this.f359353c);
        String obj = this.f359354d.toString();
        return "ShoppingListCard{suggestion=" + valueOf + ", sliceUri=" + valueOf2 + ", shoppingListPayload=" + valueOf3 + ", placesSupportingShoppingLists=" + obj + "}";
    }
}
