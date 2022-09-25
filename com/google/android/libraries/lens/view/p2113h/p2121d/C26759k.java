package com.google.android.libraries.lens.view.p2113h.p2121d;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.h.d.k */
/* compiled from: PG */
final class C26759k extends C26733ab {

    /* renamed from: b */
    private final C58833ax f72918b;

    /* renamed from: c */
    private final C58833ax f72919c;

    /* renamed from: d */
    private final C58833ax f72920d;

    /* renamed from: e */
    private final C58833ax f72921e;

    /* renamed from: f */
    private final C58833ax f72922f;

    /* renamed from: g */
    private final C58833ax f72923g;

    /* renamed from: h */
    private final C58833ax f72924h;

    /* renamed from: i */
    private final C58833ax f72925i;

    /* renamed from: j */
    private final C58833ax f72926j;

    public C26759k(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7, C58833ax axVar8, C58833ax axVar9) {
        this.f72918b = axVar;
        this.f72919c = axVar2;
        this.f72920d = axVar3;
        this.f72921e = axVar4;
        this.f72922f = axVar5;
        this.f72923g = axVar6;
        this.f72924h = axVar7;
        this.f72925i = axVar8;
        this.f72926j = axVar9;
    }

    /* renamed from: a */
    public final C58833ax mo32047a() {
        return this.f72922f;
    }

    /* renamed from: b */
    public final C58833ax mo32048b() {
        return this.f72921e;
    }

    /* renamed from: c */
    public final C58833ax mo32049c() {
        return this.f72926j;
    }

    /* renamed from: d */
    public final C58833ax mo32050d() {
        return this.f72919c;
    }

    /* renamed from: e */
    public final C58833ax mo32051e() {
        return this.f72924h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26733ab) {
            C26733ab abVar = (C26733ab) obj;
            return this.f72918b.equals(abVar.mo32054h()) && this.f72919c.equals(abVar.mo32050d()) && this.f72920d.equals(abVar.mo32053g()) && this.f72921e.equals(abVar.mo32048b()) && this.f72922f.equals(abVar.mo32047a()) && this.f72923g.equals(abVar.mo32052f()) && this.f72924h.equals(abVar.mo32051e()) && this.f72925i.equals(abVar.mo32055i()) && this.f72926j.equals(abVar.mo32049c());
        }
    }

    /* renamed from: f */
    public final C58833ax mo32052f() {
        return this.f72923g;
    }

    /* renamed from: g */
    public final C58833ax mo32053g() {
        return this.f72920d;
    }

    /* renamed from: h */
    public final C58833ax mo32054h() {
        return this.f72918b;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f72918b.hashCode() ^ 1000003) * 1000003) ^ this.f72919c.hashCode()) * 1000003) ^ this.f72920d.hashCode()) * 1000003) ^ this.f72921e.hashCode()) * 1000003) ^ this.f72922f.hashCode()) * 1000003) ^ this.f72923g.hashCode()) * 1000003) ^ this.f72924h.hashCode()) * 1000003) ^ this.f72925i.hashCode()) * 1000003) ^ this.f72926j.hashCode();
    }

    /* renamed from: i */
    public final C58833ax mo32055i() {
        return this.f72925i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f72918b);
        String valueOf2 = String.valueOf(this.f72919c);
        String valueOf3 = String.valueOf(this.f72920d);
        String valueOf4 = String.valueOf(this.f72921e);
        String valueOf5 = String.valueOf(this.f72922f);
        String valueOf6 = String.valueOf(this.f72923g);
        String valueOf7 = String.valueOf(this.f72924h);
        String valueOf8 = String.valueOf(this.f72925i);
        String valueOf9 = String.valueOf(this.f72926j);
        return "CaptureMetadata{isFocused=" + valueOf + ", focusRegions=" + valueOf2 + ", isExposureConverged=" + valueOf3 + ", exposureDurationNs=" + valueOf4 + ", callbackTimestampNs=" + valueOf5 + ", imageLocation=" + valueOf6 + ", gravityEstimate=" + valueOf7 + ", zoomFactor=" + valueOf8 + ", focalLength=" + valueOf9 + "}";
    }
}
