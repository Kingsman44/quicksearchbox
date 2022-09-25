package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.a */
/* compiled from: PG */
final class C81721a extends C81806y {

    /* renamed from: a */
    private final boolean f223534a;

    /* renamed from: b */
    private final int f223535b;

    /* renamed from: c */
    private final int f223536c;

    /* renamed from: d */
    private final int f223537d;

    /* renamed from: e */
    private final int f223538e;

    /* renamed from: f */
    private final int f223539f;

    /* renamed from: g */
    private final int f223540g;

    /* renamed from: h */
    private final int f223541h;

    /* renamed from: i */
    private final int f223542i;

    /* renamed from: j */
    private final int f223543j;

    /* renamed from: k */
    private final int f223544k;

    /* renamed from: l */
    private final int f223545l;

    /* renamed from: m */
    private final int f223546m;

    /* renamed from: n */
    private final int f223547n;

    public C81721a(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f223534a = z;
        this.f223545l = i;
        this.f223546m = i2;
        this.f223535b = i3;
        this.f223536c = i4;
        this.f223537d = i5;
        this.f223547n = i6;
        this.f223538e = i7;
        this.f223539f = i8;
        this.f223540g = i9;
        this.f223541h = i10;
        this.f223542i = i11;
        this.f223543j = i12;
        this.f223544k = i13;
    }

    /* renamed from: a */
    public final int mo75264a() {
        return this.f223536c;
    }

    /* renamed from: b */
    public final int mo75265b() {
        return this.f223543j;
    }

    /* renamed from: c */
    public final int mo75266c() {
        return this.f223540g;
    }

    /* renamed from: d */
    public final int mo75267d() {
        return this.f223535b;
    }

    /* renamed from: e */
    public final int mo75268e() {
        return this.f223544k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81806y) {
            C81806y yVar = (C81806y) obj;
            return this.f223534a == yVar.mo75276k() && this.f223545l == yVar.mo75279n() && this.f223546m == yVar.mo75278m() && this.f223535b == yVar.mo75267d() && this.f223536c == yVar.mo75264a() && this.f223537d == yVar.mo75274i() && this.f223547n == yVar.mo75277l() && this.f223538e == yVar.mo75270f() && this.f223539f == yVar.mo75275j() && this.f223540g == yVar.mo75266c() && this.f223541h == yVar.mo75271g() && this.f223542i == yVar.mo75272h() && this.f223543j == yVar.mo75265b() && this.f223544k == yVar.mo75268e();
        }
    }

    /* renamed from: f */
    public final int mo75270f() {
        return this.f223538e;
    }

    /* renamed from: g */
    public final int mo75271g() {
        return this.f223541h;
    }

    /* renamed from: h */
    public final int mo75272h() {
        return this.f223542i;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((true != this.f223534a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f223545l) * 1000003) ^ this.f223546m) * 1000003) ^ this.f223535b) * 1000003) ^ this.f223536c) * 1000003) ^ this.f223537d) * 1000003) ^ this.f223547n) * 1000003) ^ this.f223538e) * 1000003) ^ this.f223539f) * 1000003) ^ this.f223540g) * 1000003) ^ this.f223541h) * 1000003) ^ this.f223542i) * 1000003) ^ this.f223543j) * 1000003) ^ this.f223544k;
    }

    /* renamed from: i */
    public final int mo75274i() {
        return this.f223537d;
    }

    /* renamed from: j */
    public final int mo75275j() {
        return this.f223539f;
    }

    /* renamed from: k */
    public final boolean mo75276k() {
        return this.f223534a;
    }

    /* renamed from: l */
    public final int mo75277l() {
        return this.f223547n;
    }

    /* renamed from: m */
    public final int mo75278m() {
        return this.f223546m;
    }

    /* renamed from: n */
    public final int mo75279n() {
        return this.f223545l;
    }

    public final String toString() {
        boolean z = this.f223534a;
        String str = this.f223545l != 1 ? "FULLSCREEN" : "TACTILE";
        int i = this.f223546m;
        String str2 = i != 1 ? i != 2 ? i != 3 ? "TOP_LARGE_NOT_EXPANDABLE_PLATE" : "TOP_SMALL" : "TOP_LARGE" : "TOP_BOTTOM";
        int i2 = this.f223535b;
        int i3 = this.f223536c;
        int i4 = this.f223537d;
        String str3 = this.f223547n != 1 ? "SIDE" : "TOP";
        int i5 = this.f223538e;
        int i6 = this.f223539f;
        int i7 = this.f223540g;
        int i8 = this.f223541h;
        int i9 = this.f223542i;
        int i10 = this.f223543j;
        int i11 = this.f223544k;
        return "InputPlateConfiguration{isDynamicColor=" + z + ", viewStyle=" + str + ", transcriptionPadding=" + str2 + ", singleChipsTopPadding=" + i2 + ", doubleChipsTopMargin=" + i3 + ", singleTrySayingTopPadding=" + i4 + ", singleGreetingLogo=" + str3 + ", singleGreetingTopPadding=" + i5 + ", topContentVerticalPadding=" + i6 + ", freSuggestionVerticalPadding=" + i7 + ", singleInputBottomContainerBottomPadding=" + i8 + ", singleInputTopContainerMinHeight=" + i9 + ", doubleContentMinHeight=" + i10 + ", singleContentMinHeight=" + i11 + "}";
    }
}
