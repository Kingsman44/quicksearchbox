package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.textview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.textview.c */
/* compiled from: PG */
final class C108766c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ TextView f302484a;

    /* renamed from: b */
    final /* synthetic */ int f302485b;

    /* renamed from: c */
    final /* synthetic */ ExpandableSection f302486c;

    public C108766c(ExpandableSection expandableSection, TextView textView, int i) {
        this.f302486c = expandableSection;
        this.f302484a = textView;
        this.f302485b = i;
    }

    public final boolean onPreDraw() {
        this.f302484a.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableSection expandableSection = this.f302486c;
        expandableSection.f302479c.setImageResource(true != expandableSection.f302477a ? R.drawable.quantum_ic_keyboard_arrow_down_black_24 : R.drawable.quantum_ic_keyboard_arrow_up_black_24);
        int measuredHeight = this.f302484a.getMeasuredHeight();
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(this.f302484a, "height", new int[]{this.f302485b, measuredHeight}));
        if (this.f302486c.f302477a) {
            int[] iArr = new int[2];
            this.f302484a.getLocationOnScreen(iArr);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) this.f302486c.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            if (iArr[1] + measuredHeight > displayMetrics.heightPixels) {
                arrayList.add(ObjectAnimator.ofInt(this.f302486c.f302478b, "scrollY", new int[]{(displayMetrics.heightPixels + measuredHeight) - this.f302485b}));
            }
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300).start();
        return true;
    }
}
