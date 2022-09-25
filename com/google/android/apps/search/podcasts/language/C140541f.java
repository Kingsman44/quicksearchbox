package com.google.android.apps.search.podcasts.language;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.search.podcasts.language.p10578b.C140530j;
import com.google.android.apps.search.podcasts.language.p10578b.C140532l;
import com.google.android.apps.search.podcasts.p10559c.C140192a;

/* renamed from: com.google.android.apps.search.podcasts.language.f */
/* compiled from: PG */
final class C140541f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C140539e f381709a;

    /* renamed from: b */
    final /* synthetic */ DialogInterface f381710b;

    public C140541f(C140539e eVar, DialogInterface dialogInterface) {
        this.f381709a = eVar;
        this.f381710b = dialogInterface;
    }

    public final void onClick(View view) {
        C140532l lVar = this.f381709a.f381702d;
        lVar.f381681d.mo50787a(lVar.f381685h.mo51512b(new C140530j(lVar), lVar.f381679b), C140192a.f380885a);
        this.f381710b.dismiss();
    }
}
