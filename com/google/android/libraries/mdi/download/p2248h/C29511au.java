package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.C28730bh;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.mdi.download.h.au */
/* compiled from: PG */
final class C29511au implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C28730bh f79969a;

    /* renamed from: b */
    final /* synthetic */ C29514ax f79970b;

    public C29511au(C29514ax axVar, C28730bh bhVar) {
        this.f79970b = axVar;
        this.f79969a = bhVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof C28738bp) {
            this.f79970b.mo34755e((C28738bp) th, this.f79969a);
            return;
        }
        C29514ax axVar = this.f79970b;
        C28736bn bnVar = new C28736bn();
        bnVar.f78064c = th;
        bnVar.f78062a = C28737bo.UNKNOWN_ERROR;
        bnVar.f78063b = "Refresh failed.";
        axVar.mo34755e(bnVar.mo34334a(), this.f79969a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
