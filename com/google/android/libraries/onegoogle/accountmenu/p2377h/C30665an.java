package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.support.p033v7.p040e.C0432n;
import android.support.p033v7.widget.C0642fd;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30378bf;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30395bw;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.an */
/* compiled from: PG */
final class C30665an extends C0642fd {

    /* renamed from: a */
    final /* synthetic */ C30378bf f82769a;

    /* renamed from: b */
    final /* synthetic */ RecyclerView f82770b;

    /* renamed from: c */
    final /* synthetic */ C30669ar f82771c;

    public C30665an(C30669ar arVar, C30378bf bfVar, RecyclerView recyclerView) {
        this.f82771c = arVar;
        this.f82769a = bfVar;
        this.f82770b = recyclerView;
    }

    /* renamed from: a */
    public final void mo2831a() {
        mo36359h();
    }

    /* renamed from: d */
    public final void mo2834d(int i, int i2) {
        mo36359h();
    }

    /* renamed from: e */
    public final void mo2835e(int i, int i2) {
        mo36359h();
    }

    /* renamed from: h */
    public final void mo36359h() {
        int dimensionPixelSize = this.f82771c.getResources().getDimensionPixelSize(R.dimen.og_account_menu_top_cards_top_spacing);
        C30378bf bfVar = this.f82769a;
        C0432n nVar = bfVar.f82118a;
        if (nVar.f1440c != 0) {
            C58833ax a = bfVar.mo35949a(((Integer) nVar.mo1404a(0)).intValue());
            if (a.mo56113h() && ((C30395bw) a.mo56107c()).equals(C30395bw.ALWAYS_HIDE_DIVIDER_CARD)) {
                dimensionPixelSize = 0;
            }
        }
        this.f82770b.setPadding(0, dimensionPixelSize, 0, 0);
    }
}
