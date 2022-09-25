package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.p10135b.C133293a;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.p10135b.C133294b;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.p10135b.C133295c;
import com.google.android.apps.search.googleapp.p10338l.p10339a.C136382ae;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.credential.manager.invocationparams.CallerInfo;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.p10787b.C144089a;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.k */
/* compiled from: PG */
public final /* synthetic */ class C133323k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133295c f363299a;

    public /* synthetic */ C133323k(C133295c cVar) {
        this.f363299a = cVar;
    }

    public final void onClick(View view) {
        C133295c cVar = this.f363299a;
        C58838bb.m90884s(cVar.mo111064b(), "Passwords can be launched only when the API is available.");
        C46108a aVar = (C46108a) C30281j.m56319c(cVar.f363222d.f81934a.f81883d);
        aVar.getClass();
        String str = aVar.mo50210b().f121161f;
        C144089a aVar2 = cVar.f363220b;
        C143919bh.m233970m(str, "accountName must not be empty nor null");
        C146006ab a = aVar2.mo119635a(new CredentialManagerAccount(str), new CallerInfo(C136382ae.f371303a, "android", "googleapp_mavatar", BuildConfig.FLAVOR));
        a.mo122499r(C133293a.f363217a);
        a.mo122498q(C133294b.f363218a);
    }
}
