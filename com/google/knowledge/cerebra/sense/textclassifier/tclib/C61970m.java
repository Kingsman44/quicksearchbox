package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.m */
/* compiled from: PG */
public final class C61970m extends C61949de {

    /* renamed from: a */
    public C61908br f167465a;

    /* renamed from: b */
    public C61908br f167466b;

    /* renamed from: c */
    public C61908br f167467c;

    /* renamed from: d */
    public C61908br f167468d;

    /* renamed from: e */
    public C61908br f167469e;

    /* renamed from: f */
    public C61908br f167470f;

    /* renamed from: g */
    public C61908br f167471g;

    /* renamed from: h */
    public C61908br f167472h;

    /* renamed from: i */
    public C61925ch f167473i;

    /* renamed from: j */
    public C61895be f167474j;

    /* renamed from: k */
    public C61950df f167475k;

    /* renamed from: l */
    public byte f167476l;

    /* renamed from: m */
    private boolean f167477m;

    /* renamed from: n */
    private C58485gu f167478n;

    /* renamed from: a */
    public final C61951dg mo58393a() {
        C61908br brVar;
        C61908br brVar2;
        C61908br brVar3;
        C61908br brVar4;
        C61908br brVar5;
        C61908br brVar6;
        C61908br brVar7;
        C61908br brVar8;
        C61895be beVar;
        C58485gu guVar;
        C61950df dfVar;
        if (this.f167476l == 7 && (brVar = this.f167465a) != null && (brVar2 = this.f167466b) != null && (brVar3 = this.f167467c) != null && (brVar4 = this.f167468d) != null && (brVar5 = this.f167469e) != null && (brVar6 = this.f167470f) != null && (brVar7 = this.f167471g) != null && (brVar8 = this.f167472h) != null && (beVar = this.f167474j) != null && (guVar = this.f167478n) != null && (dfVar = this.f167475k) != null) {
            return new C61971n(brVar, brVar2, brVar3, brVar4, brVar5, brVar6, brVar7, brVar8, this.f167477m, this.f167473i, beVar, guVar, dfVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f167465a == null) {
            sb.append(" coreModelProvider");
        }
        if (this.f167466b == null) {
            sb.append(" langIdModelProvider");
        }
        if (this.f167467c == null) {
            sb.append(" actionsSuggestionsModelProvider");
        }
        if (this.f167468d == null) {
            sb.append(" webrefModelProvider");
        }
        if (this.f167469e == null) {
            sb.append(" personNameModelProvider");
        }
        if (this.f167470f == null) {
            sb.append(" alternateContactModelProvider");
        }
        if (this.f167471g == null) {
            sb.append(" neuralMatchingEncoderProvider");
        }
        if (this.f167472h == null) {
            sb.append(" deepCluModelProvider");
        }
        if ((this.f167476l & 1) == 0) {
            sb.append(" enableFallback");
        }
        if ((this.f167476l & 2) == 0) {
            sb.append(" enableInstalledApps");
        }
        if ((this.f167476l & 4) == 0) {
            sb.append(" enableTranslationInClassifier");
        }
        if (this.f167474j == null) {
            sb.append(" eventLogger");
        }
        if (this.f167478n == null) {
            sb.append(" actionsSuggestionsLocales");
        }
        if (this.f167475k == null) {
            sb.append(" intentGenerationOptions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo58394b(C58485gu guVar) {
        if (guVar != null) {
            this.f167478n = guVar;
            return;
        }
        throw new NullPointerException("Null actionsSuggestionsLocales");
    }

    /* renamed from: c */
    public final void mo58395c(boolean z) {
        this.f167477m = z;
        this.f167476l = (byte) (this.f167476l | 1);
    }
}
