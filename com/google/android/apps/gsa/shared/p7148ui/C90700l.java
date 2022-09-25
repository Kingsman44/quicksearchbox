package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.util.p7187ui.C91118q;

/* renamed from: com.google.android.apps.gsa.shared.ui.l */
/* compiled from: PG */
public final class C90700l extends FrameLayout.LayoutParams {

    /* renamed from: a */
    public CoScrollContainer f253712a;

    /* renamed from: b */
    public View f253713b;
    @ViewDebug.ExportedProperty(category = "layout_CoScrollContainer", mapping = {@ViewDebug.IntToString(from = 0, to = "regular"), @ViewDebug.IntToString(from = 1, to = "header"), @ViewDebug.IntToString(from = 5, to = "offscreen")})

    /* renamed from: c */
    public int f253714c;
    @ViewDebug.ExportedProperty(category = "layout_CoScrollContainer")

    /* renamed from: d */
    boolean f253715d;
    @ViewDebug.ExportedProperty(category = "layout_CoScrollContainer")

    /* renamed from: e */
    public int f253716e;
    @ViewDebug.ExportedProperty(category = "layout_CoScrollContainer")

    /* renamed from: f */
    public int f253717f;
    @ViewDebug.ExportedProperty(category = "layout_CoScrollContainer")

    /* renamed from: g */
    boolean f253718g;

    /* renamed from: h */
    public C91118q f253719h;
    @ViewDebug.ExportedProperty(category = "layout_CoScrollContainer")

    /* renamed from: i */
    public int f253720i;

    /* renamed from: j */
    public long f253721j;

    /* renamed from: k */
    public long f253722k;

    /* renamed from: l */
    public final Runnable f253723l = new C90699k(this);
    @ViewDebug.ExportedProperty(category = "layout_CoScrollContainer")

    /* renamed from: m */
    public int f253724m;

    public C90700l(Context context, CoScrollContainer coScrollContainer, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f253712a = coScrollContainer;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C90629ae.f253426d);
        this.f253715d = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int mo85030a() {
        int max = Math.max(this.f253719h.mo84903a(), this.f253716e + this.f253717f);
        CoScrollContainer coScrollContainer = this.f253712a;
        return coScrollContainer != null ? Math.max(this.f253716e - coScrollContainer.f253338a, (max - Math.max(0, this.f253717f)) - this.f253712a.getHeight()) : max - this.f253717f;
    }

    /* renamed from: b */
    public final void mo85031b(int i) {
        this.f253714c = i;
        CoScrollContainer coScrollContainer = this.f253712a;
        if (coScrollContainer != null) {
            coScrollContainer.mo84806m(this);
            this.f253712a.mo84819p(this, 0);
        }
    }

    /* renamed from: c */
    public final void mo85032c(View view) {
        this.f253713b = view;
        boolean z = view instanceof C91118q;
        this.f253718g = z;
        this.f253719h = z ? (C91118q) view : null;
    }

    public C90700l(CoScrollContainer coScrollContainer, int i) {
        super(-1, -1);
        this.f253712a = coScrollContainer;
        this.f253714c = i;
    }

    public C90700l(CoScrollContainer coScrollContainer, ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f253712a = coScrollContainer;
        if (layoutParams instanceof C90700l) {
            C90700l lVar = (C90700l) layoutParams;
            this.f253714c = lVar.f253714c;
            this.f253715d = lVar.f253715d;
            this.f253713b = lVar.f253713b;
            this.f253716e = lVar.f253716e;
            this.f253717f = lVar.f253717f;
            this.f253718g = lVar.f253718g;
            this.f253719h = lVar.f253719h;
            this.f253720i = lVar.f253720i;
        }
    }
}
