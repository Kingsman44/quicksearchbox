package com.google.android.libraries.lens.view.infopanel.p2138a;

import com.google.android.libraries.lens.view.infopanel.p2138a.p2139a.C26965d;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.infopanel.a.b */
/* compiled from: PG */
final class C26966b extends C26973i {

    /* renamed from: a */
    public final C58485gu f73530a;

    /* renamed from: b */
    public final C26965d f73531b;

    /* renamed from: c */
    public final boolean f73532c;

    /* renamed from: d */
    public final C58833ax f73533d;

    /* renamed from: e */
    public final C58833ax f73534e;

    /* renamed from: f */
    public final C58833ax f73535f;

    /* renamed from: g */
    public final boolean f73536g;

    /* renamed from: h */
    public final C58833ax f73537h;

    /* renamed from: i */
    public final C58833ax f73538i;

    /* renamed from: j */
    public final C58833ax f73539j;

    /* renamed from: k */
    public final C58833ax f73540k;

    /* renamed from: l */
    public final C58833ax f73541l;

    public C26966b(C58485gu guVar, C26965d dVar, boolean z, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, boolean z2, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7, C58833ax axVar8) {
        this.f73530a = guVar;
        this.f73531b = dVar;
        this.f73532c = z;
        this.f73533d = axVar;
        this.f73534e = axVar2;
        this.f73535f = axVar3;
        this.f73536g = z2;
        this.f73537h = axVar4;
        this.f73538i = axVar5;
        this.f73539j = axVar6;
        this.f73540k = axVar7;
        this.f73541l = axVar8;
    }

    /* renamed from: a */
    public final C26971g mo32411a() {
        return new C26961a(this);
    }

    /* renamed from: b */
    public final C26965d mo32412b() {
        return this.f73531b;
    }

    /* renamed from: d */
    public final C58833ax mo32413d() {
        return this.f73535f;
    }

    /* renamed from: e */
    public final C58833ax mo32414e() {
        return this.f73539j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26973i) {
            C26973i iVar = (C26973i) obj;
            return C58597ky.m90218i(this.f73530a, iVar.mo32423l()) && this.f73531b.equals(iVar.mo32412b()) && this.f73532c == iVar.mo32425n() && this.f73533d.equals(iVar.mo32417g()) && this.f73534e.equals(iVar.mo32422k()) && this.f73535f.equals(iVar.mo32413d()) && this.f73536g == iVar.mo32424m() && this.f73537h.equals(iVar.mo32420i()) && this.f73538i.equals(iVar.mo32421j()) && this.f73539j.equals(iVar.mo32414e()) && this.f73540k.equals(iVar.mo32418h()) && this.f73541l.equals(iVar.mo32416f());
        }
    }

    /* renamed from: f */
    public final C58833ax mo32416f() {
        return this.f73541l;
    }

    /* renamed from: g */
    public final C58833ax mo32417g() {
        return this.f73533d;
    }

    /* renamed from: h */
    public final C58833ax mo32418h() {
        return this.f73540k;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((this.f73530a.hashCode() ^ 1000003) * 1000003) ^ this.f73531b.hashCode()) * 1000003) ^ (true != this.f73532c ? 1237 : 1231)) * 1000003) ^ this.f73533d.hashCode()) * 1000003) ^ this.f73534e.hashCode()) * 1000003) ^ this.f73535f.hashCode()) * 1000003;
        if (true == this.f73536g) {
            i = 1231;
        }
        return ((((((((((hashCode ^ i) * 1000003) ^ this.f73537h.hashCode()) * 1000003) ^ this.f73538i.hashCode()) * 1000003) ^ this.f73539j.hashCode()) * 1000003) ^ this.f73540k.hashCode()) * 1000003) ^ this.f73541l.hashCode();
    }

    /* renamed from: i */
    public final C58833ax mo32420i() {
        return this.f73537h;
    }

    /* renamed from: j */
    public final C58833ax mo32421j() {
        return this.f73538i;
    }

    /* renamed from: k */
    public final C58833ax mo32422k() {
        return this.f73534e;
    }

    /* renamed from: l */
    public final C58485gu mo32423l() {
        return this.f73530a;
    }

    /* renamed from: m */
    public final boolean mo32424m() {
        return this.f73536g;
    }

    /* renamed from: n */
    public final boolean mo32425n() {
        return this.f73532c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f73530a);
        String valueOf2 = String.valueOf(this.f73531b);
        boolean z = this.f73532c;
        String valueOf3 = String.valueOf(this.f73533d);
        String valueOf4 = String.valueOf(this.f73534e);
        String valueOf5 = String.valueOf(this.f73535f);
        boolean z2 = this.f73536g;
        String valueOf6 = String.valueOf(this.f73537h);
        String valueOf7 = String.valueOf(this.f73538i);
        String valueOf8 = String.valueOf(this.f73539j);
        String valueOf9 = String.valueOf(this.f73540k);
        String valueOf10 = String.valueOf(this.f73541l);
        return "InfoPanelModel{items=" + valueOf + ", header=" + valueOf2 + ", showLoading=" + z + ", loadingType=" + valueOf3 + ", srpModel=" + valueOf4 + ", infoPanelFeedbackItem=" + valueOf5 + ", isGoodResult=" + z2 + ", presentationHtml=" + valueOf6 + ", presentationHtmlBytes=" + valueOf7 + ", inlineUpdateReplaceIndex=" + valueOf8 + ", popFromHistory=" + valueOf9 + ", lensQueryId=" + valueOf10 + "}";
    }
}
