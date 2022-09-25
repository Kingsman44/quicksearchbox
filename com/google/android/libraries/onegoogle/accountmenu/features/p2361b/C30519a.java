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

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.b.a */
/* compiled from: PG */
public final class C30519a {
    /* renamed from: a */
    public static C30464e m56981a(Context context, View.OnClickListener onClickListener) {
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_gm_ic_help_outline_vd_theme_24);
        c.getClass();
        C30462c g = C30464e.m56760g();
        g.mo36053f(R.id.og_ai_help_and_feedback);
        ((C30466g) g).f82287a = c;
        g.mo36054g(context.getString(R.string.og_help_feedback));
        g.mo36056i(90538);
        g.mo36055h(onClickListener);
        g.mo36058k(true);
        g.mo36049b(C30461b.HELP_AND_FEEDBACK);
        return g.mo36048a();
    }
}
