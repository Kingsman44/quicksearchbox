package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.p */
/* compiled from: PG */
public final /* synthetic */ class C81619p implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81603ae f223271a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f223272b;

    public /* synthetic */ C81619p(C81603ae aeVar, ImageView imageView) {
        this.f223271a = aeVar;
        this.f223272b = imageView;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81603ae aeVar = this.f223271a;
        ImageView imageView = this.f223272b;
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            if (((Integer) optional.get()).equals(-1)) {
                aeVar.f223230j.mo75434e(imageView);
                return;
            }
            aeVar.f223230j.mo75435f(imageView, ((Integer) optional.get()).intValue(), true);
            aeVar.f223230j.mo75432c(imageView, (View) aeVar.f223224d.getParent());
        }
    }
}
