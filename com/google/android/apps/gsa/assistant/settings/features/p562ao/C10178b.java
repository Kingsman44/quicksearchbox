package com.google.android.apps.gsa.assistant.settings.features.p562ao;

import android.view.View;
import android.view.ViewGroup;
import com.google.assistant.p3861at.C50277rc;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ao.b */
/* compiled from: PG */
public final /* synthetic */ class C10178b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10180d f34587a;

    /* renamed from: b */
    public final /* synthetic */ C50277rc f34588b;

    /* renamed from: c */
    public final /* synthetic */ View f34589c;

    public /* synthetic */ C10178b(C10180d dVar, C50277rc rcVar, View view) {
        this.f34587a = dVar;
        this.f34588b = rcVar;
        this.f34589c = view;
    }

    public final void onClick(View view) {
        C10180d dVar = this.f34587a;
        C50277rc rcVar = this.f34588b;
        View view2 = this.f34589c;
        dVar.f34594a.mo18313b(rcVar);
        ((ViewGroup) view2.getParent()).removeView(view2);
    }
}
