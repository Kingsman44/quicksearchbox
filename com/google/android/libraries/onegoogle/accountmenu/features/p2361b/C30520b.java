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

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.b.b */
/* compiled from: PG */
public final class C30520b {
    /* renamed from: a */
    public static C30464e m56982a(Context context, String str, View.OnClickListener onClickListener) {
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.ic_safer_shield_ic_outline_your_data);
        c.getClass();
        C30462c g = C30464e.m56760g();
        g.mo36053f(R.id.og_ai_privacy_advisor);
        ((C30466g) g).f82287a = c;
        g.mo36054g(context.getString(R.string.og_privacy_advisor, new Object[]{str}));
        g.mo36056i(90536);
        g.mo36055h(onClickListener);
        g.mo36049b(C30461b.PRIVACY_ADVISOR);
        return g.mo36048a();
    }
}
