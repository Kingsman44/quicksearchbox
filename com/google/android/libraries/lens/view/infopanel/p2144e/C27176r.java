package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60888db;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.net.PrivateKeyType;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.r */
/* compiled from: PG */
final class C27176r extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final LayerDrawable f74271a;

    /* renamed from: b */
    private final List f74272b;

    /* renamed from: c */
    private final Animator f74273c;

    /* renamed from: d */
    private final C60888db f74274d;

    /* renamed from: e */
    private int f74275e = 1;

    /* renamed from: f */
    private int f74276f = 1;

    public C27176r(LayerDrawable layerDrawable, List list, Animator animator, C60888db dbVar) {
        boolean z = true;
        C58838bb.m90883r(list.size() < 2 ? false : z);
        this.f74271a = layerDrawable;
        this.f74272b = list;
        this.f74273c = animator;
        this.f74274d = dbVar;
    }

    /* renamed from: a */
    private static void m50387a(RotateDrawable rotateDrawable) {
        rotateDrawable.setFromDegrees(-90.0f);
        rotateDrawable.setToDegrees(0.0f);
        rotateDrawable.setLevel(0);
        rotateDrawable.setAlpha(0);
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f74275e = 1 - this.f74275e;
        int size = (this.f74276f + 1) % this.f74272b.size();
        this.f74276f = size;
        RotateDrawable rotateDrawable = (RotateDrawable) this.f74272b.get(size);
        m50387a(rotateDrawable);
        this.f74271a.setDrawable(this.f74275e, rotateDrawable);
        if (this.f74276f == 1) {
            this.f74273c.pause();
            C60888db dbVar = this.f74274d;
            Animator animator2 = this.f74273c;
            Objects.requireNonNull(animator2);
            dbVar.mo29164d(new C27175q(animator2), 1200, TimeUnit.MILLISECONDS);
        }
    }

    public final void onAnimationStart(Animator animator) {
        ((RotateDrawable) this.f74272b.get(0)).setAlpha(PrivateKeyType.INVALID);
        m50387a((RotateDrawable) this.f74272b.get(1));
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = (int) ((255.0f * floatValue) + 0.0f);
        this.f74271a.getDrawable(0).setAlpha(255 - i);
        this.f74271a.getDrawable(1).setAlpha(i);
        int i2 = (int) ((floatValue * 10000.0f) + 0.0f);
        int i3 = this.f74275e;
        if (i3 == 0) {
            i2 = 10000 - i2;
        }
        ((RotateDrawable) this.f74271a.getDrawable(i3)).setLevel(i2);
    }
}
