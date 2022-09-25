package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.view.View;
import androidx.lifecycle.C2333ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.cq */
/* compiled from: PG */
public final /* synthetic */ class C30416cq implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30417cr f82186a;

    public /* synthetic */ C30416cq(C30417cr crVar) {
        this.f82186a = crVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30417cr crVar = this.f82186a;
        C58833ax axVar = (C58833ax) obj;
        boolean h = axVar.mo56113h();
        crVar.f82205v = h;
        if (h) {
            crVar.f82199p.setOnClickListener(new C30407ch(crVar, axVar));
        } else {
            crVar.f82199p.setOnClickListener((View.OnClickListener) null);
        }
        crVar.mo35984h(crVar.f82205v);
    }
}
