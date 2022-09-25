package com.google.android.apps.gsa.search.core.preferences;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.d */
/* compiled from: PG */
final class C86313d implements C91043j {

    /* renamed from: a */
    final /* synthetic */ Account f233367a;

    /* renamed from: b */
    final /* synthetic */ Uri f233368b;

    /* renamed from: c */
    final /* synthetic */ C86314e f233369c;

    public C86313d(C86314e eVar, Account account, Uri uri) {
        this.f233369c = eVar;
        this.f233367a = account;
        this.f233368b = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17709a(Object obj) {
        Uri uri = (Uri) obj;
        C86314e eVar = this.f233369c;
        if (!eVar.f233372c) {
            if (uri == null || (eVar.f233373d == null && this.f233367a != eVar.f233370a.mo79668a())) {
                uri = this.f233368b;
            }
            this.f233369c.dismiss();
            ((C91748d) this.f233369c.f233371b.mo27525b()).mo86241e(this.f233369c.getContext(), uri, false, true);
        }
    }
}
