package com.google.android.libraries.onegoogle.accountmenu.features.p2361b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30461b;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.b.c */
/* compiled from: PG */
public final class C30521c {
    /* renamed from: a */
    public static Drawable m56983a(Context context) {
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_gm_ic_settings_vd_theme_24);
        c.getClass();
        return c;
    }

    /* renamed from: b */
    public static C30464e m56984b(Context context, String str, View.OnClickListener onClickListener) {
        return m56985c(m56983a(context), context.getString(R.string.og_app_settings, new Object[]{str}), onClickListener);
    }

    /* renamed from: c */
    public static C30464e m56985c(Drawable drawable, String str, View.OnClickListener onClickListener) {
        C30462c g = C30464e.m56760g();
        g.mo36053f(R.id.og_ai_settings);
        ((C30466g) g).f82287a = drawable;
        g.mo36054g(str);
        g.mo36056i(90537);
        g.mo36055h(onClickListener);
        g.mo36058k(true);
        g.mo36049b(C30461b.SETTINGS);
        return g.mo36048a();
    }
}
