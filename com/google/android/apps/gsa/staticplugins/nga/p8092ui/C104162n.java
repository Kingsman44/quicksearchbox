package com.google.android.apps.gsa.staticplugins.nga.p8092ui;

import android.view.View;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C103964cj;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C104002du;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C104003dv;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C104004dw;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C104026er;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.n */
/* compiled from: PG */
public final /* synthetic */ class C104162n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104163o f289725a;

    public /* synthetic */ C104162n(C104163o oVar) {
        this.f289725a = oVar;
    }

    public final void onClick(View view) {
        C104026er erVar = this.f289725a.f289730f;
        ((C103964cj) erVar.f289460n.mo27525b()).mo93901b();
        synchronized (erVar.f289465s) {
            erVar.f289466t.cancel(true);
        }
        new C90873ag(erVar.mo93918b(new C104002du(erVar)), erVar.f289448b, "[NGA] NgaInitialDownloader.tryCancelDownload", C104003dv.f289411a).mo85223a(new C104004dw(erVar));
    }
}
