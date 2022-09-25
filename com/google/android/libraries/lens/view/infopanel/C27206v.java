package com.google.android.libraries.lens.view.infopanel;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.infopanel.v */
/* compiled from: PG */
final class C27206v {

    /* renamed from: a */
    public final TextView f74376a;

    /* renamed from: b */
    public final TextView f74377b;

    /* renamed from: c */
    public final ViewGroup f74378c;

    /* renamed from: d */
    public final ImageView f74379d;

    /* renamed from: e */
    public final View f74380e;

    /* renamed from: f */
    public final View f74381f;

    /* renamed from: g */
    public final View f74382g;

    /* renamed from: h */
    public final View f74383h;

    /* renamed from: i */
    public final View f74384i;

    /* renamed from: j */
    public final View f74385j;

    /* renamed from: k */
    public final boolean f74386k;

    public C27206v(View view) {
        this.f74380e = view;
        View findViewById = view.findViewById(R.id.panel_handle);
        findViewById.getClass();
        this.f74381f = findViewById;
        View findViewById2 = view.findViewById(R.id.header_shadow);
        findViewById2.getClass();
        this.f74382g = findViewById2;
        View findViewById3 = view.findViewById(R.id.panel_header_frame);
        findViewById3.getClass();
        this.f74383h = findViewById3;
        View findViewById4 = view.findViewById(R.id.header_title_wrapper);
        findViewById4.getClass();
        this.f74384i = findViewById4;
        View findViewById5 = view.findViewById(R.id.header_content);
        findViewById5.getClass();
        this.f74385j = findViewById5;
        View findViewById6 = view.findViewById(R.id.header_latex_title_wrapper);
        findViewById6.getClass();
        this.f74378c = (ViewGroup) findViewById6;
        View findViewById7 = view.findViewById(R.id.header_title);
        findViewById7.getClass();
        this.f74376a = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.header_subtitle);
        findViewById8.getClass();
        this.f74377b = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.down_caret);
        findViewById9.getClass();
        this.f74379d = (ImageView) findViewById9;
        this.f74386k = view.getResources().getConfiguration().getLayoutDirection() != 1 ? false : true;
    }
}
