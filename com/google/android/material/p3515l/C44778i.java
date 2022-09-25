package com.google.android.material.p3515l;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.p3508e.C44654a;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.material.l.i */
/* compiled from: PG */
public final class C44778i extends Drawable.ConstantState {

    /* renamed from: a */
    public C44785p f116718a;

    /* renamed from: b */
    public C44654a f116719b;

    /* renamed from: c */
    public ColorFilter f116720c;

    /* renamed from: d */
    public ColorStateList f116721d = null;

    /* renamed from: e */
    public ColorStateList f116722e = null;

    /* renamed from: f */
    public ColorStateList f116723f = null;

    /* renamed from: g */
    public ColorStateList f116724g = null;

    /* renamed from: h */
    public PorterDuff.Mode f116725h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    public Rect f116726i = null;

    /* renamed from: j */
    public float f116727j = 1.0f;

    /* renamed from: k */
    public float f116728k = 1.0f;

    /* renamed from: l */
    public float f116729l;

    /* renamed from: m */
    public int f116730m = PrivateKeyType.INVALID;

    /* renamed from: n */
    public float f116731n = 0.0f;

    /* renamed from: o */
    public float f116732o = 0.0f;

    /* renamed from: p */
    public float f116733p = 0.0f;

    /* renamed from: q */
    public int f116734q = 0;

    /* renamed from: r */
    public int f116735r = 0;

    /* renamed from: s */
    public int f116736s = 0;

    /* renamed from: t */
    public int f116737t = 0;

    /* renamed from: u */
    public boolean f116738u = false;

    /* renamed from: v */
    public Paint.Style f116739v = Paint.Style.FILL_AND_STROKE;

    public C44778i(C44778i iVar) {
        this.f116718a = iVar.f116718a;
        this.f116719b = iVar.f116719b;
        this.f116729l = iVar.f116729l;
        this.f116720c = iVar.f116720c;
        this.f116721d = iVar.f116721d;
        this.f116722e = iVar.f116722e;
        this.f116725h = iVar.f116725h;
        this.f116724g = iVar.f116724g;
        this.f116730m = iVar.f116730m;
        this.f116727j = iVar.f116727j;
        this.f116736s = iVar.f116736s;
        int i = iVar.f116734q;
        this.f116734q = 0;
        boolean z = iVar.f116738u;
        this.f116738u = false;
        this.f116728k = iVar.f116728k;
        this.f116731n = iVar.f116731n;
        this.f116732o = iVar.f116732o;
        float f = iVar.f116733p;
        this.f116733p = 0.0f;
        this.f116735r = iVar.f116735r;
        int i2 = iVar.f116737t;
        this.f116737t = 0;
        ColorStateList colorStateList = iVar.f116723f;
        this.f116723f = null;
        this.f116739v = iVar.f116739v;
        Rect rect = iVar.f116726i;
        if (rect != null) {
            this.f116726i = new Rect(rect);
        }
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        C44779j jVar = new C44779j(this);
        jVar.f116745G = true;
        return jVar;
    }

    public C44778i(C44785p pVar) {
        this.f116718a = pVar;
        this.f116719b = null;
    }
}
