package com.google.android.apps.gsa.searchplate;

import android.view.View;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;

/* renamed from: com.google.android.apps.gsa.searchplate.i */
/* compiled from: PG */
final class C88946i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C88948k f240957a;

    public C88946i(C88948k kVar) {
        this.f240957a = kVar;
    }

    public final void onClick(View view) {
        C88948k kVar = this.f240957a;
        C88893c cVar = kVar.f240970m;
        if (cVar != null) {
            switch (kVar.f240959b) {
                case 0:
                case 5:
                case 6:
                case 9:
                    cVar.mo17639i();
                    return;
                case 1:
                case 2:
                case 4:
                    cVar.mo17631a();
                    return;
                case 3:
                    cVar.mo17640j();
                    return;
                case 10:
                    if (!kVar.f240960c) {
                        cVar.mo17640j();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
