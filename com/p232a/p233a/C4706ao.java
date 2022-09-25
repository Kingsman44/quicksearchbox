package com.p232a.p233a;

import java.util.List;

/* renamed from: com.a.a.ao */
/* compiled from: PG */
public final class C4706ao implements Cloneable {

    /* renamed from: A */
    public Float f14771A;

    /* renamed from: B */
    public C4716ay f14772B;

    /* renamed from: C */
    public Float f14773C;

    /* renamed from: D */
    public int f14774D;

    /* renamed from: E */
    public int f14775E;

    /* renamed from: F */
    public int f14776F;

    /* renamed from: G */
    public int f14777G;

    /* renamed from: H */
    public int f14778H;

    /* renamed from: I */
    public int f14779I;

    /* renamed from: J */
    public int f14780J;

    /* renamed from: K */
    public int f14781K;

    /* renamed from: L */
    public int f14782L;

    /* renamed from: a */
    public long f14783a = 0;

    /* renamed from: b */
    public C4716ay f14784b;

    /* renamed from: c */
    public Float f14785c;

    /* renamed from: d */
    public C4716ay f14786d;

    /* renamed from: e */
    public Float f14787e;

    /* renamed from: f */
    public C4779z f14788f;

    /* renamed from: g */
    public Float f14789g;

    /* renamed from: h */
    public C4779z[] f14790h;

    /* renamed from: i */
    public C4779z f14791i;

    /* renamed from: j */
    public Float f14792j;

    /* renamed from: k */
    public C4770q f14793k;

    /* renamed from: l */
    public List f14794l;

    /* renamed from: m */
    public C4779z f14795m;

    /* renamed from: n */
    public Integer f14796n;

    /* renamed from: o */
    public Boolean f14797o;

    /* renamed from: p */
    public C4767n f14798p;

    /* renamed from: q */
    public String f14799q;

    /* renamed from: r */
    public String f14800r;

    /* renamed from: s */
    public String f14801s;

    /* renamed from: t */
    public Boolean f14802t;

    /* renamed from: u */
    public Boolean f14803u;

    /* renamed from: v */
    public C4716ay f14804v;

    /* renamed from: w */
    public Float f14805w;

    /* renamed from: x */
    public String f14806x;

    /* renamed from: y */
    public String f14807y;

    /* renamed from: z */
    public C4716ay f14808z;

    protected C4706ao() {
    }

    /* renamed from: a */
    public static C4706ao m13074a() {
        C4706ao aoVar = new C4706ao();
        aoVar.f14783a = -1;
        C4770q qVar = C4770q.f15113a;
        aoVar.f14784b = qVar;
        aoVar.f14774D = 1;
        Float valueOf = Float.valueOf(1.0f);
        aoVar.f14785c = valueOf;
        aoVar.f14786d = null;
        aoVar.f14787e = valueOf;
        aoVar.f14788f = new C4779z(1.0f);
        aoVar.f14775E = 1;
        aoVar.f14776F = 1;
        aoVar.f14789g = Float.valueOf(4.0f);
        aoVar.f14790h = null;
        aoVar.f14791i = new C4779z(0.0f);
        aoVar.f14792j = valueOf;
        aoVar.f14793k = qVar;
        aoVar.f14794l = null;
        aoVar.f14795m = new C4779z(12.0f, 7);
        aoVar.f14796n = 400;
        aoVar.f14777G = 1;
        aoVar.f14778H = 1;
        aoVar.f14779I = 1;
        aoVar.f14780J = 1;
        aoVar.f14797o = true;
        aoVar.f14798p = null;
        aoVar.f14799q = null;
        aoVar.f14800r = null;
        aoVar.f14801s = null;
        aoVar.f14802t = Boolean.TRUE;
        aoVar.f14803u = Boolean.TRUE;
        aoVar.f14804v = C4770q.f15113a;
        aoVar.f14805w = valueOf;
        aoVar.f14806x = null;
        aoVar.f14781K = 1;
        aoVar.f14807y = null;
        aoVar.f14808z = null;
        aoVar.f14771A = valueOf;
        aoVar.f14772B = null;
        aoVar.f14773C = valueOf;
        aoVar.f14782L = 1;
        return aoVar;
    }

    /* access modifiers changed from: protected */
    public final Object clone() {
        try {
            C4706ao aoVar = (C4706ao) super.clone();
            C4779z[] zVarArr = this.f14790h;
            if (zVarArr != null) {
                aoVar.f14790h = (C4779z[]) zVarArr.clone();
            }
            return aoVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
