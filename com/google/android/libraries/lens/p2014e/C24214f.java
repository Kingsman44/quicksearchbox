package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;

/* renamed from: com.google.android.libraries.lens.e.f */
/* compiled from: PG */
public final class C24214f extends C24233y {

    /* renamed from: a */
    public final C58833ax f66200a;

    /* renamed from: b */
    public final C58833ax f66201b;

    /* renamed from: c */
    public final C58833ax f66202c;

    /* renamed from: d */
    public final C58833ax f66203d;

    /* renamed from: e */
    public final int f66204e;

    /* renamed from: f */
    private final C24231w f66205f;

    /* renamed from: g */
    private final C58833ax f66206g;

    /* renamed from: h */
    private final C58485gu f66207h;

    /* renamed from: i */
    private final C58833ax f66208i;

    /* renamed from: j */
    private final boolean f66209j;

    /* renamed from: k */
    private final C56226ag f66210k;

    /* renamed from: l */
    private final C58833ax f66211l;

    /* renamed from: m */
    private final int f66212m;

    /* renamed from: n */
    private final int f66213n;

    /* renamed from: o */
    private final int f66214o;

    public C24214f(C24231w wVar, int i, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, int i2, C58485gu guVar, C58833ax axVar6, boolean z, C56226ag agVar, int i3, int i4, C58833ax axVar7) {
        this.f66205f = wVar;
        this.f66204e = i;
        this.f66200a = axVar;
        this.f66206g = axVar2;
        this.f66201b = axVar3;
        this.f66202c = axVar4;
        this.f66203d = axVar5;
        this.f66212m = i2;
        this.f66207h = guVar;
        this.f66208i = axVar6;
        this.f66209j = z;
        this.f66210k = agVar;
        this.f66213n = i3;
        this.f66214o = i4;
        this.f66211l = axVar7;
    }

    /* renamed from: a */
    public final C24231w mo29756a() {
        return this.f66205f;
    }

    /* renamed from: b */
    public final C58833ax mo29757b() {
        return this.f66211l;
    }

    /* renamed from: c */
    public final C58833ax mo29758c() {
        return this.f66208i;
    }

    /* renamed from: d */
    public final C58833ax mo29759d() {
        return this.f66206g;
    }

    /* renamed from: e */
    public final C58833ax mo29760e() {
        return this.f66203d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24233y) {
            C24233y yVar = (C24233y) obj;
            return this.f66205f.equals(yVar.mo29756a()) && this.f66204e == yVar.mo29769l() && this.f66200a.equals(yVar.mo29763g()) && this.f66206g.equals(yVar.mo29759d()) && this.f66201b.equals(yVar.mo29764h()) && this.f66202c.equals(yVar.mo29762f()) && this.f66203d.equals(yVar.mo29760e()) && this.f66212m == yVar.mo29772o() && C58597ky.m90218i(this.f66207h, yVar.mo29766i()) && this.f66208i.equals(yVar.mo29758c()) && this.f66209j == yVar.mo29768k() && this.f66210k.equals(yVar.mo29767j()) && this.f66213n == yVar.mo29771n() && this.f66214o == yVar.mo29770m() && this.f66211l.equals(yVar.mo29757b());
        }
    }

    /* renamed from: f */
    public final C58833ax mo29762f() {
        return this.f66202c;
    }

    /* renamed from: g */
    public final C58833ax mo29763g() {
        return this.f66200a;
    }

    /* renamed from: h */
    public final C58833ax mo29764h() {
        return this.f66201b;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.f66205f.hashCode() ^ 1000003) * 1000003) ^ this.f66204e) * 1000003) ^ this.f66200a.hashCode()) * 1000003) ^ this.f66206g.hashCode()) * 1000003) ^ this.f66201b.hashCode()) * 1000003) ^ this.f66202c.hashCode()) * 1000003) ^ this.f66203d.hashCode()) * 1000003) ^ this.f66212m) * 1000003) ^ this.f66207h.hashCode()) * 1000003) ^ this.f66208i.hashCode()) * 1000003) ^ (true != this.f66209j ? 1237 : 1231)) * 1000003) ^ this.f66210k.hashCode()) * 1000003) ^ this.f66213n) * 1000003) ^ this.f66214o) * 1000003) ^ this.f66211l.hashCode();
    }

    /* renamed from: i */
    public final C58485gu mo29766i() {
        return this.f66207h;
    }

    /* renamed from: j */
    public final C56226ag mo29767j() {
        return this.f66210k;
    }

    /* renamed from: k */
    public final boolean mo29768k() {
        return this.f66209j;
    }

    /* renamed from: l */
    public final int mo29769l() {
        return this.f66204e;
    }

    /* renamed from: m */
    public final int mo29770m() {
        return this.f66214o;
    }

    /* renamed from: n */
    public final int mo29771n() {
        return this.f66213n;
    }

    /* renamed from: o */
    public final int mo29772o() {
        return this.f66212m;
    }

    public final String toString() {
        String obj = this.f66205f.toString();
        int i = this.f66204e;
        String valueOf = String.valueOf(this.f66200a);
        String valueOf2 = String.valueOf(this.f66206g);
        String valueOf3 = String.valueOf(this.f66201b);
        String valueOf4 = String.valueOf(this.f66202c);
        String valueOf5 = String.valueOf(this.f66203d);
        String num = Integer.toString(this.f66212m - 1);
        String obj2 = this.f66207h.toString();
        String valueOf6 = String.valueOf(this.f66208i);
        boolean z = this.f66209j;
        String obj3 = this.f66210k.toString();
        String num2 = Integer.toString(this.f66213n - 1);
        String num3 = Integer.toString(this.f66214o - 1);
        return "LensInteraction{origin=" + obj + ", selectionType=" + C24232x.m45226a(i) + ", selectionPoint=" + valueOf + ", resultParentVed=" + valueOf2 + ", selectionWordBoxes=" + valueOf3 + ", selectionBox=" + valueOf4 + ", selectionAngleDegrees=" + valueOf5 + ", autoTextSelectionMode=" + num + ", tappedObjects=" + obj2 + ", queryRequestMetadata=" + valueOf6 + ", hideTranslations=" + z + ", clientTextSelection=" + obj3 + ", selectionTypeForLogging=" + num2 + ", selectionImageTypeForLogging=" + num3 + ", multimodalQuerySourceForLogging=" + String.valueOf(this.f66211l) + "}";
    }
}
