package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aar */
/* compiled from: PG */
public final class aar extends abd {

    /* renamed from: d */
    private int f20120d;

    /* renamed from: e */
    private int f20121e;

    /* renamed from: f */
    private int f20122f;

    /* renamed from: g */
    private int f20123g;

    /* renamed from: h */
    private boolean f20124h;

    /* renamed from: i */
    private boolean f20125i;

    /* renamed from: j */
    private int f20126j;

    /* renamed from: k */
    private int f20127k;

    /* renamed from: l */
    private boolean f20128l;

    /* renamed from: m */
    private int f20129m;

    /* renamed from: n */
    private int f20130n;

    /* renamed from: o */
    private boolean f20131o;

    /* renamed from: p */
    private boolean f20132p;

    /* renamed from: q */
    private final SparseArray f20133q = new SparseArray();

    /* renamed from: r */
    private final SparseBooleanArray f20134r = new SparseBooleanArray();

    @Deprecated
    public aar() {
        m18088c();
    }

    /* renamed from: c */
    private final void m18088c() {
        this.f20120d = Integer.MAX_VALUE;
        this.f20121e = Integer.MAX_VALUE;
        this.f20122f = Integer.MAX_VALUE;
        this.f20123g = Integer.MAX_VALUE;
        this.f20124h = true;
        this.f20125i = true;
        this.f20126j = Integer.MAX_VALUE;
        this.f20127k = Integer.MAX_VALUE;
        this.f20128l = true;
        this.f20129m = Integer.MAX_VALUE;
        this.f20130n = Integer.MAX_VALUE;
        this.f20131o = true;
        this.f20132p = true;
    }

    /* renamed from: a */
    public final aaq mo14357a() {
        return new aaq(this.f20120d, this.f20121e, this.f20122f, this.f20123g, this.f20124h, this.f20125i, this.f20126j, this.f20127k, this.f20128l, this.f20174a, this.f20129m, this.f20130n, this.f20131o, this.f20175b, this.f20176c, this.f20132p, this.f20133q, this.f20134r);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14358b(Context context) {
        super.mo14358b(context);
    }

    public aar(Context context) {
        mo14358b(context);
        m18088c();
        Point ah = aeu.m18517ah(context);
        int i = ah.x;
        int i2 = ah.y;
        this.f20126j = i;
        this.f20127k = i2;
        this.f20128l = true;
    }
}
