package com.google.android.apps.search.googleapp.search.srp;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58852bp;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.h */
/* compiled from: PG */
public final /* synthetic */ class C137854h implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C137886r f375068a;

    public /* synthetic */ C137854h(C137886r rVar) {
        this.f375068a = rVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        C137886r rVar = this.f375068a;
        if (((Boolean) obj).booleanValue()) {
            rVar.mo114025j(1);
            C137733c cVar = rVar.f375158h;
            View view = cVar.getView();
            view.getClass();
            view.setElevation((float) cVar.getResources().getDimensionPixelOffset(R.dimen.googleapp_search_header_elevation));
            return;
        }
        View view2 = rVar.f375158h.getView();
        view2.getClass();
        view2.setElevation(0.0f);
    }
}
