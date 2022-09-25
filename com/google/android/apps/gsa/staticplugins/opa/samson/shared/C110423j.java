package com.google.android.apps.gsa.staticplugins.opa.samson.shared;

import android.graphics.Point;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.j */
/* compiled from: PG */
public final class C110423j {

    /* renamed from: a */
    public int f307782a;

    /* renamed from: b */
    public int f307783b;

    /* renamed from: c */
    public int f307784c;

    /* renamed from: d */
    public int f307785d;

    /* renamed from: e */
    public int f307786e;

    /* renamed from: f */
    public int f307787f;

    /* renamed from: g */
    public int f307788g;

    /* renamed from: h */
    public int f307789h;

    /* renamed from: i */
    public int f307790i;

    /* renamed from: j */
    public int f307791j;

    /* renamed from: k */
    public int f307792k;

    /* renamed from: l */
    public int f307793l;

    /* renamed from: m */
    public int f307794m;

    /* renamed from: n */
    public int f307795n;

    /* renamed from: o */
    public int f307796o;

    /* renamed from: p */
    public boolean f307797p;

    /* renamed from: q */
    private final Random f307798q = new Random();

    /* renamed from: r */
    private int f307799r;

    /* renamed from: s */
    private int f307800s;

    /* renamed from: c */
    private final int m183889c(int i) {
        if (i > 0) {
            return this.f307798q.nextInt(i);
        }
        return 0;
    }

    /* renamed from: e */
    private final void m183891e(int i, boolean z) {
        if (z) {
            this.f307799r = i;
            return;
        }
        this.f307800s = i;
        m183890d(this.f307799r, true);
    }

    /* renamed from: f */
    private final boolean m183892f(int i) {
        return i >= this.f307784c && i < this.f307786e + -1;
    }

    /* renamed from: g */
    private final boolean m183893g(int i) {
        return i >= this.f307785d && i < this.f307787f + -1;
    }

    /* renamed from: a */
    public final Point mo98660a() {
        if (!this.f307797p) {
            m183890d(this.f307800s, false);
        } else {
            this.f307797p = false;
        }
        this.f307788g = this.f307789h + m183889c(this.f307791j);
        return new Point(this.f307788g, this.f307790i + m183889c(this.f307792k));
    }

    /* renamed from: b */
    public final void mo98661b(int[][] iArr) {
        int[] iArr2 = iArr[m183889c(iArr.length)];
        this.f307800s = iArr2[0];
        this.f307799r = iArr2[1];
    }

    /* renamed from: d */
    private final void m183890d(int i, boolean z) {
        if (i == 0) {
            return;
        }
        if (i == 1) {
            int i2 = this.f307789h + this.f307791j;
            if (m183892f(i2)) {
                this.f307789h = i2;
            } else {
                m183891e(2, z);
            }
        } else if (i == 2) {
            int i3 = this.f307789h - this.f307791j;
            if (m183892f(i3)) {
                this.f307789h = i3;
            } else {
                m183891e(1, z);
            }
        } else if (i == 3) {
            int i4 = this.f307790i + this.f307792k;
            if (m183893g(i4)) {
                this.f307790i = i4;
            } else {
                m183891e(4, z);
            }
        } else if (i == 4) {
            int i5 = this.f307790i - this.f307792k;
            if (m183893g(i5)) {
                this.f307790i = i5;
            } else {
                m183891e(3, z);
            }
        } else {
            throw new RuntimeException("Unknown Direction");
        }
    }
}
