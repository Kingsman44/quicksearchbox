package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.aw */
/* compiled from: PG */
public final class C44724aw {

    /* renamed from: a */
    public final ArrayList f116580a = new ArrayList();

    /* renamed from: b */
    public ValueAnimator f116581b = null;

    /* renamed from: c */
    private final Animator.AnimatorListener f116582c = new C44722au(this);

    /* renamed from: a */
    public final void mo48034a(int[] iArr, ValueAnimator valueAnimator) {
        C44723av avVar = new C44723av();
        valueAnimator.addListener(this.f116582c);
        this.f116580a.add(avVar);
    }
}
