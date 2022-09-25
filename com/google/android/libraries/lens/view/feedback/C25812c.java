package com.google.android.libraries.lens.view.feedback;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.feedback.c */
/* compiled from: PG */
final class C25812c extends C25829s {

    /* renamed from: a */
    public final C58833ax f70137a;

    /* renamed from: b */
    public final C58833ax f70138b;

    /* renamed from: c */
    public final C58833ax f70139c;

    /* renamed from: d */
    public final C58833ax f70140d;

    /* renamed from: e */
    public final C58833ax f70141e;

    /* renamed from: f */
    public final C58833ax f70142f;

    /* renamed from: g */
    public final C58833ax f70143g;

    /* renamed from: h */
    public final C58833ax f70144h;

    /* renamed from: i */
    public final C58833ax f70145i;

    public C25812c(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7, C58833ax axVar8, C58833ax axVar9) {
        this.f70137a = axVar;
        this.f70138b = axVar2;
        this.f70139c = axVar3;
        this.f70140d = axVar4;
        this.f70141e = axVar5;
        this.f70142f = axVar6;
        this.f70143g = axVar7;
        this.f70144h = axVar8;
        this.f70145i = axVar9;
    }

    /* renamed from: a */
    public final C25828r mo30960a() {
        return new C25811b(this);
    }

    /* renamed from: b */
    public final C58833ax mo30961b() {
        return this.f70139c;
    }

    /* renamed from: c */
    public final C58833ax mo30962c() {
        return this.f70138b;
    }

    /* renamed from: d */
    public final C58833ax mo30963d() {
        return this.f70142f;
    }

    /* renamed from: e */
    public final C58833ax mo30964e() {
        return this.f70141e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25829s) {
            C25829s sVar = (C25829s) obj;
            return this.f70137a.equals(sVar.mo30966f()) && this.f70138b.equals(sVar.mo30962c()) && this.f70139c.equals(sVar.mo30961b()) && this.f70140d.equals(sVar.mo30971j()) && this.f70141e.equals(sVar.mo30964e()) && this.f70142f.equals(sVar.mo30963d()) && this.f70143g.equals(sVar.mo30970i()) && this.f70144h.equals(sVar.mo30967g()) && this.f70145i.equals(sVar.mo30968h());
        }
    }

    /* renamed from: f */
    public final C58833ax mo30966f() {
        return this.f70137a;
    }

    /* renamed from: g */
    public final C58833ax mo30967g() {
        return this.f70144h;
    }

    /* renamed from: h */
    public final C58833ax mo30968h() {
        return this.f70145i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f70137a.hashCode() ^ 1000003) * 1000003) ^ this.f70138b.hashCode()) * 1000003) ^ this.f70139c.hashCode()) * 1000003) ^ this.f70140d.hashCode()) * 1000003) ^ this.f70141e.hashCode()) * 1000003) ^ this.f70142f.hashCode()) * 1000003) ^ this.f70143g.hashCode()) * 1000003) ^ this.f70144h.hashCode()) * 1000003) ^ this.f70145i.hashCode();
    }

    /* renamed from: i */
    public final C58833ax mo30970i() {
        return this.f70143g;
    }

    /* renamed from: j */
    public final C58833ax mo30971j() {
        return this.f70140d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f70137a);
        String valueOf2 = String.valueOf(this.f70138b);
        String valueOf3 = String.valueOf(this.f70139c);
        String valueOf4 = String.valueOf(this.f70140d);
        String valueOf5 = String.valueOf(this.f70141e);
        String valueOf6 = String.valueOf(this.f70142f);
        String valueOf7 = String.valueOf(this.f70143g);
        String valueOf8 = String.valueOf(this.f70144h);
        String valueOf9 = String.valueOf(this.f70145i);
        return "FeedbackRequestData{lastInteraction=" + valueOf + ", image=" + valueOf2 + ", clientImageProto=" + valueOf3 + ", screenshot=" + valueOf4 + ", isReticleRegionInteraction=" + valueOf5 + ", isInRegionSearchMode=" + valueOf6 + ", regionSearchArea=" + valueOf7 + ", lastMultimodalQuery=" + valueOf8 + ", lastResultSource=" + valueOf9 + "}";
    }
}
