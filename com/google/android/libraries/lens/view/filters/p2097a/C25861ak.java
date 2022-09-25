package com.google.android.libraries.lens.view.filters.p2097a;

import android.app.AlertDialog;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.lens.view.utils.C28135x;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.filters.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C25861ak implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C25864an f70249a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f70250b;

    /* renamed from: c */
    public final /* synthetic */ AlertDialog f70251c;

    public /* synthetic */ C25861ak(C25864an anVar, ViewGroup viewGroup, AlertDialog alertDialog) {
        this.f70249a = anVar;
        this.f70250b = viewGroup;
        this.f70251c = alertDialog;
    }

    public final void onClick(View view) {
        C25864an anVar = this.f70249a;
        ViewGroup viewGroup = this.f70250b;
        AlertDialog alertDialog = this.f70251c;
        anVar.f70270n.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(C28135x.m52426b(viewGroup)));
        anVar.mo31030c();
        alertDialog.hide();
    }
}
