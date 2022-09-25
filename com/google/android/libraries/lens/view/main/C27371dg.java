package com.google.android.libraries.lens.view.main;

import android.support.p033v7.app.C0392m;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.main.dg */
/* compiled from: PG */
public final /* synthetic */ class C27371dg implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74862a;

    /* renamed from: b */
    public final /* synthetic */ C0392m f74863b;

    public /* synthetic */ C27371dg(C27384dt dtVar, C0392m mVar) {
        this.f74862a = dtVar;
        this.f74863b = mVar;
    }

    public final void onClick(View view) {
        C27384dt dtVar = this.f74862a;
        C0392m mVar = this.f74863b;
        dtVar.f75001u.mo19974a(C37194a.f98418H.mo40815i(C62722b.OK));
        dtVar.f74891M.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        dtVar.mo32927N();
        if (dtVar.f74992l.mo30591a()) {
            dtVar.mo32921H();
        } else {
            dtVar.mo32926M();
        }
        mVar.hide();
    }
}
