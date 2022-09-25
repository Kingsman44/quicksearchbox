package com.google.android.libraries.onegoogle.accountmenu.cards;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.onegoogle.common.C30910aj;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.cj */
/* compiled from: PG */
public final /* synthetic */ class C30409cj implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30417cr f82179a;

    public /* synthetic */ C30409cj(C30417cr crVar) {
        this.f82179a = crVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30417cr crVar = this.f82179a;
        C58833ax axVar = (C58833ax) obj;
        if (!C30910aj.m57700a(crVar.f82107a)) {
            crVar.f82198o.setOnClickListener(new C30408ci(crVar, axVar));
        }
    }
}
