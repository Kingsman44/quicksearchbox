package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.gleam.b */
/* compiled from: PG */
abstract class C26468b {

    /* renamed from: a */
    protected final C26447af f72090a;

    /* renamed from: b */
    protected float f72091b = 1.0f;

    /* renamed from: c */
    protected float f72092c;

    /* renamed from: d */
    protected float f72093d;

    /* renamed from: e */
    protected final float f72094e;

    /* renamed from: f */
    protected final float f72095f;

    public C26468b(C26447af afVar, Context context) {
        this.f72090a = afVar;
        Resources resources = context.getResources();
        this.f72094e = resources.getDimension(R.dimen.storefront_font_size);
        this.f72095f = resources.getDimension(R.dimen.gleam_label_box_1_2_line_spacing);
    }

    /* renamed from: a */
    public abstract int mo31729a();
}
