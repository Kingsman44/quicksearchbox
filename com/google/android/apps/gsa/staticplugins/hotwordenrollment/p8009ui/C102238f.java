package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p8009ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.ui.f */
/* compiled from: PG */
final class C102238f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ TextView f285278a;

    /* renamed from: b */
    final /* synthetic */ int f285279b;

    /* renamed from: c */
    final /* synthetic */ ExpandableItem f285280c;

    public C102238f(ExpandableItem expandableItem, TextView textView, int i) {
        this.f285280c = expandableItem;
        this.f285278a = textView;
        this.f285279b = i;
    }

    public final boolean onPreDraw() {
        this.f285278a.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableItem expandableItem = this.f285280c;
        expandableItem.f285270f.setImageResource(true != expandableItem.f285268d ? R.drawable.quantum_ic_expand_more_grey600_24 : R.drawable.quantum_ic_expand_less_grey600_24);
        this.f285278a.setVisibility(0);
        int measuredHeight = this.f285278a.getMeasuredHeight();
        int[] iArr = new int[2];
        this.f285278a.getLocationOnScreen(iArr);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        boolean z = this.f285280c.f285268d && iArr[1] + measuredHeight > displayMetrics.heightPixels;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f285279b, measuredHeight});
        ofInt.addUpdateListener(new C102234b(this.f285278a));
        arrayList.add(ofInt);
        if (z) {
            ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{(displayMetrics.heightPixels + measuredHeight) - this.f285279b});
            ofInt2.addUpdateListener(new C102235c(this));
            arrayList.add(ofInt2);
        }
        animatorSet.addListener(new C102237e(this));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(100).start();
        return true;
    }
}
