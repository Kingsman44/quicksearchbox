package com.google.android.libraries.onegoogle.accountmenu.features.accountmessages;

import com.google.android.libraries.onegoogle.accountmenu.cards.C30356ak;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.accountmessages.c */
/* compiled from: PG */
public final /* synthetic */ class C30511c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30512d f82406a;

    /* renamed from: b */
    public final /* synthetic */ C30356ak f82407b;

    public /* synthetic */ C30511c(C30512d dVar, C30356ak akVar) {
        this.f82406a = dVar;
        this.f82407b = akVar;
    }

    public final void run() {
        C30512d dVar = this.f82406a;
        C30356ak akVar = this.f82407b;
        boolean z = true;
        if (!akVar.mo35935b() && !akVar.mo35936c()) {
            z = false;
        }
        dVar.f82412a = z;
        dVar.mo36157j(dVar.f82413l, z);
    }
}
