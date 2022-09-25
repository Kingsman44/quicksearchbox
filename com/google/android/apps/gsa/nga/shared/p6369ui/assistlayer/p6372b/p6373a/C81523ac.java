package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22869e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C81523ac implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C81525ae f222941a;

    /* renamed from: b */
    public final /* synthetic */ View f222942b;

    public /* synthetic */ C81523ac(C81525ae aeVar, View view) {
        this.f222941a = aeVar;
        this.f222942b = view;
    }

    public final void run() {
        C81525ae aeVar = this.f222941a;
        View view = this.f222942b;
        view.setPadding(0, aeVar.f222954k, 0, 0);
        aeVar.mo75132g((Optional) ((C83361k) aeVar.f222955l).f227199b.get());
        aeVar.f222947d.removeAllViews();
        aeVar.f222947d.addView(view);
    }
}
