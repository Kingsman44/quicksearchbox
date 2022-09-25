package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.gsa.search.shared.overlay.C87662k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.p */
/* compiled from: PG */
final class C87642p implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ C87625ad f236901a;

    public C87642p(C87625ad adVar) {
        this.f236901a = adVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C87662k kVar;
        C58976aa aaVar = C58975e.f156826a;
        boolean z = false;
        if (i == 4 && keyEvent.getAction() == 0) {
            C87625ad adVar = this.f236901a;
            if (adVar.f236831ah == 1 && adVar.f236844au.mo84392cY()) {
                if (TextUtils.isEmpty(this.f236901a.f236844au.f252768g)) {
                    C87625ad adVar2 = this.f236901a;
                    C87621a aVar = adVar2.f236877s;
                    if (aVar.f236749n && (kVar = adVar2.f236854bd) != null) {
                        kVar.mo76788b();
                    } else if (aVar.f236748m) {
                        adVar2.mo17500a();
                    }
                    z = true;
                }
                C87625ad adVar3 = this.f236901a;
                if (adVar3.mo81806am()) {
                    adVar3.mo81777J();
                    this.f236901a.mo81783P();
                }
            }
        }
        return z;
    }
}
