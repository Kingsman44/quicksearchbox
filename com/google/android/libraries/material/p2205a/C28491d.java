package com.google.android.libraries.material.p2205a;

import android.animation.Animator;

/* renamed from: com.google.android.libraries.material.a.d */
/* compiled from: PG */
public final class C28491d extends C28489b {

    /* renamed from: a */
    protected final Animator f77320a;

    /* renamed from: b */
    public final Runnable f77321b;

    /* renamed from: c */
    public final int f77322c;

    /* renamed from: d */
    public int f77323d;

    /* renamed from: e */
    private final C28494g f77324e = new C28490c(this);

    private C28491d(Animator animator, Runnable runnable) {
        this.f77320a = animator;
        this.f77322c = -1;
        this.f77321b = runnable;
    }

    /* renamed from: b */
    public static void m53263b(Animator animator, Runnable runnable) {
        animator.addListener(new C28491d(animator, runnable));
    }

    public final void onAnimationEnd(Animator animator) {
        if (!mo33944a(animator)) {
            C28496i.m53268c().mo33952a(this.f77324e);
        }
    }
}
