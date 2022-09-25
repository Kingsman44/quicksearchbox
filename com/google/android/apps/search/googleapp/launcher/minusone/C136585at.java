package com.google.android.apps.search.googleapp.launcher.minusone;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10347e.C136463a;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.at */
/* compiled from: PG */
public final /* synthetic */ class C136585at implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C136586au f371827a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f371828b;

    public /* synthetic */ C136585at(C136586au auVar, Fragment fragment) {
        this.f371827a = auVar;
        this.f371828b = fragment;
    }

    public final void onClick(View view) {
        C136586au auVar = this.f371827a;
        auVar.mo113255c(Optional.empty(), Optional.empty(), this.f371828b);
        C136463a aVar = auVar.f371829a;
        aVar.f371536a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
    }
}
