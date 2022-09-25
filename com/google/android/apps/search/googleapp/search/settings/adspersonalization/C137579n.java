package com.google.android.apps.search.googleapp.search.settings.adspersonalization;

import android.net.Uri;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.adspersonalization.n */
/* compiled from: PG */
public final /* synthetic */ class C137579n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137581p f374213a;

    public /* synthetic */ C137579n(C137581p pVar) {
        this.f374213a = pVar;
    }

    public final Object apply(Object obj) {
        C137581p pVar = this.f374213a;
        String str = ((C46108a) obj).mo50210b().f121165j;
        boolean z = false;
        if (!str.equals("pseudonymous") && !str.equals("incognito")) {
            z = true;
        }
        if (!z && !C58837ba.m90859h(pVar.f374215a)) {
            return Uri.parse(pVar.f374215a).buildUpon().toString();
        }
        return Uri.parse(true != z ? "https://adssettings.google.com/embedded/search/anonymous?sig=Z29vZ2xlX2FwcHM=" : "https://adssettings.google.com/embedded/authenticated").buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).toString();
    }
}
