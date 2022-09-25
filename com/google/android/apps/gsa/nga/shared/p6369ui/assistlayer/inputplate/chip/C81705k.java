package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80784fe;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81966ac;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.k */
/* compiled from: PG */
abstract class C81705k extends FrameLayout {

    /* renamed from: a */
    public static final C59071e f223451a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.k");

    /* renamed from: b */
    public Optional f223452b = Optional.empty();

    public C81705k(Context context) {
        super(context);
    }

    /* renamed from: a */
    static String m129844a(Icon icon) {
        return C81966ac.m130207b(icon.getResPackage(), icon.getResId());
    }

    /* renamed from: b */
    public abstract void mo75229b(C80784fe feVar, C81674a aVar, C81698d dVar, C81688an anVar);

    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C81705k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C81705k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C81705k(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
