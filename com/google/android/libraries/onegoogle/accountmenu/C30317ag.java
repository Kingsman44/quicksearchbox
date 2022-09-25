package com.google.android.libraries.onegoogle.accountmenu;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.p098j.C2100o;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.p4566l.C60200dk;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.ag */
/* compiled from: PG */
final class C30317ag implements View.OnTouchListener {

    /* renamed from: a */
    public final C30305n f81983a;

    /* renamed from: b */
    public final SelectedAccountDisc f81984b;

    /* renamed from: c */
    public boolean f81985c;

    /* renamed from: d */
    final GestureDetector.SimpleOnGestureListener f81986d;

    /* renamed from: e */
    private final C2100o f81987e;

    /* renamed from: f */
    private final C30897z f81988f;

    public C30317ag(C30305n nVar, SelectedAccountDisc selectedAccountDisc) {
        C30314ad adVar = new C30314ad(this);
        this.f81986d = adVar;
        this.f81983a = nVar;
        this.f81984b = selectedAccountDisc;
        C2100o oVar = new C2100o(selectedAccountDisc.getContext(), adVar, (Handler) null);
        this.f81987e = oVar;
        oVar.f6015a.f6014a.setIsLongpressEnabled(true);
        this.f81988f = nVar.mo35864o();
    }

    /* renamed from: d */
    public static boolean m56474d(int i) {
        return i == 4 || i == 5;
    }

    /* renamed from: e */
    public static boolean m56475e(int i) {
        return i == 3 || i == 2;
    }

    /* renamed from: f */
    public static final ObjectAnimator m56476f(AccountParticleDisc accountParticleDisc, int i) {
        boolean e = m56475e(i);
        boolean z = i == 3 || i == 4;
        String str = true != e ? "translationX" : "translationY";
        float[] fArr = new float[1];
        fArr[0] = ((float) (e ? accountParticleDisc.getMeasuredHeight() : accountParticleDisc.getMeasuredWidth())) * (true != z ? -0.4f : 0.4f);
        return ObjectAnimator.ofFloat(accountParticleDisc, str, fArr).setDuration(100);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m56477g(java.util.List r4, java.lang.Object r5, int r6, com.google.common.base.C58833ax r7) {
        /*
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0007
            return r5
        L_0x0007:
            r0 = -1
            int r6 = r6 + r0
            r1 = 1
            if (r6 == r1) goto L_0x0016
            r2 = 2
            if (r6 != r2) goto L_0x0010
            goto L_0x0017
        L_0x0010:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>()
            throw r4
        L_0x0016:
            r1 = -1
        L_0x0017:
            int r6 = r4.indexOf(r5)
            if (r6 == r0) goto L_0x0044
            r0 = r6
        L_0x001e:
            int r0 = r0 + r1
            int r2 = r4.size()
            int r0 = r0 + r2
            int r2 = r4.size()
            int r0 = r0 % r2
            if (r0 == r6) goto L_0x0044
            java.lang.Object r2 = r4.get(r0)
            boolean r3 = r7.mo56113h()
            if (r3 == 0) goto L_0x0043
            java.lang.Object r3 = r7.mo56107c()
            com.google.android.libraries.onegoogle.accountmanagement.a.a r3 = (com.google.android.libraries.onegoogle.accountmanagement.p2349a.C30254a) r3
            com.google.android.libraries.onegoogle.account.c.d r3 = r3.f81803a
            boolean r3 = r3.mo35583a(r2)
            if (r3 != 0) goto L_0x001e
        L_0x0043:
            return r2
        L_0x0044:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.C30317ag.m56477g(java.util.List, java.lang.Object, int, com.google.common.base.ax):java.lang.Object");
    }

    /* renamed from: a */
    public final boolean mo35883a(Object obj, Object obj2) {
        C30158c b = this.f81983a.mo35852b();
        return b.mo35552c(obj).equals(b.mo35552c(obj2));
    }

    /* renamed from: b */
    public final AnimatorSet mo35884b(int i, AnimatorListenerAdapter animatorListenerAdapter, Runnable runnable) {
        AccountParticleDisc accountParticleDisc = this.f81984b.f81902c;
        ObjectAnimator duration = ObjectAnimator.ofFloat(accountParticleDisc, "alpha", new float[]{1.0f, 0.0f}).setDuration(50);
        duration.setStartDelay(50);
        C58485gu o = C58485gu.m89847o(m56476f(accountParticleDisc, i), duration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(o);
        animatorSet.addListener(new C30315ae(this, runnable, animatorListenerAdapter));
        return animatorSet;
    }

    /* renamed from: c */
    public final void mo35885c(int i) {
        C60200dk dkVar;
        int i2 = i - 1;
        if (i2 == 1) {
            dkVar = C60200dk.UP;
        } else if (i2 == 3) {
            dkVar = C60200dk.LEFT;
        } else if (i2 != 4) {
            dkVar = C60200dk.DOWN;
        } else {
            dkVar = C60200dk.RIGHT;
        }
        C30897z zVar = this.f81988f;
        C28440j g = C28442l.m53141g();
        g.mo33895b(C28442l.m53143i(dkVar));
        zVar.mo35826f(g, this.f81984b);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C58838bb.m90884s(view == this.f81984b, "View must be the selectedAccountDisc passed on the c'tor.");
        if (motionEvent.getAction() == 0) {
            this.f81984b.requestDisallowInterceptTouchEvent(true);
        }
        return this.f81987e.f6015a.f6014a.onTouchEvent(motionEvent);
    }
}
