package com.google.common.p4522b;

import java.lang.reflect.Array;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.ed */
/* compiled from: PG */
final class C58414ed extends C58738qd {

    /* renamed from: a */
    public final C58495hd f156016a;

    /* renamed from: b */
    public final C58495hd f156017b;

    /* renamed from: c */
    public final int[] f156018c;

    /* renamed from: d */
    public final int[] f156019d;

    /* renamed from: e */
    public final Object[][] f156020e;

    /* renamed from: f */
    private final C58495hd f156021f;

    /* renamed from: g */
    private final C58495hd f156022g;

    /* renamed from: h */
    private final int[] f156023h;

    /* renamed from: i */
    private final int[] f156024i;

    public C58414ed(C58485gu guVar, C58528ij ijVar, C58528ij ijVar2) {
        int size = ijVar.size();
        int[] iArr = new int[2];
        iArr[1] = ijVar2.size();
        iArr[0] = size;
        this.f156020e = (Object[][]) Array.newInstance(Object.class, iArr);
        C58495hd c = C58662ni.m90344c(ijVar);
        this.f156016a = c;
        C58495hd c2 = C58662ni.m90344c(ijVar2);
        this.f156017b = c2;
        this.f156018c = new int[((C58729pv) c).f156487c];
        this.f156019d = new int[((C58729pv) c2).f156487c];
        int[] iArr2 = new int[guVar.size()];
        int[] iArr3 = new int[guVar.size()];
        for (int i = 0; i < guVar.size(); i++) {
            C58784rw rwVar = (C58784rw) guVar.get(i);
            Object b = rwVar.mo55972b();
            Object a = rwVar.mo55971a();
            int intValue = ((Integer) Objects.requireNonNull((Integer) this.f156016a.get(b))).intValue();
            int intValue2 = ((Integer) Objects.requireNonNull((Integer) this.f156017b.get(a))).intValue();
            m90601z(b, a, this.f156020e[intValue][intValue2], rwVar.mo55973c());
            this.f156020e[intValue][intValue2] = rwVar.mo55973c();
            int[] iArr4 = this.f156018c;
            iArr4[intValue] = iArr4[intValue] + 1;
            int[] iArr5 = this.f156019d;
            iArr5[intValue2] = iArr5[intValue2] + 1;
            iArr2[i] = intValue;
            iArr3[i] = intValue2;
        }
        this.f156023h = iArr2;
        this.f156024i = iArr3;
        this.f156021f = new C58413ec(this);
        this.f156022g = new C58408dy(this);
    }

    /* renamed from: a */
    public final Object mo55009a(Object obj, Object obj2) {
        Integer num = (Integer) this.f156016a.get(obj);
        Integer num2 = (Integer) this.f156017b.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f156020e[num.intValue()][num2.intValue()];
    }

    /* renamed from: n */
    public final int mo55196n() {
        return this.f156023h.length;
    }

    /* renamed from: o */
    public final C58495hd mo55197o() {
        return C58495hd.m89898l(this.f156022g);
    }

    /* renamed from: p */
    public final C58495hd mo55198p() {
        return C58495hd.m89898l(this.f156021f);
    }

    /* renamed from: q */
    public final C58544iz mo55199q() {
        return C58544iz.m90086a(this, this.f156023h, this.f156024i);
    }

    /* renamed from: r */
    public final C58784rw mo55200r(int i) {
        int i2 = this.f156023h[i];
        int i3 = this.f156024i[i];
        return m90096x(C58495hd.m89898l(this.f156021f).keySet().mo55229u().get(i2), C58495hd.m89898l(this.f156022g).keySet().mo55229u().get(i3), Objects.requireNonNull(this.f156020e[i2][i3]));
    }

    /* renamed from: s */
    public final Object mo55201s(int i) {
        return Objects.requireNonNull(this.f156020e[this.f156023h[i]][this.f156024i[i]]);
    }

    /* renamed from: t */
    public final /* synthetic */ Map mo55202t() {
        return C58495hd.m89898l(this.f156021f);
    }
}
