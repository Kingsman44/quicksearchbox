package com.google.android.libraries.onegoogle.tooltip;

import androidx.core.p098j.C2043bi;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.s */
/* compiled from: PG */
public final /* synthetic */ class C31083s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TooltipView f83728a;

    public /* synthetic */ C31083s(TooltipView tooltipView) {
        this.f83728a = tooltipView;
    }

    public final void run() {
        TooltipView tooltipView = this.f83728a;
        C19559g.m37304c();
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) tooltipView.f83667a).f81902c;
        if (C2043bi.m5569aw(accountParticleDisc)) {
            tooltipView.f83671e.showAtLocation(accountParticleDisc, 0, tooltipView.f83673g, tooltipView.f83674h);
        }
    }
}
