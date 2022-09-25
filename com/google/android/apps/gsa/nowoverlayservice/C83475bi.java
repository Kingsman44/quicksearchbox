package com.google.android.apps.gsa.nowoverlayservice;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.p119j.p120a.p121a.C2300b;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.bi */
/* compiled from: PG */
public final class C83475bi {

    /* renamed from: a */
    public final View f227598a;

    /* renamed from: b */
    public AnimatorSet f227599b;

    /* renamed from: c */
    public AnimatorSet f227600c;

    /* renamed from: d */
    float f227601d = 0.0f;

    /* renamed from: e */
    float f227602e = 0.0f;

    /* renamed from: f */
    public View f227603f;

    /* renamed from: g */
    public View f227604g;

    /* renamed from: h */
    public View f227605h;

    /* renamed from: i */
    public C83473bg f227606i;

    /* renamed from: j */
    public final Drawable f227607j;

    /* renamed from: k */
    private final C83474bh f227608k;

    /* renamed from: l */
    private final View f227609l;

    /* renamed from: m */
    private final Context f227610m;

    /* renamed from: n */
    private final View f227611n;

    /* renamed from: o */
    private final View f227612o;

    /* renamed from: p */
    private AnimatorSet f227613p;

    /* renamed from: q */
    private AnimatorSet f227614q;

    public C83475bi(Context context, View view, View view2, View view3, View view4) {
        this.f227610m = context;
        this.f227611n = view;
        this.f227609l = view2;
        this.f227612o = view3;
        this.f227598a = view4;
        this.f227607j = view4.getBackground();
        this.f227608k = new C83474bh(context.getResources());
    }

    /* renamed from: d */
    private static final float m132882d(View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        view2.setTranslationX(0.0f);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        return ((float) (iArr[0] - iArr2[0])) + (((float) (view.getMeasuredWidth() - view2.getMeasuredWidth())) / 2.0f);
    }

    /* renamed from: a */
    public final AnimatorSet mo76815a(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250);
        if (z) {
            animatorSet.play(ObjectAnimator.ofFloat(this.f227605h, View.ALPHA, new float[]{0.0f, 1.0f}));
        } else {
            animatorSet.play(ObjectAnimator.ofFloat(this.f227605h, View.ALPHA, new float[]{0.0f, 0.0f}));
        }
        animatorSet.addListener(new C83472bf(this, z));
        return animatorSet;
    }

    /* renamed from: b */
    public final void mo76816b() {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f227609l, View.ALPHA, new float[]{0.0f, 1.0f});
        View view = this.f227603f;
        if (view != null) {
            float d = m132882d(view, this.f227611n);
            this.f227601d = d;
            View view2 = this.f227604g;
            this.f227602e = view2 != null ? m132882d(view2, this.f227609l) : -d;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f227609l, View.TRANSLATION_X, new float[]{this.f227602e, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f227611n, View.TRANSLATION_X, new float[]{this.f227601d, 0.0f});
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f227608k, "alpha", new int[]{0, 30});
        if (this.f227604g == null) {
            arrayList.add(ofFloat);
        }
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        arrayList.add(ofInt);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f227613p = animatorSet;
        animatorSet.setInterpolator(new C2300b());
        this.f227613p.playTogether((ObjectAnimator[]) arrayList.toArray(new ObjectAnimator[arrayList.size()]));
        this.f227613p.setDuration(250);
        ArrayList arrayList2 = new ArrayList();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f227609l, View.ALPHA, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f227609l, View.TRANSLATION_X, new float[]{0.0f, this.f227602e});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f227611n, View.TRANSLATION_X, new float[]{0.0f, this.f227601d});
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.f227608k, "alpha", new int[]{30, 0});
        if (this.f227604g == null) {
            arrayList2.add(ofFloat4);
        }
        arrayList2.add(ofFloat5);
        arrayList2.add(ofFloat6);
        arrayList2.add(ofInt2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f227614q = animatorSet2;
        animatorSet2.setInterpolator(new C2300b());
        this.f227614q.playTogether((ObjectAnimator[]) arrayList2.toArray(new ObjectAnimator[arrayList2.size()]));
        this.f227614q.setDuration(250);
    }

    /* renamed from: c */
    public final void mo76817c(boolean z, boolean z2) {
        this.f227598a.setBackground(this.f227608k);
        if (!z) {
            this.f227613p.start();
            this.f227613p.end();
        } else if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200);
            animatorSet.play(ObjectAnimator.ofFloat(this.f227612o, View.ALPHA, new float[]{1.0f, 0.0f}));
            animatorSet.start();
            this.f227600c.start();
            this.f227614q.start();
        } else {
            this.f227599b.start();
            this.f227613p.start();
        }
    }
}
