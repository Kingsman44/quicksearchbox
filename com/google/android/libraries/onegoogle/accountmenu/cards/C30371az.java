package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.az */
/* compiled from: PG */
public final /* synthetic */ class C30371az implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30373ba f82103a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f82104b;

    public /* synthetic */ C30371az(C30373ba baVar, C58833ax axVar) {
        this.f82103a = baVar;
        this.f82104b = axVar;
    }

    public final void onClick(View view) {
        C30373ba baVar = this.f82103a;
        C58833ax axVar = this.f82104b;
        baVar.f82108b.mo35826f(C28442l.m53142h(), baVar.f82109c);
        if (axVar.mo56113h()) {
            ((View.OnClickListener) axVar.mo56107c()).onClick(view);
        }
    }
}
