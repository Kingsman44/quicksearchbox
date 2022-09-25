package com.google.android.libraries.onegoogle.accountmenu.features.p2373g;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.core.content.C1877c;
import androidx.core.p098j.C2043bi;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.C30173aa;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.onegoogle.common.C30938y;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.g.b */
/* compiled from: PG */
public final /* synthetic */ class C30608b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30611e f82686a;

    public /* synthetic */ C30608b(C30611e eVar) {
        this.f82686a = eVar;
    }

    public final void run() {
        C30611e eVar = this.f82686a;
        Drawable drawable = null;
        if (C30173aa.OBAKE.equals(eVar.f82690a.mo35585c())) {
            eVar.f82695f.mo36616a(37);
            AccountParticleDisc accountParticleDisc = eVar.f82690a;
            C30901aa aaVar = new C30901aa(new C30607a(eVar));
            aaVar.mo36586a(eVar.f82695f, 48);
            aaVar.f83316d = eVar.f82693d.mo35755b();
            aaVar.f83317e = eVar.f82693d.mo35754a();
            accountParticleDisc.setOnClickListener(new C30938y(aaVar));
            AccountParticleDisc accountParticleDisc2 = eVar.f82690a;
            accountParticleDisc2.setContentDescription(accountParticleDisc2.getResources().getString(eVar.f82692c.mo36314b()));
            C2043bi.m5551ae(eVar.f82690a, 1);
            AccountParticleDisc accountParticleDisc3 = eVar.f82690a;
            int a = C30905ae.m57695a(accountParticleDisc3.getContext());
            if (a != 0) {
                drawable = C1877c.m5125a(eVar.f82690a.getContext(), a);
                if (drawable instanceof RippleDrawable) {
                    ((RippleDrawable) drawable).setRadius(eVar.f82696g / 2);
                }
            }
            C2043bi.m5530X(accountParticleDisc3, drawable);
            return;
        }
        eVar.f82690a.setOnClickListener((View.OnClickListener) null);
        eVar.f82690a.setClickable(false);
        eVar.f82690a.setContentDescription((CharSequence) null);
        C2043bi.m5551ae(eVar.f82690a, 4);
        C2043bi.m5530X(eVar.f82690a, (Drawable) null);
    }
}
