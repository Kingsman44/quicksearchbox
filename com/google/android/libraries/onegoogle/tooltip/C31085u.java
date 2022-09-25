package com.google.android.libraries.onegoogle.tooltip;

import android.view.animation.Animation;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2367b.C30552c;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30559f;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30560g;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30561h;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30562i;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30564k;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30572s;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.u */
/* compiled from: PG */
final class C31085u implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ TooltipView f83730a;

    public C31085u(TooltipView tooltipView) {
        this.f83730a = tooltipView;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f83730a.mo36773a().start();
        TooltipView tooltipView = this.f83730a;
        C30559f fVar = tooltipView.f83678l;
        if (fVar != null) {
            C31081q qVar = tooltipView.f83677k;
            C30564k kVar = fVar.f82567a;
            C30572s sVar = fVar.f82568b;
            C31067c cVar = fVar.f82569c;
            C31075k kVar2 = fVar.f82570d;
            kVar.mo36252g(tooltipView, 105604);
            kVar.mo36252g(qVar, 90573);
            qVar.setOnClickListener(new C30560g(kVar));
            sVar.setOnClickListener(new C30561h(kVar, cVar, tooltipView, kVar2));
            sVar.findViewById(R.id.og_tooltip_dismiss_button).setOnClickListener(new C30562i(kVar, tooltipView, kVar2));
            Runnable runnable = sVar.f82592a;
            if (runnable != null) {
                ((C30552c) runnable).f82525a.start();
            }
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
