package com.google.android.apps.gsa.staticplugins.nga.p8092ui;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.material.progress.MaterialProgressBar;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.e */
/* compiled from: PG */
public final /* synthetic */ class C104153e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C104163o f289711a;

    public /* synthetic */ C104153e(C104163o oVar) {
        this.f289711a = oVar;
    }

    public final void run() {
        MaterialProgressBar materialProgressBar = (MaterialProgressBar) this.f289711a.f289735k.findViewById(R.id.nga_data_update_progress_bar);
        if (materialProgressBar != null) {
            materialProgressBar.mo34164g(100);
        }
    }
}
