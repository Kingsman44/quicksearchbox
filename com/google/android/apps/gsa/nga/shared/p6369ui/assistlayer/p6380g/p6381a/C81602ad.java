package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.view.View;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C81602ad implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81603ae f223219a;

    /* renamed from: b */
    public final /* synthetic */ View f223220b;

    public /* synthetic */ C81602ad(C81603ae aeVar, View view) {
        this.f223219a = aeVar;
        this.f223220b = view;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81603ae aeVar = this.f223219a;
        View view = this.f223220b;
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            if (((Integer) optional.get()).equals(-1)) {
                aeVar.f223230j.mo75434e(view);
                return;
            }
            aeVar.f223230j.mo75435f(view, ((Integer) optional.get()).intValue(), true);
            aeVar.f223230j.mo75432c(view, (View) aeVar.f223224d.getParent());
        }
    }
}
