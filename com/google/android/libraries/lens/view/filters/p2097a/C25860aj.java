package com.google.android.libraries.lens.view.filters.p2097a;

import android.app.AlertDialog;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.lens.view.utils.C28133v;
import com.google.android.libraries.lens.view.utils.C28135x;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.filters.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C25860aj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C25864an f70246a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f70247b;

    /* renamed from: c */
    public final /* synthetic */ AlertDialog f70248c;

    public /* synthetic */ C25860aj(C25864an anVar, ViewGroup viewGroup, AlertDialog alertDialog) {
        this.f70246a = anVar;
        this.f70247b = viewGroup;
        this.f70248c = alertDialog;
    }

    public final void onClick(View view) {
        C25864an anVar = this.f70246a;
        ViewGroup viewGroup = this.f70247b;
        AlertDialog alertDialog = this.f70248c;
        anVar.f70270n.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(C28135x.m52427c(viewGroup)));
        C28133v.m52419e(anVar.f70264h);
        alertDialog.hide();
    }
}
