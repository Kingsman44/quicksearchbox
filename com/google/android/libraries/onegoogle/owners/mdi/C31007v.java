package com.google.android.libraries.onegoogle.owners.mdi;

import android.accounts.Account;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.v */
/* compiled from: PG */
public final /* synthetic */ class C31007v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ MdiOwnersLoader f83506a;

    /* renamed from: b */
    public final /* synthetic */ String f83507b;

    public /* synthetic */ C31007v(MdiOwnersLoader mdiOwnersLoader, String str) {
        this.f83506a = mdiOwnersLoader;
        this.f83507b = str;
    }

    public final C60870cx apply(Object obj) {
        MdiOwnersLoader mdiOwnersLoader = this.f83506a;
        String str = this.f83507b;
        for (Account account : (List) obj) {
            if (str.equals(account.name)) {
                C60870cx c = mdiOwnersLoader.f83458a.mo34308a(account).mo34318c();
                return C47638k.m84751b(c).mo51520a(new C31006u(mdiOwnersLoader, str, c), C60826bg.f164896a);
            }
        }
        return C60866ct.f164955a;
    }
}
