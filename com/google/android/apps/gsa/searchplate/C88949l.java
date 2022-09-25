package com.google.android.apps.gsa.searchplate;

import android.view.View;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;

/* renamed from: com.google.android.apps.gsa.searchplate.l */
/* compiled from: PG */
final class C88949l implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C88951n f240978a;

    public C88949l(C88951n nVar) {
        this.f240978a = nVar;
    }

    public final void onClick(View view) {
        C88893c cVar;
        C88893c cVar2;
        C88951n nVar = this.f240978a;
        if (nVar.mo82837m() && (cVar2 = nVar.f240981c) != null) {
            cVar2.mo17650t();
        } else if (nVar.f240982d == 2 && (cVar = nVar.f240981c) != null) {
            cVar.mo17637g();
        }
    }
}
