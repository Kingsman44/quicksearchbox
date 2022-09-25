package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.y */
/* compiled from: PG */
final class C133906y implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            C95883aa.m158984e(C133907z.f364698a.mo56225c(), "Unable to update bottom bar", 40168, C38505d.f101863a, Integer.valueOf(C89885b.CUSTOM_TABS_BOTTOMBAR_SETTING_FAILED_VALUE), th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
