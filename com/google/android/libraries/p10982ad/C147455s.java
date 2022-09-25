package com.google.android.libraries.p10982ad;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.ad.s */
/* compiled from: PG */
final class C147455s extends C147451o {

    /* renamed from: d */
    private final float f398024d;

    /* renamed from: e */
    private final float f398025e;

    /* renamed from: f */
    private final float f398026f;

    /* renamed from: g */
    private final float f398027g;

    /* renamed from: h */
    private final float f398028h;

    /* renamed from: i */
    private final float f398029i;

    /* renamed from: j */
    private final float f398030j;

    /* renamed from: k */
    private final float f398031k;

    /* renamed from: l */
    private long f398032l = Long.MIN_VALUE;

    /* renamed from: m */
    private float f398033m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147455s(long j, float f, float f2, float f3, C147454r rVar) {
        super(j, f);
        float f4 = f3;
        C147454r rVar2 = rVar;
        float f5 = f2 - f;
        float f6 = rVar2.f398022a;
        float f7 = rVar2.f398023b;
        this.f398024d = f7;
        if (f7 > 1.0f) {
            double sqrt = Math.sqrt((double) (((f7 * f7) - 4.0f) * f6));
            double d = (double) f6;
            double sqrt2 = Math.sqrt(d);
            double d2 = (double) f7;
            Double.isNaN(d2);
            float f8 = (float) ((-sqrt) - (sqrt2 * d2));
            this.f398027g = f8;
            double sqrt3 = Math.sqrt((double) (f6 * ((f7 * f7) - 4.0f)));
            double sqrt4 = Math.sqrt(d);
            double d3 = (double) f7;
            Double.isNaN(d3);
            float f9 = (float) (sqrt3 - (sqrt4 * d3));
            this.f398028h = f9;
            this.f398029i = 0.0f;
            this.f398030j = 0.0f;
            this.f398031k = 0.0f;
            float f10 = (f5 - (f4 / f9)) / (1.0f - (f8 / f9));
            this.f398025e = f10;
            this.f398026f = f5 - f10;
        } else if (f7 == 1.0f) {
            float f11 = (float) (-Math.sqrt((double) f6));
            this.f398027g = f11;
            this.f398028h = 0.0f;
            this.f398029i = 0.0f;
            this.f398030j = 0.0f;
            this.f398031k = 0.0f;
            this.f398025e = f5;
            this.f398026f = f4 - (f11 * f5);
        } else {
            double d4 = (double) f6;
            double d5 = (double) (-f7);
            double sqrt5 = Math.sqrt(d4);
            Double.isNaN(d5);
            this.f398027g = (float) (d5 * sqrt5);
            float sqrt6 = (float) (Math.sqrt((double) (1.0f - (f7 * f7))) * Math.sqrt(d4));
            this.f398028h = sqrt6;
            this.f398026f = f5;
            double sqrt7 = Math.sqrt(d4);
            double d6 = (double) f4;
            double d7 = (double) (f5 * f7);
            Double.isNaN(d7);
            Double.isNaN(d6);
            double d8 = (double) sqrt6;
            Double.isNaN(d8);
            float f12 = (float) ((d6 + (d7 * sqrt7)) / d8);
            this.f398025e = f12;
            double d9 = (double) (f12 * f7);
            double d10 = (double) (f5 * sqrt6);
            double sqrt8 = Math.sqrt(d4);
            Double.isNaN(d10);
            Double.isNaN(d9);
            this.f398029i = (float) (d9 + (d10 / sqrt8));
            double d11 = (double) (f5 * f7);
            double d12 = (double) (f12 * sqrt6);
            double sqrt9 = Math.sqrt(d4);
            Double.isNaN(d12);
            Double.isNaN(d11);
            this.f398030j = (float) (d11 - (d12 / sqrt9));
            this.f398031k = (float) (-Math.sqrt(d4));
        }
    }

    /* renamed from: c */
    private static boolean m240398c() {
        return !ValueAnimator.areAnimatorsEnabled();
    }

    /* renamed from: a */
    public final float mo124190a(long j) {
        float f;
        if (m240398c()) {
            return 0.0f;
        }
        if (this.f398032l == j) {
            return this.f398033m;
        }
        float f2 = ((float) (j - this.f398014a)) * 0.001f;
        float f3 = this.f398024d;
        if (f3 > 1.0f) {
            double d = (double) this.f398025e;
            double exp = Math.exp((double) (this.f398027g * f2));
            Double.isNaN(d);
            double d2 = d * exp;
            double d3 = (double) this.f398026f;
            double exp2 = Math.exp((double) (f2 * this.f398028h));
            Double.isNaN(d3);
            f = (float) (d2 + (d3 * exp2));
            this.f398033m = f;
        } else if (f3 == 1.0f) {
            double d4 = (double) this.f398025e;
            double exp3 = Math.exp((double) (this.f398027g * f2));
            Double.isNaN(d4);
            double d5 = d4 * exp3;
            double d6 = (double) (this.f398026f * f2);
            double exp4 = Math.exp((double) (f2 * this.f398027g));
            Double.isNaN(d6);
            f = (float) (d5 + (d6 * exp4));
            this.f398033m = f;
        } else {
            double d7 = (double) this.f398025e;
            double exp5 = Math.exp((double) (this.f398027g * f2));
            Double.isNaN(d7);
            double sin = d7 * exp5 * Math.sin((double) (this.f398028h * f2));
            double d8 = (double) this.f398026f;
            double exp6 = Math.exp((double) (this.f398027g * f2));
            Double.isNaN(d8);
            f = (float) (sin + (d8 * exp6 * Math.cos((double) (this.f398028h * f2))));
            this.f398033m = f;
        }
        this.f398032l = j;
        return f;
    }

    /* renamed from: b */
    public final float mo124191b(long j) {
        if (m240398c()) {
            return 0.0f;
        }
        float f = ((float) (j - this.f398014a)) * 0.001f;
        float f2 = this.f398024d;
        if (f2 > 1.0f) {
            float f3 = this.f398025e;
            float f4 = this.f398027g;
            double exp = Math.exp((double) (f * f4));
            float f5 = this.f398026f;
            float f6 = this.f398028h;
            double d = (double) (f3 * f4);
            Double.isNaN(d);
            double d2 = (double) (f5 * f6);
            double exp2 = Math.exp((double) (f * f6));
            Double.isNaN(d2);
            return (float) ((d * exp) + (d2 * exp2));
        } else if (f2 == 1.0f) {
            double exp3 = Math.exp((double) (this.f398027g * f));
            float f7 = this.f398025e;
            float f8 = this.f398027g;
            double d3 = (double) ((f7 * f8) + (this.f398026f * ((f * f8) + 1.0f)));
            Double.isNaN(d3);
            return (float) (exp3 * d3);
        } else {
            double d4 = (double) this.f398031k;
            double exp4 = Math.exp((double) (this.f398027g * f));
            Double.isNaN(d4);
            double d5 = d4 * exp4;
            double d6 = (double) this.f398029i;
            double sin = Math.sin((double) (this.f398028h * f));
            Double.isNaN(d6);
            double d7 = d6 * sin;
            double d8 = (double) this.f398030j;
            double cos = Math.cos((double) (this.f398028h * f));
            Double.isNaN(d8);
            return (float) (d5 * (d7 + (d8 * cos)));
        }
    }
}
