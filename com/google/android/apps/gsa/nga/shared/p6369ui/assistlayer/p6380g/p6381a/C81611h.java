package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81826s;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81978ao;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81979ap;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.h */
/* compiled from: PG */
public final /* synthetic */ class C81611h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81603ae f223261a;

    public /* synthetic */ C81611h(C81603ae aeVar) {
        this.f223261a = aeVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81603ae aeVar = this.f223261a;
        C81978ao aoVar = (C81978ao) obj;
        C81979ap apVar = aeVar.f223232l;
        FrameLayout frameLayout = aeVar.f223224d;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            C81826s b = aoVar.mo75412b();
            if (aoVar.mo75411a().mo75337e() <= apVar.f224126a || !aoVar.mo75413c()) {
                layoutParams2.width = -1;
                layoutParams2.leftMargin = b.mo75359a().left;
                layoutParams2.rightMargin = b.mo75359a().right;
            } else {
                layoutParams2.width = apVar.f224126a;
                layoutParams2.gravity = 1;
                layoutParams2.leftMargin = b.mo75359a().left / 2;
                layoutParams2.rightMargin = b.mo75359a().right / 2;
            }
            layoutParams2.bottomMargin = b.mo75359a().bottom;
            frameLayout.requestLayout();
        }
    }
}
