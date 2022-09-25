package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.au */
/* compiled from: PG */
public final class C114116au extends C114152v {

    /* renamed from: b */
    private static final C59071e f316299b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.au");

    /* renamed from: c */
    private static final Interpolator f316300c = C91107f.m148859b(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d */
    private static final Interpolator f316301d = C91107f.m148859b(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: e */
    private static final Interpolator f316302e = C91107f.m148859b(0.65f, 0.0f, 1.0f, 1.0f);

    /* renamed from: f */
    private static final Interpolator f316303f = C91107f.m148859b(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: g */
    private final Context f316304g;

    public C114116au(Context context, C86124t tVar) {
        this.f316304g = context;
        if (!tVar.mo79746e(C90029ch.f248219aF)) {
            this.f2538m = false;
        }
    }

    /* renamed from: b */
    public static void m189284b(C0673gh ghVar, String str) {
        String str2;
        View view = ghVar.itemView;
        C59052c cVar = (C59052c) ((C59052c) f316299b.mo56224b()).mo56372aa(28712);
        Long valueOf = Long.valueOf(ghVar.mItemId);
        Integer valueOf2 = Integer.valueOf(ghVar.mItemViewType);
        if (view.getParent() == null) {
            str2 = "N/A";
        } else {
            str2 = view.getParent().getClass().getName();
        }
        cVar.mo56360M("#ValyrianItemAnimator.%s itemId: %d, itemViewType: %d, parentClassName: %s", str, valueOf, valueOf2, str2);
    }

    /* renamed from: l */
    private final Animator m189285l(C0673gh ghVar, float f, int i, int i2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ghVar.itemView, View.TRANSLATION_Y, new float[]{f, 0.0f});
        ofFloat.setInterpolator(f316301d);
        ofFloat.setDuration((long) i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ghVar.itemView, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(f316300c);
        ofFloat2.setDuration((long) i2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C114113ar(this, ghVar));
        animatorSet.setStartDelay(40);
        return animatorSet;
    }

    /* renamed from: x */
    private final Animator m189286x(C108241bl blVar, float f, int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(blVar.itemView, View.TRANSLATION_Y, new float[]{0.0f, -f});
        ofFloat.setInterpolator(f316302e);
        ofFloat.setDuration((long) i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(blVar.itemView, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(f316300c);
        ofFloat2.setDuration(40);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C114115at(this, blVar));
        return animatorSet;
    }

    /* renamed from: y */
    private final synchronized void m189287y(C108241bl blVar, Animator animator) {
        m189284b(blVar, "startAnimator");
        C108232bc bcVar = blVar.f301069S;
        this.f316464a.put(blVar, animator);
        animator.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl) r7;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2690f(android.support.p033v7.widget.C0673gh r7) {
        /*
            r6 = this;
            java.lang.String r0 = "animateAdd"
            m189284b(r7, r0)
            boolean r0 = r7 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl
            if (r0 == 0) goto L_0x0069
            r0 = r7
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl) r0
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r1 = r0.f301069S
            if (r1 == 0) goto L_0x0069
            int r1 = r1.mo95830h()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0045
            if (r1 == r3) goto L_0x0045
            r4 = 2
            if (r1 == r4) goto L_0x0021
            r4 = 4
            if (r1 == r4) goto L_0x0021
            goto L_0x0069
        L_0x0021:
            android.view.View r1 = r0.itemView
            android.content.Context r4 = r6.f316304g
            r5 = 1117782016(0x42a00000, float:80.0)
            float r4 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r5, r4)
            r1.setTranslationY(r4)
            android.view.View r1 = r0.itemView
            r1.setAlpha(r2)
            android.content.Context r1 = r6.f316304g
            float r1 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r5, r1)
            r2 = 300(0x12c, float:4.2E-43)
            r4 = 100
            android.animation.Animator r7 = r6.m189285l(r7, r1, r2, r4)
            r6.m189287y(r0, r7)
            return r3
        L_0x0045:
            android.view.View r7 = r0.itemView
            android.content.Context r1 = r6.f316304g
            r4 = 1101004800(0x41a00000, float:20.0)
            float r1 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r4, r1)
            r7.setTranslationY(r1)
            android.view.View r7 = r0.itemView
            r7.setAlpha(r2)
            android.content.Context r7 = r6.f316304g
            float r7 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r4, r7)
            r1 = 280(0x118, float:3.92E-43)
            r2 = 160(0xa0, float:2.24E-43)
            android.animation.Animator r7 = r6.m189285l(r0, r7, r1, r2)
            r6.m189287y(r0, r7)
            return r3
        L_0x0069:
            r6.mo2889m(r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114116au.mo2690f(android.support.v7.widget.gh):boolean");
    }

    /* renamed from: g */
    public final boolean mo2691g(C0673gh ghVar, C0673gh ghVar2, int i, int i2, int i3, int i4) {
        m189284b(ghVar, "animateChange:oldHolder");
        m189284b(ghVar2, "animateChange:newHolder");
        if (ghVar == ghVar2 && i2 != i4) {
            return mo2692h(ghVar, i, i2, i3, i4);
        }
        if (ghVar == ghVar2) {
            return mo2692h(ghVar2, i, i2, i3, i4);
        }
        if (ghVar != null) {
            mo2889m(ghVar);
        }
        mo2889m(ghVar2);
        return false;
    }

    /* renamed from: h */
    public final boolean mo2692h(C0673gh ghVar, int i, int i2, int i3, int i4) {
        m189284b(ghVar, "animateMove");
        if (ghVar instanceof C108241bl) {
            View view = ghVar.itemView;
            view.setTranslationY((((float) i2) + view.getTranslationY()) - ((float) i4));
            float min = Math.min(ghVar.itemView.getTranslationY(), C91115n.m148870b(20.0f, this.f316304g));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ghVar.itemView, View.TRANSLATION_Y, new float[]{min, 0.0f});
            ofFloat.setInterpolator(f316303f);
            ofFloat.setDuration(160);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ghVar.itemView, View.ALPHA, new float[]{0.0f, 1.0f});
            ofFloat2.setInterpolator(f316300c);
            ofFloat2.setDuration(160);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat});
            animatorSet.setStartDelay(40);
            animatorSet.addListener(new C114114as(this, ghVar));
            m189287y((C108241bl) ghVar, animatorSet);
            return true;
        }
        mo2889m(ghVar);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl) r6;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2693i(android.support.p033v7.widget.C0673gh r6) {
        /*
            r5 = this;
            java.lang.String r0 = "animateRemove"
            m189284b(r6, r0)
            boolean r0 = r6 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl
            if (r0 == 0) goto L_0x0048
            r0 = r6
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl) r0
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r1 = r0.f301069S
            if (r1 == 0) goto L_0x0048
            int r2 = r1.mo95830h()
            r3 = 2
            r4 = 1
            if (r2 != r3) goto L_0x002a
            r6 = 1101004800(0x41a00000, float:20.0)
            android.content.Context r1 = r5.f316304g
            float r6 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r6, r1)
            r1 = 150(0x96, float:2.1E-43)
            android.animation.Animator r6 = r5.m189286x(r0, r6, r1)
            r5.m189287y(r0, r6)
            return r4
        L_0x002a:
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x0048
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r1 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r1
            boolean r1 = r1.mo96710A()
            if (r1 != 0) goto L_0x0048
        L_0x0036:
            r6 = 1092616192(0x41200000, float:10.0)
            android.content.Context r1 = r5.f316304g
            float r6 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r6, r1)
            r1 = 160(0xa0, float:2.24E-43)
            android.animation.Animator r6 = r5.m189286x(r0, r6, r1)
            r5.m189287y(r0, r6)
            return r4
        L_0x0048:
            r5.mo2889m(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114116au.mo2693i(android.support.v7.widget.gh):boolean");
    }
}
