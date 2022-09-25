package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.m */
/* compiled from: PG */
final class C26186m extends C0673gh {

    /* renamed from: a */
    final TextView f71155a;

    /* renamed from: b */
    final TextView f71156b;

    /* renamed from: c */
    final ImageView f71157c;

    /* renamed from: d */
    final ImageView f71158d;

    /* renamed from: e */
    final TextView f71159e;

    /* renamed from: f */
    final DownloadButtonLayout f71160f;

    /* renamed from: g */
    final ViewGroup f71161g;

    /* renamed from: h */
    final LinearLayout f71162h;

    /* renamed from: i */
    final ImageButton f71163i;

    /* renamed from: j */
    final TextView f71164j;

    public C26186m(View view) {
        super(view);
        this.f71155a = (TextView) view.findViewById(R.id.primary_text);
        this.f71156b = (TextView) view.findViewById(R.id.secondary_text);
        this.f71159e = (TextView) view.findViewById(16908309);
        this.f71157c = (ImageView) view.findViewById(16908295);
        this.f71158d = (ImageView) view.findViewById(R.id.auto_icon);
        this.f71160f = (DownloadButtonLayout) view.findViewById(R.id.download_button);
        this.f71161g = (ViewGroup) view.findViewById(R.id.clickable);
        this.f71162h = (LinearLayout) view.findViewById(R.id.tooltip);
        this.f71163i = (ImageButton) view.findViewById(R.id.tooltip_close_button);
        view.findViewById(R.id.group_divider);
        this.f71164j = (TextView) view.findViewById(R.id.lens_translate_no_results_text);
    }
}
