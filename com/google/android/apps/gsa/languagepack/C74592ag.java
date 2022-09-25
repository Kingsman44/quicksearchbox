package com.google.android.apps.gsa.languagepack;

import android.content.DialogInterface;
import com.google.p395al.p408c.p414c.p416b.C8476as;

/* renamed from: com.google.android.apps.gsa.languagepack.ag */
/* compiled from: PG */
final class C74592ag implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C8476as f208752a;

    /* renamed from: b */
    final /* synthetic */ LanguagePackListItem f208753b;

    public C74592ag(LanguagePackListItem languagePackListItem, C8476as asVar) {
        this.f208753b = languagePackListItem;
        this.f208752a = asVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        av avVar = this.f208753b.a;
        avVar.i.mo85138c(new C74599ar(avVar, this.f208752a));
    }
}
