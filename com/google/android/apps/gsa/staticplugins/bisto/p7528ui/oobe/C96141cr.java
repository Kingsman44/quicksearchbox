package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cr */
/* compiled from: PG */
public final /* synthetic */ class C96141cr implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96142cs f269151a;

    /* renamed from: b */
    public final /* synthetic */ Intent f269152b;

    /* renamed from: c */
    public final /* synthetic */ int f269153c;

    public /* synthetic */ C96141cr(C96142cs csVar, int i, Intent intent) {
        this.f269151a = csVar;
        this.f269153c = i;
        this.f269152b = intent;
    }

    public final void onClick(View view) {
        C96142cs csVar = this.f269151a;
        int i = this.f269153c;
        Intent intent = this.f269152b;
        C58976aa aaVar = C58975e.f156826a;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 4 || i2 == 5) {
                ((C95299e) csVar.f269603D.mo27525b()).mo89237g(i, true);
                csVar.f269154b.f269023a = intent;
                csVar.mo77318iT().mo77312a();
                return;
            }
            ((C95299e) csVar.f269603D.mo27525b()).mo89237g(i, false);
            return;
        }
        throw null;
    }
}
