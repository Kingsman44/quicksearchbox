package com.google.apps.tiktok.account.api.controller;

import android.os.Bundle;
import androidx.savedstate.C4087c;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.apps.tiktok.account.api.controller.d */
/* compiled from: PG */
public final /* synthetic */ class C46030d implements C4087c {

    /* renamed from: a */
    public final /* synthetic */ AccountControllerImpl f120883a;

    /* renamed from: b */
    public final /* synthetic */ C46041i f120884b;

    public /* synthetic */ C46030d(AccountControllerImpl accountControllerImpl, C46041i iVar) {
        this.f120883a = accountControllerImpl;
        this.f120884b = iVar;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        AccountControllerImpl accountControllerImpl = this.f120883a;
        C46041i iVar = this.f120884b;
        Bundle bundle = new Bundle();
        bundle.putBoolean("state_pending_op", accountControllerImpl.f120770o);
        ProtoParsers.m95532o(bundle, "state_latest_operation", accountControllerImpl.f120769n);
        boolean z = true;
        if (!accountControllerImpl.f120771p && iVar.mo50173g()) {
            z = false;
        }
        bundle.putBoolean("state_do_not_revalidate", z);
        bundle.putBoolean("tiktok_accounts_disabled", accountControllerImpl.f120764i);
        return bundle;
    }
}
