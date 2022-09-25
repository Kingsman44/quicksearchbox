package com.google.android.libraries.lens.view.infopanel;

import android.content.res.Resources;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ae */
/* compiled from: PG */
final class C26987ae {

    /* renamed from: a */
    public final int f73591a;

    /* renamed from: b */
    public final int f73592b;

    public C26987ae(View view) {
        Resources resources = view.getResources();
        this.f73591a = resources.getDimensionPixelSize(R.dimen.lens_info_panel_vertical_padding);
        this.f73592b = resources.getDimensionPixelSize(R.dimen.lens_info_panel_content_top_margin);
    }
}
