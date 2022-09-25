package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.p1635au.C19566c;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.j.a.b.b */
/* compiled from: PG */
final class C23952b {

    /* renamed from: a */
    private static C23955e f65502a;

    /* renamed from: a */
    static final C23953c m44541a(Context context, Integer num, C55960bg bgVar, Account account, C55912b bVar) {
        C143658k kVar = new C143658k(context, "FPOP_CLIENT", account.name);
        if (f65502a == null) {
            f65502a = new C23955e(Executors.newSingleThreadScheduledExecutor(), new C19566c(context, "STREAMZ_FOOTPRINTS_CONSENT_FLOWS", (String) null));
        }
        return new C23953c(f65502a, context, num, bgVar, kVar, bVar);
    }
}
