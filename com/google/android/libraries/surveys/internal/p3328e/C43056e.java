package com.google.android.libraries.surveys.internal.p3328e;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68359ah;

/* renamed from: com.google.android.libraries.surveys.internal.e.e */
/* compiled from: PG */
public final class C43056e {

    /* renamed from: a */
    private static final Rect f112615a = new Rect();

    /* renamed from: b */
    public static void m75962b(ImageView imageView, Integer num) {
        if (num != null) {
            imageView.setImageResource(num.intValue());
            imageView.setVisibility(0);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: c */
    public static void m75963c(View view, View view2, int i, int i2) {
        view.post(new C43055d(view2, i, i2, view));
    }

    /* renamed from: a */
    public static int m75961a(ViewGroup viewGroup, View view, int i, int i2, View view2, View view3) {
        if (viewGroup == view) {
            throw new IllegalStateException("contentView should be the single child of containerViewGroup");
        } else if (viewGroup.getChildCount() == 0) {
            return i2;
        } else {
            int i3 = 0;
            view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            Resources resources = view.getContext().getResources();
            Rect rect = f112615a;
            view.getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.survey_answer_min_height_for_scrolling);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.survey_card_vertical_margin);
            if (view3 != null) {
                if (C43054c.m75959b(C68359ah.f184700a.mo6453a().mo60350a(C43054c.f112610b))) {
                    i3 = view3.getMeasuredHeight();
                } else {
                    i3 = view3.getHeight();
                }
            }
            int i4 = dimensionPixelSize2 + dimensionPixelSize2 + i3;
            int height2 = (height - view2.getHeight()) - i4;
            if (measuredHeight + i4 > height && height2 > dimensionPixelSize) {
                measuredHeight = height - i4;
            }
            return View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        }
    }
}
