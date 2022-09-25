package com.google.android.apps.search.googleapp.search.srp;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.k */
/* compiled from: PG */
public final /* synthetic */ class C137879k implements C2010ad {

    /* renamed from: a */
    public final /* synthetic */ C137886r f375138a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f375139b;

    public /* synthetic */ C137879k(C137886r rVar, ViewGroup viewGroup) {
        this.f375138a = rVar;
        this.f375139b = viewGroup;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C137886r rVar = this.f375138a;
        ViewGroup viewGroup = this.f375139b;
        int d = rVar.f375175y.f101930a ? 0 : cpVar.mo5242d();
        viewGroup.getClass();
        viewGroup.setPadding(0, d, 0, viewGroup.getPaddingBottom());
        int dimensionPixelSize = rVar.f375155e.getResources().getDimensionPixelSize(R.dimen.googleapp_search_header_height);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = dimensionPixelSize + d;
        viewGroup.setLayoutParams(layoutParams);
        return cpVar;
    }
}
