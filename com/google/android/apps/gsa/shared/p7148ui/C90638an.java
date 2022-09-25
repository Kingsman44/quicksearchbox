package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.shared.ui.an */
/* compiled from: PG */
public final class C90638an extends ViewGroup.MarginLayoutParams {
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: a */
    public int f253472a;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: b */
    public boolean f253473b = true;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: c */
    public boolean f253474c = true;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: d */
    public boolean f253475d = true;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: e */
    public boolean f253476e = false;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: f */
    public int f253477f;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: g */
    public int f253478g;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: h */
    public int f253479h;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: i */
    public int f253480i;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: j */
    public int f253481j;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: k */
    public boolean f253482k;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: l */
    public boolean f253483l;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: m */
    public boolean f253484m;

    /* renamed from: n */
    public int f253485n;

    /* renamed from: o */
    public int f253486o;

    /* renamed from: p */
    public int f253487p;

    /* renamed from: q */
    public Rect f253488q;

    /* renamed from: r */
    public int f253489r;

    /* renamed from: s */
    public int f253490s;

    public C90638an(int i) {
        super(-1, -2);
        this.f253472a = i;
    }

    /* renamed from: a */
    private static final int m147976a(TypedArray typedArray, int i, int i2) {
        int i3 = typedArray.getInt(i, -1);
        return i3 >= 0 ? new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}[i3] : i2;
    }

    public C90638an(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C90629ae.f253430h);
        this.f253472a = obtainStyledAttributes.getInteger(5, 0);
        this.f253473b = obtainStyledAttributes.getBoolean(3, true);
        this.f253474c = obtainStyledAttributes.getBoolean(4, true);
        this.f253475d = obtainStyledAttributes.getBoolean(11, true);
        this.f253476e = obtainStyledAttributes.getBoolean(12, false);
        this.f253480i = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f253481j = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.f253489r = m147976a(obtainStyledAttributes, 2, 1);
        this.f253490s = m147976a(obtainStyledAttributes, 7, 5);
        this.f253478g = obtainStyledAttributes.getInt(0, 0);
        this.f253479h = obtainStyledAttributes.getInt(6, 0);
        this.f253487p = obtainStyledAttributes.getInt(1, 0);
        this.f253484m = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
    }

    public C90638an(ViewGroup.LayoutParams layoutParams) {
        super(-1, layoutParams.height);
        if (layoutParams instanceof C90638an) {
            C90638an anVar = (C90638an) layoutParams;
            this.f253472a = anVar.f253472a;
            this.f253473b = anVar.f253473b;
            this.f253474c = anVar.f253474c;
            this.f253476e = anVar.f253476e;
            this.f253489r = anVar.f253489r;
            this.f253490s = anVar.f253490s;
            this.f253478g = anVar.f253478g;
            this.f253479h = anVar.f253479h;
            this.f253477f = anVar.f253477f;
            this.f253480i = anVar.f253480i;
            this.f253481j = anVar.f253481j;
            int i = anVar.f253485n;
            this.f253485n = 0;
            int i2 = anVar.f253486o;
            this.f253486o = 0;
            Rect rect = anVar.f253488q;
            this.f253488q = rect == null ? null : new Rect(rect);
            this.f253482k = anVar.f253482k;
            this.f253483l = anVar.f253483l;
            this.f253487p = anVar.f253487p;
            this.f253484m = anVar.f253484m;
        }
    }
}
