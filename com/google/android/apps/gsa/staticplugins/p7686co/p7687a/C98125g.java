package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.g */
/* compiled from: PG */
final class C98125g extends C98098bz {

    /* renamed from: a */
    private final C58833ax f274006a;

    /* renamed from: b */
    private final C58833ax f274007b;

    /* renamed from: c */
    private final C58833ax f274008c;

    /* renamed from: d */
    private final C58485gu f274009d;

    /* renamed from: e */
    private final C58833ax f274010e;

    /* renamed from: f */
    private final C58833ax f274011f;

    /* renamed from: g */
    private final C58485gu f274012g;

    /* renamed from: h */
    private final C58833ax f274013h;

    /* renamed from: i */
    private final C58833ax f274014i;

    /* renamed from: j */
    private final C58833ax f274015j;

    /* renamed from: k */
    private final C58833ax f274016k;

    /* renamed from: l */
    private final C58833ax f274017l;

    public C98125g(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58485gu guVar, C58833ax axVar4, C58833ax axVar5, C58485gu guVar2, C58833ax axVar6, C58833ax axVar7, C58833ax axVar8, C58833ax axVar9, C58833ax axVar10) {
        this.f274006a = axVar;
        this.f274007b = axVar2;
        this.f274008c = axVar3;
        this.f274009d = guVar;
        this.f274010e = axVar4;
        this.f274011f = axVar5;
        this.f274012g = guVar2;
        this.f274013h = axVar6;
        this.f274014i = axVar7;
        this.f274015j = axVar8;
        this.f274016k = axVar9;
        this.f274017l = axVar10;
    }

    /* renamed from: a */
    public final C58833ax mo90938a() {
        return this.f274011f;
    }

    /* renamed from: b */
    public final C58833ax mo90939b() {
        return this.f274007b;
    }

    /* renamed from: c */
    public final C58833ax mo90940c() {
        return this.f274015j;
    }

    /* renamed from: d */
    public final C58833ax mo90941d() {
        return this.f274013h;
    }

    /* renamed from: e */
    public final C58833ax mo90942e() {
        return this.f274008c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98098bz) {
            C98098bz bzVar = (C98098bz) obj;
            return this.f274006a.equals(bzVar.mo90946i()) && this.f274007b.equals(bzVar.mo90939b()) && this.f274008c.equals(bzVar.mo90942e()) && C58597ky.m90218i(this.f274009d, bzVar.mo90949l()) && this.f274010e.equals(bzVar.mo90947j()) && this.f274011f.equals(bzVar.mo90938a()) && C58597ky.m90218i(this.f274012g, bzVar.mo90948k()) && this.f274013h.equals(bzVar.mo90941d()) && this.f274014i.equals(bzVar.mo90944g()) && this.f274015j.equals(bzVar.mo90940c()) && this.f274016k.equals(bzVar.mo90943f()) && this.f274017l.equals(bzVar.mo90945h());
        }
    }

    /* renamed from: f */
    public final C58833ax mo90943f() {
        return this.f274016k;
    }

    /* renamed from: g */
    public final C58833ax mo90944g() {
        return this.f274014i;
    }

    /* renamed from: h */
    public final C58833ax mo90945h() {
        return this.f274017l;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.f274006a.hashCode() ^ 1000003) * 1000003) ^ this.f274007b.hashCode()) * 1000003) ^ this.f274008c.hashCode()) * 1000003) ^ this.f274009d.hashCode()) * 1000003) ^ this.f274010e.hashCode()) * 1000003) ^ this.f274011f.hashCode()) * 1000003) ^ this.f274012g.hashCode()) * 1000003) ^ this.f274013h.hashCode()) * 1000003) ^ this.f274014i.hashCode()) * 1000003) ^ this.f274015j.hashCode()) * 1000003) ^ this.f274016k.hashCode()) * 1000003) ^ this.f274017l.hashCode();
    }

    /* renamed from: i */
    public final C58833ax mo90946i() {
        return this.f274006a;
    }

    /* renamed from: j */
    public final C58833ax mo90947j() {
        return this.f274010e;
    }

    /* renamed from: k */
    public final C58485gu mo90948k() {
        return this.f274012g;
    }

    /* renamed from: l */
    public final C58485gu mo90949l() {
        return this.f274009d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f274006a);
        String valueOf2 = String.valueOf(this.f274007b);
        String valueOf3 = String.valueOf(this.f274008c);
        String obj = this.f274009d.toString();
        String valueOf4 = String.valueOf(this.f274010e);
        String valueOf5 = String.valueOf(this.f274011f);
        String obj2 = this.f274012g.toString();
        String valueOf6 = String.valueOf(this.f274013h);
        String valueOf7 = String.valueOf(this.f274014i);
        String valueOf8 = String.valueOf(this.f274015j);
        String valueOf9 = String.valueOf(this.f274016k);
        String valueOf10 = String.valueOf(this.f274017l);
        return "DataSet{location=" + valueOf + ", backgroundEntryTree=" + valueOf2 + ", foregroundEntryTree=" + valueOf3 + ", entryCookies=" + obj + ", requestSchedule=" + valueOf4 + ", account=" + valueOf5 + ", cardRenderEvents=" + obj2 + ", backgroundNextPageToken=" + valueOf6 + ", foregroundNextPageToken=" + valueOf7 + ", backgroundFeedId=" + valueOf8 + ", foregroundFeedId=" + valueOf9 + ", lastDiscardedFeedId=" + valueOf10 + "}";
    }
}
