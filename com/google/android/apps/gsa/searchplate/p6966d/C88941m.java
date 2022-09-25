package com.google.android.apps.gsa.searchplate.p6966d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Point;
import android.widget.ImageView;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchplate.d.m */
/* compiled from: PG */
public final class C88941m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public float f240931a;

    /* renamed from: b */
    public float f240932b;

    /* renamed from: c */
    public final int f240933c = 7;

    /* renamed from: d */
    public final int f240934d = 8;

    /* renamed from: e */
    public final Animator.AnimatorListener f240935e;

    /* renamed from: f */
    public final Map f240936f;

    /* renamed from: g */
    public final ImageView f240937g;

    /* renamed from: h */
    public final ValueAnimator f240938h;

    /* renamed from: i */
    public Point f240939i;

    /* renamed from: j */
    public int f240940j;

    /* renamed from: k */
    public String f240941k;

    /* renamed from: l */
    public int f240942l = 16;

    /* renamed from: m */
    public boolean f240943m;

    /* renamed from: n */
    private Matrix f240944n;

    /* renamed from: o */
    private int f240945o;

    public C88941m(ImageView imageView, Map map, Animator.AnimatorListener animatorListener) {
        this.f240937g = imageView;
        this.f240935e = animatorListener;
        this.f240936f = map;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f240938h = ofFloat;
        ofFloat.addUpdateListener(this);
        ofFloat.addListener(animatorListener);
    }

    /* renamed from: c */
    public static String m144560c(String str, String str2) {
        return str + "-" + str2;
    }

    /* renamed from: e */
    private final void m144561e(int i, int i2) {
        if (this.f240944n == null) {
            this.f240944n = new Matrix();
        }
        this.f240944n.setTranslate(((float) (-i)) * this.f240931a, ((float) (-i2)) * this.f240932b);
        this.f240937g.setImageMatrix(this.f240944n);
    }

    /* renamed from: a */
    public final int mo82820a(Point point) {
        return (point.y * this.f240933c) + point.x;
    }

    /* renamed from: b */
    public final C88940l mo82821b(String str) {
        return (C88940l) this.f240936f.get("*".concat(str));
    }

    /* renamed from: d */
    public final void mo82822d(Point point) {
        m144561e(point.x, point.y);
    }

    public final void onAnimationEnd(Animator animator) {
        C88940l b;
        String str = this.f240941k;
        if (!(str == null || (b = mo82821b(str)) == null || b.mo82808c() == null)) {
            mo82822d(b.mo82808c());
        }
        this.f240941k = null;
        this.f240939i = null;
        this.f240945o = -1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Point point;
        int floatValue = (int) (((float) this.f240940j) * ((Float) valueAnimator.getAnimatedValue()).floatValue());
        if (floatValue != this.f240945o && (point = this.f240939i) != null) {
            int i = point.x + floatValue;
            int i2 = this.f240933c;
            m144561e(i % i2, (i / i2) + this.f240939i.y);
            this.f240945o = floatValue;
        }
    }
}
