package com.google.android.apps.search.googleapp.incognito.p10334j;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.incognito.j.h */
/* compiled from: PG */
public final /* synthetic */ class C136364h implements C2010ad {

    /* renamed from: a */
    public final /* synthetic */ C136365i f371264a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f371265b;

    public /* synthetic */ C136364h(C136365i iVar, ViewGroup viewGroup) {
        this.f371264a = iVar;
        this.f371265b = viewGroup;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C136365i iVar = this.f371264a;
        ViewGroup viewGroup = this.f371265b;
        int d = cpVar.mo5242d();
        int dimensionPixelSize = iVar.f371266a.getContext().getResources().getDimensionPixelSize(R.dimen.googleapp_incognito_topbar_height);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = dimensionPixelSize + d;
        viewGroup.setLayoutParams(layoutParams);
        return cpVar;
    }
}
