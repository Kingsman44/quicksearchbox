package com.google.android.apps.search.googleapp.homescreen.p10313c;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import com.google.android.apps.search.googleapp.discover.streamui.p10231g.C134748a;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.c.a */
/* compiled from: PG */
public final class C136150a implements C134748a {

    /* renamed from: a */
    public final boolean f370798a;

    /* renamed from: b */
    public int f370799b = 0;

    /* renamed from: c */
    public int f370800c;

    /* renamed from: d */
    private final View f370801d;

    /* renamed from: e */
    private final Window f370802e;

    /* renamed from: f */
    private final int f370803f;

    /* renamed from: g */
    private boolean f370804g;

    /* renamed from: h */
    private float f370805h;

    public C136150a(View view, Activity activity) {
        this.f370801d = view;
        Window window = activity.getWindow();
        this.f370802e = window;
        this.f370803f = C1878d.m5128a(window.getContext(), R.color.agsa_color_background);
        boolean a = C133933a.m217248a(activity);
        this.f370798a = a;
        this.f370804g = a;
        this.f370800c = 1;
    }

    /* renamed from: a */
    public final void mo111560a(int i, int i2) {
        this.f370801d.setTranslationY((float) (i2 - this.f370799b));
        int i3 = (-i2) + this.f370799b;
        double d = 0.8d;
        if (i3 >= 0 && i3 <= this.f370801d.getHeight()) {
            double d2 = (double) i3;
            Double.isNaN(d2);
            double height = (double) this.f370801d.getHeight();
            Double.isNaN(height);
            d = (d2 * 0.8d) / height;
        }
        int h = C1924a.m5189h(this.f370803f, (int) (d * 255.0d));
        if (this.f370802e.getStatusBarColor() != h) {
            this.f370802e.setStatusBarColor(h);
        }
        this.f370805h = ((float) i3) / ((float) this.f370801d.getHeight());
        mo112803b();
    }

    /* renamed from: b */
    public final void mo112803b() {
        int i = this.f370800c;
        boolean z = true;
        if (i == 1) {
            mo112804c(!this.f370798a);
            return;
        }
        float f = this.f370805h;
        if (f >= 0.0f) {
            if (f < 0.5f) {
                if (i != 2) {
                    z = false;
                }
                mo112804c(z);
                return;
            }
            mo112804c(!this.f370798a);
        }
    }

    /* renamed from: c */
    public final void mo112804c(boolean z) {
        if (this.f370804g != z) {
            int systemUiVisibility = this.f370802e.getDecorView().getSystemUiVisibility();
            this.f370802e.getDecorView().setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
            this.f370804g = z;
        }
    }
}
