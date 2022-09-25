package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3515l.C44770aa;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44785p;

/* renamed from: com.google.android.material.button.c */
/* compiled from: PG */
public final class C44573c {

    /* renamed from: a */
    public final MaterialButton f115993a;

    /* renamed from: b */
    public C44785p f115994b;

    /* renamed from: c */
    public int f115995c;

    /* renamed from: d */
    public int f115996d;

    /* renamed from: e */
    public int f115997e;

    /* renamed from: f */
    public int f115998f;

    /* renamed from: g */
    public int f115999g;

    /* renamed from: h */
    public int f116000h;

    /* renamed from: i */
    public PorterDuff.Mode f116001i;

    /* renamed from: j */
    public ColorStateList f116002j;

    /* renamed from: k */
    public ColorStateList f116003k;

    /* renamed from: l */
    public ColorStateList f116004l;

    /* renamed from: m */
    public Drawable f116005m;

    /* renamed from: n */
    public boolean f116006n = false;

    /* renamed from: o */
    public boolean f116007o = false;

    /* renamed from: p */
    public boolean f116008p = false;

    /* renamed from: q */
    public boolean f116009q;

    /* renamed from: r */
    public boolean f116010r = true;

    /* renamed from: s */
    public LayerDrawable f116011s;

    /* renamed from: t */
    public int f116012t;

    public C44573c(MaterialButton materialButton, C44785p pVar) {
        this.f115993a = materialButton;
        this.f115994b = pVar;
    }

    /* renamed from: a */
    public final C44779j mo47586a(boolean z) {
        LayerDrawable layerDrawable = this.f116011s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C44779j) ((LayerDrawable) ((InsetDrawable) this.f116011s.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: b */
    public final C44770aa mo47587b() {
        LayerDrawable layerDrawable = this.f116011s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f116011s.getNumberOfLayers() > 2) {
            return (C44770aa) this.f116011s.getDrawable(2);
        }
        return (C44770aa) this.f116011s.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo47588c() {
        this.f116007o = true;
        this.f115993a.mo47556m(this.f116002j);
        this.f115993a.mo47557n(this.f116001i);
    }

    /* renamed from: d */
    public final void mo47589d(C44785p pVar) {
        if (mo47586a(false) != null) {
            mo47586a(false).mo47555l(pVar);
        }
        if (mo47586a(true) != null) {
            mo47586a(true).mo47555l(pVar);
        }
        if (mo47587b() != null) {
            mo47587b().mo47555l(pVar);
        }
    }

    /* renamed from: e */
    public final void mo47590e() {
        int i = 0;
        C44779j a = mo47586a(false);
        C44779j a2 = mo47586a(true);
        if (a != null) {
            int i2 = this.f116000h;
            ColorStateList colorStateList = this.f116003k;
            a.mo48129aa((float) i2);
            a.mo48128Z(colorStateList);
            if (a2 != null) {
                float f = (float) this.f116000h;
                if (this.f116006n) {
                    i = C44535e.m78719b(this.f115993a, R.attr.colorSurface);
                }
                a2.mo48127Y(f, i);
            }
        }
    }
}
