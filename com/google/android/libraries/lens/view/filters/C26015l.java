package com.google.android.libraries.lens.view.filters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.filters.l */
/* compiled from: PG */
final class C26015l {

    /* renamed from: a */
    public final ImageView f70696a;

    /* renamed from: b */
    public final TextView f70697b;

    /* renamed from: c */
    public final View f70698c;

    public C26015l(View view) {
        this.f70698c = view;
        View findViewById = view.findViewById(R.id.preview_logo_view);
        findViewById.getClass();
        this.f70696a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.preview_title_view);
        findViewById2.getClass();
        this.f70697b = (TextView) findViewById2;
    }
}
