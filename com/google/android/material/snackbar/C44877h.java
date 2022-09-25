package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.core.p098j.C2043bi;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: com.google.android.material.snackbar.h */
/* compiled from: PG */
final class C44877h implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        int i = message.what;
        int i2 = 0;
        if (i == 0) {
            BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
            if (baseTransientBottomBar.f117089j.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f117089j.getLayoutParams();
                if (layoutParams instanceof C1773f) {
                    C1773f fVar = (C1773f) layoutParams;
                    BaseTransientBottomBar.Behavior behavior = new BaseTransientBottomBar.Behavior();
                    behavior.f117102g.f117135a = baseTransientBottomBar.f117100u;
                    behavior.f115840f = new C44883n(baseTransientBottomBar);
                    fVar.mo4974a(behavior);
                    if (baseTransientBottomBar.mo48339d() == null) {
                        fVar.f5529g = 80;
                    }
                }
                C44890u uVar = baseTransientBottomBar.f117089j;
                ViewGroup viewGroup = baseTransientBottomBar.f117087h;
                uVar.f117143g = true;
                viewGroup.addView(uVar);
                uVar.f117143g = false;
                if (baseTransientBottomBar.mo48339d() != null) {
                    int[] iArr = new int[2];
                    baseTransientBottomBar.mo48339d().getLocationOnScreen(iArr);
                    int i3 = iArr[1];
                    int[] iArr2 = new int[2];
                    baseTransientBottomBar.f117087h.getLocationOnScreen(iArr2);
                    i2 = (iArr2[1] + baseTransientBottomBar.f117087h.getHeight()) - i3;
                }
                if (i2 != baseTransientBottomBar.f117096q) {
                    baseTransientBottomBar.f117096q = i2;
                    baseTransientBottomBar.mo48345j();
                }
                baseTransientBottomBar.f117089j.setVisibility(4);
            }
            if (C2043bi.m5570ax(baseTransientBottomBar.f117089j)) {
                baseTransientBottomBar.mo48344i();
            } else {
                baseTransientBottomBar.f117097r = true;
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            int i4 = message.arg1;
            if (!baseTransientBottomBar2.mo48347l() || baseTransientBottomBar2.f117089j.getVisibility() != 0) {
                baseTransientBottomBar2.mo48341f(i4);
            } else if (baseTransientBottomBar2.f117089j.f117139c == 1) {
                ValueAnimator c = baseTransientBottomBar2.mo48338c(1.0f, 0.0f);
                c.setDuration((long) baseTransientBottomBar2.f117083d);
                c.addListener(new C44869a(baseTransientBottomBar2, i4));
                c.start();
            } else {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(new int[]{0, baseTransientBottomBar2.mo48337b()});
                valueAnimator.setInterpolator(baseTransientBottomBar2.f117085f);
                valueAnimator.setDuration((long) baseTransientBottomBar2.f117084e);
                valueAnimator.addListener(new C44875f(baseTransientBottomBar2, i4));
                valueAnimator.addUpdateListener(new C44876g(baseTransientBottomBar2));
                valueAnimator.start();
            }
            return true;
        }
    }
}
