package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.c */
/* compiled from: PG */
final class C88673c {
    /* renamed from: a */
    static RelativeLayout m143429a(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(6, R.id.slice_icon);
        layoutParams.addRule(8, R.id.slice_icon);
        layoutParams.addRule(1, R.id.slice_icon);
        layoutParams.addRule(17, R.id.slice_icon);
        layoutParams.rightMargin = context.getResources().getDimensionPixelSize(R.dimen.slice_override_right_margin);
        layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.slice_override_right_margin));
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setVisibility(8);
        relativeLayout.setGravity(16);
        relativeLayout.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.line_one_drawable_padding), 0, context.getResources().getDimensionPixelSize(R.dimen.slice_override_bottom_padding));
        relativeLayout.setDuplicateParentStateEnabled(true);
        TextView textView = new TextView(context, (AttributeSet) null, R.style.LineOneText, R.style.LineOneText);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        textView.setPadding(0, 0, 0, 0);
        textView.setDuplicateParentStateEnabled(true);
        int generateViewId = View.generateViewId();
        textView.setId(generateViewId);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        relativeLayout.addView(textView);
        TextView textView2 = new TextView(context, (AttributeSet) null, R.style.LineTwoText, R.style.LineTwoText);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, generateViewId);
        textView2.setLayoutParams(layoutParams2);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setDuplicateParentStateEnabled(true);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        relativeLayout.addView(textView2);
        return relativeLayout;
    }
}
