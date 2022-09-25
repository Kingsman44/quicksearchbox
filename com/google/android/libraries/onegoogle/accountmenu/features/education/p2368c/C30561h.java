package com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.tooltip.C31067c;
import com.google.android.libraries.onegoogle.tooltip.C31075k;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.c.h */
/* compiled from: PG */
public final /* synthetic */ class C30561h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30564k f82572a;

    /* renamed from: b */
    public final /* synthetic */ C31067c f82573b;

    /* renamed from: c */
    public final /* synthetic */ View f82574c;

    /* renamed from: d */
    public final /* synthetic */ C31075k f82575d;

    public /* synthetic */ C30561h(C30564k kVar, C31067c cVar, View view, C31075k kVar2) {
        this.f82572a = kVar;
        this.f82573b = cVar;
        this.f82574c = view;
        this.f82575d = kVar2;
    }

    public final void onClick(View view) {
        C30564k kVar = this.f82572a;
        C31067c cVar = this.f82573b;
        View view2 = this.f82574c;
        C31075k kVar2 = this.f82575d;
        if (kVar.f82581a.mo36238m()) {
            ((SelectedAccountDisc) cVar).performClick();
        }
        kVar.mo36253h(view2);
        kVar2.mo36800a();
    }
}
