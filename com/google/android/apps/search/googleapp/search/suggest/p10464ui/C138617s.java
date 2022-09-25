package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28457b;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.s */
/* compiled from: PG */
public final /* synthetic */ class C138617s implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C138676y f376992a;

    /* renamed from: b */
    public final /* synthetic */ boolean f376993b;

    public /* synthetic */ C138617s(C138676y yVar, boolean z) {
        this.f376992a = yVar;
        this.f376993b = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C138676y yVar = this.f376992a;
        boolean z = this.f376993b;
        C28457b bVar = yVar.f377191j;
        bVar.getClass();
        bVar.mo33914c(C28442l.m53142h().mo33894a(), i);
        if (z) {
            yVar.mo114464c();
            return;
        }
        C47810es.m84979s(yVar.f377183b, new Intent("android.intent.action.VIEW", Uri.parse(yVar.f377182a.f375496e)));
    }
}
