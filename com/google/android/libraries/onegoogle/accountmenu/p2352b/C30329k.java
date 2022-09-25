package com.google.android.libraries.onegoogle.accountmenu.p2352b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30641x;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.b.k */
/* compiled from: PG */
public final class C30329k {
    /* renamed from: a */
    public static C30464e m56489a(Context context, C30306o oVar, C30641x xVar) {
        Drawable c = C0678gm.m2375e().mo3100c(context, xVar.mo36350a());
        c.getClass();
        C30462c g = C30464e.m56760g();
        g.mo36053f(R.id.og_use_without_an_account);
        C30466g gVar = (C30466g) g;
        gVar.f82287a = c;
        g.mo36054g(context.getString(xVar.mo36351b()));
        g.mo36056i(90140);
        g.mo36058k(false);
        g.mo36050c(xVar.mo36345c());
        gVar.f82288b = new C30328j(oVar);
        return g.mo36048a();
    }
}
