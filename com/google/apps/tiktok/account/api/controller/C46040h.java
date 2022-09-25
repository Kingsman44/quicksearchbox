package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountControllerImpl;

/* renamed from: com.google.apps.tiktok.account.api.controller.h */
/* compiled from: PG */
public final /* synthetic */ class C46040h implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ AccountControllerImpl.AccountControllerLifecycleObserver f120899a;

    public /* synthetic */ C46040h(AccountControllerImpl.AccountControllerLifecycleObserver accountControllerLifecycleObserver) {
        this.f120899a = accountControllerLifecycleObserver;
    }

    public final void onActivityResult(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        AccountControllerImpl accountControllerImpl = AccountControllerImpl.this;
        int i = activityResult.f2755a;
        Intent intent = activityResult.f2756b;
        if (i == -1) {
            accountControllerImpl.mo50094q(AccountId.m82057b(intent.getIntExtra("new_account_id", -1)), false, 0);
        } else {
            if (intent == null || !intent.getBooleanExtra("restart_account_selector", false)) {
                Throwable th = intent != null ? (Throwable) intent.getSerializableExtra("account_error") : null;
                ActivityAccountState activityAccountState = accountControllerImpl.f120759d;
                if (th == null) {
                    th = new C46058z();
                }
                activityAccountState.mo50104k(th);
            } else {
                accountControllerImpl.mo50080c();
            }
            accountControllerImpl.mo50090m();
        }
        accountControllerImpl.mo50092o();
    }
}
