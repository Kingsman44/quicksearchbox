package com.google.apps.tiktok.account.data.manager;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.account.data.manager.ba */
/* compiled from: PG */
public final class C46255ba {
    /* renamed from: a */
    public static C46293cl m82524a(Context context, C46294cm cmVar) {
        Intent intent = new Intent(context, AccountSyncService.class);
        C46253az azVar = C46253az.f121236a;
        C58838bb.m90868c(cmVar.f121277a.getPackageName().equals(intent.getComponent().getPackageName()));
        return new C46293cl(cmVar.f121277a, cmVar.f121278b, cmVar.f121279c, intent, azVar);
    }
}
