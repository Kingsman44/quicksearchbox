package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.CancellationException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.u */
/* compiled from: PG */
public final /* synthetic */ class C133902u implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C133902u f364693a = new C133902u();

    private /* synthetic */ C133902u() {
    }

    public final C60870cx apply(Object obj) {
        Exception exc = (Exception) obj;
        if (exc instanceof CancellationException) {
            return C60856cj.m92899h(exc);
        }
        C95883aa.m158984e(C133907z.f364698a.mo56225c(), "Unable to load bottom bar", 40171, C38505d.f101863a, Integer.valueOf(C89885b.CUSTOM_TABS_BOTTOMBAR_LOADING_FAILED_VALUE), exc);
        return C60856cj.m92900i(Optional.empty());
    }
}
