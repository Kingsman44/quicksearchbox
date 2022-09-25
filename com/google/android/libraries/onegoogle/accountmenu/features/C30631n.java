package com.google.android.libraries.onegoogle.accountmenu.features;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.C2332ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30460a;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30465f;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.n */
/* compiled from: PG */
public abstract class C30631n {
    /* renamed from: k */
    public static C30630m m57247k() {
        C30606g gVar = new C30606g();
        gVar.mo36302c(R.id.og_ai_custom_action);
        gVar.mo36304e(90541);
        gVar.f82679d = new C2332ag();
        return gVar;
    }

    /* renamed from: a */
    public abstract int mo36319a();

    /* renamed from: b */
    public abstract int mo36320b();

    /* renamed from: c */
    public abstract Drawable mo36321c();

    /* renamed from: d */
    public abstract View.OnClickListener mo36322d();

    /* renamed from: e */
    public abstract C2332ag mo36323e();

    /* renamed from: f */
    public abstract C30465f mo36325f();

    /* renamed from: g */
    public abstract C58833ax mo36326g();

    /* renamed from: h */
    public abstract String mo36327h();

    /* renamed from: i */
    public abstract C30460a mo36329i();

    /* renamed from: j */
    public final C30464e mo36352j() {
        C30462c g = C30464e.m56760g();
        g.mo36053f(mo36319a());
        g.mo36052e(mo36321c());
        g.mo36054g(mo36327h());
        g.mo36056i(mo36320b());
        g.mo36055h(mo36322d());
        C30466g gVar = (C30466g) g;
        gVar.f82289c = mo36325f();
        gVar.f82290d = mo36323e();
        g.mo36050c(mo36326g());
        return g.mo36048a();
    }
}
