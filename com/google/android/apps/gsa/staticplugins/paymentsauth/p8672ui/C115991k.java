package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.k */
/* compiled from: PG */
final class C115991k extends C23243a {

    /* renamed from: a */
    final /* synthetic */ View f321648a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115991k(ChildStub childStub, View view) {
        super(childStub);
        this.f321648a = view;
    }

    /* renamed from: a */
    public final void mo28675a(C22939d dVar) {
        super.mo28675a(dVar);
        View findViewById = dVar.mo28297il().findViewById(R.id.payments_auth_password_dialog);
        findViewById.getClass();
        C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(findViewById), this.f321648a), false);
    }
}
