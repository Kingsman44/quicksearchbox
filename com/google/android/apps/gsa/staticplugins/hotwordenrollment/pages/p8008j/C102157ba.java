package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ba */
/* compiled from: PG */
public final /* synthetic */ class C102157ba implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102166bj f284987a;

    /* renamed from: b */
    public final /* synthetic */ Uri f284988b;

    public /* synthetic */ C102157ba(C102166bj bjVar, Uri uri) {
        this.f284987a = bjVar;
        this.f284988b = uri;
    }

    public final void run() {
        C102166bj bjVar = this.f284987a;
        bjVar.f285008h.loadUrl(this.f284988b.toString());
        ((C89859i) bjVar.f285004d.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_VAA_CONSENT_WEB_VIEW_LOADING_START);
    }
}
