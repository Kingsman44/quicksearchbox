package com.google.android.apps.search.googleapp.search.srp;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.e */
/* compiled from: PG */
public final /* synthetic */ class C137748e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C137886r f374709a;

    /* renamed from: b */
    public final /* synthetic */ View f374710b;

    public /* synthetic */ C137748e(C137886r rVar, View view) {
        this.f374709a = rVar;
        this.f374710b = view;
    }

    public final void run() {
        C137886r rVar = this.f374709a;
        this.f374710b.setBackgroundColor(rVar.f375174x);
        View view = rVar.f375158h.getView();
        view.getClass();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.googleapp_doodle_fragment);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.googleapp_account_disc_fragment);
        viewGroup2.getClass();
        viewGroup2.setVisibility(8);
        viewGroup.getClass();
        viewGroup.setVisibility(8);
    }
}
