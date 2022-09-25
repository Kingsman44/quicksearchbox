package com.google.android.libraries.onegoogle.tooltip;

import android.widget.PopupWindow;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.o */
/* compiled from: PG */
final class C31079o {

    /* renamed from: a */
    public final C31067c f83717a;

    /* renamed from: b */
    public final C31078n f83718b = new C31078n(this);

    /* renamed from: c */
    public final PopupWindow.OnDismissListener f83719c;

    /* renamed from: d */
    public TooltipView f83720d;

    public C31079o(C31067c cVar, C31080p pVar, PopupWindow.OnDismissListener onDismissListener) {
        this.f83717a = cVar;
        this.f83719c = onDismissListener;
        C31069e eVar = (C31069e) pVar;
        TooltipView tooltipView = new TooltipView(eVar.f83698c, cVar, eVar.f83700e, eVar.f83701f);
        this.f83720d = tooltipView;
        tooltipView.f83670d.setColor(((Integer) ((C58847bk) eVar.f83696a).f156646a).intValue());
        TooltipView tooltipView2 = this.f83720d;
        C58833ax axVar = eVar.f83697b;
        C31081q qVar = tooltipView2.f83677k;
        if (axVar.mo56113h()) {
            qVar.f83722b = true;
            qVar.f83721a.setColor(((Integer) axVar.mo56107c()).intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36806a() {
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) this.f83717a).f81902c;
        C31078n nVar = this.f83718b;
        accountParticleDisc.removeOnAttachStateChangeListener(nVar);
        accountParticleDisc.getViewTreeObserver().removeOnGlobalLayoutListener(nVar);
        TooltipView tooltipView = this.f83720d;
        if (tooltipView != null && tooltipView.isShown()) {
            TooltipView tooltipView2 = this.f83720d;
            tooltipView2.f83671e.dismiss();
            tooltipView2.f83668b.removeView(tooltipView2.f83677k);
            this.f83720d = null;
        }
    }
}
