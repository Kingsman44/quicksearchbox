package com.google.android.libraries.onegoogle.accountmenu.p2352b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;
import com.google.android.libraries.onegoogle.actions.C30800a;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.b.e */
/* compiled from: PG */
public final class C30323e {
    /* renamed from: a */
    public static C30464e m56485a(C30305n nVar, Context context) {
        if (!C30800a.m57498a(context)) {
            return null;
        }
        C30462c g = C30464e.m56760g();
        g.mo36053f(R.id.og_ai_manage_accounts);
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_gm_ic_manage_accounts_vd_theme_24);
        c.getClass();
        C30466g gVar = (C30466g) g;
        gVar.f82287a = c;
        g.mo36054g(context.getString(R.string.og_manage_accounts));
        gVar.f82288b = new C30322d(nVar);
        g.mo36056i(90142);
        return g.mo36048a();
    }
}
