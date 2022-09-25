package com.google.android.apps.search.googleapp.homescreen.p10313c;

import android.content.Context;
import android.view.View;
import androidx.core.p092d.C1886a;
import com.google.android.apps.search.googleapp.discover.streamui.p10231g.C134748a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.c.c */
/* compiled from: PG */
public final class C136152c implements C134748a {

    /* renamed from: a */
    public final View f370807a;

    /* renamed from: b */
    public int f370808b = 0;

    /* renamed from: c */
    private final float f370809c;

    /* renamed from: d */
    private final float f370810d;

    public C136152c(View view, Context context) {
        this.f370807a = view;
        this.f370809c = context.getResources().getDimension(R.dimen.googleapp_hs_header_total_height);
        this.f370810d = context.getResources().getDimension(R.dimen.googleapp_hs_logo_total_height);
    }

    /* renamed from: a */
    public final void mo111560a(int i, int i2) {
        if (((int) this.f370810d) + i2 > this.f370808b) {
            this.f370807a.setTranslationY((float) i2);
            return;
        }
        this.f370807a.setTranslationY(C1886a.m5144b(this.f370807a.getTranslationY() - ((float) i), -this.f370809c, (-this.f370810d) + ((float) this.f370808b)));
    }
}
