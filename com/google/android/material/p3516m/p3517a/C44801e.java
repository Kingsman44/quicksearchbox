package com.google.android.material.p3516m.p3517a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3504a.C44498c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.m.a.e */
/* compiled from: PG */
class C44801e extends Visibility {

    /* renamed from: a */
    private final C44805i f116836a;

    /* renamed from: b */
    private final C44805i f116837b;

    /* renamed from: c */
    private final List f116838c = new ArrayList();

    protected C44801e(C44805i iVar, C44805i iVar2) {
        this.f116836a = iVar;
        this.f116837b = iVar2;
    }

    /* renamed from: c */
    private final Animator m79452c(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m79453d(arrayList, this.f116836a, viewGroup, view, z);
        m79453d(arrayList, this.f116837b, viewGroup, view, z);
        for (C44805i d : this.f116838c) {
            m79453d(arrayList, d, viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        C44804h.m79461a(this, context, mo48167a());
        C44804h.m79462b(this, context, mo48168b(), C44497b.f115651b);
        C44498c.m78600a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: d */
    private static void m79453d(List list, C44805i iVar, ViewGroup viewGroup, View view, boolean z) {
        Animator animator;
        if (iVar != null) {
            if (z) {
                animator = iVar.mo48165a(viewGroup, view);
            } else {
                animator = iVar.mo48166b(viewGroup, view);
            }
            if (animator != null) {
                list.add(animator);
            }
        }
    }

    /* renamed from: a */
    public int mo48167a() {
        throw null;
    }

    /* renamed from: b */
    public int mo48168b() {
        throw null;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m79452c(viewGroup, view, true);
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m79452c(viewGroup, view, false);
    }
}
