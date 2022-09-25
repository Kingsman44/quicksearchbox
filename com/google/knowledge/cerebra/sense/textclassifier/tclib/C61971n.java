package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.n */
/* compiled from: PG */
final class C61971n extends C61951dg {

    /* renamed from: a */
    private final C61908br f167479a;

    /* renamed from: b */
    private final C61908br f167480b;

    /* renamed from: c */
    private final C61908br f167481c;

    /* renamed from: d */
    private final C61908br f167482d;

    /* renamed from: e */
    private final C61908br f167483e;

    /* renamed from: f */
    private final C61908br f167484f;

    /* renamed from: g */
    private final C61908br f167485g;

    /* renamed from: h */
    private final C61908br f167486h;

    /* renamed from: i */
    private final boolean f167487i;

    /* renamed from: j */
    private final C61925ch f167488j;

    /* renamed from: k */
    private final C61895be f167489k;

    /* renamed from: l */
    private final C58485gu f167490l;

    /* renamed from: m */
    private final C61950df f167491m;

    public C61971n(C61908br brVar, C61908br brVar2, C61908br brVar3, C61908br brVar4, C61908br brVar5, C61908br brVar6, C61908br brVar7, C61908br brVar8, boolean z, C61925ch chVar, C61895be beVar, C58485gu guVar, C61950df dfVar) {
        this.f167479a = brVar;
        this.f167480b = brVar2;
        this.f167481c = brVar3;
        this.f167482d = brVar4;
        this.f167483e = brVar5;
        this.f167484f = brVar6;
        this.f167485g = brVar7;
        this.f167486h = brVar8;
        this.f167487i = z;
        this.f167488j = chVar;
        this.f167489k = beVar;
        this.f167490l = guVar;
        this.f167491m = dfVar;
    }

    /* renamed from: a */
    public final C58485gu mo58398a() {
        return this.f167490l;
    }

    /* renamed from: b */
    public final C61895be mo58399b() {
        return this.f167489k;
    }

    /* renamed from: c */
    public final C61908br mo58400c() {
        return this.f167481c;
    }

    /* renamed from: d */
    public final C61908br mo58401d() {
        return this.f167484f;
    }

    /* renamed from: e */
    public final C61908br mo58402e() {
        return this.f167479a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r1 = r4.f167488j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.knowledge.cerebra.sense.textclassifier.tclib.C61951dg
            r2 = 0
            if (r1 == 0) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r5 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61951dg) r5
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r4.f167479a
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r3 = r5.mo58402e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r4.f167480b
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r3 = r5.mo58404g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r4.f167481c
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r3 = r5.mo58400c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r4.f167482d
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r3 = r5.mo58407j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r4.f167483e
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r3 = r5.mo58406i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r4.f167484f
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r3 = r5.mo58401d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r4.f167485g
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r3 = r5.mo58405h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r4.f167486h
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r3 = r5.mo58403f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ba
            boolean r1 = r4.f167487i
            boolean r3 = r5.mo58410m()
            if (r1 != r3) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ch r1 = r4.f167488j
            if (r1 != 0) goto L_0x007e
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ch r1 = r5.mo58408k()
            if (r1 != 0) goto L_0x00ba
            goto L_0x0089
        L_0x007e:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ch r3 = r5.mo58408k()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0089
            goto L_0x00ba
        L_0x0089:
            boolean r1 = r5.mo58411n()
            if (r1 != 0) goto L_0x00ba
            boolean r1 = r5.mo58412o()
            if (r1 != 0) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.be r1 = r4.f167489k
            com.google.knowledge.cerebra.sense.textclassifier.tclib.be r3 = r5.mo58399b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ba
            com.google.common.b.gu r1 = r4.f167490l
            com.google.common.b.gu r3 = r5.mo58398a()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x00ba
            com.google.knowledge.cerebra.sense.textclassifier.tclib.df r1 = r4.f167491m
            com.google.knowledge.cerebra.sense.textclassifier.tclib.df r5 = r5.mo58409l()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00ba
            return r0
        L_0x00ba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61971n.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C61908br mo58403f() {
        return this.f167486h;
    }

    /* renamed from: g */
    public final C61908br mo58404g() {
        return this.f167480b;
    }

    /* renamed from: h */
    public final C61908br mo58405h() {
        return this.f167485g;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((((this.f167479a.hashCode() ^ 1000003) * 1000003) ^ this.f167480b.hashCode()) * 1000003) ^ this.f167481c.hashCode()) * 1000003) ^ this.f167482d.hashCode()) * 1000003) ^ this.f167483e.hashCode()) * 1000003) ^ this.f167484f.hashCode()) * 1000003) ^ this.f167485g.hashCode()) * 1000003) ^ this.f167486h.hashCode()) * 1000003) ^ (true != this.f167487i ? 1237 : 1231)) * 1000003;
        C61925ch chVar = this.f167488j;
        if (chVar == null) {
            i = 0;
        } else {
            i = chVar.hashCode();
        }
        return ((((((((((hashCode ^ i) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.f167489k.hashCode()) * 1000003) ^ this.f167490l.hashCode()) * 1000003) ^ 385622423;
    }

    /* renamed from: i */
    public final C61908br mo58406i() {
        return this.f167483e;
    }

    /* renamed from: j */
    public final C61908br mo58407j() {
        return this.f167482d;
    }

    /* renamed from: k */
    public final C61925ch mo58408k() {
        return this.f167488j;
    }

    /* renamed from: l */
    public final C61950df mo58409l() {
        return this.f167491m;
    }

    /* renamed from: m */
    public final boolean mo58410m() {
        return this.f167487i;
    }

    /* renamed from: n */
    public final boolean mo58411n() {
        return false;
    }

    /* renamed from: o */
    public final boolean mo58412o() {
        return false;
    }

    public final String toString() {
        String obj = this.f167479a.toString();
        String obj2 = this.f167480b.toString();
        String obj3 = this.f167481c.toString();
        String obj4 = this.f167482d.toString();
        String obj5 = this.f167483e.toString();
        String obj6 = this.f167484f.toString();
        String obj7 = this.f167485g.toString();
        String obj8 = this.f167486h.toString();
        boolean z = this.f167487i;
        String valueOf = String.valueOf(this.f167488j);
        String obj9 = this.f167489k.toString();
        String obj10 = this.f167490l.toString();
        return "TextClassifierOptions{coreModelProvider=" + obj + ", langIdModelProvider=" + obj2 + ", actionsSuggestionsModelProvider=" + obj3 + ", webrefModelProvider=" + obj4 + ", personNameModelProvider=" + obj5 + ", alternateContactModelProvider=" + obj6 + ", neuralMatchingEncoderProvider=" + obj7 + ", deepCluModelProvider=" + obj8 + ", enableFallback=" + z + ", contactOptions=" + valueOf + ", enableInstalledApps=false, enableTranslationInClassifier=false, eventLogger=" + obj9 + ", actionsSuggestionsLocales=" + obj10 + ", intentGenerationOptions=IntentGenerationOptions{addContactIntentEnabled=false, searchIntentEnabled=false}}";
    }
}
