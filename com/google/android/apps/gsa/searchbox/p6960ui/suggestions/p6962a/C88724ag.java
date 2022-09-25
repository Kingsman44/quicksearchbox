package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C88724ag implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C88727aj f239984a;

    /* renamed from: b */
    public final /* synthetic */ Intent f239985b;

    public /* synthetic */ C88724ag(C88727aj ajVar, Intent intent) {
        this.f239984a = ajVar;
        this.f239985b = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C88727aj ajVar = this.f239984a;
        ajVar.f239997b.startActivity(this.f239985b);
    }
}
