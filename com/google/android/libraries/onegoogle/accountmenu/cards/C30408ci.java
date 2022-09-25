package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.ci */
/* compiled from: PG */
public final /* synthetic */ class C30408ci implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30417cr f82177a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f82178b;

    public /* synthetic */ C30408ci(C30417cr crVar, C58833ax axVar) {
        this.f82177a = crVar;
        this.f82178b = axVar;
    }

    public final void onClick(View view) {
        C30417cr crVar = this.f82177a;
        C58833ax axVar = this.f82178b;
        crVar.f82108b.mo35826f(C28442l.m53142h(), crVar.f82198o);
        if (axVar.mo56113h()) {
            ((View.OnClickListener) axVar.mo56107c()).onClick(view);
        }
    }
}
