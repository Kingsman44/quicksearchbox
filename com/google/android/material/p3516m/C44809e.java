package com.google.android.material.p3516m;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.p197u.C4206aq;
import androidx.p197u.C4215az;
import com.google.android.material.p3504a.C44498c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.m.e */
/* compiled from: PG */
public class C44809e extends C4215az {

    /* renamed from: p */
    public C44813i f116846p;

    /* renamed from: q */
    private final C44813i f116847q;

    /* renamed from: r */
    private final List f116848r = new ArrayList();

    protected C44809e(C44813i iVar, C44813i iVar2) {
        this.f116847q = iVar;
        this.f116846p = iVar2;
    }

    /* renamed from: L */
    private final Animator m79471L(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m79472M(arrayList, this.f116847q, view, z);
        m79472M(arrayList, this.f116846p, view, z);
        for (C44813i M : this.f116848r) {
            m79472M(arrayList, M, view, z);
        }
        Context context = viewGroup.getContext();
        C44812h.m79482b(this, context, mo48175I(z));
        C44812h.m79483c(this, context, mo48176J(z), mo48177K());
        C44498c.m78600a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: M */
    private static void m79472M(List list, C44813i iVar, View view, boolean z) {
        Animator animator;
        if (iVar != null) {
            if (z) {
                animator = iVar.mo48173a(view);
            } else {
                animator = iVar.mo48174b(view);
            }
            if (animator != null) {
                list.add(animator);
            }
        }
    }

    /* renamed from: I */
    public int mo48175I(boolean z) {
        throw null;
    }

    /* renamed from: J */
    public int mo48176J(boolean z) {
        throw null;
    }

    /* renamed from: K */
    public TimeInterpolator mo48177K() {
        throw null;
    }

    /* renamed from: e */
    public final Animator mo8922e(ViewGroup viewGroup, View view, C4206aq aqVar) {
        return m79471L(viewGroup, view, true);
    }

    /* renamed from: f */
    public final Animator mo8923f(ViewGroup viewGroup, View view, C4206aq aqVar) {
        return m79471L(viewGroup, view, false);
    }
}
