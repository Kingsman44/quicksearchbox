package com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.p10992b.p10993a;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147488c;
import com.google.common.base.C58879cp;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.af.a.b.a.b.a.b */
/* compiled from: PG */
public final class C147487b {

    /* renamed from: a */
    private final C147488c f398106a;

    public C147487b(C147488c cVar) {
        this.f398106a = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo124243a(Intent intent) {
        if (!"com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.udc.extra.facsCacheAccountName");
        if (C58879cp.m90962d(stringExtra)) {
            return null;
        }
        return this.f398106a.mo124244a(new Account(stringExtra, "com.google")).mo124241i(intent);
    }
}
