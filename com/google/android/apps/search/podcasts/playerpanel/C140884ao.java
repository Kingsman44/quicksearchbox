package com.google.android.apps.search.podcasts.playerpanel;

import android.content.DialogInterface;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.DialogVisualElements;
import com.google.android.material.bottomsheet.C44565p;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.ao */
/* compiled from: PG */
final class C140884ao implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ C140912ba f382571a;

    /* renamed from: b */
    final /* synthetic */ C44565p f382572b;

    public C140884ao(C140912ba baVar, C44565p pVar) {
        this.f382571a = baVar;
        this.f382572b = pVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C140912ba baVar = this.f382571a;
        DialogVisualElements.m53173a(baVar.f382624b, this.f382572b, new C140883an(baVar));
    }
}
