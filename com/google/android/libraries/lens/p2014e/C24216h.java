package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p4017at.p4056g.p4057a.p4058a.C54007bo;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.lens.e.h */
/* compiled from: PG */
final class C24216h extends C24199ab {

    /* renamed from: b */
    private final boolean f66228b;

    /* renamed from: c */
    private final C63088z f66229c;

    /* renamed from: d */
    private final C58833ax f66230d;

    /* renamed from: e */
    private final C58485gu f66231e;

    /* renamed from: f */
    private final C58833ax f66232f;

    /* renamed from: g */
    private final C58833ax f66233g;

    /* renamed from: h */
    private final C58833ax f66234h;

    /* renamed from: i */
    private final C56304dd f66235i;

    /* renamed from: j */
    private final C58485gu f66236j;

    /* renamed from: k */
    private final C58833ax f66237k;

    /* renamed from: l */
    private final C54007bo f66238l;

    /* renamed from: m */
    private final int f66239m;

    public C24216h(boolean z, C63088z zVar, C58833ax axVar, C58485gu guVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C56304dd ddVar, C58485gu guVar2, C58833ax axVar5, C54007bo boVar, int i) {
        this.f66228b = z;
        this.f66229c = zVar;
        this.f66230d = axVar;
        this.f66231e = guVar;
        this.f66232f = axVar2;
        this.f66233g = axVar3;
        this.f66234h = axVar4;
        this.f66235i = ddVar;
        this.f66236j = guVar2;
        this.f66237k = axVar5;
        this.f66238l = boVar;
        this.f66239m = i;
    }

    /* renamed from: a */
    public final int mo29663a() {
        return this.f66239m;
    }

    /* renamed from: b */
    public final C58833ax mo29664b() {
        return this.f66233g;
    }

    /* renamed from: c */
    public final C58833ax mo29665c() {
        return this.f66230d;
    }

    @Deprecated
    /* renamed from: d */
    public final C58833ax mo29666d() {
        return this.f66232f;
    }

    /* renamed from: e */
    public final C58833ax mo29667e() {
        return this.f66234h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24199ab) {
            C24199ab abVar = (C24199ab) obj;
            return this.f66228b == abVar.mo29674l() && this.f66229c.equals(abVar.mo29672j()) && this.f66230d.equals(abVar.mo29665c()) && C58597ky.m90218i(this.f66231e, abVar.mo29670h()) && this.f66232f.equals(abVar.mo29666d()) && this.f66233g.equals(abVar.mo29664b()) && this.f66234h.equals(abVar.mo29667e()) && this.f66235i.equals(abVar.mo29673k()) && C58597ky.m90218i(this.f66236j, abVar.mo29669g()) && this.f66237k.equals(abVar.mo29668f()) && this.f66238l.equals(abVar.mo29671i()) && this.f66239m == abVar.mo29663a();
        }
    }

    /* renamed from: f */
    public final C58833ax mo29668f() {
        return this.f66237k;
    }

    /* renamed from: g */
    public final C58485gu mo29669g() {
        return this.f66236j;
    }

    /* renamed from: h */
    public final C58485gu mo29670h() {
        return this.f66231e;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((true != this.f66228b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f66229c.hashCode()) * 1000003) ^ this.f66230d.hashCode()) * 1000003) ^ this.f66231e.hashCode()) * 1000003) ^ this.f66232f.hashCode()) * 1000003) ^ this.f66233g.hashCode()) * 1000003) ^ this.f66234h.hashCode()) * 1000003) ^ this.f66235i.hashCode()) * 1000003) ^ this.f66236j.hashCode()) * 1000003) ^ this.f66237k.hashCode()) * 1000003) ^ this.f66238l.hashCode()) * 1000003) ^ this.f66239m;
    }

    /* renamed from: i */
    public final C54007bo mo29671i() {
        return this.f66238l;
    }

    /* renamed from: j */
    public final C63088z mo29672j() {
        return this.f66229c;
    }

    /* renamed from: k */
    public final C56304dd mo29673k() {
        return this.f66235i;
    }

    @Deprecated
    /* renamed from: l */
    public final boolean mo29674l() {
        return this.f66228b;
    }

    public final String toString() {
        boolean z = this.f66228b;
        String valueOf = String.valueOf(this.f66229c);
        String valueOf2 = String.valueOf(this.f66230d);
        String valueOf3 = String.valueOf(this.f66231e);
        String valueOf4 = String.valueOf(this.f66232f);
        String valueOf5 = String.valueOf(this.f66233g);
        String valueOf6 = String.valueOf(this.f66234h);
        String valueOf7 = String.valueOf(this.f66235i);
        String valueOf8 = String.valueOf(this.f66236j);
        String valueOf9 = String.valueOf(this.f66237k);
        String valueOf10 = String.valueOf(this.f66238l);
        int i = this.f66239m;
        return "LensInteractionResult{isComplete=" + z + ", compressedPresentationHtmlBytes=" + valueOf + ", presentationHtml=" + valueOf2 + ", presentationResults=" + valueOf3 + ", selectedResult=" + valueOf4 + ", interactionData=" + valueOf5 + ", textData=" + valueOf6 + ", filterDetectedContexts=" + valueOf7 + ", filterRecommendations=" + valueOf8 + ", userGuidance=" + valueOf9 + ", logInfo=" + valueOf10 + ", statusCode=" + i + "}";
    }
}
