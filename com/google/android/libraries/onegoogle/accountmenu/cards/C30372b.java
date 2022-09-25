package com.google.android.libraries.onegoogle.accountmenu.cards;

import androidx.lifecycle.C2333ah;
import androidx.lifecycle.LiveData;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30463d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.b */
/* compiled from: PG */
public final /* synthetic */ class C30372b implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30437e f82105a;

    /* renamed from: b */
    public final /* synthetic */ LiveData f82106b;

    public /* synthetic */ C30372b(C30437e eVar, LiveData liveData) {
        this.f82105a = eVar;
        this.f82106b = liveData;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30437e eVar = this.f82105a;
        C58833ax axVar = (C58833ax) obj;
        if (this.f82106b == null || !axVar.mo56113h()) {
            eVar.mo35969i(C58836b.f156633a);
            return;
        }
        C30463d dVar = (C30463d) axVar.mo56107c();
        C30445m mVar = new C30445m();
        mVar.f82253a = C58833ax.m90834k(new C30442j(dVar.mo36060c(), dVar.mo36059b()));
        eVar.mo35969i(C58833ax.m90834k(mVar.mo35977a()));
    }
}
