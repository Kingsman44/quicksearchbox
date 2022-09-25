package com.google.android.apps.search.googleapp.discover.channels;

import android.view.View;
import androidx.core.p092d.C1886a;
import com.google.android.apps.search.googleapp.discover.streamui.p10231g.C134748a;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.ab */
/* compiled from: PG */
public final /* synthetic */ class C134111ab implements C134748a {

    /* renamed from: a */
    public final /* synthetic */ View f365320a;

    /* renamed from: b */
    public final /* synthetic */ View f365321b;

    public /* synthetic */ C134111ab(View view, View view2) {
        this.f365320a = view;
        this.f365321b = view2;
    }

    /* renamed from: a */
    public final void mo111560a(int i, int i2) {
        View view = this.f365320a;
        View view2 = this.f365321b;
        view.setTranslationY(C1886a.m5144b(view.getTranslationY() - ((float) i), (float) (-view2.getHeight()), 0.0f));
        if (i2 != 0) {
            view.setVisibility(0);
            view2.setVisibility(8);
            return;
        }
        view.setVisibility(8);
        view2.setVisibility(0);
    }
}
