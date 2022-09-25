package com.google.android.apps.gsa.languagepack;

import android.content.DialogInterface;
import com.google.p395al.p408c.p414c.p416b.C8476as;

/* renamed from: com.google.android.apps.gsa.languagepack.af */
/* compiled from: PG */
final class C74591af implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguagePackListItem f208751a;

    public C74591af(LanguagePackListItem languagePackListItem) {
        this.f208751a = languagePackListItem;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LanguagePackListItem languagePackListItem = this.f208751a;
        C8476as asVar = languagePackListItem.d;
        if (asVar != null) {
            languagePackListItem.a.m(asVar);
        }
    }
}
