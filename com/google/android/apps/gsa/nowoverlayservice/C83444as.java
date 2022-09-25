package com.google.android.apps.gsa.nowoverlayservice;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.p119j.p120a.p121a.C2300b;
import androidx.p119j.p120a.p121a.C2301c;
import com.google.android.apps.gsa.search.shared.overlay.C87620a;
import com.google.android.apps.gsa.search.shared.overlay.C87653b;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.as */
/* compiled from: PG */
public final class C83444as implements C87653b {

    /* renamed from: A */
    public Rect f227437A;

    /* renamed from: B */
    public Rect f227438B;

    /* renamed from: C */
    public Point f227439C;

    /* renamed from: D */
    public Point f227440D;

    /* renamed from: E */
    public float f227441E;

    /* renamed from: F */
    public float f227442F;

    /* renamed from: G */
    public Drawable f227443G;

    /* renamed from: H */
    public ValueAnimator f227444H;

    /* renamed from: I */
    public ValueAnimator f227445I;

    /* renamed from: J */
    public boolean f227446J;

    /* renamed from: K */
    public boolean f227447K;

    /* renamed from: L */
    public C87620a f227448L;

    /* renamed from: M */
    public int f227449M;

    /* renamed from: a */
    public final Context f227450a;

    /* renamed from: b */
    public View f227451b;

    /* renamed from: c */
    public ViewGroup f227452c;

    /* renamed from: d */
    public View f227453d;

    /* renamed from: e */
    public View f227454e;

    /* renamed from: f */
    public View f227455f;

    /* renamed from: g */
    public View f227456g;

    /* renamed from: h */
    public View f227457h;

    /* renamed from: i */
    public ViewOutlineProvider f227458i;

    /* renamed from: j */
    public Rect f227459j;

    /* renamed from: k */
    public RectEvaluator f227460k;

    /* renamed from: l */
    public ValueAnimator f227461l;

    /* renamed from: m */
    public int f227462m;

    /* renamed from: n */
    public int f227463n;

    /* renamed from: o */
    public int f227464o;

    /* renamed from: p */
    public int f227465p;

    /* renamed from: q */
    public int f227466q;

    /* renamed from: r */
    public int f227467r;

    /* renamed from: s */
    public int f227468s;

    /* renamed from: t */
    public int f227469t;

    /* renamed from: u */
    public int f227470u;

    /* renamed from: v */
    public int f227471v;

    /* renamed from: w */
    public int f227472w;

    /* renamed from: x */
    public int f227473x;

    /* renamed from: y */
    public int f227474y;

    /* renamed from: z */
    public Rect f227475z;

    public C83444as(Context context) {
        this.f227450a = context;
    }

    /* renamed from: a */
    public final void mo76776a(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        this.f227452c.setX((float) i);
        this.f227452c.setY((float) i2);
        if (this.f227449M == 1) {
            this.f227452c.animate().setInterpolator(new C2300b()).setListener((Animator.AnimatorListener) null);
            i5 = (int) (Math.abs(((float) (i4 - i2)) / (((float) (this.f227438B.height() - this.f227462m)) / 2.0f)) * 200.0f);
            if (i5 > 200) {
                i5 = 200;
            }
        } else {
            this.f227452c.animate().setInterpolator(new C2301c()).setListener((Animator.AnimatorListener) null);
            i5 = 267;
        }
        this.f227452c.animate().x((float) i3).y((float) i4).setDuration((long) i5).setListener(new C83441ap(this, z));
    }

    /* renamed from: b */
    public final void mo76777b() {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        this.f227461l = duration;
        duration.addUpdateListener(new C83443ar(this));
        this.f227452c.setOutlineProvider(this.f227458i);
        this.f227452c.setClipToOutline(true);
        this.f227457h.setBackgroundColor(-1);
        this.f227455f.setAlpha(0.0f);
    }

    /* renamed from: c */
    public final void mo76778c() {
        this.f227446J = false;
        this.f227452c.setX(0.0f);
        this.f227452c.setY(0.0f);
        if (this.f227449M == 1) {
            this.f227452c.setOutlineProvider((ViewOutlineProvider) null);
            this.f227452c.setClipToOutline(false);
            this.f227453d.setTranslationX(0.0f);
            this.f227454e.setTranslationX(0.0f);
            this.f227455f.setAlpha(1.0f);
            this.f227454e.setAlpha(1.0f);
            this.f227461l.removeAllListeners();
            this.f227457h.setBackground(this.f227443G);
            return;
        }
        this.f227452c.setAlpha(1.0f);
    }

    /* renamed from: d */
    public final void mo76779d(View view, ViewGroup viewGroup) {
        this.f227451b = view;
        this.f227452c = viewGroup;
        this.f227444H = ObjectAnimator.ofInt(view.getBackground(), "alpha", new int[]{0, PrivateKeyType.INVALID});
        mo76780e(2);
        this.f227447K = true;
    }

    /* renamed from: e */
    public final void mo76780e(int i) {
        if (!this.f227446J && this.f227449M != i) {
            this.f227449M = i;
        }
    }
}
