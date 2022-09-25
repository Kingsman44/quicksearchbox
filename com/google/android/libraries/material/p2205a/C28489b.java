package com.google.android.libraries.material.p2205a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.p060c.C0984n;

/* renamed from: com.google.android.libraries.material.a.b */
/* compiled from: PG */
public class C28489b extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final C0984n f77318a = new C0984n(0);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo33944a(Animator animator) {
        return this.f77318a.containsKey(animator) && ((Boolean) this.f77318a.get(animator)).booleanValue();
    }

    public final void onAnimationCancel(Animator animator) {
        this.f77318a.put(animator, true);
    }

    public final void onAnimationStart(Animator animator) {
        this.f77318a.put(animator, false);
    }
}
