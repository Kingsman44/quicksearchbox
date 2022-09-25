package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.now.shared.p6421ui.C83419h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.d */
/* compiled from: PG */
final class C105067d extends C83419h {

    /* renamed from: c */
    private final int f292785c;

    /* renamed from: d */
    private final int f292786d;

    public C105067d(View view, int i) {
        super(view, i);
        TextView textView = (TextView) view;
        this.f292785c = textView.getCurrentTextColor();
        this.f292786d = textView.getTextAlignment();
    }

    /* renamed from: a */
    public final void mo94508a() {
        TextView textView = (TextView) this.f227389a;
        textView.setTextColor(this.f292785c);
        textView.setText(BuildConfig.FLAVOR);
        textView.setMinLines(0);
        textView.setTextAlignment(this.f292786d);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 0.0f;
            layoutParams2.setMargins(layoutParams2.leftMargin, 0, layoutParams2.rightMargin, 0);
            textView.setLayoutParams(layoutParams2);
        }
    }
}
