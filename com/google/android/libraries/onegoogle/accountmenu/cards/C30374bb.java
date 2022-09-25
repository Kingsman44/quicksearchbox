package com.google.android.libraries.onegoogle.accountmenu.cards;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.bb */
/* compiled from: PG */
public final /* synthetic */ class C30374bb implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30378bf f82113a;

    /* renamed from: b */
    public final /* synthetic */ C30253a f82114b;

    public /* synthetic */ C30374bb(C30378bf bfVar, C30253a aVar) {
        this.f82113a = bfVar;
        this.f82114b = aVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30378bf bfVar = this.f82113a;
        C30253a aVar = this.f82114b;
        C58485gu guVar = (C58485gu) obj;
        C58838bb.m90866a(guVar, "Dynamic card retrievers list may not be updated with a null value.");
        bfVar.f82119b = guVar;
        bfVar.mo35950b(C30281j.m56319c(((C30306o) aVar).f81934a.f81883d));
    }
}
