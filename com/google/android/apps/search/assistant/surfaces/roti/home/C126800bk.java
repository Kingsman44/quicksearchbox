package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bk */
/* compiled from: PG */
final class C126800bk implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f349190a;

    /* renamed from: b */
    final /* synthetic */ C126804bo f349191b;

    public C126800bk(C126804bo boVar, View view) {
        this.f349191b = boVar;
        this.f349190a = view;
    }

    public final void onGlobalLayout() {
        this.f349191b.f349220h.mo19974a(C37176a.f97324r);
        this.f349190a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C126804bo boVar = this.f349191b;
        View view = this.f349190a;
        if (boVar.f349221i.getResources().getConfiguration().orientation == 2 && !boVar.f349231s.f178301a.contains(Integer.valueOf(boVar.f349235w)) && !boVar.f349232t && !boVar.f349233u.f178301a.contains(Integer.valueOf(boVar.f349235w)) && !boVar.f349234v) {
            if (view.findViewById(R.id.assistant_roti_inputplate_root).getHeight() + ((int) boVar.mo107795a(83.0f)) <= view.findViewById(R.id.assistant_roti_app_fragment).getHeight()) {
                boVar.mo107797c(view.findViewById(R.id.assistant_roti_inputplate_shadow));
            } else {
                boVar.mo107796b(view);
            }
        }
    }
}
