package com.google.android.libraries.lens.view.filters.p2097a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.libraries.lens.view.utils.C28135x;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.apps.tiktok.account.p3603a.C45954d;

/* renamed from: com.google.android.libraries.lens.view.filters.a.al */
/* compiled from: PG */
public final /* synthetic */ class C25862al implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C25864an f70252a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f70253b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f70254c;

    public /* synthetic */ C25862al(C25864an anVar, AlertDialog alertDialog, ViewGroup viewGroup) {
        this.f70252a = anVar;
        this.f70253b = alertDialog;
        this.f70254c = viewGroup;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C25864an anVar = this.f70252a;
        AlertDialog alertDialog = this.f70253b;
        ViewGroup viewGroup = this.f70254c;
        C28306ab abVar = anVar.f70272p;
        Window window = alertDialog.getWindow();
        window.getClass();
        View findViewById = window.findViewById(16908290);
        C28313c a = anVar.f70269m.mo33805a(C28427h.m53115a(94546));
        a.mo33859g(C45954d.m82060a(anVar.f70271o.f69824a));
        abVar.mo33801b(findViewById, a);
        anVar.f70272p.mo33801b(C28135x.m52426b(viewGroup), anVar.f70269m.mo33805a(C28427h.m53115a(94548)));
        anVar.f70272p.mo33801b(C28135x.m52427c(viewGroup), anVar.f70269m.mo33805a(C28427h.m53115a(94547)));
    }
}
