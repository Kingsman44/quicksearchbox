package com.google.android.apps.gsa.languagepack;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.languagepack.ad */
/* compiled from: PG */
final class C74589ad implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f208747a;

    /* renamed from: b */
    final /* synthetic */ LanguagePackListItem f208748b;

    public C74589ad(LanguagePackListItem languagePackListItem, AlertDialog alertDialog) {
        this.f208748b = languagePackListItem;
        this.f208747a = alertDialog;
    }

    public final void onClick(View view) {
        if (this.f208747a != null && this.f208748b.f.isAdded()) {
            this.f208747a.show();
        }
    }
}
