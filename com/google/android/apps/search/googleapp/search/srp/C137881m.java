package com.google.android.apps.search.googleapp.search.srp;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.m */
/* compiled from: PG */
public final /* synthetic */ class C137881m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C137886r f375141a;

    /* renamed from: b */
    public final /* synthetic */ View f375142b;

    public /* synthetic */ C137881m(C137886r rVar, View view) {
        this.f375141a = rVar;
        this.f375142b = view;
    }

    public final void run() {
        C137886r rVar = this.f375141a;
        this.f375142b.setVisibility(0);
        View view = rVar.f375158h.getView();
        view.getClass();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.googleapp_doodle_fragment);
        viewGroup.getClass();
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.googleapp_account_disc_fragment);
        viewGroup2.getClass();
        viewGroup2.setAlpha(1.0f);
        viewGroup.setAlpha(1.0f);
        viewGroup2.setVisibility(0);
        viewGroup.setVisibility(0);
    }
}
