package com.google.android.apps.gsa.languagepack;

import android.content.DialogInterface;
import com.google.p395al.p408c.p414c.p416b.C8476as;

/* renamed from: com.google.android.apps.gsa.languagepack.ai */
/* compiled from: PG */
final class C74594ai implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguagePackListItem f208755a;

    public C74594ai(LanguagePackListItem languagePackListItem) {
        this.f208755a = languagePackListItem;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LanguagePackListItem languagePackListItem = this.f208755a;
        C8476as asVar = languagePackListItem.d;
        if (asVar != null) {
            languagePackListItem.a.m(asVar);
        }
    }
}
