package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.view.View;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.e */
/* compiled from: PG */
public final /* synthetic */ class C104341e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104348l f290287a;

    /* renamed from: b */
    public final /* synthetic */ C9141ad f290288b;

    public /* synthetic */ C104341e(C104348l lVar, C9141ad adVar) {
        this.f290287a = lVar;
        this.f290288b = adVar;
    }

    public final void onClick(View view) {
        C104348l lVar = this.f290287a;
        C9141ad adVar = this.f290288b;
        C91857e eVar = lVar.f290316k;
        if (eVar != null) {
            eVar.mo86359a(adVar.f31556v, adVar.f31557w, C23245b.m43556a(adVar));
        }
    }
}
