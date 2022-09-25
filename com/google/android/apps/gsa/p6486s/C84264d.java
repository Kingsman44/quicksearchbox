package com.google.android.apps.gsa.p6486s;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.s.d */
/* compiled from: PG */
final class C84264d extends C84271k {

    /* renamed from: a */
    private final C58833ax f229318a;

    /* renamed from: b */
    private final C58833ax f229319b;

    /* renamed from: c */
    private final C58833ax f229320c;

    /* renamed from: d */
    private final C58833ax f229321d;

    /* renamed from: e */
    private final C58833ax f229322e;

    public C84264d(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5) {
        this.f229318a = axVar;
        this.f229319b = axVar2;
        this.f229320c = axVar3;
        this.f229321d = axVar4;
        this.f229322e = axVar5;
    }

    /* renamed from: a */
    public final C58833ax mo77757a() {
        return this.f229319b;
    }

    /* renamed from: b */
    public final C58833ax mo77758b() {
        return this.f229318a;
    }

    /* renamed from: c */
    public final C58833ax mo77759c() {
        return this.f229322e;
    }

    /* renamed from: d */
    public final C58833ax mo77760d() {
        return this.f229320c;
    }

    /* renamed from: e */
    public final C58833ax mo77761e() {
        return this.f229321d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84271k) {
            C84271k kVar = (C84271k) obj;
            return this.f229318a.equals(kVar.mo77758b()) && this.f229319b.equals(kVar.mo77757a()) && this.f229320c.equals(kVar.mo77760d()) && this.f229321d.equals(kVar.mo77761e()) && this.f229322e.equals(kVar.mo77759c());
        }
    }

    public final int hashCode() {
        return ((((((((this.f229318a.hashCode() ^ 1000003) * 1000003) ^ this.f229319b.hashCode()) * 1000003) ^ this.f229320c.hashCode()) * 1000003) ^ this.f229321d.hashCode()) * 1000003) ^ this.f229322e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f229318a);
        String valueOf2 = String.valueOf(this.f229319b);
        String valueOf3 = String.valueOf(this.f229320c);
        String valueOf4 = String.valueOf(this.f229321d);
        String valueOf5 = String.valueOf(this.f229322e);
        return "PlaybackActionData{mediaItemIndex=" + valueOf + ", mediaId=" + valueOf2 + ", seekPositionMillis=" + valueOf3 + ", seekWindowIndex=" + valueOf4 + ", seekOffsetInWindowMillis=" + valueOf5 + "}";
    }
}
