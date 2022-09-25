package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88700i;
import com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.j */
/* compiled from: PG */
final class C87636j implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ CoScrollContainer f236894a;

    /* renamed from: b */
    final /* synthetic */ C87625ad f236895b;

    public C87636j(C87625ad adVar, CoScrollContainer coScrollContainer) {
        this.f236895b = adVar;
        this.f236894a = coScrollContainer;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C87625ad adVar = this.f236895b;
        if (adVar.mo81806am() && TextUtils.isEmpty(adVar.f236844au.mo84352bk())) {
            C88700i iVar = this.f236895b.f236786P;
            CoScrollContainer coScrollContainer = this.f236894a;
            iVar.mo82421c(coScrollContainer.computeVerticalScrollRange() - coScrollContainer.getHeight() > 0);
            this.f236895b.f236786P.mo82420a(this.f236894a.getHeight());
        }
    }
}
